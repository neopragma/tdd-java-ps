package com.neopragma.tdd1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrivialTest {
    @Test
    public void is_junit_set_up() {
        TrivialClass trivialObj = new TrivialClass();
        assertEquals("This is not trivial.", trivialObj.isThisTrivial());
    }
}
