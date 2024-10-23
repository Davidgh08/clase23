abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String combustible;

    abstract String encender();

    abstract String apagar();

    public void abastecerCombustible(){

    }

    abstract void mostrarInfo();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    @Override
    public String
    toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", combustible='" + combustible + '\'' +
                '}';
    }

}
