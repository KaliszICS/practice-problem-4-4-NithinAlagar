public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean hasCapital(String word){
	for (int i = 0; i <= word.length() - 1; i++ ){
		if (word.substring(i, i + 1).toUpperCase().equals(word.substring(i, i + 1))){
			return true;
		}
	}
	return false;
}
	public static boolean isPrime(int num){
		if (num == 1 || num == 0){
			return true;
		}
	for (int i = 2; i < num; i++){
		if (num%i==0){
			return false;
		}
	}
	return true;
	
	}
}
