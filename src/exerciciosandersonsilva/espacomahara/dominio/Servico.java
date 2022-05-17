package exerciciosandersonsilva.espacomahara.dominio;

public class Servico {
    private int codigo;
    private String descricao;
    private String dataservico;
    private String datapagamento;
    private double valor;
    private String formapagamento;
    private String observacao;
    // cliente-codigo
    // colaborador-codigo


    public Servico(int codigo, String descricao, String dataservico, String datapagamento, double valor, String formapagamento, String observacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataservico = dataservico;
        this.datapagamento = datapagamento;
        this.valor = valor;
        this.formapagamento = formapagamento;
        this.observacao = observacao;
    }

    public void imprime () {
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data do serviço: " + this.dataservico);
        System.out.println("Data do pagamento: " + this.datapagamento);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Forma de pagamento: " + this.formapagamento);
        System.out.println("Observação: " + this.observacao);
    }

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getDataservico() {return dataservico;}

    public void setDataservico(String dataservico) {this.dataservico = dataservico;}

    public String getDatapagamento() {return datapagamento;}

    public void setDatapagamento(String datapagamento) {this.datapagamento = datapagamento;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public String getFormapagamento() {return formapagamento;}

    public void setFormapagamento(String formapagamento) {this.formapagamento = formapagamento;}

    public String getObservacao() {return observacao;}

    public void setObservacao(String observacao) {this.observacao = observacao;}
}
