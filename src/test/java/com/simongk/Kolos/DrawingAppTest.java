package com.simongk.Kolos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class DrawingAppTest {

    private DrawingApp drawingApp;

    @Before
    public void setup(){
        drawingApp = new DrawingApp();
    }

    @Test
    public void shouldAddTwoNumbers(){

        //given
        int a=3; int b=4;
        //when
        int result = drawingApp.add(a,b);
        //then
        Assert.assertEquals(7, result);
    }

    @Test
    public void shouldMultiplicateTwoNumbers(){
        //given
        int a=3; int b=4;
        //when
        int result = drawingApp.multiply(a,b);
        //then
        Assert.assertEquals(12,result);
    }



}
