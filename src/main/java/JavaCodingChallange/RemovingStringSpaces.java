package JavaCodingChallange;

public class RemovingStringSpaces {

	String para;
	String editedPara;
	
	public RemovingStringSpaces(String para) {
		this.para = para;
		this.editedPara = "";
	} 
	
	public static void main(String[] args) {
		String para = "This      is      a     test       paragraph";
		
		
		//Create Instance of Class
		RemovingStringSpaces crv = new RemovingStringSpaces(para);
		
		//Call The Method
		crv.removeSpaces();
	

	}
	
	//Logic 1: Using replaceAll Method
	public void removeSpaces() {
		// Print the Paragraph Before removing spaces
		System.out.println("Before Space Removal: "+ para);
		
		// Remove the Space
		editedPara = para.replaceAll("\\s+", " "); 
		// {\\s+ : matches one or more consecutive whitespace characters}
		
		// Print the Paragraph After removing spaces
		System.out.println("After Space Removal: "+ editedPara);
	}

}

	/*--------------------------------
	❤️ Also Can be use ⏹️ removeSpacesAndPunctuation() Method
			The extra spaces, commas, and dots have been removed, 
			and only single spaces remain between words.
	-----------------------------------*/