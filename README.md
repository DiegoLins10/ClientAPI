# ClientAPI

API para gerenciamento de clientes utilizando **Clean Architecture** e **Domain-Driven Design (DDD)**, desenvolvida em **Java 25** com **Spring Boot 3.5.x**.  
O projeto utiliza um banco de dados em memória (**H2**) para facilitar desenvolvimento e testes locais.

---

## 📦 Estrutura do Projeto

O projeto segue os princípios da **Clean Architecture**, com separação clara de camadas:

```

com.github.diegolins10.clientapi
├── application         # Casos de uso e DTOs
├── domain              # Entidades e interfaces de repositório
├── infrastructure      # Persistência, mapeamentos e configurações
└── interfaces          # Controllers REST

````

---

## ⚙️ Dependências

Dependências principais do projeto:

- **Spring Boot Web** (`spring-boot-starter-web`) → criação de endpoints REST  
- **Spring Data JPA** (`spring-boot-starter-data-jpa`) → persistência de dados  
- **Validation** (`spring-boot-starter-validation`) → validações de campos  
- **Lombok** (`lombok`) → reduz boilerplate (getters, setters, constructors)  
- **H2 Database** (`com.h2database:h2`) → banco em memória para desenvolvimento/testes  
- **Spring Boot DevTools** (`spring-boot-devtools`) → hot reload e facilidades de desenvolvimento  

Dependências opcionais para futuras evoluções:
- **PostgreSQL Driver** (`org.postgresql`) → banco relacional real  
- **MapStruct** (`org.mapstruct`) → mapeamento DTO ↔ Entity  
- **Spring Boot Actuator** → métricas e health check  
- **Spring Security** → autenticação e autorização  
- **Swagger/OpenAPI** (`springdoc-openapi`) → documentação dos endpoints  

---

## 🌐 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/api/clientes` | Cria um cliente |
| `GET` | `/api/clientes` | Lista todos os clientes |
| `GET` | `/api/clientes/{id}` | Busca cliente por ID |
| `PUT` | `/api/clientes/{id}` | Atualiza cliente |
| `DELETE` | `/api/clientes/{id}` | Deleta cliente |

---

## 🚀 Como rodar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/DiegoLins10/clientapi.git
````

2. Entre na pasta do projeto:

```bash
cd clientapi
```

3. Compile e rode com Maven:

```bash
mvn clean install
mvn spring-boot:run
```

4. Acesse a API em:

```
http://localhost:8080/api/clientes
```

---

## 🛠 Tecnologias

* Java 25
* Spring Boot 3.5.x
* H2 Database (in-memory)
* Maven
* Lombok
* JPA/Hibernate

---

## 📖 Observações

* O projeto segue o **padrão Clean Architecture**, com camadas separadas para **domínio**, **aplicação**, **infraestrutura** e **interfaces**.
* Banco H2 é **volátil** (dados desaparecem ao parar a aplicação). Para produção, substituir por **PostgreSQL** ou outro banco relacional.
* Preparado para **adicionar autenticação JWT** e **documentação Swagger/OpenAPI** futuramente.

```



