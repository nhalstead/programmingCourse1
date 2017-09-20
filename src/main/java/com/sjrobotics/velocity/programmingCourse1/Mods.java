package com.sjrobotics.velocity.programmingCourse1;

public class Mods {

	public Mods() {
		
	};
	
	public static String join( String[] in ) 
    {
    	String output = "";
    	for (int i = 0; i < in.length; i++)
    	{
    		output += in[i];
    		if(i + 1 != in.length)
    		{
    			output += " ";
    		}
    	}
    	return output;
    }
    
    public static int add( Integer[] in ) 
    {
    	int output = 0;
    	for (int i = 0; i < in.length; i++)
    	{
    		output += in[i];
    	}
    	return output;
    }
    
    public static int mult( Integer[] in ) 
    {
    	int output = 1;
    	for (int i = 0; i < in.length; i++)
    	{
    		output += (output * in[i]);
    	}
    	return output;
    }
    
    public static String mult( String in, int Count ) 
    {
    	String output = "";
    	for (int i = 0; i < Count; i++)
    	{
    		output += in;
    	}
    	return output;
    }
}
