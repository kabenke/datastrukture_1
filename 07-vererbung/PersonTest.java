public class PersonTest
{
    private static void display( String opt, String ort, String pdt, String prt ) 
    {
        System.out.print( opt + "\t\t" + ort + "\t\t" + pdt + "\t\t" + prt + "\t\t" );
    }
        
    public static void testTypeCombinations()
    {       
         Person pWithP = new Person( "P", "P", "C", 1 );
         Student sWithS = new Student( "S", "S", "C", 1, "S", 1 );
         Person pWithS = sWithS;
         System.out.println( "calling reference\t\targument" );
         System.out.println( "declared type\truntime type\tdeclared type\truntime type\tmethod from" );
         System.out.println( "-----------------------------------------------------------------------------" );
         display( "Person", "Person", "Person", "Person" ); pWithP.whichMethod( pWithP );
         display( "Person", "Person", "Person", "Student" ); pWithP.whichMethod( pWithS );
         display( "Person", "Person", "Student", "Student" ); pWithP.whichMethod( sWithS );
         display( "Person", "Student", "Person", "Person" ); pWithS.whichMethod( pWithP );
         display( "Person", "Student", "Person", "Student" ); pWithS.whichMethod( pWithS );
         display( "Person", "Student", "Student", "Student" ); pWithS.whichMethod(sWithS );
         display( "Student", "Student", "Person", "Person" ); sWithS.whichMethod( pWithP );
         display( "Student", "Student", "Person", "Student" ); sWithS.whichMethod( pWithS );
         display( "Student", "Student", "Student", "Student" ); sWithS.whichMethod( sWithS );
    }
    
    public static void main( String[] args )
    {
        testTypeCombinations();
    }

}
