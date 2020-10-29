package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.repository;

import br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.entity.DroneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DroneRepository extends JpaRepository<DroneEntity, Long> {
    @Query(value = "SELECT top 1 * from DRONES where id = :id", nativeQuery = true)
    Optional<DroneEntity> findDrone(Long id);
}
