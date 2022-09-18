import java.util.Scanner;

public class Tabuada{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual Tabuada Exibir? ");
		int n = sc.nextInt();
		
	
		System.out.println("--- Resultado ---");
		//Montar a tabuada
		
		//i x n = n * i;
		for(int i = 1; i < 11; i++){
			System.out.println("| " + i + " x " + n + " = " + (i*n));
		}
		System.out.println("-----------------");
		
	}
}