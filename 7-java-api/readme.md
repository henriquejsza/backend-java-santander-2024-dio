# My API

API RESTful desenvolvida com Spring Boot.

## Estrutura
- **Entidades JPA**: Modelos de dados com `@Entity` e `@Table`.
- **Repositórios**: Interfaces extendendo `JpaRepository`.
- **Serviços**: Lógica de negócios.
- **Controladores**: Endpoints REST.

## Dependências
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-web`
- `h2`
- `spring-boot-starter-test`
- `junit-jupiter-api`
- `junit-jupiter-engine`
- `mockito-core`

## Configuração
Configurações no `application.properties`. Perfis de ambiente para desenvolvimento, teste e produção.

## Construção e Execução
1. Construa o projeto: `mvn clean package`
2. Execute a aplicação: `java -jar target/myapi-0.0.1-SNAPSHOT.jar`

## Problemas Conhecidos
- **Erro ao executar o .jar**: Verifique se o arquivo `.jar` está no diretório `target`.
- **Maven não reconhecido**: Verifique a instalação e configuração do Maven.

## Contribuições
Contribuições são bem-vindas. Para problemas ou melhorias, abra um pull request ou issue.

## Licença
Licenciado sob a Licença MIT.
