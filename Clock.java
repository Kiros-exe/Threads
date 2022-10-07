public class Clock implements Runnable{
	static final int wait=900;
	private String n;
	public Clock(String n) {
		this.n=n;
	}
	public static void c() {
		try {
			for(int i=1;i<=15;i++) {
				System.out.print("Número: "+i);
				if(!(i%2==0)) {
					System.out.println(" suspendendo por: "+wait+"ms ");
					Thread.sleep(wait);
				}else {
					System.out.print("\n");
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.print("Começando a Thread "+this.n+" ");
		this.c();
		System.out.print("Terminando a Thread "+this.n+" ");
		
	}
	
}
