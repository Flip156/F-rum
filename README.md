# FórumHub API REST

## Descrição do Projeto

Bem-vindo ao FórumHub! Este projeto foi desenvolvido como parte do Challenge Back End da Alura e tem como objetivo criar uma API REST que simule as funcionalidades de um fórum. Com ela, é possível realizar operações de criação, consulta, atualização e exclusão de detalhes.

### Funcionalidades da API

A API foi criada com o framework Spring e fornece as seguintes funções:

- **Criar um novo tópico:** Permite que os usuários criem novos tópicos no fórum.
- **Mostrar todos os tópicos criados:** Lista todos os tópicos disponíveis no fórum.
- **Mostrar um tópico específico:** Recupera os detalhes de um tópico específico com base em seu ID.
- **Atualizar um tópico:** Permite que os usuários atualizem o conteúdo de um tópico existente.
- **Eliminar um tópico:** Remove um tópico do fórum.



### Tecnologias Utilizadas

- **Spring Boot:** Framework principal para a construção da API.
- **Hibernate:** Para mapeamento objeto-relacional e interação com a base de dados.
- **MySQL:** Banco de dados utilizado para armazenamento persistente dos dados.
- **Spring Security:** Para implementação de autenticação e autorização.


### Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **Controller:** Contém os endpoints da API e gerencia as requisições HTTP.
- **Repository:** Gerencia a interação com a base de dados.
- **Model:** Define as entidades do banco de dados.
- **DTO:** (Data Transfer Object) Facilita a transferência de dados entre as camadas da aplicação.
