Content
PRO192: OOP in Java

Social constructive learning 

# Scenario

_File petdog.txt_	           _Description_

1; Poodle                    Information in a line:
2; Bull pháp                 <ID; pet name >
3; Chó Phú Quốc
4; Phốc sóc

-

_File dog.txt_                                  _Description_

1876;2;zuzi;xám; cái; 300; Chó Bull Pháp        Information of a line:
(French Bulldog) là giống chó dễ thương         
nhất trong các loại chó cảnh ………                <ID; pet ID; dog name;dog color;dog gender;price; describe>


# Problem requirements

Dogs for sale needs a Java console application in which operations must be supported:

1. List all PetDogs
2. Add a new PetDog
3. Remove a PetDog by ID
4. Save PetDogs to petdog.txt file
5. List all Dogs
6. Add a new Dog
7. Remove a dog by ID
8. Update a dog based on its ID
9. Save Dogs to dog.txt file
10. List all dogs in ascending order of dog names
11. List all dogs in ascending order of dog prices
12. Search dogs based on its color
13. Search dogs based on its prices, from price… to price..
14. .....
 

# Constraints

_Constraints on PetDogs:_
Pet dog ID can not be duplicated.
The pet dog name can not be blank.

_Constraints on Dogs:_
Dog ID can not be duplicated and random 4-digit number.
Color can not be blank.


# Bảng phân công

1.	Tạo các lớp thực thể: PetDog, Dog. Tạo Interface cho các chức năng của bài toán
2.	Tạo lớp đọc ghi file, tìm dữ liệu cho 2 file
3.	Tạo Lớp cài đặt các chức năng liên quan đến danh sách đối tượng lớp PetDog
4.	Tạo Lớp cài đặt các chức năng liên quan đến danh sách đối tượng lớp Dog
5.	Tạo menu + chạy các chức năng của chương trình
