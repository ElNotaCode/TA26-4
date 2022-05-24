DROP DATABASE IF EXISTS investigadores;
CREATE SCHEMA investigadores;
USE investigadores;

CREATE TABLE facultad(id_facultad INT AUTO_INCREMENT PRIMARY KEY,
nombre NVARCHAR(100)
);

CREATE TABLE investigadores(id_investigadores INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(8),
nombre_apellidos NVARCHAR(255),
id_facultad INT,
KEY (id_facultad),
FOREIGN KEY (id_facultad) REFERENCES facultad(id_facultad)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE equipos(id_equipos INT AUTO_INCREMENT PRIMARY KEY,
numero_serie CHAR(4),
nombre NVARCHAR(100),
id_facultad INT,
KEY (id_facultad),
FOREIGN KEY (id_facultad) REFERENCES facultad(id_facultad)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE reserva(id_reserva INT AUTO_INCREMENT PRIMARY KEY,
comienzo VARCHARACTER(50),
fin VARCHARACTER(50),
id_equipos INT,
KEY (id_equipos),
FOREIGN KEY (id_equipos) REFERENCES equipos(id_equipos)
ON UPDATE CASCADE ON DELETE CASCADE,
id_investigadores INT,
KEY (id_investigadores),
FOREIGN KEY (id_investigadores) REFERENCES investigadores(id_investigadores)
ON UPDATE CASCADE ON DELETE CASCADE
);