public class Carro extends Vehiculo{


    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    String encender() {
        return "esta encendido";
    }

    @Override
    String apagar() {
        return " esta apagado";
    }

    @Override
    public void mostrarInfo() {
        String combus = getCombustible();
        String marca = getMarca();
        String modelo = getModelo();
        System.out.println(marca+" "+modelo+" "+combus);
    }
}
