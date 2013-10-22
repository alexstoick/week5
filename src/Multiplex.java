
public class Multiplex {

	private Screen[] screens;
	private int screen_counter = -1 ;
	private int number_of_screens ;

	public Multiplex ( int number_of_screens )
	{
		this.number_of_screens = number_of_screens ;
		screens = new Screen[number_of_screens] ;
	}

	public void setScreen ( Movie movie , Screen s)
	{
		screens[++screen_counter] = s ;
		screens[screen_counter].setMovie ( movie ) ;
	}

	public int getNumberOfScreens ( )
	{
		return number_of_screens ;
	}

	public Screen[] getScreens ()
	{
		return screens ;
	}

	public int findScreenByMovie ( Movie m )
	{
		for ( int i = 0 ; i <= screen_counter ; ++ i )
			if ( screens[i].getMovie().equals ( m ) )
				return i ;

		return -1 ;
	}

	public Ticket bookTicketForMovie ( Movie m ) throws BookingException
	{
		Screen s = screens[findScreenByMovie ( m )] ;
		return s.bookTicket () ;
	}

	public  Ticket[] bookTicketsForMovie ( Movie m , int n) throws BookingException
	{
		Screen s = screens [ findScreenByMovie ( m ) ] ;
		return s.bookTickets ( n ) ;
	}

	public Ticket bookBestTicketForMovie ( Movie m ) throws BookingException
	{
		Screen s = screens [ findScreenByMovie ( m ) ] ;
		return s.bookBestTicket () ;
	}
}
