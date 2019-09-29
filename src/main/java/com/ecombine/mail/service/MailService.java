package com.ecombine.mail.service;

import com.ecombine.mail.pojo.Email;

import java.util.List;

public interface MailService {

    public List<Email> findAll();

    public Email findById(Integer id);
}
