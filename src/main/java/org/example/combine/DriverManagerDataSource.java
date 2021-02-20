package org.example.combine;

public class DriverManagerDataSource implements DataSource {
    private String url;
    private String username;
    private String password;

    public DriverManagerDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return url + ": " + username + " / " + password;
    }
}
