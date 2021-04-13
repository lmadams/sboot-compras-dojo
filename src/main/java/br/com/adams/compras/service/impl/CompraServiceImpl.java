package br.com.adams.compras.service.impl;

import br.com.adams.compras.document.Compra;
import br.com.adams.compras.repository.CompraRepository;
import br.com.adams.compras.service.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompraServiceImpl implements CompraService {

  private final CompraRepository compraRepository;

  @Override
  public Compra salvar(final Compra compra) {
    return compraRepository.save(compra);
  }

  @Override
  public Compra consultar(final String id) {
    return compraRepository.findById(id).orElse(null);
  }

  @Override
  public List<Compra> listar() {
    return compraRepository.findAll();
  }

  @Override
  public List<Compra> listarPorIdLivro(int idLivro) {
    return compraRepository.findAllByLivro_Codigo(idLivro);
  }
}
