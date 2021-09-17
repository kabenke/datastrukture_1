public class DLLLambdaTest
{

    public static void main( String[] args )
    {
        testStrategy();
    }

    public static void testStrategy()
    {
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<>();
        ints.add( 5 );
        ints.add( 6 );
        ints.add( 11 );
        ints.add( 2 );
        ints.add( 9 );
        
        System.out.println("double using anonymous class");
        System.out.print("in: ");
        ints.showAll();
        ints.substituteAll( 
            new DoublyLinkedList.SubstitutionStrategy<Integer>() { 
                    public Integer substitute( Integer ref ) 
                    {
                        return 2 * ref;
                    } 
            }
        );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
     
        System.out.println("double using anonymous class and effective final variable");
        System.out.print("in: ");
        ints.showAll();
        int factor = 2;
        ints.substituteAll( 
            new DoublyLinkedList.SubstitutionStrategy<Integer>() { 
                    public Integer substitute( Integer ref ) 
                    {
                        return factor * ref;
                    } 
            }
        );
        
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        
        System.out.println("double using lambda expression");
        System.out.print("in: ");
        ints.showAll();
         ints.substituteAll( x -> 2 * x );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        
        System.out.println("double using lambda expression and effective final variable");
        System.out.print("in: ");
        ints.showAll();
        int factor2 = 2;
        ints.substituteAll( x -> factor2 * x );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        
        System.out.println("show using lambda expression");
        System.out.print("in: ");
        ints.showAll();
        System.out.print("output: ");
        ints.inspectAll( x -> System.out.print( x + ", " ) );
        System.out.println();   
        System.out.println();
        System.out.println("remove even integers using lambda expression");
        System.out.print("in: ");
        ints.showAll();
        ints.deleteSelected( x -> x % 2 == 0 );
        //ints.deleteSelected( x -> { if ( x % 2 == 0 ) return true; else return false; } );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();


    }

}
