public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Write your functions here
	public static String evenOrOdd(int num){
		String result;
		if (num %2 == 0){
			result = "Even";
		}
		else{
			result = "Odd";
		}
		return result;
	}
	public static String teacherOrStudent(String word){
		String result;
		if (word.equals("Kalisz")){
			result = "Teacher";
		}
		else{
			result = "Student";
		}
		return result;
	}
	public static int fartherFromZero(int num){
		int result;
		if (num == 0){
		result = num;
		}
		else{
		if (num > 0){
			result = num + 5;
		}
		else{
			result = num - 5;
		}
	}
	return result;	
}
public static String isFive(int num){
	String result;
	if (num ==5){
		result = "The number is Five";
	}
	else{
		result = "The number is not Five";
}
return result;	
}
public static String positiveOrNegative(double number){
	String result;
	if (number >0){
		result = "Positive";
	}
	else{
		result = "Negative";
}
return result;	
}
public static String highOrLow(int num){
	String result;
	if (num >100){
		result = "High";
	}
	else{
		result = "Low";
}
return result;	
}

public static String isHello(String word){
	String result;
	if (word.equals("Hello")){
		result = "The word is Hello";
	}
	else{
		result = "The word is not Hello";
}
return result;	
}
}