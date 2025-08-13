package Optional;

import java.util.List;


class Usuario {
    private String nome;
    private String email;
    private boolean bloqueado;

    public Usuario(String nome, String email, boolean bloqueado) {
        this.nome = nome;
        this.email = email;
        this.bloqueado = bloqueado;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isBloqueado() { return bloqueado; }
    
    
    
	///forma normal
	
	public String buscaUsuarioNormalmente(List<Usuario> usuarios, String email) {
		
		Usuario userFound = null;
		
		for(Usuario u: usuarios) {
			if(u.getEmail().equalsIgnoreCase(email)) {
				userFound = u;
			}
		}
		
		if(userFound == null) {
			throw new RuntimeException("Usuário não encontrado");
			
		}
		

	    if (userFound.isBloqueado()) {
	        throw new RuntimeException("Usuário bloqueado");
	    }

	    return userFound.getNome();
	}
	
	//forma funcional
	
	public String buscarUsuarioFuncional(List<Usuario> usuarios, String email) {
	    return usuarios.stream()
	        .filter(u -> u.getEmail().equalsIgnoreCase(email)) // encontra por email
	        .filter(u -> !u.isBloqueado()) // garante que não está bloqueado
	        .findFirst() // retorna Optional<Usuario>
	        .map(Usuario::getNome) // transforma em Optional<String>
	        .orElseThrow(() -> new RuntimeException("Usuário não encontrado ou bloqueado"));
	}
    
}
