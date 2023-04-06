package packagetest;

public class CS380_Lab0 {
	public static void main(String[] args) {
		
		//initialize a number to reverse
		int num = 12345;
		//call and print reverse method
		System.out.println(reverseNum(num));
				
	}
	
	//reverses and returns a given number
	public static int reverseNum(int num) {
		//make a temp String of the number as a string
		String temp = String.valueOf(num);
		//temp2 is an empty string to manipulate the first string
		String temp2="";
		//loop through the string
		for(int i = 0; i <temp.length(); i++) {
			//starting from the end loop throug setting temp2 to 
			//be the current char in the string
			temp2 = temp2 + temp.charAt(temp.length()-1 - i);
		}
		//set num to the reversed num
		num = Integer.parseInt(temp2);
		//return num
		return num;
	}
}
