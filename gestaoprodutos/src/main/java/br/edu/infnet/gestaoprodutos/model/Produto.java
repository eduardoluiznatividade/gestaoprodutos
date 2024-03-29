package br.edu.infnet.gestaoprodutos.model;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Entity
@Table(name = "T_PRODUTO")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO")
	private Long id;
	
	@Getter
	@Setter
	@Column(name = "NM_PRODUTO")
	private String nomeProduto;
	
	@Getter
	@Setter
	@Column(name = "VL_PRECO")
	private Float preco;

}
