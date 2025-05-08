
// Bottomline Interview
// Write a program for deadlock in multithreading
public class T11_BottomLine_Multithreading extends Thread {
	
	public void run()
	{
		int counter=0;
		counter++;
		System.out.println("counter : "+counter);
	}
	
	public static void main(String[] args) {
		T11_BottomLine_Multithreading thread1 = new T11_BottomLine_Multithreading();
		T11_BottomLine_Multithreading thread2 = new T11_BottomLine_Multithreading();
		thread1.start();
		thread2.start();
	}
}
