package br.com.pcsist.lab.computadorzinho2.shared.model;

public class Mov {

  public String codProd;
  public String dtMov;
  public String numNota;
  public String codoPer;
  public String qt;
  public String pUnit;
  public String codFilial;
  public String status;

  @Override
  public String toString() {
    return "Movimento = codProd: " + codProd + ", dtMov: " + dtMov + ", numNota: " + numNota + ", codoPer: " + codoPer
        + ", qt: " + qt + ", pUnit: " + pUnit + ", codFilial: " + codFilial + ", status: " + status;
  }

}
