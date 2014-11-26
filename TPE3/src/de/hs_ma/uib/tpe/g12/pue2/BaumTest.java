
package de.hs_ma.uib.tpe.g12.pue2;

/**
 * 1312740
 * 1320733
 * 1331770
 */


import static org.junit.Assert.*;
 
import org.junit.BeforeClass;
import org.junit.Test;
 


public class BaumTest {
        
        /** The baum. */
        private static Baum baum = new Baum("nils", 15);
        
        /** The baum2. */
        private static Baum baum2 = new Baum("timo", 48);
        
        /** The baum3. */
        private static Baum baum3 = new Baum("Sinan",69 );
        
        /** The wörterbuch. */
        private static Dictionary wörterbuch = new Dictionary("hallo", "hello");
        
        /** The values. */
        private static String[] values = {"hallo","tschüss"};
        
        /** The keys. */
        private static String[] keys = {"hello","goodbye"};
       
        /**
         * Initialize.
         */
      
        public static void initialize() {
                baum.put("elefant", 30);
                baum.put("tiger", 25);
             
               
                wörterbuch.put("hello", "hallo");
                wörterbuch.put("tschüss", "goodbye");
             
 
                baum2.put("hs", 11);
               
                baum3.put("lol", 88);
               
       
               
        }
        
        /**
         * Test a.
         */
        @Test
        public void testA (){
                        assertEquals(false, baum.containsValue(101));
                        assertEquals(true, baum.containsValue(100));
                       
                        assertEquals(7, baum.size());
                       
                        assertEquals(true, baum.containsKey("nils"));
                        assertEquals(false, baum.containsKey("elefant"));
                 
                       
                        assertEquals(false, baum.isEmpty());
                       
                        assertEquals(15, baum.get("nils"));
                        assertEquals(25, baum.get("tiger"));
                       
                        baum.update("kuh", 70);
                        assertEquals(true, baum.containsValue(70));
                        assertEquals(false, baum.containsValue(54));
                       
                        assertEquals(11, baum.remove("nils"));
                      	assertEquals(false, baum.containsValue(15));                 
                     	assertEquals(false, baum.containsKey("nils"));
                       
                        assertArrayEquals(keys, wörterbuch.keys());
                        assertArrayEquals(values, wörterbuch.values());
                       
                        baum.putAll(baum2);
                        assertEquals(2, baum.size());
                       
                        baum.extractAll(baum2);
                        assertEquals(2, baum2.size());
                       
                        assertEquals(true, baum2.containsKey("timo"));
                        assertEquals(true, baum2.containsKey("hs"));
                 
                       
                        baum.clear();
                        assertEquals(0, baum.size());
                        assertEquals(true, baum.isEmpty());
       
        }
 
 
}