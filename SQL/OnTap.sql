Create Database QLNV
Use QLNV

-- Tạo bảng NHANVIEN
CREATE TABLE NHANVIEN (
    MaNV VARCHAR(10) PRIMARY KEY,
    TenNV NVARCHAR(50),
    NgaySinh DATE,
    TrinhDo NVARCHAR(50),
    ChucVu NVARCHAR(50)
);

-- Tạo bảng KHOAHOC
CREATE TABLE KHOAHOC (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH NVARCHAR(50),
    DiaDiem NVARCHAR(50)
);

-- Tạo bảng THAMGIA
CREATE TABLE THAMGIA (
    MaNV VARCHAR(10),
    MaKH VARCHAR(10),
    SoBuoiNghi INT,
    KetQua NVARCHAR(50),
    PRIMARY KEY (MaNV, MaKH),
    FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV),
    FOREIGN KEY (MaKH) REFERENCES KHOAHOC(MaKH)
);


-- Nhập dữ liệu cho bảng NHANVIEN
INSERT INTO NHANVIEN (MaNV, TenNV, NgaySinh, TrinhDo, ChucVu)
VALUES 
('NV01', N'Trần Văn Ước', '1988-05-12', N'Đại học', N'Nhân viên'),
('NV02', N'Hoàng Văn Huy', '2000-12-17', N'Đại học', N'Trưởng phòng'),
('NV03', N'Nguyễn Thị Chính', '1982-05-02', N'Cao đẳng', N'Nhân viên');

-- Nhập dữ liệu cho bảng KHOAHOC
INSERT INTO KHOAHOC (MaKH, TenKH, DiaDiem)
VALUES
('KH01', N'Giao tiếp cơ bản', N'Hà Nội'),
('KH02', N'Giao tiếp nâng cao', N'Hà Nội'),
('KH03', N'Phân tích số liệu', N'Hồ Chí Minh');

-- Nhập dữ liệu cho bảng THAMGIA
INSERT INTO THAMGIA (MaNV, MaKH, SoBuoiNghi, KetQua)
VALUES
('NV01', 'KH01', 1, N'Khá'),
('NV01', 'KH02', 2, N'Khá'),
('NV02', 'KH01', 0, N'Giỏi'),
('NV02', 'KH02', 1, N'Khá'),
('NV03', 'KH01', 4, N'Trung bình'),
('NV03', 'KH03', 0, N'Trung bình');


--Câu 2. Dựa trên CSDL vừa tạo ở câu 1, thực hiện các yêu cầu sau đây:
--a. Lấy ra từ cơ sở dữ liệu tên các nhân viên có trình độ đại học.
SELECT TenNV
FROM NHANVIEN
WHERE TrinhDo = N'Đại học';

--b. Đưa ra thông tin các nhân viên họ ‘Trần’ sinh năm 2000
SELECT *
FROM NHANVIEN
WHERE TenNV LIKE N'Trần%' AND YEAR(NgaySinh) = 2000;

--c. Lấy ra tên các nhân viên tham gia khóa học Giao tiếp nâng cao có kết quả Khá
SELECT NV.TenNV
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
JOIN KHOAHOC KH ON TG.MaKH = KH.MaKH
WHERE KH.TenKH = N'Giao tiếp nâng cao' AND TG.KetQua = N'Khá';


--d. Đưa ra thông tin câc nhân viên tham gia các khóa học ở Hà Nội có số buổi nghị học nhiều hơn 2
SELECT NV.*
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
JOIN KHOAHOC KH ON TG.MaKH = KH.MaKH
WHERE KH.DiaDiem = N'Hà Nội' AND TG.SoBuoiNghi > 2;

--e. Đưa ra mã nhân viên, tên nhân viên, tuổi của các nhân viên. Sắp xếp theo tuổi từ cao đến thấp
SELECT MaNV, TenNV, DATEDIFF(YEAR, NgaySinh, GETDATE()) AS Tuoi
FROM NHANVIEN
ORDER BY Tuoi DESC;

--f. Lấy ra mã nhân viên, tên nhân viên, số buổi nghỉ và kết quả của các nhân viên tham gia các khóa học về giao tiếp.
SELECT NV.MaNV, NV.TenNV, TG.SoBuoiNghi, TG.KetQua
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
JOIN KHOAHOC KH ON TG.MaKH = KH.MaKH
WHERE KH.TenKH LIKE N'Giao tiếp%';

--g. Đưa ra danh sách mã khóa học, tên khóa học, số người tham gia kết quả giỏi trong mỗi khóa
SELECT KH.MaKH, KH.TenKH, COUNT(TG.KetQua) AS SoNguoiGioi
FROM KHOAHOC KH
JOIN THAMGIA TG ON KH.MaKH = TG.MaKH
WHERE TG.KetQua = N'Giỏi'
GROUP BY KH.MaKH, KH.TenKH;

--h. Lấy ra mã nhân viên và số khóa học nhân viên đó đã tham gia.
SELECT NV.MaNV, NV.TenNV, COUNT(TG.MaKH) AS SoKhoaHocThamGia
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
GROUP BY NV.MaNV, NV.TenNV;

--i. Lấy ra mã và tên các khóa học có từ 2 nhân viên trở lên tham gia học.
SELECT KH.MaKH, KH.TenKH
FROM KHOAHOC KH
JOIN THAMGIA TG ON KH.MaKH = TG.MaKH
GROUP BY KH.MaKH, KH.TenKH
HAVING COUNT(TG.MaNV) >= 2;

--j. Đưa ra thông tin các nhân viên già nhất khóa học ‘Phân tích số liệu’
SELECT NV.*
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
JOIN KHOAHOC KH ON TG.MaKH = KH.MaKH
WHERE KH.TenKH = N'Phân tích số liệu';

--k. Lấy ra mã và tên nhân viên đã tham gia tất cả các khóa học.
SELECT NV.MaNV, NV.TenNV
FROM NHANVIEN NV
WHERE NOT EXISTS (
    SELECT KH.MaKH
    FROM KHOAHOC KH
    WHERE KH.MaKH NOT IN (
        SELECT TG.MaKH
        FROM THAMGIA TG
        WHERE TG.MaNV = NV.MaNV
    )
);

--l. Đưa ra nhân viên không tham gia khóa học nào
SELECT TenNV
FROM NHANVIEN
WHERE MaNV NOT IN (SELECT MaNV FROM THAMGIA);

--m. Đưa ra nhân viên tham gia nhiều khóa học nhất
SELECT TOP 1 NV.MaNV, NV.TenNV, COUNT(TG.MaKH) AS SoKhoaHoc
FROM NHANVIEN NV
JOIN THAMGIA TG ON NV.MaNV = TG.MaNV
GROUP BY NV.MaNV, NV.TenNV
ORDER BY SoKhoaHoc DESC;

--n. Đưa ra khóa học không có học viên nào học lực ‘Kém’
SELECT MaKH, TenKH, DiaDiem
FROM KHOAHOC KH
WHERE NOT EXISTS (
    SELECT 1
    FROM THAMGIA TG
    WHERE TG.MaKH = KH.MaKH AND TG.KetQua = 'Kém'
);


--o. Đưa ra nhân viên có số buổi nghỉ học nhiều nhất
SELECT TOP 1 TG.SoBuoiNghi
FROM THAMGIA TG
ORDER BY TG.SoBuoiNghi DESC;
