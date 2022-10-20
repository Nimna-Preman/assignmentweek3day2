package week3day2assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				String name ="Nimna";
				char []name1 =name.toCharArray();

				List<Character> list= new ArrayList<Character>();
				for(int i =0;i<name1.length;i++) {
					list.add(name1[i]);
				}

				Set<Character> set=new HashSet<Character>();


				for(int i =0;i<list.size();i++) 
				{if(set.contains(list.get(i))) 
					set.remove(list.get(i));
				else
				{
					set.add(list.get(i));
				}
				}
				System.out.println(set);

			}
		}

	


