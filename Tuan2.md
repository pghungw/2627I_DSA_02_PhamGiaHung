Bài 1:

1.1:

- \~½ n

- $\theta(N)$

1.2:

- \~3logn

- $\theta$(logN)

1.3:

- \~100n

- $\theta$(n)

1.4

- \~√n log₃ n

- $\theta$(√n log n)

1.5

- \~ n log₂ n

- $\theta$(n log n)

1.6

- \~ 50n³

- $\theta(n³)\$

Bài 2:

\~ n\^4 log_2(n)

Bài 3:

O(n\^2) và Ω(n\^2)

Bài 4:

\~ 64n (bytes)

Mỗi Node tốn 16 (overhead) + 8\*5 (references) + 4 (int) + 4 (padding) =
64 bytes.

n nodes tốn 64n bytes. Lớp BST tốn 32 bytes (hằng số).

Bài 5:

\~ 50n\^2

Bài 6:

O(n\^n)

\*\*\*

1.4.1.

tổ hợp chập 3 của N

Số cách chọn 3 phần tử từ N là C(N,3) = N! / (3!(N-3)!) = N(N-1)(N-2)/6.

1.4.2.

Ép sang kiểu long.

Thay (a\[i\] + a\[j\] + a\[k\] == 0) thành ((long)a\[i\] + a\[j\] +
a\[k\] == 0) để tránh tràn bộ

nhớ int.

1.4.5.

a\. \~N; b. \~1; c. \~1; d. \~2N\^3; e. \~1; f. \~2; g. \~0

1.4.6.

a\. O(N); b. O(N); c. O(N log N)

1.4.8

Sắp xếp rồi duyệt kề. Dùng Arrays.sort() mất O(N log N), sau đó duyệt
O(N) kiểm tra các phần tử liền

kề.

1.4.10

Lưu lại index và tiếp tục tìm nửa trái. Giải thích: Khi a\[mid\] == key,
gán biến res = mid và cập nhật hi = mid - 1 thay vì trả về ngay.

1.4.12.

Dùng 2 con trỏ từ đầu.Giải thích: So sánh con trỏ. Kéo con trỏ của bên
có giá trị nhỏ hơn lên. Nếu bằng thì in và kéo

cả hai.
