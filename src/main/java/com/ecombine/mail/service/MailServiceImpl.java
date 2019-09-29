package com.ecombine.mail.service;

import com.ecombine.mail.dao.EmailMapper;
import com.ecombine.mail.pojo.Email;

import com.ecombine.mail.pojo.EmailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mail
 * @description:
 * @author: Mr.Hao
 * @create: 2019-09-26 08:47
 **/
@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private EmailMapper emailMapper;
    @Override
    public List<Email> findAll() {
        EmailExample emailExample = new EmailExample();
        List<Email> emails = emailMapper.selectByExample(emailExample);
        return emails;
    }

    @Override
    public Email findById(Integer id) {
        Email email = emailMapper.selectByPrimaryKey(id);
        return email;
    }
}
