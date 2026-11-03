# Spring Boot Banking Application

A robust RESTful banking application built using **Spring Boot**, **Spring Data JPA (Hibernate)**, **Lombok**, and a **MySQL** database. This project implements full CRUD functionality for bank account management, supporting secure deposits, withdrawals, balance checks, and multi-account handling.

## 🚀 Features & REST Endpoints

| Operation | HTTP Method | Endpoint | Description |
| :--- | :--- | :--- | :--- |
| **Create Account** | `POST` | `/api/accounts` | Creates a new bank account with an initial balance. |
| **Get Account** | `GET` | `/api/accounts/{id}` | Retrieves account details by unique account ID. |
| **Get All Accounts** | `GET` | `/api/accounts` | Fetches a complete list of all registered bank accounts. |
| **Deposit Amount** | `PUT` | `/api/accounts/{id}/deposit` | Deposits a specified amount into the target account. |
| **Withdraw Amount** | `PUT` | `/api/accounts/{id}/withdraw` | Withdraws funds from an account (with validation for insufficient funds). |
| **Delete Account** | `DELETE` | `/api/accounts/{id}` | Deletes a bank account record from the database. |

---

## 🛠️ Tech Stack & Prerequisites

* **Language:** Java 17+
* **Framework:** Spring Boot (3.x / 4.x)
* **Data Access:** Spring Data JPA, Hibernate 6
* **Database:** MySQL Server / MySQL Workbench
* **Boilerplate Reduction:** Project Lombok
* **Build Tool:** Maven or Gradle

---

## ⚙️ Configuration & Setup

### 1. Database Setup
Create your local MySQL database using your MySQL client:
```sql
CREATE DATABASE banking_app;
