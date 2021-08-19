package lab0;

public class validaUsuario {

    Dados dadosUser = new Dados();

    public boolean verificaMatricula(int _matricula) {
        for (Usuario u : dadosUser.get_lista_alunos()) {
			if (u.getMat() == _matricula) {
				return true;
			}
		}return false;
    }

    public void addUsuario(Usuario _user) {
        dadosUser.get_lista_alunos().add(_user);
    }

    public Usuario realiza_login(String email, String senha) {
        for (Usuario u : dadosUser.get_lista_alunos()) {
			if (u.getEmail() == email && u.getSenha() == senha) {
				return u;
			}
		}
        return null;
    }

}
