package com.driver.test;

import com.driver.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testprintHelloWorld2() {
        Main.B obj = new Main.B();
        String result = obj.meth();
        assertEquals("Method is overridden in Extended class B", result);
    }
}


/*
package com.driver.test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    
}
*/