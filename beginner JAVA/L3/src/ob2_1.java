import java.util.Scanner;
public class ob2_1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("输入整数a");
		int a = sc1.nextInt();
		System.out.println("输入整数b");
		int b = sc2.nextInt();
		System.out.println("输入一个符号");
		String s = sc.next();
		if(s.equals("+")){
			System.out.println(a+"+"+b+"="+(a+b));
		}else {
			if(s.equals("+")){
				System.out.println(a+"-"+b+"="+(a-b));
			}else{
				if(s.equals("*")){
					System.out.println(a+"*"+b+"="+(a*b));
				}else {
					if(s.equals("/")){
						System.out.println(a+"/"+b+"="+(a/b));
					}
				}
			}
		}	
		sc.close();
		sc1.close();
		sc2.close();
	}
}
