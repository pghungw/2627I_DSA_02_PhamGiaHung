# Bài 1:

- **Lỗi sai:** Điều kiện so sánh leader\[i\] == leader\[p\] bị ảnh hưởng
  trực tiếp khi i = p. Khi duyệt tới chỉ số p, leader\[p\] bị gán thành
  giá trị mới leader\[q\], khiến các phần tử có chỉ số sau p (cùng tập
  hợp với p) không còn thỏa mãn điều kiện để đổi nhãn.

- **Testcase mẫu:** Chọn n = 3, i = 0, j = 2. Thực hiện: union(0, 1),
  sau đó union(0, 2).

  - Sau union(0, 1): leader = \[1, 1, 2\].

  - Khi gọi union(0, 2): Ban đầu leader\[0\] == 1 và leader\[2\] == 2.

    - Tại i = 0: leader\[0\] == leader\[0\] -\> leader\[0\] đổi thành 2.
      Mảng thành \[2, 1, 2\].

    - Tại i = 1: Kiểm tra leader\[1\] == leader\[0\] (lúc này là 1 == 2
      -\> false), leader\[1\] không được cập nhật!

- **Kết quả:** 0 và 1 thuộc cùng tập hợp nhưng find(0) = 2 khác find(1)
  = 1.

# Bài 2:

- **(a) 1 thành phần liên thông** (vì 0 được nối lần lượt với mọi phần
  tử từ 1 đến n - 1).

- **(b) \~ 1/2 \* n\^2** lần cập nhật.

- **(c) Theta(n)**. Cây tạo thành một danh sách liên kết thẳng: 0 -\> 1
  -\> 2 -\> \... -\> n-1. Do đó find(0) phải duyệt qua toàn bộ n nút.

- **(d) Theta(1)** (chính xác là 1 lần truy cập mảng). 0 luôn giữ vị trí
  gốc cây (parent\[0\] = 0) do ở mọi bước k \>= 2, cây chứa 0 luôn có
  kích thước lớn hơn cây nút đơn {k}.

# Bài 3:

- **Đáp án:** (0, 4) và (5, 0)

- **Giải thích:** Cây gốc 4 có tổng kích thước 8, bao gồm: nhánh chứa
  {4}, cây gốc 0 (size = 4), cây gốc 5 (size = 2), và nút 6 (size = 1).

  - (0, 4) hợp lệ vì cây {4, 5, 6, 7} (size 4) gộp với cây {0, 1, 2, 3}
    (size 4), cùng size nên q đổi parent.

  - (5, 0) hợp lệ vì cây {5, 7} (size 2) trỏ vào cây {0, 1, 2, 3, 4, 6}
    (size 6), và root của 0 là 4.

# Bài 4:

- **Đáp án:** parent\[8\] có thể nhận các giá trị: 4, 8

- **Giải thích:** {8, 9} tạo thành một cây có kích thước ít nhất là 2
  (với 8 là gốc ban đầu).

  - parent\[8\] = 8: Hợp lệ, 8 là gốc độc lập.

  - parent\[8\] = 4: Hợp lệ, cây gốc 4 (size 4) gộp với cây gốc 8 (size
    2), 8 trỏ vào 4.

  - parent\[8\] = 0: Không hợp lệ vì nếu 8 trỏ vào 0 thì cây gốc 0 phải
    có size \>= 2 + 4 = 6 (mâu thuẫn vì cây 0 hiện tại chỉ có đúng 4
    phần tử).

# Bài 5:

- **Đáp án:** Không thể.

- **Giải thích:** Chỉ có duy nhất nút 5 là gốc (parent\[5\] = 5). Đường
  đi từ 3 lên gốc: 3 -\> 4 -\> 0 -\> 5 (độ sâu h = 3). Theo định lý của
  Weighted Quick-Union, nhánh này bắt buộc phải chứa ít nhất 2\^3 = 8
  nút. Tuy nhiên, toàn bộ cây con gốc 0 hiện tại chỉ có 5 nút ({0, 2, 4,
  6, 3}), vi phạm quy tắc gộp theo kích thước.
