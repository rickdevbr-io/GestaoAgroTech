package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.component;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service.ConsumerService;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service.EmailService;

@Component
public class ScheduledComDelay {

    private final EmailService emailService;
    private static final String MAIL = "ricardodeveloper21br@gmail.com";
    private static final String SUBJECT = "AGROTECH DRONE";
    private final ConsumerService consumerService;

    @Autowired
    public ScheduledComDelay(ConsumerService consumerService, EmailService emailService) {
        this.consumerService = consumerService;
        this.emailService = emailService;
    }

    @Scheduled(fixedDelay = 10000)
    public void executar() throws MessagingException, IOException {

        AgroTech agroTech = new AgroTech();
        consumerService.ConsumeMessage(agroTech);

        emailService.sendMail(MAIL, SUBJECT, agroTech.toString());
        System.out.println("Executou o Scheduled com delay");
    }
}