package exerciciosandersonsilva.espacomahara.dominio;

public class Usuario {
    private int codigo;
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha, int codigo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.codigo = codigo;
    }

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getLogin() {return login;}

    public void setLogin(String login) {this.login = login;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}
}
