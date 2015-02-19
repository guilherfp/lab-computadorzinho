package br.com.pcsist.lab.computadorzinho2.client.ui;

import java.util.List;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import org.gwtbootstrap3.client.ui.gwt.CellTable;
import org.gwtbootstrap3.extras.bootbox.client.Bootbox;

import br.com.pcsist.lab.computadorzinho2.client.rest.MovimentoClientRest;
import br.com.pcsist.lab.computadorzinho2.shared.model.Mov;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MovimentoView extends Composite {

  private static MovimentoViewUiBinder uiBinder = GWT.create(MovimentoViewUiBinder.class);

  interface MovimentoViewUiBinder extends UiBinder<Widget, MovimentoView> {}

  private final MovimentoClientRest client = GWT.create(MovimentoClientRest.class);

  @UiField
  protected CellTable<Mov> table;

  public MovimentoView() {
    initWidget(uiBinder.createAndBindUi(this));
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.codoPer;
      }
    }, "Código");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.dtMov;
      }
    }, "Data");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.numNota;
      }
    }, "Nº Nota");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.codoPer;
      }
    }, "CodPer");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.qt;
      }
    }, "QTD.");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.pUnit;
      }
    }, "UN.");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.codFilial;
      }
    }, "Filial");
    table.addColumn(new TextColumn<Mov>() {
      @Override
      public String getValue(Mov mov) {
        return mov.status;
      }
    }, "Status");
  }

  @Override
  protected void onLoad() {
    client.todos(new MethodCallback<List<Mov>>() {

      @Override
      public void onSuccess(Method method, List<Mov> movimentos) {
        table.setRowCount(movimentos.size(), true);
        table.setRowData(0, movimentos);
        table.redraw();
      }

      @Override
      public void onFailure(Method method, Throwable exception) {
        Bootbox.alert(exception.getMessage());
      }
    });
  }

}
