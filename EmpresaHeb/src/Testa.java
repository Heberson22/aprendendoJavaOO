
public class Testa {

	public static void main(String[] args) {
		Gerente f1 = new Gerente();
		f1.setNome("Heberson Oliveira");
		f1.setSalario(8540.5);
		System.out.println("Gerente: "+f1.getNome()+
				"\nSalário: "+f1.getSalario());
		System.out.println("Bonificação: "+f1.bonificacao());
		
		Funcionario f2 = new Designer();
		f2.setNome("Diego");
		f2.setSalario(2500);
		System.out.println("Designer: "+f2.getNome()+
				"\nSalário: "+f2.getSalario());
		System.out.println("Bonificação: "+f2.bonificacao());
	}
}
