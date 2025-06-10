import java.util.Scanner;
class average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float a=sc.nextInt();
		float b=sc.nextInt();
		float c=sc.nextInt();
		double average = (a+b+c)/3;
		System.out.print(average);
	}
}
