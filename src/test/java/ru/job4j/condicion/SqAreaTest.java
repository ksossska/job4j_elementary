package ru.job4j.condicion;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Square2() {
        int expected = 5;
        int p = 10;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}