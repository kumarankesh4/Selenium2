import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	
	int[] numbers= {1,2,3,4,5,0,0,5,9};
	int temp=0;
	for(int i=0;i<numbers.length;i++)
	{
		 temp=0;
		for(int j=i+1;j<numbers.length;j++)
		{
			if(numbers[i]>numbers[j])
			{
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				
				
				
				
			}
			
			
			
		}
	}
	
	for(int i=0; i<numbers.length;i++)
	{
		System.out.print(numbers[i]);
	}
	
	
	
	
	
	
}
}
