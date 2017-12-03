/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.generator.Addition;
import code.generator.Substraction;
import code.generator.Multiplication;
import code.generator.Power;
import code.generator.Division;
import code.generator.Factorial;
import code.generator.Percentage;
import code.generator.Mean;
import code.generator.Root;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author alex
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddtion(){
        assertEquals(7,Addition.operate(4,3));
    }
     @Test
    public void testSubstraction(){
        assertEquals(1,Substraction.operate(9,8));
    }
    @Test
    public void testMultiplication(){
        assertEquals(15,Multiplication.operate(5,3));
    }
    @Test
    public void testDivision(){
        assertEquals(3,Division.operate(9,3));
    }
    @Test
    public void testPotencia(){
        assertEquals(1024,Power.operate(2,10));
    }
    @Test
    public void testFactorial(){
        assertEquals(120,Factorial.operate(5));
    }
    @Test
    public void testPercentage(){
        assertEquals(2,Percentage.operate(10,20));
    }
    @Test
    public void testMean(){
        assertEquals(5,Mean.operate(10,2,3));
    }
    @Test
    public void testSquareRoot(){
        assertEquals(10,Root.operate(100));
    }
}
