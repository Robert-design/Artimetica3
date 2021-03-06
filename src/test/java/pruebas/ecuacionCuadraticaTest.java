package pruebas;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ecuacionCuadraticaTest {

    @org.junit.jupiter.api.Test
    void haySolucion() {
        ecuacionCuadratica obj1 = new ecuacionCuadratica(1,2,0);
        assertTrue(obj1.haySolucion());
        obj1 = new ecuacionCuadratica(0,3,5);
        assertFalse(obj1.haySolucion());
        obj1 = new ecuacionCuadratica(10,2,1);
        assertFalse(obj1.haySolucion());
        obj1 = new ecuacionCuadratica(2,6,2);
        assertTrue(obj1.haySolucion());


    }

    @org.junit.jupiter.api.Test
    void solucion() {
        ecuacionCuadratica obj1 = new ecuacionCuadratica(1,2,0);
        ArrayList<Double> respuesta = new ArrayList<>(2);
        respuesta.add(0.0);
        respuesta.add(-2.0);
        assertEquals(respuesta,obj1.solucion());
        obj1 = new ecuacionCuadratica(0,3,5);
        respuesta = new ArrayList<>(2);
        respuesta.add(Double.POSITIVE_INFINITY);
        respuesta.add(Double.POSITIVE_INFINITY);
        assertEquals(respuesta,obj1.solucion());
        obj1 = new ecuacionCuadratica(10,2,1);
        respuesta = new ArrayList<>(2);
        respuesta.add(Double.POSITIVE_INFINITY);
        respuesta.add(Double.POSITIVE_INFINITY);
        assertEquals(respuesta,obj1.solucion());
        obj1 = new ecuacionCuadratica(2,6,2);
        respuesta = new ArrayList<>(2);
        respuesta.add(-0.3819660112501051);
        respuesta.add(-2.618033988749895);
        assertEquals(respuesta,obj1.solucion());


    }
}