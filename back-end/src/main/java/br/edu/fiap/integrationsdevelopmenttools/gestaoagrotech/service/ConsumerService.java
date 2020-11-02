package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
@ConfigurationProperties
public class ConsumerService {

    private static final String TOPIC = "gestaoagrotech";

    @KafkaListener(topics = TOPIC, groupId = "group_id", containerFactory = "agrotechListener")
    public void ConsumeMessage(String mensagem) throws MessagingException, IOException {
        System.out.println("MENSAGEM: " + mensagem);
    }
}
