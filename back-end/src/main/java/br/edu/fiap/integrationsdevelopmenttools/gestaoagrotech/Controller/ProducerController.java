package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.Controller;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.slf4j.*;


@RestController("/api")
public class AgroTechController {

    @Autowired
    KafkaTemplate<String, AgroTech> kafkaTemplate;

    private static final String TOPIC = "gestaoagrotechteste";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody AgroTech agroTech)
    {
        kafkaTemplate.send(TOPIC, agroTech);
        return "Mensagem publicada!";
    }
}
