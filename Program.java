package Teste;

import java.util.Scanner;

import Entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		  
		        Scanner sc=new Scanner(System.in);

		        int a = 20;
		        int b =10;
		        Calculadora calculadora=new Calculadora();
		       

		        int c=calculadora.somar(20, 30);
		        
		        System.out.println(c);
		    
		    }

	}


