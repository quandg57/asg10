  // Fig. 29.14: StringBufferInsert.java
  // StringBuffer methods insert, delete and deleteCharAt.


    import java.lang.*;
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 10/08/2014
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public class StringBufferInsert {
    public static void main( String args[] )
    {
        Object objectRef = "hello";
        String string = "goodbye";
        char charArray[]  = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'K';
        int integerValue = 7;
        long longValue = 10000000;
        float floatValue = 2.5f; // f suffix indicates that 2.5 is a float
        double doubleValue = 33.333;

        StringBuffer buffer = new StringBuffer();

        buffer.insert( 0, objectRef );
        buffer.insert( 0, " "); // each of these contains two spaces
        buffer.insert( 0, string );
        buffer.insert( 0, " ");
        buffer.insert( 0, charArray );
        buffer.insert( 0, " ");
        buffer.insert( 0, charArray, 3, 3);
        buffer.insert( 0, " ");
        buffer.insert( 0, booleanValue );
        buffer.insert( 0, " ");
        buffer.insert( 0, characterValue );
        buffer.insert( 0, " ");
        buffer.insert( 0, integerValue );
        buffer.insert( 0, " ");
        buffer.insert( 0, longValue );
        buffer.insert( 0, " " );
        buffer.insert( 0, floatValue );
        buffer.insert( 0, " " );
        buffer.insert( 0, doubleValue );

        System.out.printf(
                "buffer after inserts:\n%s\n\n", buffer.toString() );
        buffer.deleteCharAt( 10 ); // delete 5 in 2.5
        buffer.delete( 2, 6 ); // delete .333 in 33.333

        System.out.printf(
                "buffer after deletes:\n%s\n", buffer.toString() );
				
		// delete char isn't char or int;		

        for (int i=0; i<buffer.length();i++)
        {
            if((buffer.charAt(i) == '.') || (buffer.charAt(i) == ' '))
            {
                buffer.deleteCharAt(i);
            }
        }
        
		// viet kieu dao nguoc
        System.out.printf(
                "buffer after deletes:\n%s\n", buffer.toString() );

        StringBuffer buffer1 = new StringBuffer(" hi there !");

        String str = buffer1.toString();

        StringBuffer buffer2 = buffer1.reverse();

        buffer2.insert(0,str) ;

        System.out.printf("buffer after resere : \n%s\n",buffer2.toString());
    } // end main
}

 // end class StringBufferInsert