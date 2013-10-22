
import java.util.Random ;

public class Seat {

	private int row ;
	private int column ;
	private double price ;

	//normal ticket booking
	public Seat ( boolean[][] seats , int rows , int columns , double price )
	{
		this.price = price ;
		int i , j ;
		Random random_generator = new Random ( ) ;

		i =  random_generator.nextInt( rows ) ;
		j = random_generator.nextInt( columns ) ;

		while ( seats[i][j] )
		{
			i =  random_generator.nextInt( rows ) ;
			j = random_generator.nextInt( columns ) ;
		}
		this.row = i ;
		this.column = j ;
	}

	//best ticket booking
	public Seat ( boolean[][] seats , int rows , int columns , double price , boolean bestSeat )
	{
		this.price = price + price / 5 ;

		int i , j ;

		//middle of the room
		int middle_row = (rows+1)>>1 ;
		int middle_column = (columns + 1) >> 1;
		int row = 0 ;
		int column = 0 ;
		int min_cost = rows+columns ;

		for ( i = 0 ; i < rows ; ++ i )
			for ( j = 0 ; j < columns ; ++ j )
				if ( ! seats[i][j] )
				{
					int current_cost = Math.abs ( middle_row - i -1) + Math.abs ( middle_column - j-1 ) ;
					if ( current_cost < min_cost )
					{
						min_cost = current_cost ;
						row = i ;
						column = j ;
					}
				}

		this.row = row ;
		this.column = column ;
	}

	public Seat ( int row , int column , double price )
	{
		this.row = row ;
		this.column = column ;
		this.price = price ;
	}

	public String toString ( )
	{
		return ""+ (row+1) + (char)('A' + column ) + " & price: " + price + "£" ;
	}

	public int getRow ()
	{
		return row ;
	}

	public int getColumn ()
	{
		return column ;
	}
}
