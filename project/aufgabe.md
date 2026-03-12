# 📱 Mini‑Banking‑App – Praktikumsprojekt

Dieses Projekt dient als Einstieg in die Full‑Stack‑Webentwicklung. Ziel ist es, eine einfache Banking‑Webanwendung zu erstellen, die grundlegende Funktionen wie Login, Kontostand‑Anzeige und Transaktionen unterstützt.

---

## 🚀 Ziel des Projekts

Der Praktikant soll lernen:

- wie man ein **Spring‑Boot‑Backend** aufbaut
- wie man **Thymeleaf** zur Template‑Generierung nutzt
- wie man **HTML/CSS** für das Frontend einsetzt
- wie man eine **PostgreSQL‑Datenbank** anbindet
- wie man eine kleine, vollständige Webanwendung strukturiert

---

## 🧩 Funktionsumfang (MVP)

### 🔐 1. Login & Registrierung
- Registrierung mit Benutzername + Passwort
- Login‑Maske
- Keine Passwort‑Verschlüsselung notwendig (nur zu Lernzwecken)

### 📊 2. Dashboard
- Anzeige des Kontostands
- Liste der letzten Transaktionen

### 💸 3. Transaktionen
- Neue Überweisung anlegen (Empfänger, Betrag, Verwendungszweck)
- Speicherung in der Datenbank
- Kontostand aktualisiert sich entsprechend

### ✔️ 4. Validierungen
- Betrag darf nicht negativ sein
- Pflichtfelder müssen ausgefüllt sein

---

## 🏗️ Technischer Stack

### Backend
- **Spring Boot** (Java)
- MVC‑Struktur: Controller, Service, Repository
- Entities: `User`, `Account`, `Transaction`

### Frontend
- **HTML/CSS**
- **Thymeleaf** für dynamische Inhalte
- Kein JavaScript erforderlich

### Datenbank
- **PostgreSQL** (lokal)
- Verbindung über `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/banking
spring.datasource.username=postgres
spring.datasource.password=deinPasswort
spring.jpa.hibernate.ddl-auto=update
```

---

## 📂 Empfohlene Projektstruktur

```
src/
 └── main/
      ├── java/
      │    └── com.example.banking/
      │         ├── controller/
      │         ├── service/
      │         ├── repository/
      │         ├── model/
      │         └── BankingApplication.java
      └── resources/
           ├── templates/
           │     ├── login.html
           │     ├── register.html
           │     ├── dashboard.html
           │     └── transaction.html
           └── application.properties
```

---

## 🧪 Erwartetes Ergebnis

Am Ende sollte der Praktikant:

- eine funktionierende Mini‑Banking‑App präsentieren
- den Aufbau von Spring Boot + Thymeleaf erklären können
- verstehen, wie Datenbankzugriffe funktionieren
- grundlegende Full‑Stack‑Erfahrung gesammelt haben

---

## ➕ Optionale Erweiterungen

Falls Zeit übrig bleibt:

- Passwort‑Hashing (BCrypt)
- Kategorien für Transaktionen
- Pagination
- Responsive Design
- REST‑API zusätzlich zum MVC‑Ansatz

---

Wenn du möchtest, kann ich dir auch eine **To‑Do‑Liste**, ein **Starter‑Template** oder eine **Projektbeschreibung für GitHub** erstellen.