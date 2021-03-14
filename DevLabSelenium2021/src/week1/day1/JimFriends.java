package week1.day1;

public class JimFriends {

	public static void main(String[] args) {

		String[] jimFren = { "Alred","James","Smith","John","Piggie","May"	
		};
		
		
		// Find out the total number of names by using .length and store in variable int (number data type)
		int leng = jimFren.length;
		System.out.println(leng);
		
		int i;
		// for (int =j )  local variable j cannot be used outside of block {}
		for(i=0; i<leng; i++) {
			System.out.println(jimFren[i]);
			
		};
		
		
		
	}

}
