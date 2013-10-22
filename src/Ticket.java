
public class Ticket {

	private Screen screen ;
	private Seat seat ;

	public Ticket ( Screen s , Seat seat )
	{
		this.screen = s ;
		this.seat = seat ;
	}

	public String toString ( )
	{
		return printTicket ( ) ;
	}

	public String printTicket ( )
	{
		return "Ticket to movie: " + screen.getMovie() + " with a seat on " + seat ;
	}

	public Seat getSeat ( )
	{
		return seat ;
	}
}
