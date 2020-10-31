package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.Service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;

@Service
@ConfigurationProperties
public class ConsumerService {

        private static final String TOPIC = "gestaoagrotech";

        @KafkaListener(topics = TOPIC, groupId = "group_id", containerFactory = "agrotechListener")
        public void ConsumeMessage(AgroTech agroTech) throws MessagingException, IOException {
                System.out.println("MENSAGEM: " + agroTech);
        }
}
