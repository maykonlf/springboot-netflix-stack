package br.com.quicklabs.entity;

/**
 * Created by maykon on 21/03/17.
 */
public class Application {
    private String name;
    private Integer port;

    public Application(String applicationName, String port) {
        this.setName(applicationName);
        this.setPort(Integer.valueOf(port));
    }

    public Application(String name, Integer port) {
        this.setName(name);
        this.setPort(port);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
