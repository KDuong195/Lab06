# Lap06 – Kiểm thử BiCardSource (Exercise 5.11)

Project Java (Maven) chạy trên VS Code.

## Cấu trúc

```
Lap06/
├── pom.xml
├── .vscode/
├── src/main/java/lap06/
│   ├── BiCardSource.java   (lớp được kiểm thử, đã sửa lỗi draw())
│   ├── CardSource.java
│   ├── Card.java, Rank.java, Suit.java
│   └── Main.java           (chạy thử)
└── src/test/java/lap06/
    └── TestBiCardSource.java   (5 test + stub)
```

## Chạy trên VS Code

1. Cài **Extension Pack for Java** (VS Code sẽ gợi ý khi mở thư mục), cần JDK 17 trở lên.
2. `File > Open Folder...` chọn thư mục `Lap06`, đợi Java load xong.
3. Mở biểu tượng **Testing** (bình thí nghiệm) ở thanh bên trái, bấm Run để chạy test.
4. Đo coverage: bấm **Run Test with Coverage** trong Testing view.

Hoặc dùng terminal (nếu đã cài Maven): `mvn test`
(báo cáo JaCoCo ở `target/site/jacoco/index.html`).
