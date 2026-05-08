# 🧮 Arabo-Roman Converter (roman-number)

Progetto per la conversione di numeri interi arabi in numeri romani e la loro visualizzazione in formato ASCII Art. [cite_start]Sviluppato per il corso di Ingegneria del Software presso l'Università degli Studi di Padova[cite: 1, 2].

## 👥 Sviluppatori
* [cite_start]**Corrado Bacco** (Matricola: 2148615) [cite: 94]
* [cite_start]**Gabriele Gambarro** (Matricola: 2147979) [cite: 95]

## 📊 Status del Progetto
[![Build Status](https://github.com/mrobotcb30/roman-number/actions/workflows/ci.yml/badge.svg)](https://github.com/mrobotcb30/roman-number/actions)
[cite_start][![Coverage Status](https://coveralls.io/repos/github/mrobotcb30/roman-number/badge.svg?branch=main)](https://coveralls.io/github/mrobotcb30/roman-number?branch=main) [cite: 102, 104]

## 🚀 Funzionalità
* [cite_start]Conversione di numeri interi arabi in numeri romani per i primi **1000 numeri**[cite: 3].
* [cite_start]Rappresentazione grafica dei numeri romani (I, V, X, L, C, D, M) in **ASCII Art** su 6 righe[cite: 4, 5, 29, 30].
* [cite_start]Gestione dei casi speciali della numerazione romana (es. IV, IX, XL, XC, CD, CM)[cite: 14].

## 🧱 Struttura del Progetto
[cite_start]Il progetto è suddiviso nelle seguenti classi principali[cite: 16]:
* [cite_start]`IntegerToRoman`: Gestisce la logica di conversione numerica[cite: 18, 19].
* [cite_start]`RomanPrinter`: Gestisce la generazione della stringa ASCII Art[cite: 26, 27, 30].

## ⚙️ Tecnologie Utilizzate
* [cite_start]**Java 11/17**: Linguaggio di programmazione[cite: 106].
* [cite_start]**Maven**: Strumento di Build Automation e gestione delle dipendenze[cite: 61, 100].
* [cite_start]**JUnit 4**: Framework per il testing unitario[cite: 77].
* [cite_start]**GitHub Actions**: Pipeline di Continuous Integration (CI)[cite: 65, 101].
* [cite_start]**Checkstyle**: Analisi statica del codice[cite: 80, 99].
* [cite_start]**Coveralls**: Monitoraggio del Code Coverage[cite: 103].

## 📊 Continuous Integration
[cite_start]La pipeline CI, configurata manualmente tramite GitHub Actions, esegue automaticamente ad ogni push o Pull Request[cite: 66, 70]:
1. [cite_start]**Compilazione**: Verifica della correttezza sintattica[cite: 67].
2. [cite_start]**Test**: Esecuzione dei test unitari[cite: 68].
3. [cite_start]**Qualità**: Analisi statica con Checkstyle (la build fallisce in caso di violazioni)[cite: 69, 72, 99].

## 🧪 Test
[cite_start]I test seguono il pattern **Arrange/Act/Assert (AAA)** e rispettano le caratteristiche **A-TRIP** e **Right BICEP**[cite: 75, 78].
* [cite_start]**Copertura Test**: ≥ 85%[cite: 76].
* [cite_start]**Convenzioni**: Le firme dei metodi di test sono parlanti e seguono le convenzioni Maven[cite: 77, 78].

## 📦 Build del Progetto
Per compilare ed eseguire il progetto localmente:

```bash
# Compilazione del progetto
mvn compile

# Esecuzione dei test unitari
mvn test

# Verifica completa (Test + Analisi Statica)
mvn verify
