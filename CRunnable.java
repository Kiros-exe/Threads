public class CRunnable {
	public static void main(String[] args) {
		System.out.println("Começando apenas com o main");
		Clock.c();
		Clock counter=new Clock("th #2");
		Thread t1=new Thread(counter);
		t1.start();
	}
}
