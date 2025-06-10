import java.util.Scanner;
class KmToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float km=sc.nextInt();
		
		double miles = km*0.621371;
		System.out.print(miles);
	}
}
