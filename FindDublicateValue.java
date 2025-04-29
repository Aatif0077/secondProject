import java.util.*;
import java.io.*;

public class FindDublicateValue{
	public static void main(String ...as){
		String str = "AatifShaheenKhan";
		ArrayList<Character> al = new ArrayList<>();
		for(int i=0; i<str.length(); i++)
		{
			al.add(str.charAt(i));
		}
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			hm.putIfAbsent(al.get(i),Collections.frequency(al,al.get(i)));
		}
		for(Map.Entry<Character,Integer>e:hm.entrySet())
		{
			System.out.println("....Get-Character-is...."+e.getKey()+".....And-Get-Count-Value-String...."+e.getValue());
		}
	}
}