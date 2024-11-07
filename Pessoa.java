public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        nome = null; // usado para ausencia de valor
        idade = 0;
    }

    public Pessoa(String vNome, int vIdade) {
        nome = vNome;
        idade = vIdade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String value) {
        if (value != null)
            nome = value; // value valor de uma variavel
    }

    public void setIdade(int value) {
        if (value >= 0)
            idade = value;
    }

    public static void main(String[] args) {
        Pessoa p1, p2;
        p1 = new Pessoa();
        p2 = new Pessoa("Thiago", 34); // Corrigir os parâmetros

        p1.setNome("Pedro");
        p1.setIdade(25);

        System.out.println("dados P1");
        System.out.println("nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println("dados P2");
        System.out.println("nome: " + p2.getNome()); // Corrigido de p1 para p2
        System.out.println("Idade: " + p2.getIdade());
    }
}
