package com.ecombine.mail.controller;

import com.ecombine.mail.pojo.Email;
import com.ecombine.mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @program: mail
 * @description:
 * @author: Mr.Hao
 * @create: 2019-09-25 15:28
 **/
@RestController
public class maileAction {

    @Autowired
    private MailService mailService;
    @Autowired
    private JavaMailSender javaMailSender;
    @RequestMapping("/mail")
    public void mail(){
            //获取用户邮箱
        List<Email> all = mailService.findAll();
        for (Email email : all) {
            SimpleMailMessage message = new SimpleMailMessage();
            //标题内容
            message.setSubject("工资条");
            //发件人
            message.setFrom("1358846326@qq.com");
            //收件人
            String email1 = email.getEmail();
            message.setTo(email1);
            //发送时间
            message.setSentDate(new Date());
            //邮件正文内容
            message.setText("这是测试邮件的正文");
            //发送
            javaMailSender.send(message);
        }
    }
}
