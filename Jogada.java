package Jogo;

import java.util.Scanner;


public class Jogada
{
	static Scanner teclado = new Scanner(System.in);
	private static int jogadasValidas = 0;
	

	//Metodo para verificar se a entrada é um numero entre 0 e 2.
	public static boolean validaEntrada(int x, int y)
	  {
		  if(x <= 2 && x >=0 && y <=2 && y >=0)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	//Metodo verifica se já ocoreu uma jogada na zona inserida
		public static boolean validaJogada(int linha, int coluna)
		  {
			  if(Tabuleiro.getPosicaoTabuleiro(linha, coluna).equals(" "))
			  { 
				  
				  return true;
			  }
			  else
			  {
				  return false;
			  }
		  }
		//Metodo recebe a jogada que já foi validada e atribui a matriz.
		public static void execultaJogada(int linha, int coluna)
		{
			Tabuleiro.setPosicaoTabuleiro(linha, coluna);
		}
		
		
	  
		public static int getJogadasValidas() 
		{
			return jogadasValidas;
		}
	
		public static void setJogadasValidas(int jogadasValidas) 
		{
			Jogada.jogadasValidas += jogadasValidas;
		}
	
	
	
}
