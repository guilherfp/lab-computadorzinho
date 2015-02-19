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

import br.com.pcsist.lab.computadorzinho2.shared.model.Movimento;

@Repository
public class MovimentoRepository {

  private JdbcTemplate template;

  @Autowired
  public MovimentoRepository(@Qualifier("winthorDS") DataSource dataSource) {
    template = new JdbcTemplate(dataSource);
  }

  public List<Movimento> todos() {
    return template.query("select CODPROD, DTMOV,NUMNOTA,CODOPER, QT, PUNIT, CODFILIAL, STATUS from PCMOV", mapper);
  }

  private final RowMapper<Movimento> mapper = new RowMapper<Movimento>() {

    @Override
    public Movimento mapRow(ResultSet rs, int rowNum) throws SQLException {

      return new Movimento(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(3), rs.getString(4), rs
        .getString(5), rs.getString(6), rs.getString(7));
    }
  };

}
