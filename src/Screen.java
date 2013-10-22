
public class Screen {

    private boolean[][] seats ;
    private Movie movie ;
	private int rows ;
	private int columns ;
	private int available_seats ;

    public Screen ( int rows , int columns )
    {
	    this.rows = rows ;
	    this.columns = columns ;
	    this.available_seats = rows * columns ;
	    int i , j ;
	    seats = new boolean[rows][columns] ;
	    for ( i = 0 ; i < rows ; ++ i )
		    for ( j = 0 ; j < columns ; ++ j )
			    seats[i][j] = false ;
    }

	public void bookSeat ( Seat s )
	{
		seats[s.getRow()][s.getColumn()] = true ;
		-- available_seats ;
	}

	public boolean isSeatBooked ( int row , int column )
	{
		return seats[row][column] ;
	}

	public void setMovie ( Movie m )
	{
		this.movie = m ;
	}

	public Movie getMovie ( )
	{
		return movie ;
	}

	public String toString ( )
	{
		return "In a room of " + rows + " x " + columns + " plays " + movie ;
	}

	public Ticket bookTicket ( ) throws BookingException
	{
		if ( available_seats == 0 )
			throw new BookingException () ;

		Seat s = new Seat ( seats , rows , columns , movie.getPrice () ) ;
		bookSeat ( s ) ;
		return new Ticket ( this , s ) ;
	}

	public Ticket bookBestTicket ( ) throws BookingException
	{
		if ( available_seats == 0 )
			throw new BookingException () ;

		Seat s = new Seat ( seats , rows , columns , movie.getPrice () , true ) ;
		bookSeat ( s ) ;
		return new Ticket ( this , s ) ;
	}

	public Ticket[] bookTickets ( int n ) throws BookingException {

		Seat s ;
		Ticket[] tickets = new Ticket[n] ;

		if ( n > columns )
			throw new BookingException () ;

		int i , j , k ;

		for ( i = 0 ; i < rows ; ++ i )
		{
			for ( j = 0 ; j < columns ; ++ j )
			{
				//see if we can get n following seats.
				for ( k = j ; k < columns && (k-j) < n ; ++ k )
					if ( seats[i][k] )
						break ;
				if ( k -j == n )
				{
					for ( k = j ; (k-j) < n ; ++ k )
					{
						s = new Seat ( i , k , movie.getPrice() ) ;
						bookSeat ( s ) ;
						tickets [ k - j ] = new Ticket ( this , s ) ;
					}
					return tickets ;
				}
			}
		}

		throw new BookingException () ;
	}

}