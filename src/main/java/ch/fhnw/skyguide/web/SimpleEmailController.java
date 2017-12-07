package ch.fhnw.skyguide.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.internet.MimeMessage;

@Controller
public class SimpleEmailController {

    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/mail")
    @ResponseBody
    String home() {
        try {
            sendEmail();
            return "Email Sent!";
        } catch (Exception ex) {
            return "Error in sending email: " + ex;
        }
    }

    private void sendEmail() throws Exception {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(new String[]{"jalil.hashemi@students.fhnw.ch", "marco.ghilardelli@students.fhnw.ch"});
        helper.setText("Link");
        helper.setSubject("There is a new Application");

        sender.send(message);
    }
}