public class Camion extends Vehiculo{


    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "la moto esta encendida";
    }

    @Override
    String apagar() {
        return "la moto esta apagada";
    }

    @Override
    public void mostrarInfo() {
        String marca = getMarca();
        String modelo = getModelo();
        String combus = getCombustible();
        System.out.println(marca+" "+modelo+" "+combus);


    }
}
