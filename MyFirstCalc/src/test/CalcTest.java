package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calc.MyCalculater;

public class CalcTest {
	
    @Test  
    public void testSum(){  
		MyCalculater calc =  new MyCalculater();

        assertEquals(10,calc.sum(7,3));  
    }  
    
    
    @Test  
    public void testminus(){  
		MyCalculater calc =  new MyCalculater();

        assertEquals(4,calc.minus(7,3));  
}
    
    
    @Test  
    public void testmultiply(){  
		MyCalculater calc =  new MyCalculater();

        assertEquals(21,calc.multiply(7,3));  
    }  


     @Test  
     public void testdivision(){  
	MyCalculater calc =  new MyCalculater();

    assertEquals(2,calc.division(10,5));  
}  
}