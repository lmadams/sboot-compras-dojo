package br.com.adams.compras.domain;

import lombok.Data;

@Data
public class Estoque {

  private Long id;

  private Long idLivro;

  private Long total;
}
