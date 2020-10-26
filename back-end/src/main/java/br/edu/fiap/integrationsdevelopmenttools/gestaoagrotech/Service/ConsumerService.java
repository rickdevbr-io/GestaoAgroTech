package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.Service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

        private static final String TOPIC = "gestaoagrotechteste";

        @KafkaListener(topics = TOPIC, groupId = "group_id", containerFactory = "agrotechListener")
        public void
        publish(AgroTech agroTech)
        {
            System.out.println("MENSAGEM: " + agroTech);
        }
}
