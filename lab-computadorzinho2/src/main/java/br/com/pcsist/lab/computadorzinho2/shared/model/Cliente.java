package br.com.pcsist.lab.computadorzinho2.shared.model;

public class Cliente {

  private long id;
  private String nome;
  private String endereco;

  Cliente() {}

  public Cliente(long id, String nome, String endereco) {
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + (int) (id ^ (id >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Cliente other = (Cliente) obj;
    if (id != other.id) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Cliente = id: " + id + ", nome: " + nome + ", endereco: " + endereco;
  }

}
