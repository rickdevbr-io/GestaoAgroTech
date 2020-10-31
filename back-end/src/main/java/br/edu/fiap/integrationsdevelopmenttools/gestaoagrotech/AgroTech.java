package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgroTech {

    Long iddrone;
    String latitude;
    String longitude;
    Short temperatura;
    Short umidade;

    @Override
    public String toString()
    {
    	if(Objects.isNull(iddrone))
    		iddrone = 0L;
    		
        return "AgroTech{"
                + "iddrone = " + iddrone.toString()  
                + ", latitude = '" + latitude + "'"
                + ", longitude = '" + longitude + "'"
                + ", temperatura = '" + temperatura + "'"
                + ", umidade = '" + umidade + "'"
                + "}";
    }
    
}
