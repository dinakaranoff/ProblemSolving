package InterviewProblems;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZeroAndOneSorting {

	private static int[] sorting(int arr[]){
			
		int i=0;
		int j=i+1;
		boolean flag=false;
		int k=i;
		while(j<arr.length){
			
			if(arr[i]==1 && flag!=true){
				k=i;
				flag=true;
			}
			if(arr[i]>arr[j]){
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				i++;
				j++;
				k=k+1;
			}else{
				i++;
				j++;
			}
		}	
		
		return arr;
		
	}
	
private static int sortingV2(int arr[]){
	int zeroCount = 0;
	for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				zeroCount=zeroCount+1;
			}
		}
    return zeroCount;
}

private static int[] sortingV3(int arr[]){
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;				
			}
		}
	}
return arr;
}
	

	
	@Test(dataProvider="inputData")
	public void testSort(int arr[]){
		arr=sorting(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	//@Test(dataProvider="inputData")
	public void testSort2(int arr[]){
		int zeroCount=sortingV2(arr);
		for(int i=0;i<zeroCount;i++){
			System.out.println(0);
		}
		for(int i=0;i<arr.length-zeroCount;i++){
			System.out.println(1);
		}
	}
	
	
	@Test(dataProvider="inputData")
	public void testSort3(int arr[]){
		arr=sortingV3(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}		
	}
	
	@DataProvider(name="inputData")
	public Object[][] inputData(){
		return new Object[][]{
				{new int[]{0,0,1,0,1,1,0,0,1,0}},
				{new int[]{0,0,1,1,0,0,0,1,0,0,1,0}},
				{new int[]{0,0,1,0,0,1,0,1,1,0,0,0,1}}				
		};
		
	}
	
}
