

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findhowmanyelementpresentinarrays {

	public static void main(String[] args) {
		Integer a[]={2,3,5,6,7,8,9,9,0,11,13,15};
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i:a)
		{
		if(map.containsKey(i))
		{
		map.put(i, map.get(i)+1);
		}
		else
		{
		map.put(i, 1);
		}
		}
		//System.out.println(Arrays.toString(a));
		System.out.println("The Element Count is\n"+map);
		int maxInt=0;
		int maxPres=0;
		for(Map.Entry<Integer, Integer> hm : map.entrySet()) { 
			if(maxInt<hm.getValue()) {
				maxInt=hm.getValue();
				maxPres=hm.getKey();
				System.out.println("max Element is "+hm.getKey()+" = "+hm.getValue());
			}
				
			//System.out.println(hm.getKey()+" "+hm.getValue());
			
		}

	}

}
