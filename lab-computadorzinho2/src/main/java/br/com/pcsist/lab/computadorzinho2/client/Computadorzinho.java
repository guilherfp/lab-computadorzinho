package br.com.pcsist.lab.computadorzinho2.client;

import org.fusesource.restygwt.client.Defaults;

import br.com.pcsist.lab.computadorzinho2.client.ui.MovimentoView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class Computadorzinho implements EntryPoint {

  @Override
  public void onModuleLoad() {
    Defaults.setServiceRoot(GWT.getHostPageBaseURL());
    RootPanelUtils.changeBody(new MovimentoView());
  }
}
