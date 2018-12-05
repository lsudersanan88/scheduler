package com.example.scheduler.component;

import com.example.scheduler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class PasswordComponent {

    @Autowired
    private RestTemplate restTemplate;

    private static final String USER_MAPPING = "users";

    @Scheduled(fixedDelay = 5000)
    @Async
    public void startScheduler() throws URISyntaxException {

        URI uri = new URI("http://localhost:8081/users/1");
        // HttpEntity<String>: To get result as String.

        HttpEntity<String> entity = new HttpEntity<String>(createHttpHeaders());
        ResponseEntity<User> userResponseEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, User.class);
        if (userResponseEntity.getStatusCode().is2xxSuccessful()){
            User user = userResponseEntity.getBody();
            System.out.println(user.getName());
        }else {

        }

    }

    private HttpHeaders createHttpHeaders(){
        HttpHeaders headers = new HttpHeaders();

        return headers;

    }
}
