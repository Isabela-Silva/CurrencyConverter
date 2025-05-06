# Currency Converter API 🌍💱

Este projeto é um conversor de moedas que utiliza a API de taxas de câmbio para converter valores entre diferentes moedas. O programa permite ao usuário escolher entre várias opções de conversão e calcular o valor resultante, com base nas taxas de câmbio obtidas da API. 🚀

## O que foi aprendido neste projeto 📚

Durante o desenvolvimento deste projeto, foram adquiridos conhecimentos em diversas áreas relacionadas à programação e integração com APIs, como:

### 1. **Integração com APIs 🌐**
   - **Aprender a consumir APIs**: O projeto faz uso de uma API pública (ExchangeRate-API) para obter as taxas de câmbio em tempo real. 🌍
   - **Tratamento de requisições HTTP**: Utilizando `HttpRequest` e `HttpResponse` para fazer requisições e processar as respostas da API de forma assíncrona. 🔄
   - **Processamento de respostas JSON**: A resposta da API é um JSON, que é convertido para objetos Java utilizando a biblioteca Gson. 📑

### 2. **Trabalho com `switch` e `Scanner` 🔄📱**
   - **Menu interativo**: O programa oferece um menu interativo para o usuário, onde ele escolhe a opção de conversão entre diferentes moedas. 📝
   - **Entrada de dados do usuário**: Utilização da classe `Scanner` para capturar o valor informado pelo usuário e a opção escolhida no menu. ✍️

### 3. **Uso de Classes e Métodos 🏗️**
   - **Organização do código em classes**: O código foi estruturado de forma a separar as responsabilidades em diferentes classes, como `ApiRequestService`, `CurrencyData`, e `CurrencyConverter`. 🧩
   - **Encapsulamento e Métodos**: Criar métodos como `calculateConvertion` para abstrair a lógica de conversão e fazer o código mais modular. 🔧

### 4. **Conversão de Moedas 💵💰**
   - **Obtendo a taxa de conversão**: O valor da taxa de conversão é extraído de um mapa retornado pela API (no campo `conversion_rates`). 🔍
   - **Cálculo de conversão**: A lógica de conversão multiplica o valor do usuário pela taxa de conversão específica, dependendo da opção escolhida. ➗

### 5. **Estruturas de Dados 📊**
   - **Uso de `Map` para armazenar taxas de câmbio**: A resposta da API é manipulada e as taxas de câmbio são armazenadas em um `Map<String, Double>`, permitindo o acesso rápido às taxas para cada moeda. 📉

### 6. **Exceções e Tratamento de Erros ⚠️**
   - **Lidando com exceções**: O projeto lida com exceções como `IOException` e `InterruptedException` durante a requisição da API para garantir que o programa continue funcionando mesmo em caso de erro. 🛠️

## Funcionalidades do Projeto ⚙️

- O usuário pode escolher entre 6 opções de conversão de moedas:
    1. Real Brasileiro (BRL) para Dólar (USD) 💵➡️💵
    2. Dólar (USD) para Real Brasileiro (BRL) 💵⬅️💵
    3. Dólar (USD) para Peso Argentino (ARS) 💵➡️🇦🇷
    4. Peso Argentino (ARS) para Dólar (USD) 🇦🇷➡️💵
    5. Real Brasileiro (BRL) para Euro (EUR) 💵➡️💶
    6. Dólar (USD) para Euro (EUR) 💵➡️💶
- O programa permite ao usuário sair digitando 'sair'. 🚪

## Como Executar 🏃‍♂️

1. Clone o repositório para o seu computador:
   ```bash
   git clone https://github.com/Isabela-Silva/CurrencyConverter.git

![image](https://github.com/user-attachments/assets/ca96b635-d6bf-4f19-bc0b-7db762fcfcad)

