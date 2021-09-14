public class Banco {
	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		/*
		 * gerente1.nome = "Marcão"; gerente1.salario = 1000;
		 * gerente1.aumentarSalario(50); // System.out.println(gerente1.salario);
		 * 
		 * Agencia agencia1 = new Agencia(1001);
		 * 
		 * Conta origem = new Conta(agencia1); Conta destino = new Conta(agencia1);
		 * 
		 * origem.saldo = 1000; destino.saldo = 1000;
		 * 
		 * origem.transfere(destino, 100);
		 * 
		 * // System.out.println("Saldo origem "+ origem.saldo); //
		 * System.out.println("Saldo Destino "+ destino.saldo);
		 * 
		 * Funcionario funcio1 = new Funcionario();
		 * 
		 * funcio1.nome = "Coala"; funcio1.salario = 1000; funcio1.valeRefeicao = 20;
		 * 
		 * System.out.println(funcio1.nome + "\n" + funcio1.salario + "\n" +
		 * funcio1.valeRefeicao); funcio1.reajuste(50);
		 * System.out.println(funcio1.valeRefeicao);
		 */
	}
}

class Gerente {
	private String nome;
	private double salario;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	private void aumentarSalario() {
		this.aumentarSalario(10);
	}

	private void aumentarSalario(double taxa) {
		this.salario += (this.salario * (taxa / 100));
	}
}

class Pessoa {
	private String rg;
	private int cpf;

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	private Pessoa(String rg) {
		this.rg = rg;
	}

	private Pessoa(int cpf) {
		this.cpf = cpf;
	}
}

class Conta {
	private Agencia agencia;
	private double saldo;
	private double limite;

	public Agencia getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	private Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	private Conta(Agencia agencia, double limite) {
		this.agencia = agencia;
		this.limite = limite;
	}

	private void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

	private void deposita(double valor) {
		this.saldo += valor;
	}

	private double exibeSaldoComLimite() {
		return this.saldo + this.limite;
	}

	private void imprimeExtrato() {
		this.imprimeExtrato(15);
	}

	private void imprimeExtrato(int dias) {
		System.out.println("Extrato do últimos " + dias + " dias");
	}

}

class CartaoDeCredito {
	private int numero;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private CartaoDeCredito(int numeroCartao) {
		this.numero = numeroCartao;

	}
}

class Agencia {
	private int numero;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private Agencia(int numeroAgencia) {
		this.numero = numeroAgencia;
	}

}

class Funcionario {
	private String nome;
	private double salario;
	private static double valeRefeicao;

	public String getNomeFunci() {
		return this.nome;
	}

	public void setNomeFuncio(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	private static void reajuste(double taxa) {
		taxa = taxa / 100;
		Funcionario.valeRefeicao = Funcionario.valeRefeicao + (Funcionario.valeRefeicao * taxa);

	}

}