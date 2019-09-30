CREATE DATABASE  telefonia;
use Telefonia;

create table persona(
percedula Varchar (20) primary key, 
pernombre Varchar (50),
perapellido Varchar (50),
pertelefonofijo Varchar (20),
perfechanacimiento Varchar (20)
);


create table linea(
linumerolinea  varchar (30) primary key ,
percedula  Varchar (20),
linestado varchar(20),
tipo_plan varchar(20),
constraint percedula foreign key (percedula) references persona (percedula)
);

create table equipo(
equserial  int primary key auto_increment,
linumerolinea  varchar (30),
equmarca Varchar (50),
equdescripcion Varchar (50),
equestado Varchar (50),
constraint linumerolinea foreign key (linumerolinea) references linea (linumerolinea)

);

create table factura(
factnumero  Int primary key auto_increment,
linumerolineas  varchar (30),
facfechaemision timestamp,
facvalor Decimal,
constraint linumerolineas foreign key (linumerolineas) references linea (linumerolinea)

);

