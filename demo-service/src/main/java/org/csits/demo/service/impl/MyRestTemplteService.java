package org.csits.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
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

@Service
@Slf4j
public class MyRestTemplteService {

    private final RestTemplate restTemplate;

    public MyRestTemplteService(RestTemplateBuilder restTemplateBuilder, @Value("${rest.server.uri}") String ROOT_SERVER_URL) {
        this.restTemplate = restTemplateBuilder
                .rootUri(ROOT_SERVER_URL)
                .uriTemplateHandler(new RootUriTemplateHandler(ROOT_SERVER_URL))
                .setReadTimeout(Duration.ofMinutes(5))
                .setConnectTimeout(Duration.ofMinutes(5))
                .errorHandler(new MyResponseErrorHandler())
                .build();
    }


    public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return restTemplate.getForObject(url, responseType, uriVariables);
    }

    public <T> T getForObject(String url, Class<T> responseType) throws RestClientException {
        return restTemplate.getForObject(url, responseType);
    }

    class MyResponseErrorHandler implements ResponseErrorHandler {

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
    }
}
