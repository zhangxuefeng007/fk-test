package test;

public class 嘻嘻 {
	public static void main(String[] args) {
		Thread a1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				mm();
			}
			
			synchronized void mm() {
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("我被中断了");
					e.printStackTrace();
				}
			}
		});
		
		a1.start();
		//这个只有dev中有asdsxixixixi
		//sdfsdfsd
		
		a1.interrupt();
	}
}
