package teste;

import java.util.Scanner;

public class Exercicio3Prof {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int idade, AnosDeEmpresa, filho;
		String  EstadoCivil, nome;
		float salario;
		
		
		
		System.out.println("Qual � o seu nome");
		nome = sc.next();
		
		
		System.out.println("Digite a sua idade");
		idade = sc.nextInt();
		
		
		System.out.println("Qual � o seu estado civil ? ");
		 EstadoCivil = sc.next();
		 
		 
		 System.out.println("quantos filhos vc tem ? ");
		 filho = sc.nextInt();
		 
		 
		 System.out.println("Quantos anos voc� tem de empresa ? ");
		 AnosDeEmpresa = sc.nextInt();
		 
		 
		 System.out.println("Qual � o seu salario ? ");
		 salario = sc.nextInt();
		 
		 
		 if(idade>60){
			 System.out.println("Apresentar plano de aposentadoria");
		 }else {
			 System.out.println("Sem plano de aposentadoria para funcionario");
			 
		  if(filho>0){
			 System.out.println("Voc� tem direito ao auxilio familia");
			 
		 }else {
			 System.out.println("Voc� n�o tem direito ao auxilio familia");
			 
		  if(AnosDeEmpresa > 5){
			 System.out.println("Funcionario com direito a abono salarial");
			 
		 }else {
			 System.out.println("Funcionario n�o tem direito a abono salarial");
			 
		 if(salario > 4.300){
			 System.out.println("Funcionario tem direito a, segura de vida e sa�de");
				 
		 }else {
			 System.out.println("Funcionario n�o tem direito a, seguro de vida e sa�de");
			 
			 }
		 }
		 }
		 }
	}
}	
		 
	

		 
	     
			 
			 
		 
		 
		 
	


