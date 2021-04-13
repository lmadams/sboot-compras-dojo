package br.com.adams.compras.domain;

import lombok.Data;

@Data
public class Preco {

  private Long id;

  private Long idLivro;

  private Double preco;
}
