create database QuanLi_BH
go 
use QuanLi_BH
go

create table NguoiDung_BH(
	idBHYT int identity(1,1) not null primary key,
	hoTen nvarchar(100),
	ngaySinh date,
	gioiTinh varchar(10),
	soDienThoai varchar(50),
	diaChi nvarchar(100),
	noiDK nvarchar(100),
	ngayBatDau date,
	ngayKetThuc date,
)
go

insert into NguoiDung_BH
values (N'Nguyễn Văn A','2002-04-20','Nam','0123456789',N'30 Lê Duẩn','Đà Nẵng','2019-02-10','2024-02-10'),
(N'Trần Thị B','2005-03-12','Nam','0143256789',N'10 Trường Chinh','Đà Nẵng','2020-10-22','2025-10-22'),
(N'Lê Văn C','2004-07-29','Nam','0132456789',N'30 Lê Duẩn','Đà Nẵng','2021-05-16','2026-05-16')