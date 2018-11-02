package com.udea.DojoTDDMaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    private CodeBreaker code = new CodeBreaker("1234");
	String result;
	
	
	public void testGuessAllMatch() {
		result = code.guess("1234");
		assertEquals("xxxx", result);
	}
	
	
	public void testGuessOneFailAndThreeMatch(){
		result = code.guess("0234");
		assertEquals("xxx", result);
	}
	
	
	public void testGuessTwoFailAndTwoMatch(){
		result = code.guess("0034");
		assertEquals("xx", result);
	}
	
	
	public void testGuessThreeFailAndOneMatch(){
		result = code.guess("0004");
		assertEquals("x", result);
	}
	
	
	public void testGuessAllFail(){
		result = code.guess("0000");
		assertEquals("", result);
	}
	
	
	public void testGuessAllMessy(){
		result = code.guess("4321");
		assertEquals("____", result);
	}
	
	
	public void testGuessThreeMessy(){
		result = code.guess("4120");
		assertEquals("___", result);
	}
	
	
	public void testGuessTwoMessy(){
		result = code.guess("0041");
		assertEquals("__", result);
	}
	
	
	public void testGuessOneMessy(){
		result = code.guess("0040");
		assertEquals("_", result);
	}
	
	
	public void testGuessOneMatchThreeMessy(){
		result = code.guess("2314");
		assertEquals("x___", result);
	}
	
	
	public void testGuessTwoMatchTwoMessy(){
		result = code.guess("1432");
		assertEquals("xx__", result);
	}
	
	
	public void testGuessOneFailThreeMessy(){
		result = code.guess("4320");
		assertEquals("___", result);
	}
	
	
	public void testGuessTwoFailTwoMessy(){
		result = code.guess("0041");
		assertEquals("__", result);
	}
	
	
	public void testGuessThreeFailOneMessy(){
		result = code.guess("0400");
		assertEquals("_", result);
	}

}
