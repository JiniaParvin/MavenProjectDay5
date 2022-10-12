package com.accenture.maven;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String, String>treemap = new TreeMap<String,String>(Collections.reverseOrder());
    	treemap.put("1","Ramesh");
    	treemap.put("2","Suresh");
    	treemap.put("3","Jinia");
    	treemap.put("4","Samrat");
    	Set s = treemap.entrySet();
    	Iterator i=s.iterator();
    	while(i.hasNext()) {
    		Map.Entry m=(Map.Entry)i.next();
    		System.out.println(m.getKey()+":" );
    		System.out.println(m.getValue());
    	}
        
    }
}
