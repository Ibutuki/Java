import java.util.Scanner;
public class e8 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("��������");
		int ages = sca.nextInt();
		if(ages<18){
			System.out.println("δ����");
		}else{
			if(18<ages && ages<35){
				System.out.println("����");
			}else{
				System.out.println("����");
			}
		}
		sca.close();
	}

}