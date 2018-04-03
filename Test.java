package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class Test {
	public static String output ="";
	public static void foo(int i){
		try {
			if(i == 1){
				throw new Exception();
			}
			output += "1";
			
		} catch (Exception e) {
			output += "2";
			return;
		}finally{
			output += "3";
		}
		output += "4";
	}
	public String doSoming(){
		return "do";
	}
	public static void main(String[] args) {
		//foo(0);
		//foo(1);
		//System.out.println(output);
		/*int a = 1000;
		int b = 1000;
		System.out.println(a == b);//true 
		int c = 100;
		int d = 100;
		System.out.println(c == d);//true
		Integer e = 1000;
		Integer f = 1000;
		System.out.println(e == f);//false
		System.out.println(e.equals(f));//true
		Integer g = 100;
		Integer h = 100;
		System.out.println(g == h);//true
		System.out.println(g.equals(h));//true
		String i = "abc";
		String j = "abc";
		System.out.println(i == j); //true
		System.out.println(i.equals(j));//true
		String l = new String("abc");
		String m = new String("abc");
		System.out.println(l == m); //false
		System.out.println(l.equals(m)); //true
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println(sc1 == sc2);//false
		System.out.println(sc1.equals(sc2));//false
		final LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(2);//索引，去除了数据3
		System.out.println(list);
		System.out.println(list.toString());
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", list);
		map.put("i", i);
		map.put("j", j);
		for (Map.Entry<String,Object> maps : map.entrySet()) {
			System.out.println(maps.getKey()+":"+maps.getValue());
		}
		for (String maps : map.keySet()) {
			System.out.println(maps+":"+map.get(maps));
		}
		
		Iterator<Map.Entry<String,Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
					System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println(8 >> 2);
		
		String s1 = "hello";
		String s2 = "he" + new String("llo");
		String s3 = "he" + "llo";
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//true
		String y = "llo";
		String s4= "he" + y;
		System.out.println(s1 == s4);//false
*/		
		int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		bubbleSort1(arr);
		for (int k : arr) {
			System.out.println(k);
		}
		
	}
	public static void bubbleSort1(int [] a){
	    int i, j;

	    for(i=0; i<a.length; i++){//表示n次排序过程。
	        for(j=1; j<a.length-i; j++){
	            if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
	                //交换a[j-1]和a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;
	            }
	        }
	    }
	}// end
	
}
