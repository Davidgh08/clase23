public class Main {
    public static void main(String[] args) {

        Carro ford = new Carro("ford","Raptor","extra");
        Camion jac = new Camion("jac", "jhr","gas");
        Moto yamaha = new Moto("yamaha","fz250","corriente");
        CarroElectrico tesla = new CarroElectrico("tesla","model s playd", "electrico");


        System.out.println(ford.getMarca()+" "+ford.encender());
        System.out.println(ford.getMarca()+" "+ford.apagar());
        System.out.println("--------------------------------------");
        ford.mostrarInfo();
        System.out.println("--------------------------------------");

        System.out.println(jac.getMarca()+" "+jac.encender());
        System.out.println(jac.getMarca()+" "+jac.apagar());
        System.out.println("--------------------------------------");
        jac.mostrarInfo();
        System.out.println("--------------------------------------");

        System.out.println(yamaha.getMarca()+" "+yamaha.encender());
        System.out.println(yamaha.getMarca()+" "+yamaha.apagar());
        System.out.println("--------------------------------------");
        yamaha.mostrarInfo();
        System.out.println("--------------------------------------");

        System.out.println(tesla.getMarca()+" "+tesla.encender());
        System.out.println(tesla.getMarca()+" "+tesla.apagar());
        System.out.println("--------------------------------------");
        tesla.mostrarInfo();
        System.out.println("--------------------------------------");












    }
}