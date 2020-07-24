package Jogo;


public class Tabuleiro 
{
	private static String[][] tabuleiro = {{" "," "," "},{" "," "," "},{" "," "," "}};
	private static int i,j;
	
	
	
	//O metodo imprime a matriz tabuleiro.
	static void  imprimeJogada()
	{
		System.out.println("0 | 1| 2\n");
		for (i = 0 ; i < tabuleiro.length ; i++)
		{
			for(j = 0 ; j < tabuleiro[i].length;j++)
			{
				if(j == 1 || j == 2)
				{
					System.out.print("|");
				}
				System.out.print(tabuleiro[i][j] + " ");
				
			}
			System.out.print("\n");
		}
	}
	//O metodo atribui um espa�o em branco a todas as zonas da matriz e zera o numero de jogadas validas.
	static void limpartabuleiro()
	{
		for (i = 0 ; i < tabuleiro.length ; i++)
		{
			for(j = 0 ; j < tabuleiro[i].length;j++)
			{
				tabuleiro[i][j] = " ";
			}
		}
		Jogada.setJogadasValidas(-Jogada.getJogadasValidas());
	}
	
	//O metodo recebe um posi��o e retorna a zona corespondente a essa posi��o.
	static String getPosicaoTabuleiro(int linha, int coluna) 
	{
		return tabuleiro[linha][coluna];
	}
		
	//O metodo recebe uma posi��o e o simbolo que deve ser atribuido e atribui a matriz na posi��o passada.
	static void setPosicaoTabuleiro(int linha, int coluna) 
	{
		tabuleiro[linha][coluna] = Jogador.getSimbolo();
	}
}
