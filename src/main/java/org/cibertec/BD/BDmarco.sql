Create database BDmarco;

Use BDmarco;

Create table Tipo_Usuario(
	tipo_id int auto_increment primary key,
    tipo_nom varchar(50)
);

Create table USUARIO(
		Usuario_id int auto_increment primary key,
        Usu_Usuario varchar(50) not null,
        Usu_Password varchar(255) not null,
        Usu_TipoUsuario int not null,
        foreign key (Usu_TipoUsuario) references Tipo_Usuario (tipo_id)
);

create table Tipo_Producto(
	TipoProduto_id int primary key AUTO_INCREMENT,
    descrip varchar(50) not null
);

create table Producto(
	producto_id int primary key AUTO_INCREMENT,
    descrip varchar(50) not null,
    precio float not null,
    stockactual int not null,
	TipoProduto_id int not null,
    imagen varchar(255) not null,
	foreign key (TipoProduto_id) references Tipo_Producto(TipoProduto_id)
);

create table Ventas(
	venta_id int primary key AUTO_INCREMENT,
    producto_id int not null,
    Usuario_id int null,
    venta_cantidad int not null,
    venta_total double not null,
	foreign key (producto_id) references Producto(producto_id),
    foreign key (Usuario_id) references USUARIO(Usuario_id)
);

insert into Tipo_Usuario values(null,'ADMIN'), (null,'USER');

insert into USUARIO values(null,'administrador','$2a$10$8wW8PA2xEeX/udePmM0uVuYpPARfyYEx9cw55nPuh4gC11neNy9rq',1);
insert into USUARIO values(null,'comprador','$2a$10$fFnpdSCTgxuVZDd74N4RveBBt72nng8b4ZqkyF3RdgRzpY.MFtCy.',2);

insert into Tipo_Producto values(null,'Teclado'), (null,'Tarjeta de video'), (null,'Procesador');

insert into producto values(null,'TECLADO ENCORE EXPLORER',84.32,50,1,'no hay imagen');

update Tipo_Usuario set tipo_nom = "USER" where tipo_id = 2;