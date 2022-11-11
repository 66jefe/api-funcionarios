# API Funcionarios

## Sobre o projeto
API Funcionarios é um crud back-end. 
A aplicação consiste em fazer a criação de cadastro de funcionarios, com validação de email. Listar todos os funcionarios criados e por ID. Alterar qualquer funcionario e deletar por ID.

## Tecnologias utilizadas
- Java
- Spring Boot
- Spring Validator
- JPA / Hibernate
- Project Lombok
- Maven
- H2(banco de dados em memoria)
- Postman

# Endpoints

Pré-requisito: Java 17

# criar funcionario
Para criar um funcionario, dentro do postman, utilizar o verbo POST para fazer o envio utilizando o caminho http://localhost:8080/api/funcionarios. Passando no JSON nome, sobrenome, email e pis.

# lista funcionarios
Para listar, pode ser utilizado duas formas: por ID, onde dentro do postman utiliza o verbo GET e passa o caminho com o id no final, exemplo http://localhost:8080/api/funcionarios/{id}. E para lista todos basta utiliza o metodo GET mas sem o ID, exemplo: http://localhost:8080/api/funcionarios.

#alterar funcionarios
Altera o funcionario utilizando no postman o metodo PUT, passando o caminho com o ID, exemplo: http://localhost:8080/api/funcionarios/{id}, e alterando os dados necessarios.

# deletar funcionarios
Para deletar, precisa passar o ID, onde dentro do postman utiliza o verbo DELETE e passa o caminho com o id no final, exemplo http://localhost:8080/api/funcionarios/{id}.
