class ForDemo {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("----------------------");
		for(int i = 1; i <= 10; i = i + 2) {
			System.out.println("i = "+i);
		}
		System.out.println("----------------------");
		for(int i = 10; i > 0;  i--) {
			System.out.println("i = "+i);
		}
	}
}