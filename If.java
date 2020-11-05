import java.util.Scanner;

public class If{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int a = 0;
	System.out.println("---------------");
	System.out.println("Introduce 1 para hola y otro numero para adios");
	System.out.println("---------------");
	a=scanner.nextInt();
	System.out.println("---------------");
	
	if(a==1){
		System.out.println("Hola!!!!");
	}	else{
			System.out.println("Adeu!!!");

}
	System.out.println("---------------");

	}
}
