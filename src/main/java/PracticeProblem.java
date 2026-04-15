public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPrime(int num){
	for (int i = 0; i < num; i++){
		if (i%2==0){
			return false;
		}
	}
	return true;
	
	}
	public static String hasCapital(String word){
	for (int i = 0; i < word.length() - 1; i++ ){
		if (word.substring(i, i + 1).toUpperCase() == word.substring(i, i + 1)){
			return true;
		}
	}
	return false;
}

}
