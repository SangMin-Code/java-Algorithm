package sw;
import java.util.ArrayList;
public class permutation {
	public static void main(String[] args) {
		
		//중복 숫자 없는 순열
		//{1,2,3,4,5,6}
		/*
		String a = "";
		String b = "";
		String c = "";
		int [] list = {1,3,5};
		for(int i=0; i<list.length; i++)
		{
			a = list[i]+"";
			for(int j=0; j <list.length; j++)
			{
				if(i!=j)
					{
						b = list[j]+"";
						for(int k=0; k<list.length; k++)
						{
							if(k!=j && k!=i)
							{
								c=list[k]+"";
							}
						}
					}
			}
			System.out.println(a+b+c);
		}
		*/
		
		int[] list = {1,2,2};
		perm(list,0,3,3);
	}
	
	static void perm(int[] arr, int depth, int n, int k) {
		if(depth == k)
		{
			print(arr);
			return;
		}
		for(int i=depth; i < n; i++)
		{
				swap(arr,i,depth);
				perm(arr,depth+1,n,k);
				swap(arr,i,depth);
		}
		
	}
	static void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx2];
		arr[idx2]=arr[idx1];
		arr[idx1]=temp;
	}
}
