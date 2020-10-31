package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;

@Service
@ConfigurationProperties
public class ConsumerService {

        private static final String TOPIC = "gestaoagrotech";

        @KafkaListener(topics = TOPIC, groupId = "group_id", containerFactory = "agrotechListener")
        public void ConsumeMessage(AgroTech agroTech) throws MessagingException, IOException {
                System.out.println("MENSAGEM: " + agroTech);
        }
}
