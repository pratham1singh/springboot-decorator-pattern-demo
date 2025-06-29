# ☕ Decorator Pattern - Coffee System (Spring Boot)

This project demonstrates the **Decorator Design Pattern** using a simple coffee system implemented in **Spring Boot**. It allows dynamic addition of addons like **Milk**, **Sugar**, **Cream**, and **Choco** to a base coffee.

---

## 🔧 Features

- Implements Decorator pattern in a clean and understandable way.
- Exposes two REST endpoints:
    - `GET /coffee` - View available product and addons.
    - `POST /coffee` - Send desired addons and receive the final decorated coffee with price and description.

---

## 📦 API Endpoints

### `GET /coffee`

**Returns:**
```json
{
  "productName": "Coffee",
  "addons": [
    "MILK",
    "CHOCO",
    "CREAM",
    "SUGAR"
  ]
}

```

### `POST /coffee`

**Body**

```json
["MILK", "SUGAR", "CREAM", "SUGAR"]
```
**Returns:**
```json
{
  "totalPrice": 200,
  "desc": "It is a coffee! It contains SUGAR, CREAM, MILK.",
  "decorators": [
    {
      "price": 10,
      "count": 2,
      "desc": "I am sugar decorated coffee",
      "type": "SUGAR"
    },
    {
      "price": 30,
      "count": 1,
      "desc": "I am cream decorated coffee",
      "type": "CREAM"
    },
    {
      "price": 50,
      "count": 1,
      "desc": "I am milk decorated coffee",
      "type": "MILK"
    }
  ]
}
```

## 🚀 Getting Started

**1. Clone the repository**
```bash
git clone git@github.com:pratham1singh/springboot-decorator-pattern-demo.git
cd springboot-decorator-pattern-demo
```

**2.Run the Spring Boot Application**

Make sure you have Java and Maven installed.
```bash
./mvnw spring-boot:run
```

## 📚 What You’ll Learn
- How to use the Decorator Design Pattern effectively.

- Dynamic object construction using decorators.

- Spring Boot setup for a RESTful API.

## 🧠 Inspiration
This was created to explain how you can structure real-world solutions (like adding toppings to coffee) using decorators without modifying the base class.

