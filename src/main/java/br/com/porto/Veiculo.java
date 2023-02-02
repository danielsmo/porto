package br.com.porto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@ToString
public class Veiculo {

    private Long idVeiculo;
    private String numeroRenavam;
    private String placaVeiculo;
    private String uf;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataConsulta;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;
    private Integer statusMonitoramento;
    private String descricaoStatusMonitoramento;
}
