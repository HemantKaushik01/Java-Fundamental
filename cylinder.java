import java.util.Scanner;
class cylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float r=sc.nextFloat();
		float h=sc.nextFloat();
		double volume=3.14*(r*r)*h;
		System.out.print(volume);
	}
}
