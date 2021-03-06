package br.com.bytebankPney.banco.Codes;

public class ContaPoupanša extends Conta{
	
	public ContaPoupanša(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}
	}
	@Override
	public String toString() {
		return "Conta Poupanša: " + super.toString();
	}
}
