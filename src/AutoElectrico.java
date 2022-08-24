
public class AutoElectrico extends AutomovilDecorator {

    public AutoElectrico(Automovil auto) {
        super(auto);
    }

    @Override
    public void acelerar() {
        getAuto().acelerar();
        System.out.println("Sistema operativo forzando la aceleracion");

    }

    @Override
    public void frenar() {
        getAuto().frenar();
        System.out.println("Sistema electrico forzando el frenaje");
    }

    @Override
    public void arrancar() {
        getAuto().arrancar();
        System.out.println("Sistema operativo encendiendo");
    }

}
