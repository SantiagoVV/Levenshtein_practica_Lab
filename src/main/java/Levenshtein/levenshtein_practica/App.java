package Levenshtein.levenshtein_practica;

import junit.framework.TestCase;


/**
 * Hello world!
 *
 */

public class App extends TestCase
{
	

	
	public void testPruebas1 () {
		
		String str1 = "prueba1";
        	String str2 = "prueba2";
       
		assertTrue(Levenshtein.computeLevenshteinDistance(str1,str2) == 1);
		
		assertEquals(1, Levenshtein.computeLevenshteinDistance(str1,str2) );
	   
	}
	
	
	public void testPruebas2 () {
		
	String str1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        String str2 = "Ut enim ad minim veniam";
        
        assertTrue(Levenshtein.computeLevenshteinDistance(str1,str2) == 105);
        
	}

        
        
        
     

}
