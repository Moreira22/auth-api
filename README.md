# Authentication API with Product Registration

Este projeto é uma API de autenticação com a capacidade de cadastrar produtos somente após a autenticação do usuário. A API foi desenvolvida utilizando o framework Spring e o banco de dados MySQL.

## Funcionalidades Principais

1. **Autenticação de Usuários**: Os usuários podem se autenticar na API utilizando suas credenciais.

2. **Cadastro de Produtos**: A API permite o cadastro de produtos, mas somente após a autenticação do usuário.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para a construção de aplicativos Java baseados em microservices.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.
- **Spring Security**: Para a implementação da segurança da aplicação.
- **Spring Data JPA**: Para a integração com o banco de dados.

## Configuração do Ambiente

1. **Requisitos Prévios**:
   - JDK 8 ou superior instalado
   - MySQL Server instalado e configurado

2. **Configuração do Banco de Dados**:
   - Crie um banco de dados MySQL com o nome desejado.
   - Atualize as informações de conexão com o banco de dados no arquivo `application.properties` conforme necessário.

3. **Executando a Aplicação**:
   - Clone o repositório para o seu ambiente local.
   - Importe o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.).
   - Execute a aplicação Spring Boot.

## Endpoints

- **POST /api/auth/signup**: Endpoint para registrar um novo usuário.
- **POST /api/auth/signin**: Endpoint para autenticar um usuário.
- **POST /api/products**: Endpoint para cadastrar um novo produto (requer autenticação).

## Exemplo de Uso

1. Registrar um novo usuário:
```
POST /api/auth/signup
{
    "username": "example_user",
    "email": "user@example.com",
    "password": "password"
}
```

2. Autenticar o usuário:
   
```
POST /api/auth/signin
{
    "username": "example_user",
    "password": "password"
}
```
   
4. Após autenticação bem-sucedida, o usuário pode cadastrar um produto:
   
```
POST /api/products
{
    "name": "Produto X",
    "description": "Descrição do Produto X",
    "price": 19.99
}
```

   
## Contribuição

Contribuições são bem-vindas. Sinta-se à vontade para abrir issues para reportar problemas, sugestões ou melhorias.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).




