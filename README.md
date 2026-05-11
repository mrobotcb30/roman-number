# 🧮 Arabo-Roman Converter (`roman-number`)


Un convertitore completo per numeri romani progettato seguendo pratiche moderne di **Continuous Integration**, **Testing**, **Build Automation** e **Code Quality**.

---

# ✨ Panoramica

Il progetto implementa:

- conversione dei primi **1000 numeri interi** da formato arabo a formato romano;
- rappresentazione grafica dei numeri romani in **ASCII Art**;
- pipeline automatizzata con **GitHub Actions**;
- analisi statica del codice tramite **Checkstyle**;
- testing automatizzato con copertura superiore all’85%.

L’intero sviluppo è stato realizzato seguendo workflow professionali basati su:

- Feature Branch;
- Pull Request;
- Git Flow;
- Continuous Integration.

---

# 👨‍💻 Sviluppatori

| Nome | Matricola |
|---|---|
| Corrado Bacco | 2148615 |
| Gabriele Gambarro | 2147979 |

---

# 🚀 Funzionalità

## 🔢 Conversione Arabo → Romano

Il sistema converte correttamente i primi **1000 numeri interi**, rispettando tutte le regole della numerazione romana:

| Arabo | Romano |
|---|---|
| 1 | I |
| 4 | IV |
| 9 | IX |
| 40 | XL |
| 90 | XC |
| 400 | CD |
| 900 | CM |
| 1000 | M |

La logica gestisce automaticamente:

- notazione sottrattiva;
- composizione dei simboli;
- validazione dell’input.

---

## 🎨 Stampa ASCII Art

Ogni numero romano può essere visualizzato tramite rendering ASCII Art su 6 righe.

### Esempio

```text
 _____  __      __ __   __  _         _____   _____    __  __
|_   _| \ \    / / \ \ / / | |       / ____| |  __ \  |  \/  |
  | |    \ \  / /   \ V /  | |      | |      | |  | | | \  / |
  | |     \ \/ /     > <   | |      | |      | |  | | | |\/| |
 _| |_     \  /     / . \  | |____  | |____  | |__| | | |  | |
|_____|     \/     /_/ \_\ |______|  \_____| |_____/  |_|  |_|
```

---

# 🧱 Architettura del Progetto

Il progetto è strutturato secondo il principio di separazione delle responsabilità.

## `IntegerToRoman`

Classe responsabile della conversione numerica.

```java
public class IntegerToRoman {

    public static String convert(int number) {
        // conversion logic
    }
}
```

### Responsabilità

- conversione del numero;
- gestione dei casi speciali;
- costruzione della stringa romana.

---

## `RomanPrinter`

Classe responsabile della generazione della rappresentazione ASCII Art.

```java
public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        // ASCII art generation
    }
}
```

### Responsabilità

- rendering grafico;
- composizione multilinea;
- gestione dei simboli romani.

---

# ⚙️ Stack Tecnologico

| Tecnologia | Utilizzo |
|---|---|
| **Java 11/17** | Linguaggio principale |
| **Maven** | Build automation |
| **JUnit 4** | Testing framework |
| **GitHub Actions** | Continuous Integration |
| **Checkstyle** | Analisi statica |
| **Coveralls** | Code coverage |
| **Git & GitHub** | Versionamento collaborativo |

---

# 🔄 Continuous Integration

La pipeline CI è stata configurata manualmente tramite **GitHub Actions**.

Ogni `push` o `pull request` attiva automaticamente:

## ✅ Compilazione

- verifica della correttezza sintattica;
- controllo dipendenze Maven.

## ✅ Test Automatici

- esecuzione dei test unitari;
- verifica regressioni.

## ✅ Analisi Statica

- controllo qualità del codice;
- verifica standard di sviluppo;
- fallimento automatico della build in caso di errori.

L’obiettivo della pipeline è garantire:

- affidabilità;
- mantenibilità;
- qualità costante del codice.

---
# 🔖 Status build

![build](https://github.com/mrobotcb30/roman-number/actions/workflows/build.yml/badge.svg)
---
# 💯 Copertura
[![Coverage Status](https://coveralls.io/repos/github/mrobotcb30/roman-number/badge.svg?branch=main)](https://coveralls.io/github/mrobotcb30/roman-number?branch=main)
---

# 🧪 Testing

I test unitari sono stati sviluppati seguendo:

- pattern **Arrange / Act / Assert (AAA)**;
- principi **A-TRIP**;
- metodologia **Right-BICEP**.


## Convenzioni adottate

- nomi dei test descrittivi;
- isolamento dei casi di test;
- verifiche indipendenti;
- struttura Maven standard.

---

# 📏 Analisi Statica del Codice

Il progetto utilizza **Maven Checkstyle** con regole dedicate al controllo di:

- complessità ciclomatica;
- complessità delle espressioni booleane;
- lunghezza file e metodi;
- import non consentiti;
- linee troppo lunghe;
- utilizzo delle parentesi;
- tabulazioni;
- blocchi `catch` vuoti;
- header obbligatorio nei file Java.

La build viene interrotta automaticamente in presenza di violazioni.

---

# 📦 Build del Progetto

## Compilazione

```bash
mvn compile
```

## Test

```bash
mvn test
```

## Verifica Completa

```bash
mvn verify
```

---

# 🔧 Workflow Git

Il progetto segue un workflow professionale basato su:

- Feature Branch;
- Git Flow;
- Pull Request;
- Code Review;
- Merge controllato su `main`.

Tutte le attività sono state sviluppate incrementalmente e tracciate tramite GitHub.

---

# 📁 Contenuto del Repository

Il repository include:

- codice sorgente Java;
- test unitari;
- configurazione Maven;
- configurazione Checkstyle;
- workflow GitHub Actions;
- badge CI e Coverage;
- documentazione del progetto.

---

# 🎯 Obiettivi Formativi

Questo progetto dimostra competenze pratiche in:

- sviluppo software collaborativo;
- integrazione continua;
- testing automatizzato;
- qualità del codice;
- automazione del processo di build;
- gestione del versionamento.

---

# 🏁 Conclusione

`roman-number` rappresenta un progetto completo di Metodi e Tecnologie per lo sviluppo software. 
L’attenzione alla struttura del codice, ai test automatici e alla Continuous Integration garantisce un software affidabile, mantenibile e facilmente estendibile.


