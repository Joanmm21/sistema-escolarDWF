-- Profesores
INSERT INTO profesor(nombre) VALUES ('Jonathan Erazo');
INSERT INTO profesor(nombre) VALUES ('Karla Claros');
INSERT INTO profesor(nombre) VALUES ('Alejandra Jovel');
INSERT INTO profesor(nombre) VALUES ('Maria Climaco');
INSERT INTO profesor(nombre) VALUES ('Fatima Cordova');

-- Materias
INSERT INTO materia(nombre, id_profesor) VALUES ('Ingles', 1);
INSERT INTO materia(nombre, id_profesor) VALUES ('Algebra', 2);
INSERT INTO materia(nombre, id_profesor) VALUES ('Redes de comunicacion', 3);
INSERT INTO materia(nombre, id_profesor) VALUES ('Aplicaciones con Web Frameworks', 4);
INSERT INTO materia(nombre, id_profesor) VALUES ('Frances', 5);

-- Alumnos
INSERT INTO alumno(nombre, apellido) VALUES ('Joan', 'Martinez');
INSERT INTO alumno(nombre, apellido) VALUES ('Stephanie', 'Hernandez');
INSERT INTO alumno(nombre, apellido) VALUES ('Luis', 'Nolasco');
INSERT INTO alumno(nombre, apellido) VALUES ('Marco', 'Galvez');
INSERT INTO alumno(nombre, apellido) VALUES ('Fernando', 'Duran');

-- Inscripciones (alumno_materia)
INSERT INTO alumno_materia VALUES (1,1);
INSERT INTO alumno_materia VALUES (1,2);
INSERT INTO alumno_materia VALUES (2,3);
INSERT INTO alumno_materia VALUES (3,4);
INSERT INTO alumno_materia VALUES (4,5);