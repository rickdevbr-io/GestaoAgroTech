package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech;

public class AgroTech {

    String iddrone;
    String latitude;
    String longitude;
    double temperatura;
    double umidade;
    boolean rastreamento;

    @Override
    public String toString()
    {
        return "AgroTech{"
                + "iddrone = " + iddrone
                + ", latitude = '" + latitude + "'"
                + ", longitude = '" + longitude + "'"
                + ", temperatura = '" + temperatura + "'"
                + ", umidade = '" + umidade + "'"
                + ", rastreamento = '" + rastreamento + "'"
                + "}";
    }

    public AgroTech() {
    }

    public AgroTech(String iddrone, String latitude, String longitude, double temperatura, double umidade, boolean rastreamento) {
        this.iddrone = iddrone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.rastreamento = rastreamento;
    }

    public String getIddrone() {
        return iddrone;
    }

    public void setIddrone(String iddrone) {
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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public boolean isRastreamento() {
        return rastreamento;
    }

    public void setRastreamento(boolean rastreamento) {
        this.rastreamento = rastreamento;
    }
}
