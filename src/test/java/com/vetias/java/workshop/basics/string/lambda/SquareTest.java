package com.vetias.java.workshop.basics.string.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vetias.java.workshop.lambda.Square;

public class SquareTest{
    @Test
    public void testSquare(){

        Square square=(int x)->x*x;
        Assertions.assertEquals(36,square.findSquare(6));

    }

}
