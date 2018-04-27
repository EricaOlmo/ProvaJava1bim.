import java.util.Scanner;

public class ProvaErica {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		float num1;
		float num2;
		float num3;
		float num4;

		System.out.println("Informe o primeiro valor: ");
		num1 = scan.nextFloat();
		System.out.println("Informe o segundo valor: ");
		num2 = scan.nextFloat();
		System.out.println("Informe o terceiro valor: ");
		num3 = scan.nextFloat();	
		System.out.println("Informe o quarto valor: ");
		num4 = scan.nextFloat();

		float media = (num1 + num2 + num3 + num4) / 4;
		System.out.println("A media é "+media);
	}
}