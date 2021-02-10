package InterviewProblems;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class minMaxofArray {
	
	
	private static int findMin(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}
	
	private static int findMax(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}

	@Test(dataProvider="inputData")
	public void findMinValue(int arr[]){
		System.out.println("Min Value is "+ findMin(arr));
				
	}
	
	@Test(dataProvider="inputData")
	public void findMaxValue(int arr[]){
		System.out.println("Max Value is "+ findMax(arr));	
	}
	
	@DataProvider(name="inputData")
	public Object[][] inputData(){
		return new Object[][]{
				{new int[]{32,11,8,2,16,25,1,4}},
				{new int[]{32,11,8,2,16,25,1,4,0}},
				{new int[]{0,32,11,8,2,16,25,1,4}}				
		};
		
	}

}
