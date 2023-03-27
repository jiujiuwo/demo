package org.csits.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.time.Duration;

@Configuration
@Slf4j
public class MyRestTemplteConfig {

    @Bean
    public RestTemplate myRestTemplate() {
        return new RestTemplateBuilder()
                .interceptors(clientHttpRequestInterceptor())
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

    @Bean
    ClientHttpRequestInterceptor clientHttpRequestInterceptor() {
        return (request, body, execution) -> {
            log.info("{},{},{}", request.getURI(), request.getHeaders(), request.getMethod());
            ClientHttpResponse response = execution.execute(request, body);
            log.info("{},{}", response.getStatusCode(), response.getStatusCode());
            return response;
        };
    }

}
