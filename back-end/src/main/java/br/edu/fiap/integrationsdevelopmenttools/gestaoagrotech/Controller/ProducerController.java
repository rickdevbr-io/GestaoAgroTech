package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.Controller;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.Service.EmailService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.slf4j.*;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    KafkaTemplate<String, AgroTech> kafkaTemplate;

    private static final String TOPIC = "gestaoagrotech";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody AgroTech agroTech)
    {
        kafkaTemplate.send(TOPIC, agroTech);
        return "Mensagem publicada!";
    }
}
