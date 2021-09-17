import java.util.*;

public class CharacterSearchTree
{
  private HuffmanTriple content;
  private CharacterSearchTree leftChild, rightChild;

  public CharacterSearchTree()
  {
    content = null;
    leftChild = null;
    rightChild = null;
  }


 public HuffmanTriple getContent()
 {
  if ( !isEmpty() )
  {
    return content;
  } else {
    throw new IllegalStateException();
  }
}


public boolean isEmpty()
{
  return content == null;
}

public boolean isLeaf()
{
  return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
}

public void add( char t )
{
  if ( isEmpty() )
  {
    content = new HuffmanTriple( t );
    leftChild = new CharacterSearchTree();
    rightChild = new CharacterSearchTree();
  }
  else
  {
    if ( content.getToken() > t )
    {
      leftChild.add( t );
    }
    else if ( content.getToken() < t )
    {
      rightChild.add( t );
    }
    else
    {
      content.incrementQuantity();
    }
  }
}

public void iterativeAdd( char t )
{
  CharacterSearchTree current = this;
  while ( !current.isEmpty() && current.content.getToken() != t )
  {
    if ( current.content.getToken() > t )
    {
      current = current.leftChild;
    }
    else
    {
      current = current.rightChild;
    }
  }
  if ( current.isEmpty() )
  {
    current.content = new HuffmanTriple( t );
    current.leftChild = new CharacterSearchTree();
    current.rightChild = new CharacterSearchTree();
  }
  else
  {
    current.content.incrementQuantity();
  }
}

public String getCode( char t )
{
  if ( !isEmpty() )
  {
    if ( content.getToken() > t )
    {
      return leftChild.getCode( t );
    }
    else if ( content.getToken() < t )
    {
      return rightChild.getCode( t );
    }
    else
    {
      return content.getCode();
    }
  }
  else
  {
    throw new IllegalStateException();
  }
}

public int size()
{
  if ( isEmpty() )
  {
    return 0;
  }
  else
  {
    return 1 + leftChild.size() + rightChild.size();
  }
}

public void show()
{
  if ( !isEmpty() )
  {
    leftChild.show();
    System.out.println( content.toString() );
    rightChild.show();
  }
}
public void show1()
{
  if ( !isEmpty() )
  {
    leftChild.show1();
    rightChild.show1();
    System.out.println( content.toString() );
  }
}
public void show2()
{
  if ( !isEmpty() )
  {
    System.out.println( content.toString() );
    leftChild.show2();
    rightChild.show2();
  }
}

public HuffmanTriple[] toArray()
{
  if ( !isEmpty() )
  {
    HuffmanTriple[] collector = new HuffmanTriple[size()];
    toArray( collector, 0 );
    return collector;
  }
  return new HuffmanTriple[0];
}

private int toArray( HuffmanTriple[] collector, int index )
{
  if ( !isEmpty() )
  {
    index = leftChild.toArray( collector, index );
    collector[index] = content;
    index = rightChild.toArray( collector, index + 1 );
  }
  return index;
}
public int checkTree()
{
  if(isEmpty())
  {
    return 0;
  }
  else
  {
    int  l = leftChild.checkTree();

    int r = rightChild.checkTree();



    if(l>r)
    {
     return (l-r > 2) ? l : -1 ;
   }
   if(r>l)
   {
    return (r-l > 2) ? r : -1;

  }
  else {
    return -1;
  }

}
}

public int isNiceTree()
{
  if(isEmpty())
  {
    return -1;
  }
  else
  {
    int  l = leftChild.isNiceTree();

    int r = rightChild.isNiceTree();



    if(l>r)
    {
     return (l-r ==1 ) ? l : -1 ;
   }
   if(r>l)
   {
    return (r-l == 1) ? r : -1;

  }
  else {
    return -1;
  }

}
}

public int heigth ()
{
  if(!isEmpty())
  {

   int l = 1+leftChild.heigth();
   int r = 1+rightChild.heigth();

   return l>r ? l : r ;

 }

 return 0;
}
public boolean onLevel(Object obj , int level)
{
  if(!isEmpty())
  {
    if(level == 0)
    {
      if(obj.equals(content))
      {
         return true;
      }
      else{
        return false;
      }
    }
    else{

            return   leftChild.onLevel(obj , level--) || rightChild.onLevel(obj , level--);

          }


  }

  return false;


  }

public int leafAtLevel( int level)
{
 if(!isEmpty() && level >= 0)
 {
    if(isLeaf() && level > 0)
    {
      return 1 + leftChild.leafAtLevel(level--) + rightChild.leafAtLevel(level--);
    }

    else {
              return leftChild.leafAtLevel(level--) + rightChild.leafAtLevel(level--);

    }
 }

 return 0;

}
public HuffmanTriple largestOnLevel(int level)
{
  if(!isEmpty())
  {

    CharacterSearchTree  current = this.rightChild;

    if(level == 0)
    {
      if(!current.isEmpty()) {
        return current.content;
      }

    }
    else{
      return current.largestOnLevel(--level);
    }
  }
  return null;
}

}







