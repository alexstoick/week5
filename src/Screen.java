
public class Screen {

    private boolean[][] seats ;
    private Movie movie ;
	private int rows ;
	private int columns ;

    public Screen ( int rows , int columns )
    {
	    this.rows = rows ;
	    this.columns = columns ;
	    int i , j ;
	    seats = new boolean[rows][columns] ;
	    for ( i = 0 ; i < rows ; ++ i )
		    for ( j = 0 ; j < columns ; ++ j )
			    seats[i][j] = false ;
    }

	public void bookSeat ( Seat s )
	{
		seats[s.getRow()][s.getColumn()] = true ;
	}

	public boolean isSeatBooked ( int row , int column )
	{
		return seats[row][column] ;
	}

	public void setMovie ( Movie m )
	{
		this.movie = m ;
	}

	public String toString ( )
	{
		return "In a room of " + rows + " x " + columns + " plays " + movie ;
	}

	public Ticket bookTicket ( )
	{
		Seat s = new Seat ( seats , rows , columns ) ;
		bookSeat ( s ) ;
		return new Ticket ( this , s ) ;
	}

	public double getPrice ( )
	{
		return movie.getPrice () ;
	}

	public Movie getMovie ( )
	{
		return movie ;
	}

}