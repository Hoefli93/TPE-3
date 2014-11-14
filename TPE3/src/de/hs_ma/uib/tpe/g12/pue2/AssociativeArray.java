package de.hs_ma.uib.tpe.g12.pue2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AssociativeArray {

public static void main(String args[]){
    Map<String,String> myMap1 = new HashMap<String, String>();

    List<Map<String , String>> myMap  = new ArrayList<Map<String,String>>();

    myMap1.put("URL", "Val0");
    myMap1.put("CRC", "Vla1");
    myMap1.put("SIZE", "Vla2");
    myMap1.put("PROGRESS", "Vla2");

    myMap.add(0,myMap1);
    myMap.add(1,myMap1);

    for (Map<String, String> map : myMap) {
        System.out.println(map.get("URL"));
    }

    //System.out.println(myMap);

}


}