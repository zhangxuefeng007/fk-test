package test;

public class ���� {
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
					System.out.println("�ұ��ж���");
					e.printStackTrace();
				}
			}
		});
		
		a1.start();
		
		//sdfsdfsd
		
		a1.interrupt();
	}
}
