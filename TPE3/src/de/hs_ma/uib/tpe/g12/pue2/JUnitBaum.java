/*
 * 
 */
package de.hs_ma.uib.tpe.g12.pue2;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class JUnitBaum.
 */
public class JUnitBaum {
	
	 /** The baum eins. */
 	Baum<Integer,String>baumEins = new Baum<Integer,String>();
	 
 	/** The baum zwei. */
 	Baum<Integer,String>baumZwei = new Baum<Integer,String>();
	 
 	/** The baum drei. */
 	Baum<Integer,String>baumDrei = new Baum<Integer,String>();
	 
 	/** The baum vier. */
 	Baum<Integer,String>baumVier = new Baum<Integer,String>();

	/**
	 * Test.
	 */
	@Test
	public void test() {
		 baumEins.put(5,"Tiger");
		 baumEins.put(2,"Affe");
		 baumEins.put(7,"Krokodil");
		 baumEins.put(1,"Pelikan");
		 baumEins.put(12,"Löwe");

		 baumVier.put(12,"Schlange");
		 baumVier.put(16,"Elefant");

		 baumVier.clear();
		
		 assertTrue(baumEins.isEmpty()==true);
		/* assertTrue(baumEins.containsKey(5) == true);
		
		 
		 assertTrue(baumVier.containsKey(12)==false);
 		assertTrue(baumEins.containsValue("Affe") == true);
		

		 assertTrue(baumEins.containsKey(1) == true);

		 assertTrue(baumEins.get(1)=="Pelikan"); 
		 baumDrei.putAll(baumEins);
		 assertTrue(baumDrei.containsKey(1)==true);

		 baumEins.remove(2);
		 assertTrue(baumEins.containsKey(2)==false);

		 assertTrue(baumEins.size()==4);

		 assertTrue(baumZwei.size()==0);

		 baumEins.update(1,"Pelikan");
		 assertTrue(baumEins.containsValue("Pelikan")==true);

		 baumEins.extractAll(baumVier);
		 assertTrue(baumVier.containsKey(1)==true);*/
	}

}
