# Day 13 – Inheritance (Pewarisan)

## 🎯 Tujuan Pembelajaran

Pada hari ini kamu akan memahami:

* Apa itu **Inheritance** dalam OOP
* Kenapa backend Java butuh pewarisan
* Penggunaan keyword `extends`
* Penggunaan keyword `super`
* Studi kasus inheritance di backend

Inheritance adalah fondasi untuk **scalable & maintainable code** di sistem backend besar.

---

## 1️⃣ Apa itu Inheritance?

**Inheritance (pewarisan)** adalah konsep OOP di mana:

> Sebuah class dapat mewarisi atribut dan method dari class lain

Class yang diwarisi disebut:

* **Parent / Superclass**

Class yang mewarisi disebut:

* **Child / Subclass**

---

## 2️⃣ Kenapa Inheritance Penting di Backend?

Di backend nyata:

* Banyak entitas punya **sifat yang sama**
* Tapi juga punya **perilaku khusus**

Contoh:

* User

    * Admin
    * Customer

Semua user punya:

* username
* email

Tapi:

* Admin → manage system
* Customer → transaksi

📌 Inheritance mencegah **duplikasi kode**.

---

## 3️⃣ Contoh Tanpa Inheritance (BURUK)

```java
class Admin {
    String username;
    String email;
}

class Customer {
    String username;
    String email;
}
```

❌ Duplikasi
❌ Sulit dirawat

---

## 4️⃣ Contoh Dengan Inheritance (BENAR)

### Parent Class

```java
public class User {
    protected String username;
    protected String email;

    public void login() {
        System.out.println(username + " login");
    }
}
```

### Child Class

```java
public class Admin extends User {
    public void manageSystem() {
        System.out.println("Admin mengelola sistem");
    }
}

public class Customer extends User {
    public void transaksi() {
        System.out.println("Customer melakukan transaksi");
    }
}
```

---

## 5️⃣ Keyword `extends`

```java
class Child extends Parent { }
```

Artinya:

* Child mewarisi semua **non-private** member Parent

---

## 6️⃣ Keyword `super`

`super` digunakan untuk:

1. Memanggil constructor parent
2. Mengakses method / atribut parent

### Contoh Constructor

```java
public class Customer extends User {
    public Customer(String username, String email) {
        super(username, email);
    }
}
```

---

## 7️⃣ Access Modifier & Inheritance

| Modifier  | Bisa diwarisi?   |
| --------- | ---------------- |
| public    | ✅                |
| protected | ✅                |
| default   | ✅ (satu package) |
| private   | ❌                |

📌 Backend Java sering pakai `protected` untuk inheritance.

---

## 8️⃣ Studi Kasus Backend Sederhana

### User (Parent)

```java
public class User {
    protected String username;

    public void login() {
        System.out.println("User login");
    }
}
```

### Admin

```java
public class Admin extends User {
    public void approveUser() {
        System.out.println("Admin approve user");
    }
}
```

### Customer

```java
public class Customer extends User {
    public void order() {
        System.out.println("Customer order");
    }
}
```

---

## 9️⃣ TUGAS LATIHAN DAY 13

### 📝 Tugas 1

Buat parent class `Employee`:

* name
* salary
* method `work()`

---

### 📝 Tugas 2

Buat child class:

* `BackendDeveloper`
* `FrontendDeveloper`

Masing-masing override method `work()`

---

### 📝 Tugas 3

Buat `MainApp`:

* Buat object BackendDeveloper & FrontendDeveloper
* Panggil method `work()`

---

## 🔟 Kesimpulan Day 13

* Inheritance = reuse code
* `extends` = pewarisan
* `super` = akses parent
* Ini fondasi sistem backend besar

---

## 🚀 Next Step

👉 **Day 14 – Polymorphism (Overriding & Dynamic Binding)**

Di sini inheritance benar-benar terasa kekuatannya 💪
