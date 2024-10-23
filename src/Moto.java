public class Moto extends Vehiculo{


    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "el camion esta encendido";
    }

    @Override
    String apagar() {
        return "el camion esta apagado";
    }

    @Override
    public void mostrarInfo() {
        String marca = getMarca();
        String modelo = getModelo();
        String combus = getCombustible();
        System.out.println(marca+" "+modelo+" "+combus);

    }
}
