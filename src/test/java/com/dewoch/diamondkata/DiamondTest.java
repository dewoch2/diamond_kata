package com.dewoch.diamondkata;

import com.dewoch.exceptions.MultipleLettersException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by boris on 07/01/2017.
 */
public class DiamondTest {

    @Test
    public void testADiamond() throws Exception {



        Assert.assertEquals("Le diamond A n'est pas bon", "A\n", Diamond.print("A"));

    }

    @Test
    public void testBDiamond() throws Exception {

        Assert.assertEquals("Le diamond B n'est pas bon", "  A\nB   B\n  A\n", Diamond.print("B"));

    }

    @Test
    public void testCDiamond() throws Exception {

        Assert.assertEquals("Le diamond C n'est pas bon", "    A\n  B   B\nC       C\n  B   B\n    A\n", Diamond.print("C"));

    }

    @Test(expected = MultipleLettersException.class)
    public void testMultipleLettersException() throws Exception {

        Diamond.print("AB");

    }
}
