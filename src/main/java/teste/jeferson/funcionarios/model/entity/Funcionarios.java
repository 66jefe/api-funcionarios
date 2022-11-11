package teste.jeferson.funcionarios.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Funcionarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 30)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String sobrenome;
	
	@Email(message = "Por favor digite um email válido!")
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, length = 11)
	private Long pis;

}
