

package ru.kuznetsov.oleg;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Выводит в стандартный поток вывода строки "Hello World!" и "One Two Three".
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(org.apache.commons.text.WordUtils.capitalize("one two three"));
    }
}
