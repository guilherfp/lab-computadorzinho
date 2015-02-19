package br.com.pcsist.lab.computadorzinho2.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pcsist.lab.computadorzinho2.server.repostory.MovimentoRepository;
import br.com.pcsist.lab.computadorzinho2.shared.model.Movimento;

@Controller
@RequestMapping("/movimentos")
public class MovimentoController {

  @Autowired
  private MovimentoRepository movimentoRepository;

  @ResponseBody
  @RequestMapping(value = "/todos", method = RequestMethod.GET)
  public List<Movimento> todos() {
    return movimentoRepository.todos();
  }
}
