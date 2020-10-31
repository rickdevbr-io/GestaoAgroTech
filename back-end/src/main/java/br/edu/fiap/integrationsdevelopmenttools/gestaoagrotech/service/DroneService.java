package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneResponseDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneUpdateDTO;

public interface DroneService {
    DroneResponseDTO findById(Long idDrone);

    DroneResponseDTO update(Long id, DroneUpdateDTO droneUpdateDTO);
}
