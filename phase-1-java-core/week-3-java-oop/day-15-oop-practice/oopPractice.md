# Day 15 – OOP Practice (Studi Kasus Sistem User Sederhana)

## 🎯 Tujuan Pembelajaran

Day 15 adalah **puncak Phase 1 Week 3**. Di sini semua materi OOP digabung:

* Class & Object
* Encapsulation
* Inheritance
* Polymorphism

Target akhirnya:

> Kamu bisa memodelkan **mini backend system** dengan OOP Java yang rapi.

---

## 🧠 Studi Kasus

Kita akan membuat **Sistem User Sederhana** dengan ketentuan:

1. Sistem punya beberapa jenis user
2. Semua user bisa login
3. Setiap user punya cara kerja berbeda
4. Notifikasi dikirim sesuai jenis user

---

## 🏗️ Desain Sistem (High Level)

```text
User (abstract)
│
├── Admin
│     └── manageSystem()
│
└── Customer
      └── doTransaction()

Notification (interface / abstract)
│
├── EmailNotification
└── SmsNotification
```

---

## 1️⃣ Parent Class `User`

```java
public abstract class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void login() {
        System.out.println(username + " login");
    }

    public abstract void work();
}
```

📌 Konsep:

* `abstract` → tidak bisa di-instansiasi
* Encapsulation → `private`
* Polymorphism → `work()`

---

## 2️⃣ Child Class `Admin`

```java
public class Admin extends User {

    public Admin(String username) {
        super(username);
    }

    @Override
    public void work() {
        System.out.println("Admin mengelola sistem");
    }

    public void manageSystem() {
        System.out.println("System maintenance by admin");
    }
}
```

---

## 3️⃣ Child Class `Customer`

```java
public class Customer extends User {

    public Customer(String username) {
        super(username);
    }

    @Override
    public void work() {
        System.out.println("Customer melakukan transaksi");
    }

    public void doTransaction() {
        System.out.println("Customer transaction processed");
    }
}
```

---

## 4️⃣ Notification (Polymorphism)

```java
public interface Notification {
    void send(String message);
}
```

### EmailNotification

```java
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
```

### SmsNotification

```java
public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
```

---

## 5️⃣ MainApp (Simulasi Backend)

```java
public class MainApp {
    public static void main(String[] args) {

        User admin = new Admin("admin01");
        User customer = new Customer("user01");

        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        admin.login();
        admin.work();
        email.send("Admin login success");

        System.out.println("--------------------");

        customer.login();
        customer.work();
        sms.send("Transaction success");
    }
}
```

---

## 🔍 Konsep OOP yang Terpakai

| Konsep        | Dipakai |
| ------------- | ------- |
| Encapsulation | ✅       |
| Inheritance   | ✅       |
| Polymorphism  | ✅       |
| Abstraction   | ✅       |

---

## 📝 TUGAS FINAL DAY 15

1. Tambahkan user baru `Guest`
2. Guest hanya bisa login (tidak bisa transaksi)
3. Tambahkan notifikasi `PushNotification`
4. Simulasikan semua di `MainApp`

---

## 🎓 Kesimpulan Phase 1 Week 3

* Kamu sudah **memahami OOP Java dengan benar**
* Struktur kode sudah mendekati backend profesional
* Siap masuk materi **Collection, Exception, dan Java Core lanjut**

---

## 🚀 Next Phase

👉 **Phase 1 Week 4 – Java Core Lanjutan**

* Array & Collection
* Exception Handling
* Best Practice Java Backend

🔥 Gas terus, ini fondasi yang sangat kuat
