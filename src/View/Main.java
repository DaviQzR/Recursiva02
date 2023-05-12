package View;

import Controller.Menor;

public class Main 
{

	public static void main(String[] args) 
	{
		Menor contro = new Menor();
		int tamanho = (int)(Math.random()* 5)+ 1;
		int vetor [] = new int [tamanho];
		System.out.println("Tamanho do vetor: " + tamanho);
		System.out.print("Vetor: ");
		for (int i =0; i < tamanho; i++)
		{
			int valor = (int)(Math.random()*10) + 1;
			vetor[i] = valor;
			System.out.print(vetor[i]+ " ");
		}
System.out.println("");
		
		int ultvalor = vetor[tamanho - 1];
		
		int resultado = contro.MenorValor(vetor, tamanho, ultvalor);
		System.out.println("Menor valor: " + resultado);
	}

}
