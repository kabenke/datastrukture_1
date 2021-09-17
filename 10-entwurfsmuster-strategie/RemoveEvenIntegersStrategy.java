public class RemoveEvenIntegersStrategy
extends DoublyLinkedList.DeletionStrategy
{
    public boolean select( Object ref )
    {
        return (int)ref % 2 == 0;
    }
}