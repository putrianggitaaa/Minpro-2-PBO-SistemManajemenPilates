# Sistem Manajemen Pilates - Geets Pilates Studio
**Putri Anggita Melasari | 2509116010**

## Deskripsi Program
Sistem Manajemen Pilates Geets Pilates Studio merupakan sebuah program yang dirancang untuk membantu proses pengelolaan data pada sebuah studio Pilates secara sederhana.
Program ini menyediakan beberapa menu yang dapat digunakan untuk mengelola informasi terkait Member, Instruktur, Jenis Kelas, dan Data Kelas Pilates. 
Sistem ini dapat membantu pengelola untuk memanajemen proses bisnis yang terdapat dalam Geets Pilates Studio.

## Struktur Packages dan Class 
Program Sistem Manajemen Pilates menerapkan konsep MVC (Model, View, Controller) dengan membagi struktur program ke dalam beberapa package, yaitu model, service, dan main. 
Pembagian ini digunakan untuk memisahkan pengelolaan data, proses pengolahan data, serta bagian utama yang menjalankan program.


<img width="421" height="317" alt="image" src="https://github.com/user-attachments/assets/dd358f8d-136c-418e-9f1f-6ffbca08d668" />


Berikut adalah penjelasan dari masing-masing package dan class yang ada didalam packages tersebut:
### 1. Package 'model'
Package `model` digunakan untuk merepresentasikan data atau objek yang terdapat dalam sistem. Package ini terdiri dari beberapa class, yaitu:

* **a. Member.java**

  Member.java adalah class model yang berisi data member atau pelanggan yang terdaftar. Atribut yang berada dalam class ini, yaitu ID Member, nama, nomor telepon, usia, dan jenis kelamin.
  
*  **b. Instruktur.java**

Instruktur.java adalah class model yang berisi data instruktur yang bekerja di studio. Atribut yang berada dalam class ini, yaitu ID Instruktur, nama Instruktur, nomor telepon, spesialisasi, jenis kelamin, dan domisili.

*  **c. JenisKelas.java**
  
*  **d. JenisKelasPrivate.java**
*  **e. JenisKelasPublik.java**
*  **f. KelasPilates**


Setiap class memiliki atribut dan method yang digunakan untuk menyimpan serta mengelola data dari masing-masing objek. Contohnya, class `Member` digunakan untuk menyimpan data member, sedangkan `KelasPilates` digunakan untuk menyimpan data kelas Pilates.

Package `model` berperan sebagai bagian **Model** dalam penerapan MVC karena bertanggung jawab terhadap representasi dan pengelolaan data objek dalam program.

### 2. Service

Package `service` digunakan untuk menangani proses dan logika yang terdapat dalam program. Package ini terdiri dari:

- `Service`
- `InputValidator`

Class `Service` menangani proses utama seperti **CRUD (Create, Read, Update, Delete)** pada data member, instruktur, jenis kelas, dan kelas Pilates. Class ini juga mengatur proses pencarian data, pengecekan ID, penambahan data, perubahan data, dan penghapusan data.

Sementara itu, `InputValidator` digunakan untuk melakukan validasi terhadap input pengguna, seperti validasi angka, pilihan menu, jenis kelamin, nomor telepon, usia, kapasitas, dan status kelas.

Package `service` berperan sebagai bagian **Controller** karena menangani proses dan logika program berdasarkan input yang diberikan oleh pengguna.

### 3. Main

Package `main` berisi class `PilatesMinpro2` yang digunakan sebagai **entry point** atau titik awal program. Class ini digunakan untuk menjalankan program dan mengatur alur utama interaksi pengguna dengan sistem.

Bagian `main` juga menghubungkan pengguna dengan proses yang terdapat pada `Service`, sehingga pengguna dapat memilih menu dan menjalankan fitur-fitur yang tersedia pada program.

### 4. Alur Penerapan MVC

Secara sederhana, penerapan MVC pada program dapat digambarkan sebagai berikut:

**User → Main → Service → Model**

Input dari pengguna diterima melalui bagian `main`, kemudian diteruskan ke class `Service` untuk diproses. `Service` akan mengelola data yang terdapat pada class-class di package `model`. Hasil dari proses tersebut kemudian ditampilkan kembali kepada pengguna melalui bagian `main`.

Dengan pembagian tersebut, masing-masing package memiliki tanggung jawab yang berbeda. `model` berfokus pada representasi data, `service` menangani proses dan logika program, sedangkan `main` menjadi bagian utama yang mengatur jalannya program dan interaksi dengan pengguna.
