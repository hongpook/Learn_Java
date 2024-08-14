package Chapter_1;

public class Bai_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi1 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        System.out.println("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = " + pi1);

        // Calculate the second approximation
        double pi2 = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.printf("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = %.2f" , pi2);
	}

}
