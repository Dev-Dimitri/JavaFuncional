package Optional;

import java.util.List;
import java.util.Optional;

public class ExampleOptional {

	public static void main(String[] args) {
		
		///Instanciando Optionals.
		Optional<String> nome1 = Optional.of("João"); // não pode ser null
		Optional<String> nome2 = Optional.ofNullable(null); // pode ser null
		Optional<String> nome3 = Optional.empty(); // vazio
	
	
		List<Usuario> usuarios = List.of(
			    new Usuario("Ana", "ana@email.com", false),
			    new Usuario("Pedro", "pedro@email.com", true),
			    new Usuario("Dimitri", "dev.dimitri7@gmail.com", false)
			);
		
		
		String usuariosBusca = usuarios.stream()
				.filter(u -> u.getEmail().equals("dev.dimitri7@gmail.com"))
				.filter(b -> !b.isBloqueado())
				.findFirst()
				.map(Usuario::getNome)
				.orElseThrow(() -> new RuntimeException("Usuário não encontrado ou bloqueado!"));
		
		
		System.out.println(usuariosBusca);
	}
}
