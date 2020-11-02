package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.AgroTech;

@RestController
@RequestMapping("/kafka")
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
