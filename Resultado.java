package Jogo;

public class Resultado 
{
	//
	public static boolean vencedor()
	{ 
		//Analisa se tivemos um vencedor e imprime quem venceu.
		if(Tabuleiro.getPosicaoTabuleiro(0,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(0,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(0,2).equals("X") || Tabuleiro.getPosicaoTabuleiro(0,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(0,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(0,2).equals("O") )
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(1,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,2).equals("X") || Tabuleiro.getPosicaoTabuleiro(1,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,2).equals("O"))
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(2,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("X") || Tabuleiro.getPosicaoTabuleiro(2,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("O") )
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(0,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,0).equals("X") || Tabuleiro.getPosicaoTabuleiro(0,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,0).equals("O") )
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(0,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,1).equals("X") || Tabuleiro.getPosicaoTabuleiro(0,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,1).equals("O") )
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(0,2).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,2).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("X") || Tabuleiro.getPosicaoTabuleiro(2,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,2).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("O") )
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		
		else if(Tabuleiro.getPosicaoTabuleiro(0,0).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("X") || Tabuleiro.getPosicaoTabuleiro(0,0).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,2).equals("O"))
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Tabuleiro.getPosicaoTabuleiro(0,2).equals("X") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("X") && Tabuleiro.getPosicaoTabuleiro(2,0).equals("X") || Tabuleiro.getPosicaoTabuleiro(0,2).equals("O") && Tabuleiro.getPosicaoTabuleiro(1,1).equals("O") && Tabuleiro.getPosicaoTabuleiro(2,0).equals("O"))
		{
			System.out.println("\nJogador " + Jogador.getNjogador() + " ganhou!");
			return true;
		}
		else if(Jogada.getJogadasValidas() == 9)
		{
			System.out.println("\nDeu velha");
			return true;
		}
		return false;
	}

}
