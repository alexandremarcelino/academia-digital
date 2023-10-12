package br.com.marcelino.academia.digital.entity;

import java.time.LocalDateTime;

public class Matricula {

  private Long id;

  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
