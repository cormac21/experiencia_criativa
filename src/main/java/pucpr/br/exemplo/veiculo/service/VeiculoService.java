package pucpr.br.exemplo.veiculo.service;

import org.springframework.stereotype.Service;
import pucpr.br.exemplo.veiculo.entity.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class VeiculoService {

    Logger log = Logger.getLogger(VeiculoService.class.getName());

    public Veiculo salvar(Veiculo veiculo) {
        log.info(veiculo.getPlaca());
        log.info(veiculo.getModelo());

        return null;
    }

    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo v = new Veiculo();
        v.setMarca("Ford");
        v.setModelo("Focus");
        v.setPlaca("ARS-8920");
        veiculos.add(v);
        return veiculos;
    }

    public void deletar(Veiculo veiculo) {

    }

}
