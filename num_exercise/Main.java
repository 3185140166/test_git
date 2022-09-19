import java.util.Scanner;
public class Main{
	public int findMaxArray(int[] array){
		if(array == null || array.length ==0){
			return Integer.MIN_VALUE;
		}
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int i=0;i<array.length;i++){
			if(currentSum<0){
				currentSum = array[i];
			}else{
				currentSum += array[i];
			}
			maxSum = Math.max(maxSum,currentSum);
		}
		return maxSum;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Main m = new Main();
		System.out.println("请输入的数组长度：");
		int size = in.nextInt();
		int [] nums = new int[size];
		System.out.println("请输入数组：");
		for(int i=0;i<size;i++){
			nums[i]=in.nextInt();
		}
		int maxSum = m.findMaxArray(nums);
		System.out.println("最大值为："+maxSum);
	}
}