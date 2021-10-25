import java.util.Scanner;

public class CalcularImc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Digite o peso: ");
		Double valorPeso = scanner.nextDouble();
		
		System.out.print("Digite a altura: ");
		Double valorAltura = scanner.nextDouble();
		
		 
		Double resultado = valorPeso / (valorAltura * valorAltura);
		System.out.printf("Seu IMC é: " +String.format("%.2f", resultado));
		 
		
		scanner.close();
	}

}