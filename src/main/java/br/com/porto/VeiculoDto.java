package br.com.porto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class VeiculoDto {

    private Long idVeiculo;
    private String numeroRenavam;
    private String placaVeiculo;
    private String uf;
    private LocalDateTime dataConsulta;
    private LocalDate dataCadastro;


    public VeiculoDto (Veiculo veiculo) {
        this.idVeiculo = veiculo.getIdVeiculo();
        this.numeroRenavam = veiculo.getNumeroRenavam();
        this.placaVeiculo = veiculo.getPlacaVeiculo();
        this.uf = veiculo.getUf();
        this.dataConsulta = veiculo.getDataConsulta().minusHours(3);
        this.dataCadastro = veiculo.getDataCadastro();
    }



    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public String getNumeroRenavam() {
        return numeroRenavam;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getUf() {
        return uf;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }


}
