
public class TicketOffice {

	Multiplex multiplex ;

	public TicketOffice ( Multiplex m )
	{
		this.multiplex = m ;
	}

	public void showMovies ( )
	{
		int length = multiplex.getNumberOfScreens () ;
		Screen[] screens = multiplex.getScreens () ;

		for ( int i = 0 ; i < length ; ++ i )
		{
			System.out.println ( screens[i] ) ;
		}
	}

}
