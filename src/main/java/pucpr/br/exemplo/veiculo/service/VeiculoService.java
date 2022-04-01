package pucpr.br.exemplo.veiculo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pucpr.br.exemplo.veiculo.entity.Veiculo;
import pucpr.br.exemplo.veiculo.repository.VeiculoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VeiculoService {

    Logger log = Logger.getLogger(VeiculoService.class.getName());

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    private VeiculoRepository veiculoRepository;

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    public void deletar(Veiculo veiculo) {
        veiculoRepository.delete(veiculo);
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).get();
    }

    public Veiculo buscarPorPlaca(String placa) {
        return veiculoRepository.findVeiculoByPlaca(placa).get();
    }

}
