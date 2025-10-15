
Records trong Java là gì?
Record là một loại lớp đặc biệt (special kind of class) trong Java, được thiết kế để tạo ra các lớp chứa dữ liệu thuần túy (plain data carriers). Mục đích chính của Record là giảm thiểu tối đa lượng mã lặp đi lặp lại (boilerplate code) mà lập trình viên phải viết khi tạo các lớp dùng để lưu trữ dữ liệu (ví dụ: các lớp POJO - Plain Old Java Object hoặc Value Objects).

# cu phap khai bao co ban 

public record Points(int x , int y ){

}

= 

public class Points (int x , int y)
{ 
  private final int x ;
  private final int y;

  public Points( int x , int y)
  {
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY()
  {
    return this.y;
  }

  public void setX(int x)
  {
    this.x = x;
  }
  
  public void setY(int y)
  {
    this.y = y;
  }
}


mot record mac dinh la khong the ke thua bat ki lop nao khac 
mot record khong the duoc ke thua bat ki mot lop nao khac.



record Person(String name, int age) {}

Person p1 = new Person("Alice", 30);
Person p2 = new Person("Alice", 30);
Person p3 = new Person("Bob", 25);

// p1.equals(p2) sẽ là TRUE vì cả name ("Alice") và age (30) đều bằng nhau.
// p1.equals(p3) sẽ là FALSE.



record Person(String name, int age) {}
Person p1 = new Person("Alice", 30);

// p1.toString() sẽ trả về một chuỗi tương tự như:
// "Person[name=Alice, age=30]"
