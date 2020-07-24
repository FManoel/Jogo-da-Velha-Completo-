package Jogo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteJogoDaVelha 
{
	@Test
	public void testValidaEntradaValida()
	{
		// quando eu...
		boolean x = Jogada.validaEntrada(0, 0);
		//espero que...
		assertTrue(x);
		
		
	}
	@Test
	public void testValidaEntradaInvalida()
	{
		// quando eu...
		boolean x = Jogada.validaEntrada(3, 0);
		//espero que...
		assertFalse(x);
		
		
	}
	@Test
	public void testValidaJogadaValida()
	{
		// quando eu...
		Jogador.jogador(0);
		Jogada.execultaJogada(0, 0);
		boolean resultado = Jogada.validaJogada(0,1);
		//espero que...
		assertTrue(resultado);
		
		
	}
	@Test
	public void testValidaJogadaInvalida()
	{ 
		// quando eu...
		Jogador.jogador(0);
		Jogada.execultaJogada(0,0);
		boolean resultado = Jogada.validaJogada(0,0);
		//espero que...
		assertFalse(resultado);
			
	}
	@Test
	public void testJogador()
	{ 
		// quando eu...
		String resultado = Jogador.jogador(0);
		//espero que...
		assertTrue(resultado.equals("X"));
			
	}
	@Test
	public void testNumeroDoJogador()
	{ 
		// quando eu...
		Jogador.jogador(0);
		Jogador.numeroJogador();
		//espero que...
		assertTrue(Jogador.getNjogador() == 1);
			
	}
	@Test
	public void testVitoria()
	{ 
		// quando eu...
		Ranking.vitoria(1);
		//espero que...
		assertTrue(Ranking.getjogador1() == 1);
			
	}
	@Test
	public void testVencedor()
	{ 
		// quando eu...
		Jogador.jogador(0);
		Jogada.execultaJogada(0,0);
		Jogada.execultaJogada(1,1);
		Jogada.execultaJogada(2,2);
		//espero que...
		assertTrue(Resultado.vencedor());
			
	}
	public void testLimpaTabuleiro()
	{ 
		// quando eu...
		Jogador.jogador(0);
		Jogada.execultaJogada(2,2);
		Tabuleiro.limpartabuleiro();
		//espero que...
		assertTrue(Jogada.validaJogada(2,2));
			
	}
	

}
