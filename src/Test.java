
public class Test {

    public static void main ( String args[] )
    {
        System.out.println ( "uat" ) ;
	    Multiplex multi = new Multiplex ( 2 ) ;

	    Screen s1 = new Screen ( 1 , 1 ) ;
	    Movie m1 = new Movie ( "Batman" , 10 ) ;
	    multi.setScreen ( m1 , s1  );

	    Screen s2 = new Screen ( 5 , 5 ) ;
	    Movie m2 = new Movie ( "Superman" , 10 ) ;
	    multi.setScreen ( m2 , s2 );

	    TicketOffice to = new TicketOffice ( multi ) ;

	    to.showMovies ();

	    Ticket t ;

	    try {
		    t = multi.bookBestTicketForMovie ( m1 ) ;

		    System.out.println ( t ) ;
	    } catch ( BookingException e ) {
		    System.out.println ( "Can't book ticket to movie " + m1  ) ;
	    }

	    try {
		    t = multi.bookBestTicketForMovie ( m1 ) ;

		    System.out.println ( t ) ;
	    } catch ( BookingException e )	{
			System.out.println ( "Can't book ticket to movie " + m1 ) ;
	    }

	    Ticket ts[] ;


	    int i ;

	    for ( int counter = 0 ; counter < 10 ; ++ counter )
	    {
		    try {
		        ts = multi.bookTicketsForMovie ( m2 , 4 ) ;
			    for ( i = 0 ; i < 4 ; ++ i)
			    {
				    System.out.println ( ts[i] ) ;
			    }
		    } catch ( BookingException e )
		    {
			    System.out.println ( "Can't book more tickets to movie " + m2  ) ;
		    }

	    }
    }
}
