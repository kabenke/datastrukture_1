public class ArrayCopy
{
    public static void copyValues()
    {
        int[] values1;
        int[] values2 = {1,2,3,4};

        values1 = new int[values2.length];
        for ( int i = 0; i < values2.length; i++ ) 
        {
            values1[i] = values2[i];
        }

        for (int i = 0; i < values1.length; i++ )
        {
            System.out.print( values1[i] + " " );
        }
    }

    public static int[] copy( int[] in ) 
    {
        int[] out = new int[in.length];
        for ( int i = 0; i < in.length; i++ ) 
        {
            out[i] = in[i];
        }
        return out;
    }

    public static void moveTo( int[] source, int[] into ) 
    {
        if ( source.length == into.length )
        {
            for ( int i = 0; i < source.length; i++ ) 
            {
                into[i] = source[i];
            }
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Test copy:" );
        int[] values1;
        int[] values2 = {1,2,3,4};
        values1 = copy( values2 );

        for (int i = 0; i < values1.length; i++ )
        {
            System.out.print( values1[i] + " " );
        }
        System.out.println();

        System.out.println( "Test moveTo:" );
        int[] values4 = {1,2,3,4};
        int[] values3 = new int[values4.length];
        moveTo( values4, values3 );

        for (int i = 0; i < values3.length; i++ )
        {
            System.out.print( values3[i] + " " );
        }
    }
}
