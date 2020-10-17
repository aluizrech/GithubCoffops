package br.com.coffops;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
public class Pessoa {

    private Integer id;
    private String nome;
    private LocalDate dataNacimento;

    @Getter
    @Setter
    private String endereco;

    public LocalDate getDataNacimento() {
        if(this.dataNacimento == null){
            dataNacimento = LocalDate.now();
        }
        return dataNacimento;
    }
}
