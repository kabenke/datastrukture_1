import java.util.LinkedList;

public class Hashtable<T>
{
    LinkedList<T>[] table;
    int capacity;
    int size;

    // Erzeugung des Feldes ist nicht typsicher möglich
    // immer auftretende Warnung wird unterdrueckt,
    // Methode put erlaubt nur das Eintragen von Objekten des Typs T 
    @SuppressWarnings({"unchecked"})
    public Hashtable( int c )
    {
        if ( c > 0 ) 
        {
            capacity = c;
        } else {
            throw new IllegalArgumentException();
        }
        table = new LinkedList[capacity];
        size = 0;
        for( int i = 0; i < capacity; i++ )
        {
            table[i] = new LinkedList<>();
        }
    }

    public void put( T o )
    {
        if ( !table[position( o )].contains( o ) )
        {
            if ( (double)(size + 1) / capacity > 0.75 )
            {
                rehash();
            }
            table[position( o )].add( o );
            size++;
        }
    }

    public boolean contains( T o )
    {
        return table[position( o )].contains( o );
    }

    public void remove( T o )
    {
        if ( table[position( o )].remove( o ) )
        {
            size--;
        }
    }

    private int position( T o )
    {
        return Math.abs( o.hashCode() % capacity );
    }
    
    public int size()
    {
        return size;
    }

    // Erzeugung des Feldes ist nicht typsicher möglich
    // immer auftretende Warnung wird unterdrueckt,
    // Methode put erlaubt nur das Eintragen von Objekten des Typs T 
    @SuppressWarnings({"unchecked"})
    protected void rehash()
    {
        capacity = 2 * capacity;
        LinkedList<T>[] oldTable = table;
        table = new LinkedList[capacity];
        for( int i = 0; i < capacity; i++ )
        {
            table[i] = new LinkedList<>();
        }
        size = 0;
        for ( LinkedList<T> list : oldTable )
        {
            for ( T elem : list )
            {
                if ( elem != null )
                {
                    put( elem );
                }
            }
        }
    }

    public void showAll() 
    {
        for ( int i = 0; i < capacity; i++ )
        {
            System.out.print( "hashcode: " + i + " objects: " );
            for ( T elem : table[i] )
            {
                System.out.print( elem + " " );
            }
            System.out.println();
        }
    }
}
