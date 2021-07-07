#Author: monicaoliveiralimalombardi@gmail.com


Feature: Cadastrar novo cliente
  Eu como usuario quero cadastrar cliente para acessar o site

 Background: Acessar o site
  Given que acesso o site "http://advantageonlineshopping.com/#/"
 
  Scenario: Cadastrar cliente
    And acesso o formulario de abertura de conta
    When preencher todos os campos obrigatorios
    Then cliente cadastrado com sucesso
    


