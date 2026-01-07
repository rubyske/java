# Day 11 – OOP Basic (Class & Object)

## Tujuan Pembelajaran

Hari ke-11 menandai masuknya kamu ke **Object-Oriented Programming (OOP)**. Di backend Java, OOP adalah **fondasi utama** untuk membangun sistem yang rapi, scalable, dan mudah dirawat.

---

## 1. Apa Itu OOP?

**OOP (Object-Oriented Programming)** adalah paradigma pemrograman yang berfokus pada **objek**, bukan sekadar fungsi.

Objek merepresentasikan **entitas dunia nyata**.

Contoh di backend:

* User
* Account
* Transaction
* Order

---

## 2. Class

### Apa Itu Class?

**Class** adalah blueprint atau cetakan untuk membuat object.

Class berisi:

* **Atribut** (data)
* **Method** (perilaku)

Contoh class:

```java
public class User {
    String username;
    String email;

    void login() {
        System.out.println("User login");
    }
}
```

📌 Class = konsep, belum bisa digunakan langsung.

---

## 3. Object

### Apa Itu Object?

**Object** adalah hasil nyata (instance) dari sebuah class.

```java
User user1 = new User();
```

Penjelasan:

* `User` → class
* `user1` → object
* `new` → membuat object baru di memory

---

## 4. Atribut (Field)

**Atribut** adalah variabel yang dimiliki object.

```java
String username;
String email;
```

Setiap object memiliki **nilai atribut sendiri**.

---

## 5. Method

**Method** adalah fungsi yang dimiliki object.

```java
void login() {
    System.out.println("Login berhasil");
}
```

Method digunakan untuk:

* Proses bisnis
* Manipulasi data object

---

## 6. Contoh Program Lengkap

```java
public class User {
    String username;
    String email;

    void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.username = "admin";
        user.email = "admin@mail.com";

        user.displayInfo();
    }
}
```

---

## 7. Kenapa Backend Java Wajib OOP?

Alasan utama:

* Struktur kode jelas
* Mudah dikembangkan
* Cocok untuk sistem besar
* Selaras dengan framework (Spring)

> Di backend Java, **tidak pakai OOP = anti-pattern**.

---

## 8. Kesalahan Umum Pemula

❌ Menganggap class = object
❌ Semua logic ditaruh di `main`
❌ Tidak memodelkan entitas

---

## 9. Output yang Diharapkan Day 11

* Paham perbedaan class vs object
* Bisa membuat object dari class
* Bisa mengakses atribut & method
* Mulai berpikir berbasis entitas

---

## Catatan Penting

> OOP bukan soal syntax, tapi **cara berpikir**.

---

📌 *Lanjut ke Day 12 – Encapsulation (Access Modifier)*
