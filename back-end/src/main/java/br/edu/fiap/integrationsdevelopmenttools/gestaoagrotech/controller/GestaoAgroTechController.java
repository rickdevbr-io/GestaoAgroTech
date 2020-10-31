package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneResponseDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneUpdateDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service.DroneService;

@RestController
@RequestMapping("requisicoes")
public class GestaoAgroTechController {
    public static final String URI_ID_DRONE = "{id}";
    public static final String DRONE_CONSULTA_REALIZADA = "Consulta realizada com sucesso.";
    public static final String DRONE_ATUALIZADO = "Dados do drone atualizados com sucesso.";
    private final Logger logger = LoggerFactory.getLogger(GestaoAgroTechController.class);

    private final DroneService droneService;

    public GestaoAgroTechController(DroneService droneService) {
        this.droneService = droneService;
    }

    @GetMapping(path = URI_ID_DRONE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public DroneResponseDTO getDadosDrone(@PathVariable Long id) {
        ResponseEntity<Object> responseEntity;

        try {
            DroneResponseDTO droneResponseDTO = droneService.findById(id);

            logger.info(DRONE_CONSULTA_REALIZADA);
            return droneResponseDTO;
//            responseEntity = ResponseEntity.ok().body(droneResponseDTO);
//            logger.info(DRONE_CONSULTA_REALIZADA);
//            return responseEntity;

        } catch (ResponseStatusException e) {
            logger.error(e.getMessage());
            	return new DroneResponseDTO(); 
//            return ResponseEntity.status(e.getStatus()).body(e.getMessage());
        }
    }

    @PutMapping(URI_ID_DRONE)
    public ResponseEntity<Object> updateDadosDrone(@PathVariable Long id, @RequestBody DroneUpdateDTO droneUpdateDTO) {
        ResponseEntity<Object> responseEntity;

        try {
            DroneResponseDTO droneResponseDTO = droneService.update(id, droneUpdateDTO);

            responseEntity = ResponseEntity.ok().body(droneResponseDTO);
            logger.info(DRONE_ATUALIZADO);
            return responseEntity;

        } catch (ResponseStatusException e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(e.getStatus()).body(e.getMessage());
        }
    }
}