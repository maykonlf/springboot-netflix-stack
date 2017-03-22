package br.com.quicklabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by maykon on 21/03/17.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ribbon-client")
@EnableHystrix
public class SampleUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleUserApplication.class, args);
    }
}
