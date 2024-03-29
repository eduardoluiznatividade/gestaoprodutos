package br.edu.infnet.gestaoprodutos.model;


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
@Table(name = "T_SOBREMESA")
@PrimaryKeyJoinColumn(name = "FK_PRODUTO")
public class Sobremesa extends Produto{
		
	@Getter
	@Setter
	@Column(name = "DS_INFORMACAO")
	private String informacao;
	
	@Getter
	@Setter
	@Column(name = "IN_DOCE")
	private boolean doce;
	
	@Getter
	@Setter
	@Column(name = "QT_TAMANHO")
	private float tamanho;

}
