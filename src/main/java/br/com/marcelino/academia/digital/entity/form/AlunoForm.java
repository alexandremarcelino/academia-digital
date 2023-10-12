package br.com.marcelino.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "É necessário informar o nome!")
  @Size(min = 2, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres!")
  private String nome;

  @NotBlank(message = "É necessário informar o CPF!")
  @CPF(message = "'${validatedValue} é inválido!")
  private String cpf;

  @NotBlank(message = "É necessário informar o bairro!")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres!")
  private String bairro;

  @NotNull(message = "É necessário informar a data de nascimento!")
  @Past(message = "Data '${validatedValue}' é inválida!")
  private LocalDate dataDeNascimento;
}
