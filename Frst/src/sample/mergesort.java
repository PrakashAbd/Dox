package sample;
public class mergesort 
{
	public static int a[] = {12,5,9,4,10,2,6,8};
	public static void merge(int a,int b)
	{
		if(a<b)
		{
			int mid = (a+b)/2;
			merge(a,mid);
			merge(mid+1,b);
			sort(a,mid,b);
		}
	}
	public static void sort(int low, int mid,int high)
	{
		int l = low, i = low, m = mid+1, k;
		int b[] = new int[low+high];
		while(l<=mid && m<=high)
		{
			b[i++] = (a[l]<=a[m])? a[l] : a[m];
		}
		if(l>mid)
		{
			for(k=m;k<=high;k++)
				b[i++] = a[k];
		}
		else
		{
			for(k=l;k<=mid;k++)
				b[i++] = a[k];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge(0,a.length);
	}

}
