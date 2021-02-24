package ecuacion_cuadratica;

import java.util.ArrayList;

public class EcuaciónCuadrática {
    private double a,b,c ;
    private ArrayList<Double> resultado;

    EcuaciónCuadrática(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.resultado = new ArrayList<Double>(2);
    }

    public boolean haySolucion(){

        if(this.a == 0 || Math.pow(this.b,2) - (4*this.a*this.c) < 0)
            return false;
        return true;
    }

    public ArrayList<Double> solucion() {
        double solucion1 = Double.POSITIVE_INFINITY, solucion2 = Double.POSITIVE_INFINITY;

        if(haySolucion()){
            solucion1 = (-b + Math.sqrt( Math.pow(this.b,2) - (4*this.a*this.c))) / (2*this.a);
            solucion2 = (-b - Math.sqrt( Math.pow(this.b,2) - (4*this.a*this.c))) / (2*this.a);

        }
        resultado.add(solucion1);
        resultado.add(solucion2);
        return resultado;

    }
    public static void main(String[] args) {
        EcuaciónCuadrática ecuacion = new EcuaciónCuadrática(0 ,-1,0);

        System.out.println(ecuacion.haySolucion());
        System.out.println(ecuacion.solucion());
    }


}
