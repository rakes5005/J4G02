package module1;

public class AdditionAverage {
	int[] data = { 10, 20, 30, 40, 50 };

	public static int findSumWithoutUsingStream(int[] data) {
	    int sum = 0;
	    for (int value : data) {
	        sum += value;
	    }
	    return sum;
	}

}
