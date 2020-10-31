package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DroneResponseDTO {

    private Long id;
    private Long latitude;
    private Long longitude;
    private int temperatura;
    private int umidade;
}
