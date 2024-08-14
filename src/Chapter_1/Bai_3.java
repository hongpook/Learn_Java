package Chapter_1;

public class Bai_3 {

	public static void main(String[] args) {
		String[] pattern = {
			"J",
			"J  aaa    v     vaaa",
			"J  J  aa    v v   a  a",
			"J   aaaa	  v	   aaaa"
		};
		for(String line: pattern) {
			System.out.println(line);
		}
	}
}
