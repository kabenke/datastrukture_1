public class HuffmanCodingTest
{
    public static void main(String[] args)
    {

        HuffmanTriple[] tokens = {
                new HuffmanTriple( 'u', 120 ),
                new HuffmanTriple( 'v', 35 ),
                new HuffmanTriple( 'w', 70 ),
                new HuffmanTriple( 'm', 165 ),
                new HuffmanTriple( 'y', 50 ),
                new HuffmanTriple( 'a', 40 ),
                 new HuffmanTriple( 'z', 30 )

            };
         HuffmanCoding    hc = new HuffmanCoding( tokens);
        hc.showCodeTable();
        System.out.println();
    }
}
