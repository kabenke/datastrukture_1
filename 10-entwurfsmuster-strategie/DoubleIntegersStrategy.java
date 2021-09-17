public class DoubleIntegersStrategy 
extends DoublyLinkedList.SubstitutionStrategy
{
    public Object substitute( Object ref )
    {
        return 2 * (int)ref;
    }
}