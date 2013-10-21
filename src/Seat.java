
import java.util.Random ;

public class Seat {

	private int row ;
	private int column ;

	public Seat ( boolean[][] seats , int rows , int columns )
	{
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

	public String toString ( )
	{
		return ""+ (row+1) + (char)('A' + column ) ;
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
