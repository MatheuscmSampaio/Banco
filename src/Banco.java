public class Banco {
    public static void main(String[] args) {
    	Gerente gerente1 = new Gerente();
    	gerente1.nome = "Marcão";
    	gerente1.salario = 1000;
    	gerente1.aumentarSalario(50);
    	System.out.println(gerente1.salario);
    	
    	
    	Agencia agencia1 = new Agencia(1001);
    	
    	Conta origem = new Conta(agencia1);
    	Conta destino = new Conta(agencia1);
    	
    	origem.saldo = 1000;
    	destino.saldo = 1000;
    	
    	origem.transfere(destino, 100);
    
    	System.out.println("Saldo origem "+ origem.saldo);
    	System.out.println("Saldo Destino "+ destino.saldo);
    }
}
class Gerente{
	public String nome;
	public double salario;
	
	public void aumentarSalario() {
		this.aumentarSalario(10);
    }
	public void aumentarSalario(double taxa) {
		this.salario += (this.salario * (taxa / 100));
	}
}
class Pessoa {
    public String rg;
    public int cpf;

    public Pessoa(String rg){
        this.rg = rg;
    }

    public Pessoa(int cpf){
        this.cpf = cpf;
    }
}
class Conta {
    public Agencia agencia;
    public double saldo;
    public double limite;

    public Conta(Agencia agencia) {
        this.agencia = agencia;
    }

    public Conta(Agencia agencia, double limite) {
        this.agencia = agencia;
        this.limite = limite;
    }
    void transfere(Conta destino, double valor) {
    	this.saldo -= valor;
    	destino.saldo += valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    double exibeSaldoComLimite(){
        return this.saldo + this.limite;
    }

    void imprimeExtrato(){
        this.imprimeExtrato(15);
    }

    void imprimeExtrato(int dias){
        System.out.println("Extrato do últimos "+ dias +" dias");
    }
    
}

class CartaoDeCredito {
    public int numero;
    
    public CartaoDeCredito(int numeroCartao) {
    	this.numero = numeroCartao;
    	
    }
}

class Agencia {
    public int numero;
    
    public Agencia(int numeroAgencia) {
    	this.numero = numeroAgencia;
    }
    
}