package com.ecombine.mail.pojo;

public class Email {
    private Integer id;

    private String username;

    private String password;

    private Long salary;

    private String email;

    private String jubnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJubnum() {
        return jubnum;
    }

    public void setJubnum(String jubnum) {
        this.jubnum = jubnum;
    }
}