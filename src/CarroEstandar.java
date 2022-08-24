
public class CarroEstandar implements Automovil {

    private String nombre;

    public CarroEstandar(String s) {
        nombre = s;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando..\n" + nombre + " en movimiento");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando..\n" + nombre + " deteniendose");
    }

    @Override
    public void arrancar() {
        System.out.println(nombre + " Encendiendo motor");
    }

}
