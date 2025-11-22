#  API Restaurant


---

## Descrição

API REST desenvolvida em **Java + Spring Boot** para gerenciar pedidos de restaurante.  
Permite cadastrar, listar, buscar e excluir pedidos de forma simples e organizada.  
A documentação da API é feita com **Swagger/OpenAPI**.

---

##  Tecnologias



| Tecnologia                      | Uso |
|---------------------------------|-----|
| **Java 25**                     | Linguagem principal |
| **Spring Boot**                 | Framework para criação da API |
| **PostgreSQL**                  | Banco de dados |
| **Docker & Docker Compose**     | Containerização do banco |
| **JPA**                         | Mapeamento ORM |
| **Swagger (Springdoc OpenAPI)** | Documentação da API |
| **Maven**                       | Gerenciamento de dependências |

---

##  Instalação e execução

## Dependencias
- **Spring web**
- **Spring Data JPA**
- **PostgresSQL driver**
- **Springdoc OpenAPI**
---

###  Passos

### Clone o repositorio
```bash
git clone https://github.com/pedroh430/ApiRestaurant.git
```
---
### Configure o docker compose para depois fazer a criaçao do conteiner
```yaml
services:

  db:

    container_name: postgres-spring-boot

    image: postgres:latest

    environment:

      POSTGRES_USER: pedro

      POSTGRES_PASSWORD: password

      PGDATA: /data/postgres

    volumes:

      - db:/data/postgres

    ports:

      - "5332:5432"

    networks:

      - db

    restart: unless-stopped



networks:

  db:

    driver: bridge

volumes:

  db:
```
---
```dockerfile
Variáveis padrão (podem mudar)

HOST: localhost

PORT: 5432

USER: postgres

PASSWORD: postgres
```
---

---

```dockerfile
#rode no terminal apos docker comfigurado
docker compose up -d
```
---
### Acessando o banco pelo terminal
```dockerfile
docker exec -it postgres bash
psql -U postgres -d meu_banco 
```

-------
### Para visualizar a documentaçao da Api usei o Swegger basta acessar o site quando o projeto rodar.
```
http://localhost:8080/swagger-ui/index.html
```
---
## 👤 Autor

### Pedro Ribeiro
Desenvolvedor Backend
- 🔗 LinkedIn: https://www.linkedin.com/in/pedro-ribeiro-85aba2319/




