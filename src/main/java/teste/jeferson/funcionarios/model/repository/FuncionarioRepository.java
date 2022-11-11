package teste.jeferson.funcionarios.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import teste.jeferson.funcionarios.model.entity.Funcionarios;

public interface FuncionarioRepository extends JpaRepository<Funcionarios, Integer>{

}
