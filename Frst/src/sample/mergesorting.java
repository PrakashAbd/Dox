package sample;

import java.util.Scanner;

public class mergesorting {
	public static void sort(int[] a, int low, int high) {
		int len = high - low;
		if (len <= 1)
			return;
		int mid = low + len / 2;

		sort(a, low, mid);
		sort(a, mid, high);

		int[] temp = new int[len];
		int i = low, j = mid;
		for (int k = 0; k < len; k++) {
			if (i == mid)
				temp[k] = a[j++];
			else if (j == high)
				temp[k] = a[i++];
			else if (a[j] < a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < len; k++)
			a[low + k] = temp[k];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();

		sort(a, 0, n);

		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
		s.close();
	}
}