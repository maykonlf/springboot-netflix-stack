package br.com.quicklabs.controller;

import br.com.quicklabs.entity.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maykon on 20/03/17.
 */

@RestController
public class Info {

    @Value("${spring.application.name}")
    String applicationName;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public Application getServerData() {
        return new Application(applicationName, port);
    }

}
