package InterviewProblems;

import org.testng.annotations.DataProvider;

public class StringDivide {

	public static String intConvert(int num1, int num2){		
		int res1;
		int res2;
		int i=0;
		StringBuilder result=new StringBuilder();
		for( i=num1;i>1;i--){
			if(num1%i==0 && num2%i==0){
				res1=num1/i;
				res2=num2/i;
				if(res2%res1!=0){
				result.append(res2).append("/").append(res1);
				}else{
				result.append(res2);
				}
			 return result.toString();				
			}
		}
		if(i==1){
			result.append(num2).append("/").append(num1);
		}
	return result.toString();			
}
	
	private String stringConvert(String data) {		
		String[] arr= data.split("/");
		int num1=Integer.parseInt(arr[0]);
		int num2= Integer.parseInt(arr[1]);
		int res1;
		int res2;
		int i=0;
		StringBuilder result=new StringBuilder();
		for( i=num1;i>1;i--){
			if(num1%i==0 && num2%i==0){
				res1=num1/i;
				res2=num2/i;
				if(res2%res1!=0){
				result.append(res2).append("/").append(res1);
				}else{
				result.append(res2);
				}
			 return result.toString();				
			}
		}
		if(i==1){
			result.append(num2).append("/").append(num1);
		}
	return result.toString();	
	}
	
	
	
	@org.testng.annotations.Test(dataProvider="intData")
	public void testSort(int num1,int num2){
		String value=intConvert(num1,num2);
		System.out.println("value "+value);
	}
	

	@org.testng.annotations.Test(dataProvider="stringData")
	public void testSort(String data){
		String value=stringConvert(data);
		System.out.println("value "+value);
	}
	
	
	@DataProvider(name="intData")
	public Object[][] intData(){
		return new Object[][]{
				{60,90},{110,111},{5,50},{6,2}
		};
	}
	
	@DataProvider(name="stringData")
	public Object[][] stringData(){
		return new Object[][]{
				{"60/90"},{"110/111"},{"5/50"},{"6/2"}
		};
	}
	
	public static void main(String[] args){
		System.out.println("12");
	}
}
