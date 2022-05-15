# Whitebox-testing

Kiểm thử hộp trắng theo quy trình các bước sau đây:

- Tìm một đoạn codes bất kỳ
- Lập đồ thị
- Tìm đường đi theo tiêu chuẩn MC/CD
- Lập phương trình
- Giải tạo ca kiểm thử
- Viết các unit tests

//////////////Bài làm//////////////
- Code: Cho 3 số, tìm số có giá trị nằm giữa 2 số còn lại
  public static int findMid(int a,int b,int c){
  if (a<b){
  if (b<c) return b; else
  if (a<c) return c;
  else return a;
  }
  else
  if (b>c) return b; else
  if (c<a) return c;
  else return a;

  }

- Đồ thị:
  ![img.png](img.png)

- Tìm đường đi và lập phương trình:
1. 1T -> 2T -> 3
   Phương trình: a<b<c <=> (a,b,c)=(10,15,16), output=b=15
2. 1T -> 2F -> 4T -> 5
   Phương trình: a<b, b>c, a<c <=> (a,b,c)=(10,18,16), output=c=16
3. 1T -> 2F -> 4F ->6
   Phương trình: a<b, b>c, a>c <=> (a,b,c)=(10,18,9), output=a=10
4. 1F -> 7T -> 8
   Phương trình: a>b,b>c <=> (a,b,c)=(10,5,4), output=b=5
5. 1T -> 7F -> 9T -> 10
   Phương trình: a>b, b<c, c<a <=> (a,b,c)=(17,15,16), output=c=16
6. 1T -> 7F -> 9F -> 11
   Phương trình: a>b, b<c, c>a <=> (a,b,c)=(10,9,16), output=a=10

- Unit test:
  Input Output
  10,15,16 15
  10,18,16 16
  10,18,9 10
  10,5,4 5
  17,15,16 16
  10,9,16 10

