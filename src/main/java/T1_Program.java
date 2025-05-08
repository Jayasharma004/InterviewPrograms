public class T1_Program {

	public void sum(int[] arr)
	{
	int sum=0;
		for (int i=0; i< arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum : "+sum);
	}

	public void reverse()
	{
	    StringBuffer str = new StringBuffer("Jaya");
	    str.reverse();
		System.out.println("str : "+str);
	}

	public static void main(String[] args) {
		int [] arr = {-1, -2, 7, 8, 3};
		new T1_Program().sum(arr);
		new T1_Program().reverse();
	}

}
