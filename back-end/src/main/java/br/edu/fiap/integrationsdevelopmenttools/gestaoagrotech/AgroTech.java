package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech;

public class AgroTech {

    Long iddrone;
    String latitude;
    String longitude;
    Short temperatura;
    Short umidade;

    @Override
    public String toString()
    {
        return "AgroTech{"
                + "iddrone = " + iddrone.toString()
                + ", latitude = '" + latitude + "'"
                + ", longitude = '" + longitude + "'"
                + ", temperatura = '" + temperatura + "'"
                + ", umidade = '" + umidade + "'"
                + "}";
    }

    public AgroTech() {
    }

    public AgroTech(Long iddrone, String latitude, String longitude, Short temperatura, Short umidade) {
        this.iddrone = iddrone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    public Long getIddrone() {
        return iddrone;
    }

    public void setIddrone(Long iddrone) {
        this.iddrone = iddrone;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Short getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Short temperatura) {
        this.temperatura = temperatura;
    }

    public Short getUmidade() {
        return umidade;
    }

    public void setUmidade(Short umidade) {
        this.umidade = umidade;
    }
}
