public class SummationWithLoop
{
    public static int sumOfSquares( int n ) 
    {
        int value = 1;
        int subtotal = 0;
        while ( value <= n ) 
        {
            subtotal = subtotal + value * value;
            value = value + 1;
        }
        return subtotal;
    }
}