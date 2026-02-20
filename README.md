## ▶ Como executar

1. Clonar o repositório
2. Abrir na IDE
3. Rodar a aplicação
4. Acessar http://localhost:8080

## Gerenciador de Tarefas - Spring Boot + Thymeleaf

Sistema web desenvolvido com Spring Boot e Thymeleaf, com foco em praticar arquitetura MVC, organização em camadas e boas práticas no desenvolvimento backend com Java.

## Sobre o Projeto

Este projeto começou como um CRUD básico e evoluiu para uma aplicação estruturada com dashboard, filtros e separação clara de responsabilidades.

### O objetivo é consolidar conhecimentos em:

1. Spring Boot
2. Thymeleaf
3. Arquitetura MVC
4. Organização em camadas (Controller, Service, Repository)
5. Manipulação de listas com Stream API
6. Integração backend + frontend

## Arquitetura

### O projeto segue o padrão:

Model → Repository → Service → Controller → View

### Separação de responsabilidades:

- Controller → recebe requisições HTTP
- Service → contém regra de negócio
- Repository → comunicação com o banco
- View (Thymeleaf) → renderização dinâmica

## Funcionalidades

- Cadastro de tarefas
- Listagem de tarefas
- Edição de tarefas
- Exclusão de tarefas
- Busca por nome
- Filtro por status (pendente/concluída)
- Dashboard com métricas:

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Bootstrap
- Stream API

## Evolução do Projeto

### Versão 1

- CRUD básico
- Estrutura inicial MVC

### Versão 2

- Implementação de dashboard
- Busca dinâmica com Stream e filter
- Filtros por status
- Melhor organização visual
- Uso de parâmetros opcionais
- Melhor estrutura semântica no HTML

### Próximas Versões (Planejamento)

- Tratamento global de erros
- Validação com Bean Validation
- Paginação
- Melhor organização com fragments no Thymeleaf
- Refatoração para padrões mais avançados

## Objetivo Educacional

Este projeto faz parte do meu processo de aprendizado em desenvolvimento backend com Java, com foco em evoluir gradualmente a arquitetura e boas práticas.



