# 🌸 Iris Dataset Viewer

A fullstack web application built with **Spring Boot**, **PostgreSQL**, and **vanilla HTML/CSS/JS** to view and search the Iris flower dataset.

---

## 🚀 Features

- 🌍 REST API with Spring Boot
- 🐘 PostgreSQL integration
- 📥 Loads data from `iris.json` on startup
- 🔍 Search by species name
- 📄 Pagination support
- 💻 Clean HTML+CSS+JS frontend
- 🧪 API: `GET /api/iris?species=setosa&page=0&size=10`

---

## 🛠 Tech Stack

- **Backend:** Java + Spring Boot + Spring Data JPA
- **Database:** PostgreSQL
- **Frontend:** HTML, CSS, JavaScript (no framework)

---

## 🗂 Project Structure

```
iris-backend/
├── src/
│   ├── main/
│   │   ├── java/com/example/irisbackend/
│   │   │   ├── model/Iris.java
│   │   │   ├── repository/IrisRepository.java
│   │   │   ├── service/IrisService.java
│   │   │   ├── controller/IrisController.java
│   │   │   └── IrisBackendApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── iris.json
│   │       └── static/
│   │           └── index.html
└── README.md
```

---

## 📦 Setup Instructions

### 1. 🐘 Setup PostgreSQL

```bash
sudo service postgresql start
sudo -u postgres psql
```

```sql
CREATE DATABASE irisdb;
ALTER USER postgres WITH PASSWORD '1234';
\q
```

---

### 2. ⚙️ Configure `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/irisdb
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=create
```

---

### 3. ▶️ Run the App

```bash
mvn clean spring-boot:run
```

---

### 4. 🌐 Open the Frontend

Visit: [http://localhost:8080/index.html](http://localhost:8080/index.html)

---

## 🔍 Sample API Usage

```
GET /api/iris?species=setosa&page=0&size=5
```

Response:

```json
{
  "content": [
    {
      "id": 1,
      "sepalLength": 5.1,
      "sepalWidth": 3.5,
      "petalLength": 1.4,
      "petalWidth": 0.2,
      "species": "setosa"
    }
    // ...
  ],
  "totalPages": 3,
  "totalElements": 15
}
```
# Output:
![image](https://github.com/user-attachments/assets/475f0d27-2e21-4e95-9556-6ac59768c02f)
