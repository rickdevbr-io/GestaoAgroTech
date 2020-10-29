package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.service;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneResponseDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto.DroneUpdateDTO;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.entity.DroneEntity;
import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.repository.DroneRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DroneServiceImpl implements DroneService {

    private DroneRepository droneRepository;

    public DroneServiceImpl(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    @Override
    public DroneResponseDTO findById(Long idDrone) {
        DroneEntity droneEntity = getDrone(idDrone);

        return droneToJsonResponse(droneEntity);
    }

    @Override
    public DroneResponseDTO update(Long id, DroneUpdateDTO droneUpdateDTO) {
        DroneEntity droneEntity = getDrone(id);

        droneEntity.setLatitude(droneUpdateDTO.getLatitude());
        droneEntity.setLongitude(droneUpdateDTO.getLongitude());
        droneEntity.setTemperatura(droneUpdateDTO.getTemperatura());
        droneEntity.setHumidade(droneUpdateDTO.getHumidade());

        DroneEntity droneEntitySalvo = droneRepository.save(droneEntity);

        return droneToJsonResponse(droneEntitySalvo);
    }

    private DroneResponseDTO droneToJsonResponse(DroneEntity droneEntity) {
        return DroneResponseDTO.builder()
                .id(droneEntity.getId())
                .latitude(droneEntity.getLatitude())
                .longitude(droneEntity.getLongitude())
                .temperatura(droneEntity.getTemperatura())
                .humidade(droneEntity.getHumidade())
                .build();
    }

    private DroneEntity getDrone(Long id) {
        return droneRepository.findDrone(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
