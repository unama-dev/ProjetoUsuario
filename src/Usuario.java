public class Usuario {

    private String nome;
    static int totalUsuarioLogados;

    public Usuario(){}

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void logar(){
        totalUsuarioLogados++;
    }

    public void deslogar(){
        totalUsuarioLogados--;
    }

}
