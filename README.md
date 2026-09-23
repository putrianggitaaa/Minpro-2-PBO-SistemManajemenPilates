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
  
  JenisKelas.java adalah class model yang berisi data jenis kelas yang terdaftar. Atribut yang berada dalam class ini, yaitu ID jenis, Nama Kelas, Level, Durasi.

*  **d. JenisKelasPrivate.java**

JenisKelasPrivate.java adalah class model yang berisi data khusus jenis kelas private yang terdaftar. Atribut yang berada dalam class ini, yaitu jenis sesi.

*  **e. JenisKelasPublik.java**

JenisKelasPublik.java adalah class model yang berisi data khusus jenis kelas publik yang terdaftar. Atribut yang berada dalam class ini, yaitu kapasitas.

*  **f. KelasPilates**

KelasPilates.java adalah class model yang berisi data kelas yang akan dilaksanakan beserta member yang melaksanakan kelas, instruktur yang memandu kelas, serta jenis kelas nya. Class ini juga memuat waktu kapan kelas tersebut dilaksanakan. Atribut yang berada dalam class ini, yaitu ID Kelas, ID Member, ID Instruktur, ID Jenis, Tanggal, Waktu, dan status.

### 2. Service

Package `service` digunakan untuk menangani proses dan logika yang terdapat dalam program. Package ini terdiri dari:

* **a. Service.java**
  
Class `Service` menangani proses utama yaitu CRUD pada data member, instruktur, jenis kelas, dan kelas Pilates. Class ini  mengatur proses penambahan data, perubahan data, dan penghapusan data.

* **b. InputValidator.java**

Class 'InputValidator` digunakan untuk melakukan validasi terhadap input pengguna, dalam program ini menggunakan validasi input sebagai berikut:

* Input Integer
  Digunakan untuk memvalidasi input agar pengguna hanya dapat memasukkan inputan dengan tipe data integer.
* Input String
  Digunakan untuk memvalidasi input agar pengguna tidak dapat mengosongkan inputan.
* Input Pilihan
  Digunakan untuk memvalidasi input agar pengguna memilih nomor pilihan menu dengan benar.
* Input Status
  Digunakan untuk memvalidasi input agar pengguna dapat memilih status kelas pilates dengan benar yang terdiri dari Terjadwal, Selesai, dan Batal.
* Input Nomor Telepon
  Digunakan untuk memvalidasi input nomor telepon sehingga pengguna dapat memasukkan nomor telepon dengan rentang 10-12 karakter saja.
* Input Usia
  Digunakan untuk memvalidasi input usia sehingga pengguna hanya dapat memasukkan usia dengan rentang 1-100 saja.
* Input Kapasitas
  Digunakan untuk memvalidasi input kapasitas sehingga pengguna dapat memasukkan kapasitas kelas tidak lebih dari 25 orang.


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
