import java.util.Scanner;
class rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float l=sc.nextInt();
		float w=sc.nextInt();
		
		double perimeter = 2*(l+w);
		System.out.print(perimeter);
	}
}
