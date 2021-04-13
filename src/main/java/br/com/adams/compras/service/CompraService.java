package br.com.adams.compras.service;

import br.com.adams.compras.document.Compra;

import java.util.List;

public interface CompraService {

  Compra salvar(Compra compra);

  Compra consultar(String id);

  List<Compra> listar();

  List<Compra> listarPorIdLivro(int idLivro);
}
