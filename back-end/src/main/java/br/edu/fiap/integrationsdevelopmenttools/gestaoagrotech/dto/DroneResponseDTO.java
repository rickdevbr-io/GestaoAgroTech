package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DroneResponseDTO {

    @JsonProperty
    private Long id;
    @JsonProperty
    private String latitude;
    @JsonProperty
    private String longitude;
    @JsonProperty
    private int temperatura;
    @JsonProperty
    private int umidade;
}