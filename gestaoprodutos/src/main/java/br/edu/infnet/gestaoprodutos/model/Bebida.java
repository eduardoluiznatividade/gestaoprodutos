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
@Table(name = "T_BEBIDA")
@PrimaryKeyJoinColumn(name = "FK_PRODUTO")
public class Bebida extends Produto implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@Getter
	@Setter
	@Column(name = "IN_GELADA")
	private boolean gelada;
	
	@Getter
	@Setter
	@Column(name = "QT_TAMANHO")
	private Float tamanho;
	
	@Getter
	@Setter
	@Column(name = "DS_MARCA")
	private String marca;
	
}
