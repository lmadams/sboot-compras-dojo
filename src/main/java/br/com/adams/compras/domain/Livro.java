package br.com.adams.compras.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class Livro {

  private Long id;

  @Indexed private Long codigo;

  private Long paginas;

  private String nome;

  private Categoria categoria;
}
