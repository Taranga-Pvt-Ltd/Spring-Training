package com.tharanga.SpringJavaMail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MailerTest {
 
    public static void main(String[] args)
    {
        //Create the application context
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         
        //Get the mailer instance
        ApplicationMailer mailer = (ApplicationMailer) context.getBean("mailService");
 
        //Send a composed mail
        mailer.sendMail("ramyachaitra123@gmail.com", "Test Subject", "Testing body");
 
        //Send a pre-configured mail
        mailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");
    }
}