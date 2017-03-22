package br.com.quicklabs.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by maykon on 21/03/17.
 */
@RestController
public class User {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "GET /user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser() {
        return "POST /user";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String updateUserById(@PathVariable(value = "id") Integer id) {
        return "PUT /user/{" + id + "}";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable(value = "id") Integer id) {
        return "DELETE /user/{" + id + "}";
    }
}
