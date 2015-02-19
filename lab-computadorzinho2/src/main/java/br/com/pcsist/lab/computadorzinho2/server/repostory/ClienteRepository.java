package br.com.pcsist.lab.computadorzinho2.server.repostory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.pcsist.lab.computadorzinho2.shared.model.Cliente;

@Repository
public class ClienteRepository {

  private JdbcTemplate template;

  @Autowired
  public ClienteRepository(@Qualifier("localDatasource") DataSource dataSource) {
    template = new JdbcTemplate(dataSource);
  }

  public List<Cliente> todos() {
    return template.query("select * from cliente", mapper);
  }

  private RowMapper<Cliente> mapper = new RowMapper<Cliente>() {

    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
      return new Cliente(rs.getLong("id"), rs.getString("nome"), rs.getString("endereco"));
    }
  };
}
