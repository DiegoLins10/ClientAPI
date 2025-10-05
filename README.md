# 🚀 ClientAPI - Aplicação de Gerenciamento de Clientes

![Java](https://img.shields.io/badge/Java-25-blue?logo=java) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.x-green?logo=spring) 
![Maven](https://img.shields.io/badge/Maven-3.9.6-red?logo=apache-maven) 
![H2 Database](https://img.shields.io/badge/H2%20DB-in%20memory-orange?logo=h2-database)

API para gerenciamento de clientes utilizando **Clean Architecture** e **Domain-Driven Design (DDD)**, desenvolvida em **Java 25** com **Spring Boot 3.5.x**.  
O projeto utiliza um banco de dados em memória (**H2**) para facilitar desenvolvimento e testes locais. 💻🛠️

---

## 📦 Estrutura do Projeto

O projeto segue os princípios da **Clean Architecture**, com separação clara de camadas:

```

com.github.diegolins10.clientapi
├── application         # Casos de uso e DTOs 📝
├── domain              # Entidades e interfaces de repositório 🏛️
├── infrastructure      # Persistência, mapeamentos e configurações 🗄️
└── api                 # Controllers REST 🌐

````

---

## ⚙️ Dependências

| Dependência                                          | Para que serve                                                                             |
| ---------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| **Spring Boot Web** 🌐 (`spring-boot-starter-web`)      | Permite criar **endpoints REST** e construir a camada web da aplicação                     | 
| **Spring Data JPA** 💾  (`spring-boot-starter-data-jpa`) | Facilita a **persistência de dados** usando JPA/Hibernate, abstraindo queries SQL          | 
| **Validation** ✅ (`spring-boot-starter-validation`)    | Adiciona **validações automáticas** em DTOs e entidades                                    | 
| **Lombok** ✂️(`lombok`)                                | Reduz **boilerplate code**, gerando getters, setters, construtores e outros métodos comuns | 
| **H2 Database** 🏗️(`com.h2database:h2`)                | Banco de dados **em memória**, ideal para desenvolvimento e testes                         | 
| **Spring Boot DevTools** 🔄 (`spring-boot-devtools`)    | Permite **hot reload**, reiniciando a aplicação ao salvar alterações                       | 
| **Swagger/OpenAPI** 📑  (`springdoc-openapi`)            | Gera **documentação automática da API** e interface interativa para testar endpoints       | 

---

Dependências opcionais para futuras evoluções:

| Dependência                                          | Para que serve                                                                             |
| ---------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| **PostgreSQL Driver** 🐘(`org.postgresql`)             | Driver para conexão com **banco relacional PostgreSQL** (produção)                      |
| **MapStruct** 🔀 (`org.mapstruct`)                      | Facilita o **mapeamento entre DTOs e entidades**, reduzindo código manual              | 
| **Spring Boot Actuator** 📊                            | Adiciona **endpoints de monitoramento e métricas**, como health check                   | 
| **Spring Security** 🔒                                 | Implementa **autenticação e autorização**, protegendo endpoints                         | 

---

## 🌐 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/api/clientes` | Cria um cliente ➕ |
| `GET` | `/api/clientes` | Lista todos os clientes 📃 |
| `GET` | `/api/clientes/{id}` | Busca cliente por ID 🔎 |
| `PUT` | `/api/clientes/{id}` | Atualiza cliente ✏️ |
| `DELETE` | `/api/clientes/{id}` | Deleta cliente 🗑️ |

---

## 📬 Teste da API com `curl`

Você pode criar um novo cliente utilizando o seguinte comando **`curl`**:

```bash
curl --location 'http://localhost:8080/api/clients' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Diego",
    "lastName": "Lins",
    "email": "diegofernandeslins@gmail.com",
    "phone": "11987549239"
}'
```

### 🔹 Exemplo de Resposta

```json
{
    "id": 1,
    "firstName": "Diego",
    "lastName": "Lins",
    "email": "diegofernandeslins@gmail.com",
    "phone": "11987549239"
}
```

### 🔹 Observações

* Certifique-se de que a API está rodando localmente em `http://localhost:8080`
* O endpoint para criação de clientes é `/api/clients`
* O cabeçalho `Content-Type` deve ser `application/json`
* Esse comando irá criar um **novo cliente** no banco de dados em memória (H2)

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

* 🟢 **Java 25**
* 🌐 **Spring Boot 3.5.x**
* 💾 **H2 Database (in-memory)**
* ⚙️ **Maven**
* ✂️ **Lombok**
* 🏛️ **JPA/Hibernate**

---

### 🚀 Próximos Passos

* [ ] 🏠 **Integrar API do ViaCEP** para preencher e validar endereços automaticamente ao criar ou atualizar clientes.
  Fonte: [ViaCEP - API](https://viacep.com.br/)

* [ ] 🎯 **Adicionar Result Pattern** para retorno consistente de sucesso ou falha nas operações.

* [ ] 🔄 **Implementar middleware / interceptadores** para logs, tratamento de erros unificado e validações globais.

* [ ] 🔒 **Adicionar autenticação JWT** para proteger os endpoints da API.

* [ ] 📑 **Documentar a API com Swagger / OpenAPI** para facilitar testes e integração com outros sistemas.

* [ ] 🐘 **Substituir H2 por PostgreSQL** ou outro banco relacional para persistência em produção.

* [ ] 🧪 **Adicionar testes de integração** que validem fluxos completos da API.

* [ ] ✅ **Adicionar validações avançadas de campos** como email, telefone e CPF.

* [ ] 🔀 **Implementar mapeamento DTO ↔ Entity com MapStruct** para reduzir boilerplate.

### ***Indicadores de Conclusão***

* [ ] = tarefa pendente
* [x] = tarefa concluída

---

## 📖 Observações

* O projeto segue o **padrão Clean Architecture**, com camadas separadas para **domínio**, **aplicação**, **infraestrutura** e **interfaces**.
* Banco H2 é **volátil** (dados desaparecem ao parar a aplicação). Para produção, substituir por **PostgreSQL** ou outro banco relacional.
* Preparado para **adicionar autenticação JWT** e **documentação Swagger/OpenAPI** futuramente. 🔐📑

---

✨ **by Diego Lins**
