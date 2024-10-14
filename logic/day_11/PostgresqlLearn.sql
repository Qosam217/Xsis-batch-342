create table Type_dosen(id SERIAL, 
						Kode_TypeDosen varchar(4), 
						Deskripsi varchar(50));

create table Agama(id serial, 
				Kode_Agama varchar(4), 
				Deskripsi varchar(10));

create table Jurusan(id serial, 
					Kode_Jurusan varchar(4), 
					Nama_Jurusan varchar(50), 
					Status_Jurusan varchar(10));

create table Mahasiswa(id serial, 
					Kode_Mahasiswa varchar(4), 
					Nama_Mahasiswa varchar(50), 
					Alamat varchar(50),
					Kode_Agama varchar(4), 
					Kode_Jurusan varchar(4));

create table Dosen(id serial, 
				Kode_Dosen varchar(4), 
				Nama_Dosen varchar(50), 
				Kode_Jurusan varchar(4),
				Kode_TypeDosen varchar(4));

create table Ujian(id serial, 
				Kode_Ujian varchar(4), 
				Nama_Ujian varchar(50), 
				Status_Ujian varchar(10));

create table Nilai(id serial, 
				Kode_Mahasiswa varchar(4), 
				Kode_ujian varchar(4), 
				Nilai Integer);

insert into agama (kode_agama, deskripsi) 
values ('A001', 'Islam'), ('A002', 'Kristen'),
('A003', 'Katolik'), ('A004', 'Hindu'), ('A005', 'Budha');

insert into type_dosen (kode_typedosen, deskripsi)
values('T001', 'Tetap'), ('T002', 'Honorer'), ('T003', 'Expertise');

insert into jurusan (kode_jurusan, nama_jurusan, status_jurusan) 
values ('J001', 'Teknik Informatika', 'Aktif'), 
('J002', 'Management Informatika', 'Aktif'),
('J003', 'Sistem Informasi', 'Non Aktif'),
('J004', 'Sistem Komputer', 'Aktif'),
('J005', 'Komputer Akutansi', 'Non Aktif');

insert into mahasiswa (kode_mahasiswa, nama_mahasiswa, alamat, kode_agama, kode_jurusan)
values ('M001', 'Budi Gunawan', 'Jl. Mawar No 3 Rt 05 Cicalengka, Bandung', 'A001', 'J001'),
('M002', 'Rinto Raharjo', 'Jl. Kebagusan No. 33 RT04 RW06 Bandung', 'A002', 'J002'),
('M003', 'Asep Saepudin', 'Jl. Sumatera No. 12 RT02 RW01, Ciamis', 'A001', 'J003'),
('M004', 'M. Hafif Isbullah', 'Jl. Jawa No 01 RT01 RW01, Jakarta Pusat', 'A001', 'J001'),
('M005', 'Cahyono', 'Jl. Niagara No. 54 RT01 RW09, Surabaya', 'A003', 'J002');

insert into dosen (kode_dosen, nama_dosen, kode_jurusan, kode_typedosen)
values ('D001', 'Prof. Dr. Retno Wahyuningsih', 'J001', 'T002'),
('D002', 'Prof. Roy M. Sutikno', 'J002', 'T001'),
('D003', 'Prof. Hendri A. Verburgh', 'J003','T002'),
('D004', 'Prof. Risma Suparwata', 'J004', 'T002'),
('D005', 'Prof. Amir Sjarifuddin Madjid, MM, MA', 'J005', 'T001');

insert into ujian (kode_ujian, nama_ujian, status_ujian) 
values ('U001', 'Algoritma', 'Aktif'),
('U002', 'Aljabar', 'Aktif'),
('U003', 'Statistika', 'Non Aktif'),
('U004', 'Etika Profesi', 'Non Aktif'),
('U005', 'Bahasa Inggris', 'Aktif');

insert into nilai (kode_mahasiswa, kode_ujian, nilai) 
values ('M004', 'U001', 90),
('M001', 'U001', 80),
('M002', 'U003', 85),
('M004', 'U002', 95),
('M005', 'U005', 70);

-- 1. query ubah type data pada column nama_dosen pada table dosen menjadi varchar(200)
alter table dosen alter column nama_dosen type varchar(200);

-- 2. query tampilkan data
select * from mahasiswa where kode_mahasiswa = 'M001';

-- 3. query data mahasiswa mengambil jurusan dengan status jurusan non aktif
select m.kode_mahasiswa as "NIM", m.nama_mahasiswa as "Nama" 
from mahasiswa as m join jurusan as j 
on m.kode_jurusan = j.kode_jurusan 
where j.status_jurusan = 'Non Aktif';

-- 4. query data mahasiswa dengan nilai diatas 80 (exclude) untuk ujian status aktif
select m.nama_mahasiswa, n.nilai, u.nama_ujian 
from mahasiswa as m 
join nilai as n on m.kode_mahasiswa = n.kode_mahasiswa 
join ujian as u on n.kode_ujian = u.kode_ujian 
where n.nilai > 80 and u.status_ujian = 'Aktif';

-- 5. query data jurusan mengandung kata "sistem"
select kode_jurusan, nama_jurusan, status_jurusan from jurusan 
where nama_jurusan like '%Sistem%';

-- 6. query menampilkan mahasiswa ambil ujian lebih dari 1
select nama_mahasiswa as "Nama Mahasiswa", count(nama_mahasiswa) as "Ujian"
from mahasiswa as m left join nilai as n on m.kode_mahasiswa = n.kode_mahasiswa 
group by nama_mahasiswa having count(nama_mahasiswa) > 1;

-- 7. query tampil data
select kode_mahasiswa, nama_mahasiswa, nama_jurusan, 
a.deskripsi as "Agama", nama_dosen, status_jurusan, t.deskripsi as "Deskripsi" 
from mahasiswa as m join agama as a on a.kode_agama = m.kode_agama 
join jurusan as j on j.kode_jurusan = m.kode_jurusan 
join dosen as d on d.kode_jurusan = m.kode_jurusan
join type_dosen as t on d.kode_typedosen = t.kode_typedosen where m.kode_mahasiswa = 'M001';

-- 8. query for view
create view check_view as
select kode_mahasiswa, nama_mahasiswa, nama_jurusan, 
a.deskripsi as "Agama", nama_dosen, status_jurusan, t.deskripsi as "Deskripsi" 
from mahasiswa as m join agama as a on a.kode_agama = m.kode_agama 
join jurusan as j on j.kode_jurusan = m.kode_jurusan 
join dosen as d on d.kode_jurusan = m.kode_jurusan
join type_dosen as t on d.kode_typedosen = t.kode_typedosen where m.kode_mahasiswa = 'M001';

select * from check_view;

-- 9. query data mahasiswa beserta nilainya
select m.nama_mahasiswa as "Nama Mahasiswa",coalesce (n.nilai, 0) as "Nilai", 
coalesce (u.nama_ujian, '-') as "Ujian"  from mahasiswa as m 
left join nilai as n on m.kode_mahasiswa = n.kode_mahasiswa
left join ujian as u  on u.kode_ujian = n.kode_ujian 
order by m.nama_mahasiswa asc ;
