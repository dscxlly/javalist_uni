
public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Yasmine");
		gerente.setSalario(7000.0);
		gerente.setLogin("yasus");
		gerente.setSenha("blessyasus123");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Jason");
		telefonista.setSalario(2500.0);
		telefonista.setCodigoEstacao(911);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Alex");
		secretaria.setSalario(3000.0);
		secretaria.setNumeroRamal(192);
		
		System.out.println("Dados do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Login: " + gerente.getLogin());
        System.out.println("Senha: " + gerente.getSenha());

        System.out.println("\nDados da Telefonista:");
        System.out.println("Nome: " + telefonista.getNome());
        System.out.println("Salário: " + telefonista.getSalario());
        System.out.println("Código de Estação: " + telefonista.getCodigoEstacao());

        System.out.println("\nDados da Secretaria:");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Número de Ramal: " + secretaria.getNumeroRamal());
	}
}
