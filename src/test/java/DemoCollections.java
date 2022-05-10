import java.util.ArrayList;
import java.util.List;

public class DemoCollections {
	
	
	public void setElement(int i, Object o, List l)
	{
		l.add(i,o);
	}
	
	public void printList(List l)
	{
		for(Object o : l)
		{
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		
		List l= new ArrayList<>();
		DemoCollections dm= new DemoCollections();
		dm.setElement(0, "kumar Ankesh",l);
		dm.printList(l);
		l.add("sachin");
		l.add("tendulkar");
		l.add("manis");
		Object temp;
		System.out.println(l);
		
		List l2= new ArrayList<>();
		for(int i =l.size()-1;i>=0;i--)
		{
			l2.add(l.get(i));
			
		}
		System.out.println(l2);
		
		l2.add("neha");
		System.out.println(l2);
		
		
	}

}
