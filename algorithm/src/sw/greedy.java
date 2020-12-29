package sw;

public class greedy {
	public static void main(String[] args) {
		
		int num = 111134;
		int triplet = 0;
		int run = 0;
		int[] list= new int[10];
		
		while(num>0)
		{
			list [num%10]++;
			num/=10;
		}
		for(int i=0; i <10; i++)
		{
			if(list[i]>=3)
			{
				list[i]-=3;
				triplet++;
			}
			if(i<8 && list[i]>=1 &&
					  list[i+1]>=1 &&
					  list[i+2]>=1)
			{
				list[i]--;
				list[i+1]--;
				list[i+2]--;
				run++;
			}
		}
		if(run+triplet>1) System.out.println("baby-git");
		else System.out.println("non");
	}
}
