import java.util.*;
public class FrequencyMap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String token[]=str.split("\\s");
		LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<token.length;i++)
		{
			if(map.containsKey(token[i]))
				{

					map.put(token[i],map.get(token[i])+1);

				}
				else
				{
					map.put(token[i],1);
				}

		}
		for(Map.Entry k:map.entrySet())
			System.out.println(k.getKey()+"-"+k.getValue());
		map.clear();
		TreeMap<Character,Integer>mapp=new TreeMap<Character,Integer>();
		char arr[]=str.toCharArray();
		try
		{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
				continue;
			if(mapp.containsKey(arr[i]))
				{
					mapp.put(arr[i],mapp.get(arr[i])+1);

				}
				else
				{
					mapp.put(arr[i],1);
				}

		}
		
	}
	catch(Exception e)
	{

	}
	System.out.println("characters:"+mapp);

	}
}