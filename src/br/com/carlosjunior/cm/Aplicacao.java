package br.com.carlosjunior.cm;

import br.com.carlosjunior.cm.modelo.Tabuleiro;
import br.com.carlosjunior.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 1);
		new TabuleiroConsole(tabuleiro);
	}
}
