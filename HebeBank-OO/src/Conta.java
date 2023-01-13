
public class Conta {

	private double saldo;
	private int agencia;
	private String numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, String numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
