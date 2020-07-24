package Jogo;

import java.util.Scanner;

public class Partida 
{
	static void partida()
	{
	int i,linha,coluna,opcao;
	String simbolo;
	do {
		//menu
		System.out.println("============================================");
		System.out.println("              JOGO DA VELHA                 ");
		System.out.println("Novo jogo         	(1)");
		System.out.println("Finalizar partida 	(0)");
		System.out.println("============================================");
		System.out.print("Digite sua opção: ");
		Scanner teclado = new Scanner(System.in);
		opcao = teclado.nextInt();
		System.out.print("\n");
		
		
		if(opcao == 1) 
		{
			Tabuleiro.imprimeJogada();
			do {
				//Imprime o jogador que deve efetuar a proxima jogada e recebe os parametros
			    System.out.print("\nJogador ["+ Jogador.jogador(Jogada.getJogadasValidas()) +"] sua vez! ");
				linha = teclado.nextInt();
				coluna = teclado.nextInt();
				/*
				 * Primeramente, verifica se os valores digitados estão entre 0 e 2.
				 * Em seguida, verifica se a zona esta vazia.
				 * Se a zona estiver vazia ele execulta a jogada, caso contrario ele apresenta uma mensagem de erro.
				 * */
				 
				if(Jogada.validaEntrada(linha,coluna))
				{
					if(Jogada.validaJogada(linha,coluna))
					{
						simbolo = Jogador.jogador(Jogada.getJogadasValidas());
						Jogada.execultaJogada(linha, coluna);
						Jogada.setJogadasValidas(1);
						 
					}
					else
					{
						System.err.println("\nJogada Invalida!");
					}
				
				}
				else
				{
					 System.err.println("\nJogada Invalida!");
				}
				 System.out.println("");
				 //Imprime o tabuleiro
				Tabuleiro.imprimeJogada();
				/*
				 * Primeiramente, testa se teve um vencedor
				 * Se tiver um vencedor ele testa pra saber se o vecedor é igual a empate
				 * Se vencedor for igual a empate ele atribui (3) ao metodo vitoria, para que o mesmo encremente o numero de empates
				 * Caaso vencedor seja diferente de empate ele atribui o numero do jogador ao metodo vitoria,para que o mesmo encremente as vitorias aos jogadores
				 * Por fim, imprime o placar, limpa o tabuleiro e finaliza o laço.
				 * */
					if(Resultado.vencedor())
					{
						if(Jogada.getJogadasValidas() == 9)
						{
							Ranking.vitoria(3);
						}
						else
						{
							Ranking.vitoria(Jogador.getNjogador());
						}
						Ranking.placar();
						Tabuleiro.limpartabuleiro();
						break;
					}
					//i recebe o numero de jogadas validas
			    i = Jogada.getJogadasValidas();
			}while( i < 10 );
		}
		//Mensagem de erro caso o usuario digite um valor indesejado.
		else if(opcao != 0) 
		{
			System.err.println("\nEntrada invalida!\nTente novamente!");
		}
		
	 }while(opcao != 0);
	//imprime o placar quando o jogo for finalizado.
	Ranking.placar();
}

}
