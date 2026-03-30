# 📱 Comparador de Preços Automatizado (Amazon vs Mercado Livre)

## 📌 Descrição do Projeto
Este projeto consiste em uma automação de testes desenvolvida com **Selenium + Java**, cujo objetivo é comparar preços de um produto específico entre duas grandes lojas virtuais: Amazon e Mercado Livre.

A automação realiza a busca pelo produto **"iPhone 16 Pro Max"**, coleta os preços encontrados em cada site, compara os valores e, por fim, envia um relatório por e-mail indicando a melhor opção de compra.

---

## 🚀 Tecnologias Utilizadas

- Java
- Selenium WebDriver
- Jakarta Mail (Jakarta EE)
- Maven/Gradle (gerenciamento de dependências)

---

## 🔄 Fluxo da Automação

1. Acessa o site da Amazon  
2. Pesquisa pelo produto: `iPhone 16 Pro Max`  
3. Captura o preço do produto  

4. Acessa o site do Mercado Livre  
5. Pesquisa pelo mesmo produto  
6. Captura o preço do produto  

7. Compara os valores obtidos:
   - Identifica qual loja possui o menor preço  

8. Gera um relatório com:
   - Nome do produto  
   - Preço na Amazon  
   - Preço no Mercado Livre  
   - Melhor opção de compra  

9. Envia um e-mail automaticamente com o resultado da comparação  

---

## 📧 Exemplo de Saída (E-mail)
