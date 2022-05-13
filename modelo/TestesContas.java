package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaEspecial ce = new ContaEspecial(777, 888);
		   
		
		ContaCorrente1 cc = new ContaCorrente1(111,111); 
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}
	
		
}
