# 🧮 Roman Number Converter

Progetto Java per la conversione di numeri arabi in numeri romani, con stampa in ASCII art.

Il progetto è stato sviluppato seguendo pratiche di **Continuous Integration (CI)**, utilizzo di **GitHub Actions**, **Maven**, **JUnit** e analisi statica del codice con **Checkstyle**.

---

## 🚀 Funzionalità

- Conversione numeri arabi → numeri romani (fino a 1000)
- Stampa dei numeri romani in ASCII art
- Gestione casi speciali della numerazione romana (IV, IX, XL, CM, ecc.)

---

## 🧱 Struttura del progetto

- `IntegerToRoman` → conversione numerica
- `RomanPrinter` → stampa ASCII art
- Test unitari con JUnit 5

---

## ⚙️ Tecnologie utilizzate

- Java 17
- Maven
- JUnit 5
- GitHub Actions (CI)
- Checkstyle (analisi statica del codice)

---

## 📊 Continuous Integration

La pipeline CI esegue automaticamente:

1. Compilazione del progetto
2. Esecuzione dei test
3. Verifica qualità del codice (Checkstyle)

---

### 🔖 Status build

![CI](https://github.com/mrobotcb30/romain-number/actions/workflows/ci.yml/badge.svg)

---

## 🧪 Test

I test sono sviluppati con JUnit 5 e seguono il pattern **Arrange / Act / Assert (AAA)**.

Copertura test: ≥ 85%

---

## 📦 Build del progetto

Per compilare ed eseguire i test:

```bash
mvn clean compile
mvn test
mvn verify
