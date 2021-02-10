package InterviewProblems;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class checkKeyForSegment {
	
	public boolean isKeyFound(int arr[],int key,int size){
		int rem= arr.length%size; 
		
		int i;
		boolean flag=false;
		for(i=0;i<arr.length-rem;i=i+size){
			flag=false;
			for(int j=0;j<size;j++){
				if(arr[i+j]==key){
					flag=true;
					break;
					}	
				}
			if(!flag)
				return flag;
		}
		
		if(rem!=0){
			flag=false;
		for(int j=i;j<i+rem;j++){
			if(arr[j]==key){
				flag=true;
				break;
			}			
		}
	}
	
		 
//		i=i-size;
//		for(;i<arr.length;i++){
//			if(arr[i]==key){
//				flag=true;
//				break;
//			}
//		}
	return flag;
		
	}

	@Test(dataProvider="inputData")
	public void verifyKeyPresence(int arr[]){
		int key=3;
		int size=3;
		System.out.println(""+isKeyFound(arr,key,size));				
	}
	
	@DataProvider(name="inputData")
	public Object[][] inputData(){
		return new Object[][]{
				{new int[]{3,2,1,5,6,3,6,3,8}},
				{new int[]{3,2,1,5,6,3,6,2,8}},
				{new int[]{3,2,1,5,6,3,6,3,8,3,2}},
				{new int[]{3,2,1,5,6,3,6,3,8,4,2}}
		};
		
	}
}
