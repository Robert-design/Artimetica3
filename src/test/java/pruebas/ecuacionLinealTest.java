package pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ecuacionLinealTest {

    @Test
    void haySolucion() {
        ecuacionLineal obj = new ecuacionLineal(1, -1);
        assertTrue(obj.haySolucion());
        ecuacionLineal obj2 = new ecuacionLineal(0,3);
        assertFalse(obj2.haySolucion());
        ecuacionLineal obj3 = new ecuacionLineal(0,0);
        assertFalse(obj3.haySolucion());
        ecuacionLineal obj4 = new ecuacionLineal(3,6);
        assertTrue(obj4.haySolucion());
        ecuacionLineal obj5 = new ecuacionLineal(3,0);
        assertTrue(obj5.haySolucion());
    }

    @Test
    void solucion() {
        ecuacionLineal obj5 = new ecuacionLineal(1,-1);
        assertEquals(1,obj5.solucion());
        ecuacionLineal obj6 = new ecuacionLineal(0,3);
        assertEquals(Double.POSITIVE_INFINITY, obj6.solucion());
        ecuacionLineal obj7 = new ecuacionLineal(0,0);
        assertEquals(Double.POSITIVE_INFINITY, obj7.solucion());
        ecuacionLineal obj8 = new ecuacionLineal(3,6);
        assertEquals(-2,obj8.solucion());
        ecuacionLineal obj9 = new ecuacionLineal(3,0);
        assertEquals(0,obj9.solucion());
    }
}