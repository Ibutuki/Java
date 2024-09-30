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
//����author��������date��Ĵ���ʱ�䣬version����İ汾���������Ĳ������Ա�д
//������ͨ���༭�����޸�Ĭ�ϳ��Ĳ���������
/**
 * 
 * @author Seiryo-Huang
 * 
 */
public class Test {
	
	//������ҵ���Լ�ֵ�Ե���ʽչʾmap�е����ݣ���Ҫ��getһ������ȡ���
//	  map.put("bookName","java oop");
//    map.put("author", "john");
//    map.put("price", 50);//�Զ�װ��
//    map.put("price", 80);//�����ظ��ļ�:price
//    map.put(null,"nothing");//�ռ�
//	  bookName java oop
//	  author   john
//	  ...
	
	public static void main(String[] args) {
		//�ӿ�ָ��ʵ����
		//ͬ����List�����벻ͬ����Ϣ���в�ͬ�Ľ������̬��
		
		//List�ӿڵ��ص㣺�洢˳������ģ����Ա����ظ�Ԫ��
			//List�ӿ��е�ʵ������
			//arrayList/linkedList/vector
		
			//arrayList����ṹ
				//add/remove
				//add����������Ӳ�ͬ���͵�����
				//remove�����ֲ�ͬ��ɾ����ʽ�������±��Ԫ�ر���ɾ��
				//size��get����ȡԪ�صĳ��ȣ��������±��ȡԪ������
		
			//linkedList˫���������ݽṹ���Ƚ��ȳ������洢���ݣ�
			//linkedListͬʱʵ����List�ӿ���Queue�ӿڣ����Գ���List�ӿ��еķ���������һЩ�Լ����еķ�����
			//��ΪlinkedListʵ���˶���ӿڣ�����Ҫ���ò�ͬ�ӿڵķ���������ʵ��ĳһ������Ľӿ�ָ��ʵ���࣬���ʹ�þ���Ľӿڣ���ôֻ��ʹ�øýӿ��еķ���
		
		//ArrayList��LinkedList����
			//1.ArrayList�ǽӿ�ָ��ʵ���࣬LinkedList��ֱ��ʵ��������
			//2.LinkedList�����Լ����е�һЩ������ArrayListû��
				//addFirst��addLast��removeFirst��removeLast
			//3.linkedList������ɾ�Ĳ���ʱ���ܽϸ�,��ѯЧ�ʽϵ͡�ArrayList������ѯ����ʱ���������ܻ�ϸߣ���ɾ�Ľϵ�
		
		//Vector��ArrayList����
			//��Ԫ�ش���ʱ��ArrayList�Զ���������֮һ��Vector�Զ�����һ��
				//Ĭ�ϳ�ʼ���ȶ���20��ArrayList���Զ�����Ϊ30,VectorΪ40
				//Arraylist���̲߳���ȫ��(���ܸ���)��Vector���̰߳�ȫ�ģ����ܸ��ͣ������̳߳��򡿣����̣߳�
		
		//�����������£���ʹ��ArrayList
		//���������������Ҫʹ��LinkedList��Vector��������ʹ����ArrayList��ͬ
		
		
		//Set�ӿڣ��洢�����(���ǰ������˳��չʾ������Ԫ�ص�hashֵ����չʾ)�������Ա����ظ��ģ��̳���Collection
		//Set�ӿ���List�ӿ�ʹ���ϻ�����ͬ��add��remove��
		//Set����hash���У�û���±꣬���������Ҫ��������Ҫ����Iterator���������е���������hasNext�жϡ�next��ȡֵ
		//HashSet/TreeSet
		
		//Map�ӿ�
		//1.�Լ�ֵ�Ե���ʽ�洢����
		//2.����������ظ���(����ӵļ�����ǰ��ļ�)�������ظ�ֵ
		//3.˳���������
		//Map�ӿڳ��÷���
			//1.get������Object get(Object),���ݼ������ƣ�����ֵ����ȡ��һ��ֵ��
			//2.put������Object put(Object k,Object v),�������ݣ�����һ�����ݣ��������ݣ�
			//3.keySet������Set keySet()������map�����е�key�����key����һ��Set�����У����ű���set����Ϳ��Եõ����е�key
			//4.values������Collection values()������map�����е�value�����value����һ��Collection�����У����ű���Collection����Ϳ��Եõ����е�value
		//Map����HashMap��HashTable����ʵ����
			//���õ���HashMap��HashTable���̰߳�ȫ�ģ�HashTable�в�������ڿռ�����ֵ��
		
		//����
			//�����������еļ����ϣ���Ҫ����ȷ�����ϵ�����,����������ݵ���ӡ���ȡ����
			//���Ǽ�������Ӳ�ͬ�����������󣬲�Ȼ������������ø��Ϸ��ͣ���Ϊ��ȫ
		List<Integer> list = new ArrayList<Integer>();
		Set<String> set = new HashSet<String>();
		Map<Integer,String> map = new Hashtable<Integer,String>();
//		map.put(key, value)
//		Map map = new Hashtable();
//	    map.put("bookName","java oop");
//	    map.put("author", "john");
//	    map.put("price", 50);//�Զ�װ��
//	    map.put("price", 80);//�����ظ��ļ�:price
//	    map.put(null,"nothing");//�ռ�
	    
	    //1.���ݾ���ļ��õ������ֵ
//	    Object aString =  map.get("bookName");
//		System.out.println(aString);
		
		//2.��ȡ���е�ֵ
//		Collection collection = map.values();
//		Iterator iterator = collection.iterator();
//		//�ж�iterrator�����£���û����һ��Ԫ�أ��оͷ���true
//		while (iterator.hasNext()) {
//			//�õ���һ��Ԫ��
//			System.out.println(iterator.next());
//		}
//		//3.��ȡ���еļ�
//		Set set = map.keySet();
//		
//		Iterator iterator2 = set.iterator();
//		//�ж�iterrator�����£���û����һ��Ԫ�أ��оͷ���true
//		while (iterator2.hasNext()) {
//			//�õ���һ��Ԫ��
//			System.out.println(iterator2.next());
//		}
		
//		Set set = new HashSet();
//		set.add("abc");
//		set.add("abc");
//		set.add(123);
//		set.add(9877.654);
////		for (int i = 0; i < set.size(); i++) {
//			//��Ϊset�ӿ�������ģ�Ҳû���ṩget���������Բ�������list��ͬ�ķ�ʽ������ȡ���е�����
////			System.out.println(set.get);
////		}
//		//Iterator������������ѭ��ȡ�������е�ֵ
//		//iterator
//		Iterator iterator = set.iterator();
//		//�ж�iterrator�����£���û����һ��Ԫ�أ��оͷ���true
//		while (iterator.hasNext()) {
//			//�õ���һ��Ԫ��
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
	 * �˷����ǽ��мӷ����㷽�������������������ݣ�������ӽ��
	 * @param a ��һ������
	 * @param b �ڶ�������
	 * @return ���֮��
	 */
	public int test(int a,int b){
		return 0;
	}
}
