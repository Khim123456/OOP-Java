-- tạo cơ sở dữ liệu
create database QLBH2		
drop database QLBH2		

use QLBH2

create table HangSX
(
	MaHangSX char(10) primary key,
	TenHang nvarchar(50),
	DiaChi nvarchar(100),
	SoDT char(12),
	Email varchar(50)
)
Drop table SanPham
create table SanPham
(
	MaSP char(10) primary key,
	MaHangSX char(10) foreign key References HangSX(MaHangSX),
	TenSP nvarchar(50),
	SoLuong int,
	MauSac Nvarchar(20),
	GiaBan Money,
	DonViTinh Nvarchar(20),
	MoTa Ntext,
)

create table NhanVien
(
	MaNV char(10) primary key,
	TenNV nvarchar(50),
	GioiTinh Nchar(10),
	DiaChi Nvarchar(100),
	SoDT Char(12),
	Email varchar(50),
	TenPhong Nvarchar(100),
)

create table PNhap
(
	SoHDN char(10) Primary key,
	NgayNhap Date,
	MaNV char(10) Foreign key References NhanVien(MaNV),
)

create table Nhap
(
	SoHDN char(10) Primary key(SoHDN,MaSP) Foreign Key References PNhap(SoHDN),
	MaSP Char(10) foreign key references SanPham(MaSP),
	SoLuongN int,
	DonGiaN money,
)

create table PXuat
(
	SoHDX char(10) Primary key,
	NgayXuat Date,
	MaNV char(10) Foreign key references NhanVien(MaNV),
)

create table Xuat
(
	SoHDX char(10) primary key(SoHDX,MaSP) foreign key references PXuat(SoHDX),
	MaSP char(10) foreign key references SanPham(MaSP),
	SoLuongX int,
)


insert into HangSX values	('H01','Samsung', 'Korea', '011-08271717', 'ss@gmail.com.kr'),
							('H02','OPPO','China','081-08626262','oppo@gmail.com.cn'),
							('H03','Vinfone',N'Việt Nam','084-09826262','vf@gmail.com.vn')						

						
insert into NhanVien values	('NV01',N'Nguyễn Thị Thu',N'Nữ',N'Hà Nội','0982626521','thu@gmail.com',N'Kế toán'),
							('NV02',N'Lê Văn Nam',N'Nam',N'Bắc Ninh','0972525252','nam@gmail.com',N'Vật tư'),
							('NV03',N'Trần Hòa Bình',N'Nữ',N'Hà Tây','0328388388','hb@gmail.com',N'Kế toán')

insert into SanPham values	('SP01','H02','F1 Plus','100',N'Xám','7000000',N'Chiếc',N'Hàng cận cao cấp'),
							('SP02','H01','Galaxy Note 11','50',N'Đỏ','19000000',N'Chiếc',N'Hàng cao cấp'),
							('SP03','H02','F3 lite','200',N'Nâu','3000000',N'Chiếc',N'Hàng Phổ Thông'),
							('SP04','H03','Vjoy3','200',N'Xám','1500000',N'Chiếc',N'Hàng Phổ Thông'),
							('SP05','H01','Galaxy V21','500',N'Nâu','8000000',N'Chiếc',N'Hàng cận cao cấp')

insert into PNhap values	('N01','02-05-2019','NV01'),
							('N02','04-07-2020','NV02'),
							('N03','05-17-2020','NV02'),
							('N04','03-22-2020','NV03'),
							('N05','07-07-2020','NV01')

insert into Nhap values		('N01','SP02','10','17000000'),
							('N02','SP01','30','6000000'),
							('N03','SP04','20','1200000'),
							('N04','SP01','10','6200000'),
							('N05','SP05','20','7000000')


insert into PXuat values	('X01','06-14-2020','NV02'),
							('X02','03-05-2019','NV03'),
							('X03','12-12-2020','NV01'),
							('X04','06-02-2020','NV02'),
							('X05','05-18-2020','NV01')

insert into Xuat values		('X01','SP03','5'),
							('X02','SP01','3'),
							('X03','SP02','1'),
							('X04','SP03','2'),
							('X05','SP05','1')


select * from HangSX
select * from NhanVien
select * from SanPham
select * from PNhap
select * from Nhap
select * from PXuat
select * from Xuat

update NhanVien set DiaChi= N'Hà Nội'
where DiaChi=N'Hà Tây';


delete from SanPham where MaHangSX='H05';

--1. Đưa ra các thông tin về các Sản phẩm có màu Đỏ.
Select* 
From SanPham
Where MauSac=N'Đỏ';

--2. Đưa ra 2 sản phẩm có giá bán Lớn nhất
Select top 2 TenSP, GiaBan
From SanPham Order by GiaBan Desc 



--3. Đưa ra thông tin các Phiếu nhập có năm nhập là 2019
Select*
From PNhap Where Year(NgayNhap) = 2019;


--4. Đưa ra Danh sách các tên tỉnh của các nhân viên không trùng nhau
Select Distinct DiaChi From NhanVien;


--5. Đưa ra 3 sản phẩm màu xám có số lượng nhỏ nhất
Select top 3 TenSP, SoLuong
From SanPham Where MauSac=N'Xám' Order by SoLuong Asc


--6. Đưa ra tên nhân viên, địa chỉ, số điện thoại của các nhân viên phòng “Kế toán”
Select TenNV, DiaChi, SoDT From NhanVien Where TenPhong ='Kế toán';

--7. Đưa ra các sản phẩm có giá bán từ 1.000.000 đến 10.000.000.
Select*
From SanPham Where GiaBan Between 1000000 And 10000000;


--8. Đưa ra SoHDN, ngày nhập, tháng nhập, năm nhập của các PNhap
Select SoHDN, NgayNhap, Month(NgayNhap) as ThangNhap, Year(NgayNhap) as NamNhap From PNhap;


--9. Đưa ra tất cả các nhân viên có họ ‘Nguyễn’
Select* From NhanVien Where TenNV Like N'Nguyễn%';

--10.Đưa ra tất cả các sản phẩm có giá bán sắp xếp theo chiều từ cao đến thấp và số lượng sắp xếp theo chiều từ thấp đến cao.Học phần: Hệ thống cơ sở dữ liệu
Select* From SanPham Order by GiaBan Desc, SoLuong Asc;

--Trang 2
--11.Đưa ra thông tin PXuat bao gồm SoHDX,NgayX, TenNV với tháng xuất là tháng 3, năm xuất là 2019
Select PXuat.SoHDX, PXuat.NgayXuat As NgayX, NhanVien.TenNV
From PXuat 
Join NhanVien On PXuat.MaNV = NhanVien.MaNV
Where Month(PXuat.NgayXuat) = 3 And Year(PXuat.NgayXuat) = 2019;


--12.Đưa ra thông tin các nhân viên đã xuất hàng trong ngày 12/12/2020
Select Distinct NhanVien.*
From PXuat
Join NhanVien On PXuat.MaNV = NhanVien.MaNV
Where PXuat.NgayXuat = '2020-12-12';


--13.Đưa ra các thông tin sản phẩm cận cao cấp có giá bán từ 5.000.000 đến 10.000.000 của hãng Samsung.
Select SanPham.*
From SanPham
Join HangSX On SanPham.MaHangSX = HangSX.MaHangSX
Where SanPham.GiaBan Between 5000000 And 10000000 And HangSX.TenHang = 'Samsung';


--14.Đưa ra thông tin các sản phẩm màu đỏ, do hãng OPPO sản xuất
Select SanPham.*
From SanPham
Join HangSX On SanPham.MaHangSX = HangSX.MaHangSX
Where SanPham.MauSac ='Đỏ' And HangSX.TenHang = 'OPPO';


--15.Đưa ra các thông tin về các hóa đơn mà hãng Samsung đã nhập trong năm 2019, gồm: SoHDN, MaSP, TenSP, SoLuongN, DonGiaN, NgayNhap, TenNV, TenPhong.
Select PNhap.SoHDN, Nhap.MaSP, SanPham.TenSP, Nhap.SoLuongN, Nhap.DonGiaN, PNhap.NgayNhap, NhanVien.TenNV, NhanVien.TenPhong
From PNhap
Join Nhap On PNhap.SoHDN = Nhap.SoHDN
Join SanPham On Nhap.MaSP = SanPham.MaSP
Join HangSX On SanPham.MaHangSX = HangSX.MaHangSX
Join NhanVien On PNhap.MaNV = NhanVien.MaNV
Where HangSX.TenHang = 'Samsung' And Year(PNhap.NgayNhap) = 2019;
