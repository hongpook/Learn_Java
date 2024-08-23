package Chapter_1;

public class Bai_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (Dự báo dân số) Cục Điều tra Dân số Hoa Kỳ dự đoán dân số dựa trên giả định sau:
			■■ Cứ 7 giây lại có một ca sinh nở
			■■ Cứ 13 giây lại có một người chết
			■■ Cứ 45 giây lại có một người nhập cư mới
			
			Viết chương trình hiển thị dân số của từng năm trong 5 năm tiếp theo. 
			Giả sử rằng dân số hiện nay là 312.032.486 người, một năm có 365 ngày. 
			Gợi ý: Trong Java, nếu hai số nguyên thực hiện phép chia thì kết quả là một số nguyên. Phần phân đoạn được cắt ngắn. 
			Ví dụ: 5/4 là 1 (không phải 1,25) và 10/4 là 2 (không phải 2,5). Để có được kết quả chính xác với phần phân số, 
			một trong các giá trị liên quan đến phép chia phải là số bằng dấu thập phân. Ví dụ: 5,0/4 là 1,25 và 10/4,0 là 2,5.
			
			dân số hiện nay: 312.032.486 người
			1 năm có: 365 ngày
			cứ: 
			7s = 1 ca sinh nở
			13s = 1 người chết
			45s = 2 người nhập cư mới
		 */
		
		
		long currentPopulation = 312032486;
		long secondsInYear = 365 * 24 * 60 * 60;
		int years = 5;
		
		int born = 7;
		int dead = 13;
		int immigration = 45;
		
		long bornPerYear = secondsInYear / born;
		long deadPerYear = secondsInYear / dead;
		long immigrationPerYear = secondsInYear / immigration;
		
		System.out.println("Dân số hiện tại là: " + currentPopulation);
		for (int year = 1; year <= years ; year ++) {
			currentPopulation = currentPopulation + bornPerYear - deadPerYear + immigrationPerYear;
			System.out.println("Dân số trong " + year + " tiếp theo là: " + currentPopulation + " người");
		}
	}

}
