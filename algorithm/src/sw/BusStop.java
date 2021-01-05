package sw;

public class BusStop {
	public static void main(String[] args) {
		
		int k = 3;
		int n = 10;
		int m = 4;
		int[] stop = {1,5,8};
		int cnt =0;
		int location = 0;
		int index = 0;
		boolean flag = false;	
		
		while(true) {
			index = location;
			if(location + k >= n) break; //도착 성공
			else
			{
				loop:
				for(int i=index+k; i>index; i--)
				{
					for(int j =stop.length-1; j>=0; j--)
					{
						if(stop[j]==i)
						{
							flag = true;
							location = i;
							cnt++;
							break loop;
						}
					}
				}
				if(!flag)
				{
					System.out.println("0");
					break;
				}
			}
			flag = false;
		}
		if(location>=n)	System.out.println(cnt);
	}
}
