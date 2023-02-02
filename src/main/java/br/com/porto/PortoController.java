package br.com.porto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping
public class PortoController {


    @GetMapping("/veiculos")
    public VeiculoDto chamaOBackend() {

        Veiculo veiculo = veiculoBackend();

        VeiculoDto veiculoDto = new VeiculoDto(veiculo);

        System.out.println("*************");
        System.out.println(veiculo.toString());

        return veiculoDto;


    }


    static Veiculo veiculoBackend() {
        Veiculo veiculo = Veiculo.builder()
                .idVeiculo(200471L)
                .uf("SP")
                .placaVeiculo("FVJ3A75")
                .dataCadastro(LocalDate.of(2022, 10, 01))
                .numeroRenavam("01333471723")
                .dataConsulta(LocalDateTime.now().withNano(0))
                .statusMonitoramento(1)
                .descricaoStatusMonitoramento("ATIVO")
                .build();

        return veiculo;
    }
}
