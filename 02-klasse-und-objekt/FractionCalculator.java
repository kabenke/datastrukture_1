public class FractionCalculator
{    
    public static void main( String[] args )
    {
        Fraction f1 = new Fraction ( 4, 5 );
        System.out.println( f1.toString() );
        Fraction f2 = new Fraction ( 6, -9 );
        System.out.println( f2.toString() );
        Fraction f3 = f1.add( f2 );
        System.out.println( f3.toString() );
        Fraction f4 = new Fraction( 7 );
        System.out.println( f2.toString() );
        Fraction f5 = new Fraction( 1,2 ).multiply( f4.add( f2.multiply( f3.subtract( f1 ) ) ));
        System.out.println( f5.toString() );
        Fraction f6 = new Fraction( 1, 0 );
    }
}