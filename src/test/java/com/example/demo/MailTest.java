package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired

    private com.example.demo.service.MailService MailService;



    @Test

    public void testSimpleMail() throws Exception {

        MailService.sendSimpleMail("g100679262@163.com","test simple mail"," hello this is simple mail");

    }
}
