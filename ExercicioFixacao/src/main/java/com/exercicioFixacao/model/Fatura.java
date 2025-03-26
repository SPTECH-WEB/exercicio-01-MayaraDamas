package com.exercicioFixacao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "fatura")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve ter 16 caracteres")
    private String numeroCartao;

    @NotBlank(message = "O nome do cliente não pode estar em branco")
    @Size(min = 3, max = 100, message = "O nome do cliente deve possuir entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.0", message = "O valor mínimo são 10 reais")
    @DecimalMax(value = "5000.0", message = "O valor máximo são 5.000 reais")
    private Double valor;

    @NotNull(message = "A data não pode ser nula")
    @FutureOrPresent(message = "A data de vencimento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O e-mail não pode ser nulo")
    @Email(message = "Deve ser um e-mail válido")
    private String emailContato;

}
