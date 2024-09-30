package com.edu.seiryo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.print.attribute.standard.RequestingUserName;

import org.w3c.dom.stylesheets.LinkStyle;
//除了author还有例如date类的创建时间，version，类的版本，等其他的参数可以编写
//【可以通过编辑器，修改默认出的参数个数】
/**
 * 
 * @author Seiryo-Huang
 * 
 */
public class Test {
	
	//额外作业：以键值对的形式展示map中的数据，不要用get一个个获取输出
//	  map.put("bookName","java oop");
//    map.put("author", "john");
//    map.put("price", 50);//自动装箱
//    map.put("price", 80);//出现重复的键:price
//    map.put(null,"nothing");//空键
//	  bookName java oop
//	  author   john
//	  ...
	
	public static void main(String[] args) {
		//接口指向实现类
		//同样是List，传入不同的消息，有不同的结果（多态）
		
		//List接口的特点：存储顺序有序的，可以保存重复元素
			//List接口中的实现类有
			//arrayList/linkedList/vector
		
			//arrayList数组结构
				//add/remove
				//add方法可以添加不同类型的数据
				//remove有两种不同的删除方式，根据下表或元素本身删除
				//size、get，获取元素的长度，及根据下表获取元素内容
		
			//linkedList双向链表数据结构（先进先出方法存储数据）
			//linkedList同时实现了List接口与Queue接口（所以除了List接口中的方法，还有一些自己独有的方法）
			//因为linkedList实现了多个接口，如需要调用不同接口的方法，不能实现某一个具体的接口指向实现类，如果使用具体的接口，那么只能使用该接口中的方法
		
		//ArrayList与LinkedList区别
			//1.ArrayList是接口指向实现类，LinkedList是直接实例化本身
			//2.LinkedList中有自己独有的一些方法，ArrayList没有
				//addFirst、addLast、removeFirst、removeLast
			//3.linkedList在做增删改操作时性能较高,查询效率较低。ArrayList在做查询操作时，运行性能会较高，增删改较低
		
		//Vector与ArrayList区别
			//当元素存满时，ArrayList自动增长二分之一而Vector自动增长一倍
				//默认初始长度都是20，ArrayList会自动增长为30,Vector为40
				//Arraylist是线程不安全的(性能更高)，Vector是线程安全的（性能更低）【单线程程序】（多线程）
		
		//绝大多数情况下，都使用ArrayList
		//即便特殊情况，需要使用LinkedList或Vector，基本的使用与ArrayList相同
		
		
		//Set接口，存储无序的(不是按照添加顺序展示，按照元素的hash值排列展示)，不可以保存重复的，继承自Collection
		//Set接口与List接口使用上基本相同，add、remove。
		//Set根据hash排列，没有下标，所以如果需要遍历，需要依靠Iterator迭代器进行迭代遍历。hasNext判断、next获取值
		//HashSet/TreeSet
		
		//Map接口
		//1.以键值对的形式存储数据
		//2.不允许出现重复键(后添加的键覆盖前面的键)，可以重复值
		//3.顺序是无序的
		//Map接口常用方法
			//1.get方法，Object get(Object),传递键的名称，返回值（获取单一的值）
			//2.put方法，Object put(Object k,Object v),存入数据，存入一组数据（存入数据）
			//3.keySet方法，Set keySet()，返回map中所有的key，会把key放入一个Set对象中，接着遍历set对象就可以得到所有的key
			//4.values方法，Collection values()，返回map中所有的value，会把value放入一个Collection对象中，接着遍历Collection对象就可以得到所有的value
		//Map中有HashMap与HashTable两个实现类
			//常用的是HashMap，HashTable是线程安全的，HashTable中不允许存在空键、空值。
		
		//泛型
			//可以用在所有的集合上，主要用来确定集合的类型,方便后续数据的添加、获取操作
			//除非集合有添加不同类型数据需求，不然大多数情况下最好给上泛型，较为安全
		List<Integer> list = new ArrayList<Integer>();
		Set<String> set = new HashSet<String>();
		Map<Integer,String> map = new Hashtable<Integer,String>();
//		map.put(key, value)
//		Map map = new Hashtable();
//	    map.put("bookName","java oop");
//	    map.put("author", "john");
//	    map.put("price", 50);//自动装箱
//	    map.put("price", 80);//出现重复的键:price
//	    map.put(null,"nothing");//空键
	    
	    //1.根据具体的键得到具体的值
//	    Object aString =  map.get("bookName");
//		System.out.println(aString);
		
		//2.获取所有的值
//		Collection collection = map.values();
//		Iterator iterator = collection.iterator();
//		//判断iterrator迭代下，有没有下一个元素，有就返回true
//		while (iterator.hasNext()) {
//			//拿到下一个元素
//			System.out.println(iterator.next());
//		}
//		//3.获取所有的键
//		Set set = map.keySet();
//		
//		Iterator iterator2 = set.iterator();
//		//判断iterrator迭代下，有没有下一个元素，有就返回true
//		while (iterator2.hasNext()) {
//			//拿到下一个元素
//			System.out.println(iterator2.next());
//		}
		
//		Set set = new HashSet();
//		set.add("abc");
//		set.add("abc");
//		set.add(123);
//		set.add(9877.654);
////		for (int i = 0; i < set.size(); i++) {
//			//因为set接口是无序的，也没有提供get方法，所以不能用与list相同的方式遍历获取所有的数据
////			System.out.println(set.get);
////		}
//		//Iterator迭代器，用于循环取出对象中的值
//		//iterator
//		Iterator iterator = set.iterator();
//		//判断iterrator迭代下，有没有下一个元素，有就返回true
//		while (iterator.hasNext()) {
//			//拿到下一个元素
//			System.out.println(iterator.next());
//		}
		
		
		
		
		//
		
		
//		List arrayList = new ArrayList();
//		
//		LinkedList linkedList = new LinkedList();
//		
//		arrayList.add(123);
////		arrayList.remove
//		linkedList.add(456);
//		linkedList.addFirst(123);
//		for (int i = 0; i < linkedList.size(); i++) {
//			System.out.println(linkedList.get(i));
//		}
//		List vector = new Vector();
//		vector.add(456);
//		vector.add(123);
//		for (int i = 0; i < vector.size(); i++) {
//			System.out.println(vector.get(i));
//		}
		
	}
	/**
	 * 此方法是进行加法运算方法，传递两个整形数据，返回相加结果
	 * @param a 第一个参数
	 * @param b 第二个参数
	 * @return 相加之和
	 */
	public int test(int a,int b){
		return 0;
	}
}
