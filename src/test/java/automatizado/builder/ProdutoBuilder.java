package automatizado.builder;

public class ProdutoBuilder {
  public String codigo = "0001";
  public String nome = "Produto padrão";
  public Integer quantidade = 1;
  public Double valor = 1.0;
  public String data = "23/11/2021";

  public ProdutoBuilder adicionarCogido(String codigo) {
    this.codigo = codigo;
    return this;
  }

  public ProdutoBuilder adicionarNome(String nome) {
    this.nome = nome;
    return this;
  }

  public ProdutoBuilder adicionarQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  public ProdutoBuilder adicionarValor(Double valor) {
    this.valor = valor;
    return this;
  }

  public ProdutoBuilder adicionarData(String data) {
    this.data = data;
    return this;
  }
}
