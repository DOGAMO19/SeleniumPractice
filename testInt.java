
public class testInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInt ob = new testInt();
		ob.foo(false, false);
		int ex = 1; 
	    if(ex)
	    {
	        System.out.println("EX"); 
	    } 
	    else 
	    {
	        System.out.println("OTHER"); 
	    } 
	    
	    int a= 0;
        while ( a == 1 )  /* Line 6 */
        {
            System.out.print("a plus one is " + (a + 1));  /* Line 8 */
        }
	}
	public void foo( boolean x, boolean y)
	{ 
	    if( x ) 
	    {
	        System.out.println("X"); 
	    } 
	    else if(x && y)
	    { 
	        System.out.println( "X && Y"); 
	    } 
	    else
	    { 
	        if ( !y ) 
	        {
	            System.out.println( "notY") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 
	}

}
