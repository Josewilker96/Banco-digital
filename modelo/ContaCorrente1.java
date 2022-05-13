package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente1 extends Conta implements Tributavel {

	public ContaCorrente1(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double ValorASacar = valor + 0.2;
		super.saca(ValorASacar);	
	}
	
	public void deposita(double valor){
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente1, " + super.toString();
	}
		
	}
	

