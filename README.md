# Freepass Backend 

Backend service sederhana untuk aplikasi Freepass yang menangani pengelolaan data user menggunakan REST API berbasis Spring Boot.

---

## Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API
- Postman (untuk testing API)

---

## Fitur

- Menambahkan user baru
- Melihat daftar user
- REST API sederhana
- Backend server menggunakan Spring Boot

---

## ⚙ Cara Menjalankan Project

### 1. Clone Repository

git clone https://github.com/revuriii99/backend.git

2. Masuk ke Folder Project
cd backend

3. Jalankan Project

Buka project

Jalankan file:

FreepassBackendApplication.java


Atau lewat terminal:

./mvnw spring-boot:run

🌐 Server Default

Project berjalan di:

http://localhost:8080

📡 API Endpoint
✅ Get Semua User
GET /users


Response contoh:

[
  {
    "name": "Vincent",
    "email": "vincent@email.com"
  }
]

✅ Tambah User
POST /users


Body JSON:

{
  "name": "Vincent",
  "email": "vincent@email.com"
}

🧪 Testing API

Gunakan Postman:

Pilih method GET atau POST

Masukkan URL endpoint

Untuk POST gunakan Body JSON

📂 Struktur Project
controller  → API endpoint
model       → Data object
resources   → Configuration

