package com.sjrobotics.velocity.programmingCourse1;

/**
 * This is for the Programming Course at 316
 * @author Noah Halstead
 */
public class App 
{
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
       /*
        System.out.println(Mods.join( new String[] {"String1", "String2", "String3", "String4"} ));
        System.out.println(Mods.add( new Integer[] { 1, 2, 3, 4, 5 } ));
        System.out.println(Mods.mult( new Integer[] { 1, 2, 3, 4, 5 } ));
        */
        System.out.println(Mods.mult( "Hi Everyone, ", 10 ));
        System.out.print("\n");
        
        
        Operations op = new Operations(10, 5);
        System.out.println(op.add());
        System.out.print("\n");
        
        Operations op2 = new Operations(30, 5);
        System.out.println(op2.add());
        System.out.println(op2.addTo(5));
        System.out.println(op2.subTo(6));
        //System.out.println(op2.getLast());
        System.out.print(op2.explain());
        System.out.print("\n");
        
        
        Dog rockey = new Dog("Rockey");
        System.out.println(Dog.type());
        System.out.println(rockey.getName());
        rockey.bark();
        rockey.setName("Billy");
        System.out.println(rockey.getName());
        System.out.print("\n");
        
        Dog foundDog = new Dog();
        foundDog.bark();
        System.out.println(foundDog.getName());
    }
}
