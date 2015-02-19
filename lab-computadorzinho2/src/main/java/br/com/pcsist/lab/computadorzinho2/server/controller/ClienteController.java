package br.com.pcsist.lab.computadorzinho2.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pcsist.lab.computadorzinho2.server.repostory.ClienteRepository;
import br.com.pcsist.lab.computadorzinho2.shared.model.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @ResponseBody
  @RequestMapping(value = "/todos", method = RequestMethod.GET)
  public List<Cliente> todos() {
    return clienteRepository.todos();
  }
}
