import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Yasmine");
		gerente.setSalario(7000.0);
		gerente.setLogin("yasus");
		gerente.setSenha("blessyasus123");
		funcionarios.add(gerente);
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Jason");
		telefonista.setSalario(2500.0);
		telefonista.setCodigoEstacao(911);
		funcionarios.add(telefonista);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Alex");
		secretaria.setSalario(3000.0);
		secretaria.setNumeroRamal(192);
		funcionarios.add(secretaria);
		
		System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
        	System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());

            if (funcionario instanceof Gerente) {
                Gerente g = (Gerente) funcionario;
                System.out.println("Login: " + g.getLogin());
                System.out.println("Senha: " + g.getSenha());
            } else if (funcionario instanceof Telefonista) {
                Telefonista t = (Telefonista) funcionario;
                System.out.println("Código de Estação: " + t.getCodigoEstacao());
            } else if (funcionario instanceof Secretaria) {
                Secretaria s = (Secretaria) funcionario;
                System.out.println("Número de Ramal: " + s.getNumeroRamal());
            }

            System.out.println();
        }
        
        if (!funcionarios.isEmpty()) {
            Funcionario funcionarioParaAlterar = funcionarios.get(0);
            if (funcionarioParaAlterar instanceof Gerente) {
                Gerente g = (Gerente) funcionarioParaAlterar;
                g.setLogin("novo_login");
                g.setSenha("nova_senha");
            }
        }
        
        if (!funcionarios.isEmpty()) {
            Funcionario funcionarioParaExcluir = funcionarios.get(1);
            funcionarios.remove(funcionarioParaExcluir);
        }
        
        System.out.println("Lista de Funcionários após Alteração e Exclusão:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());

            if (funcionario instanceof Gerente) {
                Gerente g = (Gerente) funcionario;
                System.out.println("Login: " + g.getLogin());
                System.out.println("Senha: " + g.getSenha());
            } else if (funcionario instanceof Telefonista) {
                Telefonista t = (Telefonista) funcionario;
                System.out.println("Código de Estação: " + t.getCodigoEstacao());
            } else if (funcionario instanceof Secretaria) {
                Secretaria s = (Secretaria) funcionario;
                System.out.println("Número de Ramal: " + s.getNumeroRamal());
            }

            System.out.println();
        }
        
	}
}
