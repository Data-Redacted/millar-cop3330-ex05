package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "First Number" );
        int one = scan.nextInt();

        System.out.println( "Second Number" );
        int two = scan.nextInt();

        System.out.println( one + " + " + two + " = " + (one + two) );
        System.out.println( one + " * " + two + " = "+ (one*two) );
        System.out.println( one + " - " + two + " = "+ (one-two) );
        System.out.println( one + " / " + two + " = "+ (one/two) );
    }
}
