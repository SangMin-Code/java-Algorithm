package sw;

public class uncommonSort {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		
		//1. max, min max(2) min(2)
		
		for(int i=0; i<list.length-1; i++) 
		{
			int max = 1;
			int min = 10;
			
			for (int j =i+1; j<list.length; j++)
			{
				if(i%2==0 && list[j]>list[i]) swap(list,i,j);
				else if(i%2!=0 && list[j]<list[i]) swap(list,i,j);
			}
			
		}
		for(int a : list) {
			System.out.println(a);
		}
 	}
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx2];
		arr[idx2]=arr[idx1];
		arr[idx1]=temp;
	}
}
