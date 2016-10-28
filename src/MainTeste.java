import br.com.mre.pessoa.Nome;

public class MainTeste {
	public static void main(String[] args) {
		Nome nome = new Nome();
		nome.setNomeString("Leandro");
		System.out.println("Hello " + nome.getNomeString());
	}
}