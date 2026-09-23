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

### 2. Package service

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


### 3. Package main

Package `main` berisi class `PilatesMinpro2` yang digunakan sebagai entry point atau titik awal program. Class ini digunakan untuk menjalankan program dan mengatur alur utama interaksi pengguna dengan sistem. Bagian `main` juga menghubungkan pengguna dengan proses yang terdapat pada `Service`, sehingga pengguna dapat memilih menu dan menjalankan fitur-fitur yang tersedia pada program.

## Alur Program
Alur program dimulai ketika pengguna menjalankan program melalui class Pilates.java sebagai class utama. Setelah program dijalankan, sistem akan menampilkan halaman utama  yang berisi beberapa pilihan menu.
Pengguna dapat memilih menu dengan menginput angka sesuai dengan pilihan yang tersedia. Sistem kemudian menggunakan percabangan switch-case untuk menentukan proses yang akan dijalankan.

Jika pengguna memilih menu Member, sistem akan mengarahkan pengguna ke proses lihat atau tambah data member. Jika memilih Instruktur, sistem akan mengarahkan pengguna ke proses lihat atau tambah data instruktur. Jika memilih Jenis Kelas, sistem akan mengarahkan pengguna ke proses lihat atau tambah data Jenis Kelas. Apabila pengguna memilih menu daftar kelas, maka akan diarahkan ke lihat daftar kelas yang sudah ada, menambahkan daftar kelas baru, menghapus daftar kelas yang sudah ada, dan melakukan update pada data daftar kelas. 

Program akan terus berjalan dan menampilkan kembali menu utama selama pengguna belum memilih menu Keluar. Dengan demikian, pengguna dapat melakukan beberapa proses pengelolaan data dalam satu kali menjalankan program.

## Penerapan Encapsulation

Konsep encapsulation diterapkan pada class Member, Instruktur, JenisKelas, JenisKelasPrivate, JenisKelasPublik, dan KelasPilates dengan menjadikan atribut-atribut di dalamnya sebagai private. Atribut tersebut tidak dapat diakses secara langsung dari class lain, sehingga akses data dilakukan melalui getter dan setter yang telah disediakan. Selain itu, class Service juga menerapkan encapsulation pada atribut seperti daftarMember, daftarInstruktur, daftarJenisKelas, dan daftarKelas, sedangkan class InputValidator menerapkannya pada atribut scanner. Penggunaan encapsulation berfungsi untuk melindungi dan membatasi akses langsung terhadap data, sehingga perubahan maupun pengambilan data harus dilakukan melalui method yang telah ditentukan dan data menjadi lebih terkontrol.

## Penerapan Inheritance

Inheritance dalam program ini diterapkan dengan membuat class JenisKelas.java yang bertindak sebagai Superclass dan class JenisKelasPrivate.java serta JenisKelasPublik.java yang bertindak sebagai Subclass. Kedua class yang bertindak sebagai Subclass tersebut mewarisi atribut dari Superclass nya, yaitu JenisKelas.java. Pada JenisKelasPrivate.java terdapat tambahan atribut khusus yaitu jenisSesi dan untuk JenisKelasPublik.java terdapat tambahan atribut khusus yaitu kapasitas. 
