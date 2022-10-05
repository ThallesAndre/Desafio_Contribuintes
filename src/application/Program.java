package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Quantos contribuintes voce vai digitar? ");
		n = sc.nextInt();
		
		for ( int i=0; i<n;i++) {
			System.out.printf("Digite os dados do " +(i+1)+ "o contribuinte: %n");
			System.out.print("Renda anual com salario: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestacao de servico: ");
			double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			System.out.println("");
			list.add(new TaxPayer(salaryIncome,serviceIncome,capitalIncome,healthSpending,educationSpending)); 
		}
		int contador =0;
		for (TaxPayer obj : list) {
			contador += 1;
			System.out.println("");
			System.out.printf("Resumo do "+(contador)+"o contribuinte: %n");
			System.out.printf("Imposto bruto total: %.2f%n", obj.grossTax());
			System.out.printf("Abatimento: %.2f%n", obj.taxRebate());
			System.out.printf("Imposto devido:%.2f%n", obj.netTax());
			System.out.println("");
			
		}
		
		sc.close();
	}

}
