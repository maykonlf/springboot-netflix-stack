package br.com.quicklabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by maykon on 22/03/17.
 */

@RestController
public class ClientCheck {
    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/clientCheck", method = RequestMethod.GET)
    public String clientCheck() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            String valueReceived = this.restTemplate.getForObject("http://clients-service/status", String.class);
            result = result.concat(i + "=>");
            result = result.concat(valueReceived);
            result = result.concat("\n");
        }
        return result;
    }

}
