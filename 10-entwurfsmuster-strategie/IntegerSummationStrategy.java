public class IntegerSummationStrategy 
extends DoublyLinkedList.InspectionStrategy
{
    private int sum;
    
    public IntegerSummationStrategy() { sum = 0; }
        
    public void inspect( Object ref )
    {
        sum += (int)ref;
    }
    
    public int getSum()
    {
        return sum;
    }
}