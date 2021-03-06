package demo2;

public class CustomerDemo {
	
	public static void main(String[] args) {
		
		// enum 타입의 상수값을 사용하는 Customer 생성
		Customer customer1 = new Customer("홍길동", Grade.VIP);
		Customer customer2 = new Customer("홍길동", Grade.GOLD);
		Customer customer3 = new Customer("홍길동", Grade.SILVER);
		Customer customer4 = new Customer("홍길동", Grade.BRONZE);
		
		// enum 타입에서 정의한 상수값 외의 값은 대입 될 수 없음 (컴파일시 에러)
//		Customer customer5 = new Customer("홍길동", "골드");
//		Customer customer6 = new Customer("홍길동", 0);
//		Customer customer7 = new Customer("홍길동", Grade.VVIP);
		
		System.out.println(getPoint(customer1, 120000));
		System.out.println(getPoint(customer2, 120000));
		System.out.println(getPoint(customer3, 120000));
		System.out.println(getPoint(customer4, 120000));
		
	}
	
	public static int getPoint(Customer customer, int orderPrice) {
		
		int point = 0;
		if (customer.getGrade() == Grade.VIP) {
			point = (int) (orderPrice * 0.07) ;
		} else if (customer.getGrade() == Grade.GOLD) {
			point = (int) (orderPrice * 0.05) ;
		} else if (customer.getGrade() == Grade.SILVER) {
			point = (int) (orderPrice * 0.03) ;
		} else if (customer.getGrade() == Grade.BRONZE) {
			point = (int) (orderPrice * 0.01) ;
		} 
		
		return point;
	}
	
}
