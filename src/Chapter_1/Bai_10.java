		package Chapter_1;

public class Bai_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (Tốc độ trung bình tính bằng dặm) Giả sử một vận động viên chạy 15 km trong 50 phút 
			và 30 giây. Viết chương trình hiển thị tốc độ trung bình theo đơn vị km/h. 
			(Lưu ý rằng 1 dặm là 1,6 km.)
			15km ( 50p30s)
			1 dặm = 1.6km
			
		 */
		double kilometer = 15.0;
		int minutes = 50;
		int seconds = 30;
	
		//  Đổi km = dặm 
		double kilometerToMiter = kilometer / 1.6;
		
		// đổi thời gian sang phút
		double timeRun = (minutes / 60.0) + (seconds / 3600.0);
		System.out.println(timeRun);
		// Tính trung bình
		double avgSpeed = kilometerToMiter / timeRun;
		System.out.printf("toc do trung binh: %.2f km/h", avgSpeed);

	}

}
