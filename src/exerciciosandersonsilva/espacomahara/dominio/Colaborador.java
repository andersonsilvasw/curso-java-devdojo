package exerciciosandersonsilva.espacomahara.dominio;

public class Colaborador {
    private int codigo;
    private String nome;
    private String funcao;
    private String observacao;

    public Colaborador(int codigo, String nome, String funcao, String observacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
        this.observacao = observacao;
    }

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getFuncao() {return funcao;}

    public void setFuncao(String funcao) {this.funcao = funcao;}

    public String getObservacao() {return observacao;}

    public void setObservacao(String observacao) {this.observacao = observacao;}
}
