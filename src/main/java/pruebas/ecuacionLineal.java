package pruebas;

public class ecuacionLineal {
    double a, b;

    public ecuacionLineal(double a,double b) {
        this.a = a;
        this.b = b;
    }

    public boolean haySolucion() {
        return a != 0 && (a != 0 || b != 0);
    }


    public double solucion() {
        if (haySolucion()) {
            return (-b / a);
        }
        return Double.POSITIVE_INFINITY;
    }
}
