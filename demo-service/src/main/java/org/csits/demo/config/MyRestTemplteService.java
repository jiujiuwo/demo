package org.csits.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.time.Duration;

@Configuration
@Slf4j
public class MyRestTemplteService {

    @Bean
    public RestTemplate myRestTemplate() {
        return new RestTemplateBuilder()
                .errorHandler(myResponseErrorHandler())
                .setReadTimeout(Duration.ofMinutes(5))
                .setConnectTimeout(Duration.ofMinutes(10))
                .setBufferRequestBody(true)
                .interceptors()
                .build();
    }


    @Bean
    public ResponseErrorHandler myResponseErrorHandler() {
        return new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                HttpStatusCode httpStatusCode = response.getStatusCode();
                HttpStatus httpStatus = HttpStatus.resolve(httpStatusCode.value());
                return httpStatus == null || httpStatus.isError();
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {
                throw new RuntimeException("网络错误");
            }

            @Override
            public void handleError(URI url, HttpMethod method, ClientHttpResponse response) throws IOException {
                log.error("{},{},{}", url.toString(), method.toString(), response.getStatusCode());
                handleError(response);
            }
        };
    }

}
