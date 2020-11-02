package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneResponseDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneUpdateDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.entity.DroneEntity;

import java.util.List;

public interface DroneService {
    DroneResponseDTO findById(Long idDrone);

    DroneResponseDTO update(Long id, DroneUpdateDTO droneUpdateDTO);

    void updateDrone(Long id, DroneUpdateDTO droneUpdateDTO);

    List<DroneEntity> findAll();
}
