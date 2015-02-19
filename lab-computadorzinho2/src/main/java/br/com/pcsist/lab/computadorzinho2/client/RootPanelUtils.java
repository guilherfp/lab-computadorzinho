package br.com.pcsist.lab.computadorzinho2.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Guilherme Pacheco
 */
public class RootPanelUtils {

  private static RootPanel BODY = RootPanel.get("main");

  public static void clear() {
    BODY.getElement().removeAllChildren();
  }

  public static void changeBody(Widget widget) {
    clear();
    BODY.add(widget);
  }

}
