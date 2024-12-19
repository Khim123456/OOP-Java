--7.1 Tạo CSDL QLBanHang với 3 bảng
Create Database QLBanHang

Use QLBanHang


Create Table CongTy
(
MaCT int Primary Key,
TenCT nvarchar(100),
TrangThai nvarchar(100),
ThanhPho nvarchar(50),
)
Drop Table CongTy

Create Table SanPham
(
MaSP int Primary Key,
TenSP nvarchar(100),
MauSac nvarchar(50) Default 'Đỏ',
Gia Decimal (10, 2),
SoLuongCo int,
)
Drop Table SanPham

Create Table CungUng
(
MaCT int Foreign Key References CongTy(MaCT), 
MaSP int Foreign Key References SanPham(MaSP),
Primary Key(MaCT, MaSP),
SoLuongBan int Check(SoLuongBan > 0),
)
Drop Table CungUng

--7.2 Thêm các ràng buộc vào CSDL QLBanHang
--1 Ràng buộc mặc định và duy nhất cho bảng sản phẩm
Alter Table SanPham
Add Constraint UC_TenSP Unique (TenSP);

--2 Ràng buộc cho bảng CungUng
--Đã thêm từ khi tạo bảng
Select * From CongTy
Select * From SanPham
Select * From CungUng

--7.3 
--a Nhập dữ liệu mẫu
Insert Into CongTy(MaCT, TenCT, TrangThai, ThanhPho) Values
(1, N'Công ty A', N'Đang hoạt động', N'Hà Nội'),
(2, N'Công ty B', N'Ngừng hoạt động', N'Hồ Chí Minh'),
(3, N'Công ty C', N'Đang hoạt dộng', N'Đà Nẵng')
Truncate Table CongTy

Insert into SanPham(MaSP, TenSP, MauSac, Gia, SoLuongCo) Values
(101, N'Sản phẩm 1', N'Xanh', 50000, 100),
(102, N'Sản phẩm 2', N'Đỏ', 150000, 50),
(103, N'Sản phẩm 3', N'Vàng', 200000, 200)
Truncate Table SanPham

Insert into CungUng(MaCT, MaSP, SoLuongBan) Values
(1, 101, 20),
(1, 102, 15),
(2, 101, 10),
(2, 103, 15),
(3, 102, 30),
(3, 103, 50);
Truncate Table CungUng
