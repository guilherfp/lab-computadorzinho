package br.com.pcsist.lab.computadorzinho2.shared.model;

public class Movimento {

  private String codProd;
  private String dtMov;
  private String numNota;
  private String codoPer;
  private String qt;
  private String pUnit;
  private String codFilial;
  private String status;

  Movimento() {}

  public Movimento(String codProd, String dtMov, String numNota, String codoPer, String qt, String pUnit,
                   String codFilial, String status) {
    this.codProd = codProd;
    this.dtMov = dtMov;
    this.numNota = numNota;
    this.codoPer = codoPer;
    this.qt = qt;
    this.pUnit = pUnit;
    this.codFilial = codFilial;
    this.status = status;
  }

  public String getCodProd() {
    return codProd;
  }

  public String getDtMov() {
    return dtMov;
  }

  public String getNumNota() {
    return numNota;
  }

  public String getCodoPer() {
    return codoPer;
  }

  public String getQt() {
    return qt;
  }

  public String getpUnit() {
    return pUnit;
  }

  public String getCodFilial() {
    return codFilial;
  }

  public String getStatus() {
    return status;
  }

}
