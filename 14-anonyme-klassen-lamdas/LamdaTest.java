import java.util.function.*;
import java.util.*;

public class LamdaTest
{

    public static void main( String[] args )
    {
        Function<Integer,Integer> f = x -> x * x;
        Function<Integer,Integer> g = x -> 3 * x;
        System.out.println( f.compose( Function.identity() ).apply( 5 ) );
        System.out.println( f.compose( g ).apply( 5 ) );
        System.out.println( f.andThen( g ).apply( 5 ) );
        //System.out.println( f.andThen( g ).compose( x -> x + 7 ).apply( 5 ) );
        System.out.println( f.andThen( g ).compose( (Integer x) -> x + 7 ).apply( 5 ) );
        System.out.println( ((Function<Integer,Integer>) (Integer x) -> x + 7).apply( 5 ) );
        
        List<Integer> numbers = new LinkedList<>();
        numbers.add( 2 ); numbers.add( 4 ); numbers.add ( 11 ); 
        numbers.add( 5 ); numbers.add( 6 ); numbers.add (7 );
        numbers.iterator().forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
        Iterator<Integer> it = numbers.iterator();
        it.next(); it.forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
        
        //numbers.replaceAll( x -> x + 3 );
        numbers.iterator().forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
        //numbers.sort( (x,y) -> y - x ); 
        numbers.iterator().forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
        //numbers.sort( (x,y) -> x % 2 - y % 2 ); 
        numbers.iterator().forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
        numbers.sort( (x,y) -> y % 2 - x % 2 ); 
        numbers.iterator().forEachRemaining( x -> System.out.print( x + " " ) ); System.out.println();
    }
}
