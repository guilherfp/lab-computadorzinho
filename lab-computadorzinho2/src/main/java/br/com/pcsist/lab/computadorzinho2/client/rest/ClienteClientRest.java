package br.com.pcsist.lab.computadorzinho2.client.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import br.com.pcsist.lab.computadorzinho2.shared.model.Cliente;

@Path("/resources/clientes")
public interface ClienteClientRest extends RestService {

  @GET
  @Path("/todos")
  void todos(MethodCallback<List<Cliente>> callback);
}
