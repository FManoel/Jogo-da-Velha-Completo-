package Jogo;

public class Ranking 
{
	private static int jogador1;
	private static int jogador2;
    private static	int velha;
	
	//Recebe o numero do jogador e atribui sua vitoria.
	static void vitoria(int vencedor)
	{
		if(vencedor == 1)
		{
			jogador1 += 1;
		}
		else if(vencedor == 2)
		{
			jogador2 += 1;
		}
		else
		{
			velha += 1;
		}
	}
	//Printa o placar de acordo com o numero de vitorias de cada jogador.
	static void placar()
	{
		if(jogador1 > jogador2)
		{
			System.out.println("\n\n1° - [X] com " + jogador1 + " vitoria[s].\n"+ "2° - [O] com " + jogador2 +" vitoria[s].\n"+  "Empates: "  + velha   );
		}

		else if(jogador1 < jogador2)
		{
			System.out.println("\n\n1° - [O] com " + jogador2 + " vitoria[s].\n"+ "2° - [X] com " + jogador1 +" vitoria[s].\n"+ "Empates: "  + velha );
		}
		else if(jogador1 == jogador2)
		{
			System.out.println("\n\n[X] e [O] estão empatados com "+ jogador1 +" vitoria[s].\n" + "Empates: "  + velha );
		}
		
	}
	//get para realizar o teste do metodo vitoria.
	public static int getjogador1() 
	{
		return jogador1;
	}

}
