package Chapter_1;

public class Bai_12 {

	public static void main(String[] args) {
		/*
		 * (Tốc độ trung bình tính bằng km) Giả sử một vận động viên chạy 24 dặm trong 1 giờ, 40
			phút và 35 giây. Viết chương trình hiển thị tốc độ trung bình trong 
			kilômét một giờ. (Lưu ý 1 dặm bằng 1,6 km.)
			- 24 dặm (1g40p30s)
			- 1 dặm = 1.6 km
			
		 */
		int hours = 1;
		int minutes = 40;
		int seconds = 35;
		int dam = 24;
		// Đổi dặm = km
		double damToKilomiter = dam * 1.6;
		// Đổi thời gian = giờ
		double timeRun = hours + (minutes / 60.0) + (seconds / 3600.0);
		// Tính tốc độ trung bình km/h 
		double avgSpeed = damToKilomiter / timeRun;
		
		System.out.printf("Tốc độ trung bình: %.2f km/h", avgSpeed);

	}

}
