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

Inheritance dalam program ini diterapkan dengan membuat class JenisKelas.java yang bertindak sebagai Superclass dan class JenisKelasPrivate.java serta JenisKelasPublik.java yang bertindak sebagai Subclass. Kedua class yang bertindak sebagai Subclass tersebut mewarisi atribut dari Superclass nya, yaitu JenisKelas.java. Pada JenisKelasPrivate.java terdapat tambahan atribut khusus yaitu jenisSesi dan untuk JenisKelasPublik.java terdapat tambahan atribut khusus yaitu kapasitas. Pada masing-masing Subclass, diterapkan keyword 'super' untuk mengakses atribut dari Superclass nya. Selain itu, terdapat penerapan keyword 'final' pada atribut kapasitas dibagian InputValidator yang bertujuan untuk membatasi modifikasi pada atribut kapasitas sehingga pengguna dapat memasukkan kapasitas maksimal 25.

## Penerapan Polymorphism 

Polymorphism dalam program ini diterapkan melalui method overriding pada class JenisKelasPrivate dan JenisKelasPublik yang merupakan Subclass dari JenisKelas. Kedua Subclass tersebut memiliki method yang sama dengan Superclass, tetapi dapat memberikan implementasi yang berbeda sesuai dengan karakteristik masing-masing jenis kelas. Dengan demikian, ketika method tersebut dipanggil melalui objek JenisKelas, program dapat menjalankan implementasi method sesuai dengan jenis objek yang digunakan. Penerapan polymorphism ini membuat program lebih fleksibel karena satu method dapat memiliki perilaku yang berbeda pada masing-masing Subclass.

## Dokumentasi Program 
Adapun dokumentasi dari alur program yaitu sebagai berikut:

### Tampilan Menu Utama

<img width="560" height="276" alt="image" src="https://github.com/user-attachments/assets/9f24b780-4369-461f-8b09-e1c7a4b8515e" />

Ketika program dijalankan, pengguna akan diberikan beberapa pilihan menu yang dapat digunakan untuk mengelola data. Terdapat menu member yang berfungsi untuk mengelola data member, menu Instruktur yang digunakan untuk mengelola data instruktur, menu jenis kelas yang digunakan untuk mengelola jenis kelas yang tersedia, serta menu pendaftaran kelas yang digunakan untuk mengelola daftar kelas yang akan dilaksanakan di studio pilates ini.

### Menu Member

<img width="523" height="232" alt="image" src="https://github.com/user-attachments/assets/eb119f87-0417-479e-b689-8b81ce2b4249" />

Menu member berisi 2 sub menu yaitu lihat dan tambah member yang fungsinya sebagai berikut:

* **1. Tambah Member**

<img width="517" height="382" alt="image" src="https://github.com/user-attachments/assets/b2370b67-6dc1-4df6-9912-314440e0dcbf" />


Pada sub menu ini, pengguna dapat menambahkan member baru yang akan bergabung untuk mengikuti kelas di studio dengan memasukkan ID member, nama member, nomor telepon, usia dan jenis kelamin member tersebut.

* **2. Lihat Member**

<img width="537" height="423" alt="image" src="https://github.com/user-attachments/assets/0b38ed01-e904-4a16-83e9-88bc863ffb7b" />


Pada sub menu ini, pengguna dapat melihat daftar member yang telah terdaftar pada sistem.

* **3. Kembali**

<img width="557" height="335" alt="image" src="https://github.com/user-attachments/assets/a46b10a8-69cd-40ba-ba02-a911879235f5" />


Pada sub menu ini, pengguna dapat kembali ke menu utama program.

### Menu Instruktur

<img width="543" height="223" alt="image" src="https://github.com/user-attachments/assets/efb1cc9b-20df-42bc-95e8-a794fe3e54f5" />

Menu instruktur berisi 2 sub menu yaitu lihat dan tambah instruktur yang fungsinya sebagai berikut:

* **1. Tambah Instruktur**

  <img width="652" height="420" alt="image" src="https://github.com/user-attachments/assets/0e8f5069-3467-4d11-95d6-d039c92a9a0b" />

Pada sub menu ini, pengguna dapat menambahkan instruktur baru yang akan bergabung untuk memandu kelas di studio dengan memasukkan ID instruktur, nama instruktur, spesialisasi, nomor telepon, dan jenis kelamin instruktur tersebut.

* **2. Lihat Instruktur**

<img width="550" height="471" alt="image" src="https://github.com/user-attachments/assets/88c32ecb-e897-4da7-9b2b-d0dd12573a02" />

Pada sub menu ini, pengguna dapat melihat daftar instruktur yang telah terdaftar pada sistem.

* **3. Kembali**

<img width="552" height="363" alt="image" src="https://github.com/user-attachments/assets/8a4f46ae-c333-4c73-9c72-c1e90d2034be" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

### Menu Jenis Kelas

<img width="563" height="312" alt="image" src="https://github.com/user-attachments/assets/c0d3964b-e548-4527-86f9-2b221e44a211" />

Menu jenis kelas berisi 2 sub menu yaitu lihat dan tambah jenis kelas yang fungsinya sebagai berikut:

* **1. Tambah Jenis Kelas**
  
<img width="593" height="421" alt="image" src="https://github.com/user-attachments/assets/fb3b7744-cfd1-4203-b66e-432936f2de9a" />

Pada sub menu ini, pengguna dapat menambahkan jenis kelas baru yang akan diadakan di studio dengan memasukkan ID jenis, nama pilates, level, durasi, dan jenis sesi dari jenis kelas tersebut.

* **2. Lihat Jenis Kelas**

<img width="511" height="732" alt="image" src="https://github.com/user-attachments/assets/ecf18a2b-4205-483e-b349-20b4c638c110" />

Pada sub menu ini, pengguna dapat melihat daftar jenis kelas yang telah terdaftar pada sistem.

* **3. Kembali**

<img width="593" height="280" alt="image" src="https://github.com/user-attachments/assets/a25594ba-52d9-4cec-a6de-498a02d751d7" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.

### Menu Daftar Kelas

<img width="522" height="282" alt="image" src="https://github.com/user-attachments/assets/183c5e60-2844-4d5d-83f1-83f5fbef6bd5" />

Menu pendaftaran kelas berisi 4 sub menu yaitu lihat, tambah, hapus, dan perbarui daftar kelas yang fungsinya sebagai berikut:

* **1. Lihat Pendaftaran Kelas**

<img width="566" height="323" alt="image" src="https://github.com/user-attachments/assets/d88d4c4d-a8a0-4860-9957-103a3ba1d0eb" />

Pada sub menu ini, pengguna dapat melihat daftar kelas yang telah terdaftar pada sistem dan siap untuk dilaksanakan pada studio. Data ini berisi identitas member yang melaksanakan kelas, instruktur yang memandu kelas, jenis kelas yang dilaksanakan dan waktunya.

* **2. Pendaftaran Kelas**

<img width="548" height="251" alt="image" src="https://github.com/user-attachments/assets/263573bb-a879-44cb-a0fa-44b0393695d1" />

Pada sub menu ini, sistem akan menampilkan id member, id instruktur, dan id jenis kelas agar pengguna dapat memilih member, instruktur, dan jenis kelas apa yang ingin ditambahkan. Setelah itu, akan muncul output dimana kelas berhasil ditambahkan dan tertera identitas member, instruktur, dan jenis kelas yang akan dilaksanakan.

* **3. Hapus Kelas**

<img width="557" height="190" alt="image" src="https://github.com/user-attachments/assets/3676ebd4-fba9-4134-8166-c2932b38d4a1" />

Pada sub menu ini, sistem akan mengarahkan pengguna untuk menginput ID kelas yang akan dihapus. Selanjutnya, sistem akan menghapus kelas sesuai dengan ID yang di input oleh pengguna. Sub menu ini dapat digunakan apabila sesi kelas telah selesai dilaksanakan dan member tidak ingin memperpanjang sesi kelas nya kembali.

* **4. Update Kelas**

<img width="537" height="406" alt="image" src="https://github.com/user-attachments/assets/6b2cfdbe-79ba-44f5-b8f4-a87c2797a687" />

Pada sub menu ini, sistem akan mengarahkan pengguna untuk melakukan update terhadap status kelas yang ada. Update bisa berupa Terjadwal, Selesai, atau Batal. Sub Menu ini berguna untuk memudahkan pengelola dalam menandai status kelas yang telah terdaftar.

* **5. Kembali**
  
<img width="571" height="347" alt="image" src="https://github.com/user-attachments/assets/56864935-369e-478b-ab72-7100b43ff3c3" />

Pada sub menu ini, pengguna dapat kembali ke menu utama program.
  
### Menu Keluar dari Program

<img width="557" height="395" alt="image" src="https://github.com/user-attachments/assets/4e76cefa-fdd6-496d-8c36-315a31e06323" />


Pada menu ini, pengguna akan diarahkan untuk keluar dari sistem.
