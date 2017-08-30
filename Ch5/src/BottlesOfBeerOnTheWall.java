
public class BottlesOfBeerOnTheWall {
	
	public static void CheerySong() {
		BeerBottles(99);
	}
	
	private static void BeerBottles(Integer n){
		{
			
	if (n>1) {
		
		System.out.println(n +" bottles of beer on the wall, " + n +  " bottles of beer, ya’ take one down, ya’ pass it around," + (n-1) + "bottles of beer on the wall.");
		n = n -1;
		BeerBottles(n);
		
	} else  {
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer, ya’ take one" + 
				"down, ya’ pass it around, 1 bottle of beer on the wall. \n");
		System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
	}
}
}
}
	


