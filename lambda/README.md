lamdba : 

(parameters) -> expression

(parameters) -> {expression;}

vi du 
```Java

(int a , int b) -> return a+b;
() -> System.out.println("Hello lamdba") ;
(x) -> return x*x;
```

lamdba chỉ có thể dùng với Functional Inteface- Là Interface chỉ có duy nhất một phương
thức trừu tượng (@annoted bằng  @FunctionalInterface)


``` Interface được sử dụng trong thực tế:
```



1. Duyet danh sach :
```Java

List<String> names = {"An", "Binh", "Cao"}; 
names.forEach(n -> System.out.println(n));
```

2. Loc phan tu:
```Java
List<Integer> nums = List.of(1,2,3,4);

nums.stream().filter(n -> n%2 ==0).forEach(n -> System.out.println(x));
```


3. sap xep:
```Java
List<String> tens = new ArrayList<>(List.of({"kim", "an" , "Hang", "Phong", "Tam"}));
tens.sort((a,b) -> a.length() - b.length);
```

4. Khai bao 1 Object cua Interface ??
```Java
Runnable r = () -> System.out.println("Running...");
```
