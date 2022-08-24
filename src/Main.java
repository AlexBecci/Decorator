
public class Main {

    public static void main(String[] args) {
        Automovil autoElectrico = new AutoElectrico(new CarroEstandar("BMW"));
        Automovil autoEstandar = new CarroEstandar("Golf");
        System.out.println("Vehiculo Electrico");
        autoElectrico.arrancar();
        autoElectrico.acelerar();
        autoElectrico.frenar();

        System.out.println("");
        System.out.println("Vehiculo estandar");
        autoEstandar.arrancar();
        autoEstandar.acelerar();
        autoEstandar.frenar();

    }

}
