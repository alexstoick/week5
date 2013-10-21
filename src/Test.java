
public class Test {

    public static void main ( String args[] )
    {
        System.out.println ( "uat" ) ;
	    Multiplex multi = new Multiplex ( 2 ) ;

	    Screen s1 = new Screen ( 3 , 3 ) ;
	    Movie m1 = new Movie ( "Batman" , 12.30 ) ;
	    multi.setScreen ( m1 , s1  );

	    Screen s2 = new Screen ( 2 , 2 ) ;
	    Movie m2 = new Movie ( "Superman" , 9.8 ) ;
	    multi.setScreen ( m2 , s2 );

	    TicketOffice to = new TicketOffice ( multi ) ;

	    to.showMovies ();

	    Ticket t = multi.bookTicketForMovie ( m2 ) ;

	    System.out.println ( t ) ;

    }
}