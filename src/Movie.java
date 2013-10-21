
public class Movie {

    private String name ;
	private double price ;

	public Movie ( String name , double price )
	{
		this.name = name ;
		this.price = price ;
	}

	public String toString ()
	{
		return name ;
	}

	public String getName ()
	{
		return name ;
	}
	public double getPrice ()
	{
		return price ;
	}

	public boolean equals ( Movie m )
	{
		return m.getName ().equals ( this.getName() ) && this.getPrice() == m.getPrice () ;
	}
}