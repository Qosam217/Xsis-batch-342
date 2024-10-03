create table biodata(id bigint primary key,
first_name varchar(20), last_name varchar(30),
dob varchar(10), pob varchar(50), 
address varchar(255), marital_status boolean);

create table employee (id bigint primary key,
biodata_id bigint, nip varchar(5),
status varchar(10), salary numeric(10), 
foreign key(biodata_id) references biodata(id));

create table family(id bigint primary key, 
biodata_id bigint, name varchar(100),
status varchar(50), foreign key(biodata_id) references biodata(id));

create table contact_person(id bigint primary key,
biodata_id bigint, type varchar(5), contact varchar(100), 
foreign key(biodata_id) references biodata(id));

create table position(id bigint primary key, name varchar(100));

create table employee_position(id bigint primary key, employee_id bigint,
position_id bigint, foreign key(employee_id) references employee(id),
foreign key (position_id) references position(id));

create table departement(id bigint primary key, name varchar(100));

create table leave(id bigint primary key, type varchar(10),
name varchar(100));

create table employee_leave(id integer primary key,
employee_id integer, period varchar(4),
regular_quota integer, foreign key(employee_id) references employee(id));

create table leave_request(id bigint primary key,
employee_id bigint, leave_id bigint, start_date date,
end_date date, reason varchar(255), 
foreign key(employee_id) references employee(id), 
foreign key(leave_id) references leave(id));

create table travel_type(id bigint primary key, 
name varchar(50), travel_fee integer)

create table travel_request(id bigint primary key,
employee_id bigint, travel_type_id bigint, 
start_date date, end_date date,
foreign key (employee_id) references employee(id),
foreign key (travel_type_id) references travel_type(id));

create table travel_settlement(id bigint primary key,
travel_request_id bigint, item_name varchar(100),
item_cost integer,
foreign key (travel_request_id) references travel_request(id));



insert into biodata(id, first_name, last_name, dob,pob, address,marital_status)
values(1, 'Raya', 'Indriyani', '1991-01-01', 'Bali', 'Jl. Raya Baru, Bali', false),
(2, 'Rere', 'Wulandari', '1992-01-02','Bandung', 'Jl. Berkah Ramadhan, Bandung', false),
(3, 'Bunga', 'Maria', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true),
(4, 'Natasha', 'Wulan', '1990-04-10', 'Jakarta', 'Jl. Mawar Harum, Jakarta', false),
(5, 'Zahra', 'Aurelia Putri', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true),
(6, 'Katniss', 'Everdeen', '1989-01-12', 'Jakarta', 'Jl. Bunga Melari, Jakarta', true);

insert into employee(id, biodata_id, nip, status, salary)
values(1,1,'NX001', 'Permanen', 12000000),
(2,2,'NX002', 'Kontrak', 15000000),
(3,4,'NX003', 'Permanen', 13500000),
(4,5,'NX004', 'Permanen', 12000000),
(5,6,'NX005', 'Permanen', 17000000),
(6,3,'NX006', 'Permanan', 14000000);

insert into contact_person (id, biodata_id, type, contact)
values (1,1,'MAIL', 'raya.indriyani@gmail.com'),
(2,1,'PHONE', '085612345678'),
(3,2,'MAIL', 'rere.wulandari@gmail.com'),
(4,2,'PHONE', '081312345678'),
(5,2,'PHONE', '087812345678'),
(6,3,'MAIL', 'bunga.maria@gmail.com'),
(7,4,'MAIL', 'natasha.wulan@gmail.com'),
(8,5,'MAIL', 'zahra.putri@gmail.com'),
(9,6,'MAIL', 'katniss.everdeen@gmail.com');

insert into family (id, biodata_id, "name", status)
values (1,3,'Azka Fadlan Zikrullah', 'Suami'),
(2,3,'Primrose Everdeen', 'Anak'),
(3,5,'Jaka Samudera Buana', 'Suami'),
(4,5,'Friska Davira', 'Anak'),
(5,5,'Harum Indah Az Zahra', 'Anak'),
(6,6,'Adya Pratama Yuda', 'Suami');

insert into departement (id, "name")
values(1, 'Recruitment'),
(2, 'Sales'),
(3, 'Human Resource'),
(4, 'General Affair');

insert into "position" (id, "name")
values (1, 'Direktur'),
(2, 'General Manager'),
(3, 'Manager'),
(4, 'Staff');

insert into employee_position (id, employee_id, position_id)
values (1,5,1),(2,4,2),
(3,3,3), (4,2,4), (5,1,4);

insert into employee_leave (id, employee_id, "period", regular_quota)
values (1,1,'2020', 16),
(2,2,'2020', 12),
(3,1,'2021',16),
(4,2,'2021', 12),
(5,4,'2021', 12),
(6,5,'2021', 12),
(7,6,'2021', 12);

insert into leave (id, "type", "name")
values (1, 'Regular', 'Cuti Tahunan'),
(2, 'Khusus', 'Cuti Menikah'),
(3, 'Khusus', 'Cuti Haji & Umroh'),
(4, 'Khusus', 'Melahirkan');

insert into leave_request (id, employee_id, leave_id, start_date,end_date,reason)
values(1,1,1,'2020-10-10','2020-10-12', 'Liburan'),
(2,1,1,'2020-11-12', '2020-11-15', 'Acara keluarga'),
(3,2,2,'2020-05-05', '2020-05-07', 'Menikah'),
(4,2,1,'2020-09-09', '2020-09-13', 'Touring'),
(5,2,1,'2020-12-24', '2020-12-25', 'Acara keluarga');

insert into travel_type (id, "name",travel_fee)
values (1,'In Indonesia', 200000),
(2, 'Out Indonesia', 350000);

insert into travel_request (id, employee_id,travel_type_id,start_date,end_date)
values(1,1,1,'2020-07-07', '2020-07-08'),
(2,1,1,'2020-08-07','2020-08-08'),
(3,2,2,'2020-04-04', '2020-04-07');

insert into travel_settlement (id, travel_request_id,item_name,item_cost)
values (1,1,'Tiket travel Do-Car berangkat', 165000),
(2,1,'Hotel', 750000),
(3,1,'Tiket travel Do-Car pulang', 165000),
(4,2,'Tiket pesawat berangkat', 750000),
(5,2,'Hotel', 650000),
(6,2,'Tiket pesawat pulang', 1250000),
(7,3, 'Tiket pesawat berangkat', 4750000),
(8,3, 'Hotel', 6000000),
(9,2, 'Tiket pesawat pulang', 4250000);

-- 1. Urutkan nama-nama karyawan dan statusnya, diurutkan dari yang paling tua ke yang paling muda
select b.first_name as "Nama Depan", b.last_name as "Nama Belakang", 
b.dob as "Tanggal Lahir", b.marital_status as "Menikah" 
from biodata b order by dob asc;  

-- 2. Tampilkan last name dengan huruf capital dimana last name nya diawali dengan huruf ?M?
select upper(b.last_name) as "Nama Belakang", b.first_name "Nama Depan" 
from biodata b where b.last_name like'%M%';

-- 3. Buatlah kolom NIP pada table Employee sebagai index
create index "index" on employee("nip");

-- 4. Buatlah kolom employee_id pada table employee_leave sebagai kolom unique

-- 5. Tampilkan fullname, salary_lama, dan salary_baru. dimana salary baru itu sebesar 10% dari salary lama dan ditampilkan dengan kolom alias GajiBaru
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
e.salary as "Gaji Lama", e.salary*1.1  as "Gaji Baru"
from biodata b join employee e on e.biodata_id = b.id; 

-- 6. Tampilkan nama karyawan, jenis perjalanan dinas, dan total pengeluarannya selama perjalanan dinas tersebut
select tr.id as "Travel", concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
tt."name" as "Jenis Perjalanan", sum(ts.item_cost) + tt.travel_fee as "Total Pengeluaran"  
from biodata b join employee e on b.id = e.biodata_id 
join travel_request tr on tr.employee_id = e.id 
join travel_type tt on tr.travel_type_id = tt.id 
join travel_settlement ts on tr.id  = ts.travel_request_id 
group by ts.travel_request_id, b.first_name , b.last_name, tt."name", tr.id, tt.travel_fee 
order by sum(ts.item_cost) asc;

-- 7. Buatkan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap"
from biodata b join employee e on b.id = e.biodata_id 
left join travel_request tr on e.id = tr.employee_id 
where tr.employee_id is null ;

-- 8. Tampilkan nama lengkap karyawan, jenis cuti, alasan cuti, durasi cuti, dan nomor telepon yang bisa dihubungi untuk masing-masing karyawan yang mengajukan cuti
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap", 
l."type" as "Jenis Cuti", lr.reason as "Alasan", 
(lr.end_date-lr.start_date) as "Durasi Cuti (hari)", 
cp.contact as "Nomor Telepon"
from biodata b join employee e on b.id = e.biodata_id 
join employee_leave el on e.id = el.employee_id
join leave_request lr on lr.employee_id = e.id 
join leave l on l.id = lr.leave_id 
join contact_person cp on e.id = cp.biodata_id
where cp."type" = 'PHONE';

-- 9. Tampilkan alasan cuti yang sering diajukan karyawan
select lr.reason, count(lr.reason) from leave_request lr 
group by lr.reason order by count(lr.reason) desc limit 1; 

-- 10. Tampilkan last name, bonus, dan salary + bonus untuk karyawan yang namanya mengandung minimal salah satu huruf vokal (a,i,u,e,o) dimana bonus itu sebesar 20% dari salary
select b.last_name as "Nama Akhir", 0.2 * e.salary as "Bonus",
0.2 * e.salary + e.salary as "Gaji + Bonus" from biodata b
join employee e on b.id = e.biodata_id 
where lower(b.last_name) like '%a%' or 
lower(b.last_name) like '%i%' or 
lower(b.last_name) like '%u%' or
lower(b.last_name) like '%e%' or
lower(b.last_name) like '%o%';

-- -----------------------------------------------------------------------------------------------------------
-- 11. Tampilkan data lengkap karyawan dan rata-rata gaji setahun untuk masing-masing dari mereka
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
b.dob as "Tanggal Lahir", p."name" as "Jabatan", 
avg(e.salary) * 12 as "Rata-rata gaji/tahun"
from biodata b join employee e on e.biodata_id = b.id 
join employee_position ep on ep.employee_id = e.id 
join "position" p on ep.position_id = p.id group by b.first_name, b.last_name , b.dob, b.pob, p."name" ;

-- Nomor 12.
-- Tambahkan 3 orang pelamar, dimana 2 di antaranya diterima sebagai karyawan kontrak 
-- dan 1 nya lagi tidak diterima sebagai karyawan. 
-- Lalu tampilkan semua biodata berupa fullname, nip, status karyawan dan salary
insert into biodata (id, first_name, last_name, dob, pob, address, marital_status)
values(7, 'Lara', 'Setiawan', '1991-01-12', 'Jakarta','Jl. Merdeka Bangkit, Jakarta', true),
(8, 'Aditya', 'Pratama', '1985-05-25','Bandung', 'Jl. Melati, Bandung', false),
(9, 'Maya', 'Putri', '1993-08-30', 'Surabaya','Jl.Soekarno Hatta', true);

insert into employee (id, biodata_id, nip, status, salary) values
(7, 7, 'NX007', 'Permanen', 14000000),
(8, 9, 'NX009', 'Kontrak',  13500000);

select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap", 
e.nip as "Nomor Karyawan", e.status as "Status Karyawan", 
e.salary as "Gaji"
from biodata b join employee e on e.biodata_id = b.id 
order by b.first_name asc; 

-- 13. Tampilkan fullname pelamar yang tanggal lahirnya antara 01-01-1991 s/d 31-12-1991
select concat(b.first_name, ' ', b.last_name) as "Nama Pelamar", b.dob as "Tanggal lahir" 
from biodata b where b.dob between '1991-01-01' and '1991-12-31';

-- 14. Tampilkan nama-nama pelamar yang tidak diterima sebagai karyawan
select  concat(b.first_name, ' ', b.last_name) as "Pelamar Tidak Diterima"
from biodata b left join employee e on e.biodata_id = b.id where e.id is null ; 

-- 15. Tampilkan sisa cuti tahun 2020 yang dimiliki oleh karyawan
select distinct jc.nama as "Nama Karyawan",  
el2.regular_quota - jc.sum as "Sisa Cuti Tahun 2020"
from (select distinct concat(b.first_name, ' ', b.last_name) as "nama", 
	e.id as "employee_id",sum(lr.end_date - lr.start_date) as "sum" 
	from leave_request lr join employee e  on lr.employee_id = e.id 
	join biodata b on b.id = e.biodata_id 
	join employee_leave el on el.employee_id = e.id
	where el."period" = '2020'
	group by b.first_name,b.last_name, e.id) as jc
join employee_leave el2 on el2.employee_id = jc.employee_id;

-- 16. Tampilkan selisih antara total item cost dengan total travel fee untuk masing-masing karyawan
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
sum(ts.item_cost) - sum(tt.travel_fee) as "Selisih total 	item cost dengan total travel fee"
from biodata b join employee e on e.biodata_id = b.id 
join travel_request tr on tr.employee_id  = e.id 
join travel_settlement ts on ts.travel_request_id = tr.id 
join travel_type tt  on tr.travel_type_id = tt.id
group by b.first_name, b.last_name ;

-- NOMOR 17. 
-- Tambahkan data cuti tahun 2021 terhadap semua karyawan(termasuk karyawan baru yang sudah ditambahkan pada soal sebelumnya). 
-- Lalu hitung jumlah cuti yang sudah diambil pada tahun 2020 dari masing-masing karyawan.
-- Constraint : Data cuti karyawan baru tidak perlu ditampilkan
insert into employee_leave (id, employee_id, "period", regular_quota) values
(8, 7, 2021, 16),
(9, 8, 2021, 12);

select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
sum(lr.end_date - lr.start_date) as "Cuti diambil thn 2020"
from biodata b join employee e  on b.id = e.biodata_id 
join leave_request lr on lr.employee_id  = e.id
group by b.first_name, b.last_name;

-- NOMOR 18
-- Tampilkan fullname, jabatan, usia, dan jumlah anak dari masing-masing karyawan saat ini 
-- (kalau tidak ada anak tulis 0 (nol) atau '-' saja)
select concat(b.first_name, ' ', b.last_name) as "Nama Lengkap",
coalesce (p."name",'-' )as "Jabatan", '2024' - extract(year from date(b.dob)) as "Usia",
case when f.status = 'Anak' then count(f.status) else '0' end as "Jumlah Anak"
from biodata b join employee e on e.biodata_id = b.id 
full join employee_position ep on ep.employee_id = e.id 
full join "position" p on p.id = ep.position_id
full join "family" f on b.id = f.biodata_id
group by b.first_name, b.last_name, p."name", b.dob, f.status ;

-- 19. Hitung ada berapa karyawan yang sudah menikah dan yang tidak menikah 
-- (tabel: menikah x orang, tidak menikah x orang)
select count(case when b.marital_status = true then 1 end) as "Sudah Menikah",
count(case when b.marital_status = false then 1 end) as "Tidak Menikah"
from biodata b join employee e on e.biodata_id  = b.id ; -- ada pelamar tidak diterima jadi karyawan dalam biodata

-- 20. Jika digabungkan antara cuti dan perjalanan dinas, 
-- berapa hari Raya tidak berada di kantor pada tahun 2020?
select distinct concat(b.first_name, ' ', b.last_name) as "Nama Lengkap" , 
sum((lr.end_date - lr.start_date) + (tr.end_date - tr.start_date)) as "Jumlah Absen"
from biodata b join employee e on b.id = e.biodata_id 
join leave_request lr on lr.employee_id = e.id 
join travel_request tr on tr.employee_id = e.id 
group by b.first_name, b.last_name, tr.id 
having b.first_name = 'Raya';
