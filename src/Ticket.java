
public class Ticket {

	private Screen screen ;
	private Seat seat ;
	private double price ;

	public Ticket ( Screen s , Seat seat )
	{
		this.screen = s ;
		this.seat = seat ;
		this.price = s.getPrice () ;
	}

	public String toString ( )
	{
		return printTicket ( ) ;
	}

	public String printTicket ( )
	{
		return "Ticket to movie: " + screen.getMovie() + " with a seat on " + seat + " & price: " + price + "£";
	}

	public Seat getSeat ( )
	{
		return seat ;
	}
}
