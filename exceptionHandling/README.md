1. Exception (Ngoại lệ) là gì?
Exception là một sự kiện xảy ra trong quá trình thực thi chương trình, làm gián đoạn luồng lệnh bình thường của chương trình.


Tất cả các ngoại lệ trong Java đều là đối tượng kế thừa từ lớp java.lang.Throwable.


Throwable có hai nhánh con chính:

Error: Đại diện cho các vấn đề nghiêm trọng bên ngoài tầm kiểm soát của ứng dụng (ví dụ: OutOfMemoryError, StackOverflowError). Bạn không nên cố gắng xử lý chúng.

EThrowable có hai nhánh con chính:

Error: Đại diện cho các vấn đề nghiêm trọng bên ngoài tầm kiểm soát của ứng dụng (ví dụ: OutOfMemoryError, StackOverflowError). Bạn không nên cố gắng xử lý chúng.

Exception: Đại diện cho các vấn đề ứng dụng có thể và nên được xử lý (ví dụ: IOException, NullPointerException).xception: Đại diện cho các vấn đề ứng dụng có thể và nên được xử lý (ví dụ: IOException, NullPointerException).


2. Cơ chế Xử lý Ngoại lệ (try-catch-finally)

      1. Khối try:
Chứa đoạn mã có khả năng ném ra ngoại lệ.

Nếu ngoại lệ xảy ra trong khối try, việc thực thi sẽ ngay lập tức chuyển sang khối catch phù hợp.

    2. Khối catch:
Được sử dụng để bắt (handle) một loại ngoại lệ cụ thể.

Một khối try có thể có nhiều khối catch để xử lý các loại ngoại lệ khác nhau.

    3. Khối finally:
Chứa đoạn mã luôn luôn được thực thi, bất kể ngoại lệ có xảy ra hay không, hay có được xử lý hay không.

Thường được dùng để thực hiện các công việc dọn dẹp (cleanup), như đóng kết nối cơ sở dữ liệu hoặc đóng luồng file.

3. Các Từ khóa Khác

    1. throws:
Được sử dụng trong chữ ký của phương thức để khai báo rằng phương thức đó có thể ném ra một hoặc nhiều loại Checked Exceptions.

Nó không xử lý ngoại lệ; nó chỉ chuyển trách nhiệm xử lý sang phương thức gọi nó (caller).

```java 
// Phương thức này không xử lý IOException, mà khai báo rằng nó sẽ ném ra
public void processData() throws IOException, SQLException {
    // ... code có thể ném ngoại lệ
}
```

    2. throw:
Được sử dụng để ném (raise) một thể hiện ngoại lệ (exception object) một cách rõ ràng trong code.

Thường được dùng để tạo và ném các ngoại lệ tùy chỉnh hoặc để ném lại một ngoại lệ sau khi xử lý một phần.

```java 

if (age < 0) {
    // Tự tạo và ném ngoại lệ
    throw new IllegalArgumentException("Tuổi không thể là số âm.");
}
```
```
