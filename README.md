# API REST de Clima

Projeto desenvolvido em Java com Spring Boot para consultar informações meteorológicas de Belo Horizonte - MG.

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- Spring Web
- Open-Meteo API

## API utilizada

Foi utilizada a API Open-Meteo.

Não é necessária API Key para esta aplicação.

## Endpoint

### GET /clima

Retorna informações meteorológicas de Belo Horizonte.

Exemplo de acesso:

http://localhost:8080/clima

## Informações retornadas

- Temperatura atual
- Umidade do ar
- Velocidade do vento
- Direção do vento
- Temperatura máxima
- Temperatura mínima
- Código da condição do tempo
- Latitude e longitude
- Data e horário dos dados

## Como executar

1. Clone o repositório.
2. Abra o projeto em uma IDE Java.
3. Execute a classe `DemoApplication`.

Ou pelo terminal:

```bash
mvn spring-boot:run