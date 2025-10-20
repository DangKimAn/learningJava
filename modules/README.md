
Từ Java 9, Java giới thiệu module system (JPMS) — giúp chia chương trình thành các khối độc lập (module).

👉 Module = một đơn vị đóng gói logic lớn hơn package,
chứa các class, package, và file cấu hình module-info.java.

📦 2. Cấu trúc của một module

Mỗi module thường có một file đặc biệt gọi là module-info.java nằm ở gốc của thư mục src (cấp cao nhất của module):

myApp/
 ├── module-info.java
 └── com/
     └── example/
         └── app/
             └── Main.java
📦 2. Cấu trúc của một module

Mỗi module thường có một file đặc biệt gọi là module-info.java nằm ở gốc của thư mục src (cấp cao nhất của module):

myApp/
 ├── module-info.java
 └── com/
     └── example/
         └── app/
             └── Main.java



⚙️ 3. File module-info.java

Đây là “trái tim” của module — nó mô tả module này cung cấp gì và phụ thuộc vào module nào.

Ví dụ:

module com.example.app {
    requires com.example.utils;  // cần module khác
    exports com.example.app;     // cho phép module khác sử dụng package này
}


Từ khóa	Ý nghĩa
module	Khai báo tên module
requires	Chỉ ra module mà module hiện tại phụ thuộc vào
exports	Cho phép module khác truy cập vào package được export
opens	Cho phép truy cập qua reflection (ví dụ trong Hibernate, Jackson)
requires transitive	Khi module A requires B (transitive) → module nào dùng A cũng thấy được B
uses / provides	Dành cho Service Provider Interface (SPI) — lập trình hướng dịch vụ


⚠️ 7. Lưu ý khi dùng module

Một package không thể xuất hiện trong hai module khác nhau (tránh trùng lặp).

Một class chỉ thuộc một module duy nhất.

Module phải export package thì module khác mới import được.

Các thư viện cũ (trước Java 9) không có module-info.java → được xem là automatic modules.
