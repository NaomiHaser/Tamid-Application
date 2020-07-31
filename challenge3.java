
public class challenge3 {

	
	public static void main(String [] args) {
		String[] words = {"TAMID" , "IS", "THE", "COOLEST"}; //array of strings

		boxedstrings(words);
	}
	static void boxedstrings(String [] words) {
		int longest =words[0].length(); //calculate length of the longest word
		  for(int i=1; i<words.length;i++){
			  if(longest < words[i].length()){ //loop through the array to find longest word
				  longest = words[i].length(); //set longest to longest	 
			  }
	      }
		  starline(longest); // creates upper and bottom star line 
		  int space;
	    System.out.println();

		  for(int j=0; j<words.length; j++){ //for loop
			  System.out.print("*" + " ");// all start with star and space 
			  System.out.print(words[j]);//print the word 
			  
			  space = (longest+1) -words[j].length(); //figure out how many spaces needed
			  for(int k=0;k<space;k++) {
				  System.out.print(" ");//print that amount of spaces 
			  }
			  System.out.print("*");//print end star

		      System.out.println();
		  }
		  
		  starline(longest);//print bottom
		    	
		    	
		 
	}
	static void starline(int longest) {
		for(int y=0; y<=longest+3; y++ ) //based off longest word , calculate width of the box 
		    	 System.out.print("*");
	}
}
