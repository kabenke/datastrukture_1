public class ArrayWithException

{
    public static void main( String[] args )
    {
        int[] values = { 1, 2, 9, -5, 0, 7 };
        //int i = values[8];
        values[-1] = 1;
    }
}
