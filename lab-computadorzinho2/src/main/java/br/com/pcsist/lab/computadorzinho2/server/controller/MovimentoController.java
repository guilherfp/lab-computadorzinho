package br.com.pcsist.lab.computadorzinho2.server.controller;

import java.util.ArrayList;
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
    final List<Movimento> movimentos = new ArrayList<>();
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    movimentos.add(new Movimento("1", "1", "1", "1", "1", "1", "1", "1"));
    return movimentos;
    // return movimentoRepository.todos();
  }
}
