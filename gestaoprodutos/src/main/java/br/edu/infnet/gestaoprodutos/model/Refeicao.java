package br.edu.infnet.gestaoprodutos.model;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@NoArgsConstructor
@Entity
@Table(name = "T_REFEICAO")
@PrimaryKeyJoinColumn(name = "FK_PRODUTO")
public class Refeicao extends Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Column(name = "QT_PESO")
	private float peso;
	
	@Getter
	@Setter
	@Column(name = "IN_VEGANO")
	private boolean vegano;
	
	@Getter
	@Setter
	@Column(name = "DS_INGREDIENTES")
	private String ingredientes;
   
}