package br.com.pcsist.lab.computadorzinho2.client;

import java.util.List;

import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import br.com.pcsist.lab.computadorzinho2.client.rest.ClienteClientRest;
import br.com.pcsist.lab.computadorzinho2.shared.model.Cliente;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;

public class Computadorzinho implements EntryPoint {

  private HTMLPanel htmlPanel = new HTMLPanel("");
  private Button button = new Button("Teste");
  private Label label = new Label();

  private ClienteClientRest client = GWT.create(ClienteClientRest.class);

  @Override
  public void onModuleLoad() {
    Defaults.setServiceRoot(GWT.getHostPageBaseURL());
    button.addStyleName("btn btn-primary");
    htmlPanel.add(button);
    htmlPanel.add(label);
    button.addClickHandler(new ClickHandler() {

      @Override
      public void onClick(ClickEvent event) {
        client.todos(new MethodCallback<List<Cliente>>() {

          @Override
          public void onSuccess(Method method, List<Cliente> client) {
            String string = "";
            for (Cliente cliente : client) {
              string += cliente.getNome().concat("<br/>");
            }
            label.setText(string);
          }

          @Override
          public void onFailure(Method method, Throwable exception) {
            Window.alert(exception.getMessage());
          }
        });
      }
    });

    RootPanelUtils.changeBody(htmlPanel);
  }
}
