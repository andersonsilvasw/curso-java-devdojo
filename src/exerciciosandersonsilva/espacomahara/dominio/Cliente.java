package exerciciosandersonsilva.espacomahara.dominio;

public class Cliente {
    protected int codigo;
    private String nome;
    private String observacao;
    private String celular;
    private String whatsapp;

    public Cliente(int codigo, String nome, String observacao, String celular, String whatsapp) {
        this.codigo = codigo;
        this.nome = nome;
        this.observacao = observacao;
        this.celular = celular;
        this.whatsapp = whatsapp;
    }

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getObservacao() {return observacao;}

    public void setObservacao(String observacao) {this.observacao = observacao;}

    public String getCelular() {return celular;}

    public void setCelular(String celular) {this.celular = celular;}

    public String getWhatsapp() {return whatsapp;}

    public void setWhatsapp(String whatsapp) {this.whatsapp = whatsapp;}
}
