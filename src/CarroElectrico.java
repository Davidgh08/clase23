public class CarroElectrico extends Vehiculo implements VehiculoElectrico{


    public CarroElectrico(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "el auto electrico esta encendido";
    }

    @Override
    String apagar() {
        return "el auto electrico esta apagado";
    }

    @Override
    void mostrarInfo() {
        String marca = getMarca();
        String modelo = getModelo();
        String combus = getCombustible();
        System.out.println(marca+" "+modelo+" "+combus);
    }

    @Override
    public double cargarBateria(double carga) {
        carga = 10 +carga;
        return carga;
    }

    @Override
    public double nivelBateria(double bateria) {
        return bateria;
    }
}
