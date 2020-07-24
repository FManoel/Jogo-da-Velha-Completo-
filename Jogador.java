package Jogo;

public class Jogador {
	private static String simbolo;
	private static int njogador;



	// O metodo altera o Jogador de acordo com o numero de jogadas validas. 

	//	Os atributos simbolo e njogador são modificados a cada jogada valida,para inicar a vez.
	public static String jogador(int JogadasValidas) 
	{
		simbolo = (JogadasValidas % 2 == 0) ? "X" : "O";
		numeroJogador();
		return simbolo;
	}
	
	//O metodo converte o simbolo do jogador para o seu numero. Ex: "X" == "1".
	public static void numeroJogador() 
	{
		njogador = (simbolo.equals("X")) ? 1 : 2;
	}
	
    //O metodo retorna o simbolo do jogador
	public static String getSimbolo() 
	{
		return simbolo;
	}
	
	//O metodo atribui o simbolo do jogador
	public static void setSimbolo(String simbolo) 
	{
		Jogador.simbolo = simbolo;
	}
	
	//O metodo retorna o numero do jogador
	public static int getNjogador() 
	{
		return njogador;
	}
	
	//O metodo atribui o numero do jogador
	public static void setNjogador(int njogador) 
	{
		Jogador.njogador = njogador;
	}
}
