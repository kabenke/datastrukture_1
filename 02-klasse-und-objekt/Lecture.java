public class Lecture
{
    private String title;
    private Student[] students;
    private int firstUnused;

    public Lecture( String t, int cap ) 
    {
        title = t;
        students = new Student[cap];
        firstUnused = 0;
    }

    public boolean add( Student s ) 
    {
        if ( firstUnused < students.length ) 
        {
            students[firstUnused] = s;
            firstUnused++;
            return true;
        }
        return false;
    }

    public void show() 
    {
        System.out.println( "lecture: " + title );
        System.out.println( "participants:");
        for ( Student s : students )
        {
            if ( s != null )
            {
                System.out.println( s.toString() );
            }
        }
    }
}