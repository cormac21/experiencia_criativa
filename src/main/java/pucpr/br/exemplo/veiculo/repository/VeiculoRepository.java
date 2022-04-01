package pucpr.br.exemplo.veiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pucpr.br.exemplo.veiculo.entity.Veiculo;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    public Optional<Veiculo> findVeiculoByPlaca(String placa);
}
