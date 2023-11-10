-- Insertar 30 alumnos
INSERT INTO usuario (nombre, apellido, email, contraseña, estado)
VALUES
('Juan', 'López', 'juan.lopez@gmail.com', 'contrasenia1', 'activo'),
('María', 'García', 'maria.garcia@gmail.com', 'contrasenia2', 'activo'),
('Carlos', 'Martínez', 'carlos.martinez@gmail.com', 'contrasenia3', 'activo'),
('Laura', 'Rodríguez', 'laura.rodriguez@gmail.com', 'contrasenia4', 'activo'),
('Pedro', 'Fernández', 'pedro.fernandez@gmail.com', 'contrasenia5', 'activo'),
('Ana', 'Pérez', 'ana.perez@gmail.com', 'contrasenia6', 'activo'),
('Luis', 'Gómez', 'luis.gomez@gmail.com', 'contrasenia7', 'activo'),
('Carmen', 'Sánchez', 'carmen.sanchez@gmail.com', 'contrasenia8', 'activo'),
('Antonio', 'Ramírez', 'antonio.ramirez@gmail.com', 'contrasenia9', 'activo'),
('Elena', 'González', 'elena.gonzalez@gmail.com', 'contrasenia10', 'activo'),
('Miguel', 'Díaz', 'miguel.diaz@gmail.com', 'contrasenia11', 'activo'),
('Sofía', 'Torres', 'sofia.torres@gmail.com', 'contrasenia12', 'activo'),
('José', 'Hernández', 'jose.hernandez@gmail.com', 'contrasenia13', 'activo'),
('Isabel', 'Luna', 'isabel.luna@gmail.com', 'contrasenia14', 'activo'),
('David', 'Molina', 'david.molina@gmail.com', 'contrasenia15', 'activo'),
('Paula', 'Ortega', 'paula.ortega@gmail.com', 'contrasenia16', 'activo'),
('Javier', 'Jiménez', 'javier.jimenez@gmail.com', 'contrasenia17', 'activo'),
('Beatriz', 'Ruiz', 'beatriz.ruiz@gmail.com', 'contrasenia18', 'activo'),
('Fernando', 'Santos', 'fernando.santos@gmail.com', 'contrasenia19', 'activo'),
('Natalia', 'Cruz', 'natalia.cruz@gmail.com', 'contrasenia20', 'activo'),
('Pablo', 'Vargas', 'pablo.vargas@gmail.com', 'contrasenia21', 'activo'),
('Rosa', 'Reyes', 'rosa.reyes@gmail.com', 'contrasenia22', 'activo'),
('Alberto', 'Navarro', 'alberto.navarro@gmail.com', 'contrasenia23', 'activo'),
('Silvia', 'Morales', 'silvia.morales@gmail.com', 'contrasenia24', 'activo'),
('Manuel', 'Castro', 'manuel.castro@gmail.com', 'contrasenia25', 'activo'),
('Cristina', 'Soto', 'cristina.soto@gmail.com', 'contrasenia26', 'activo'),
('Roberto', 'Iglesias', 'roberto.iglesias@gmail.com', 'contrasenia27', 'activo'),
('Nerea', 'Mendoza', 'nerea.mendoza@gmail.com', 'contrasenia28', 'activo'),
('Alejandro', 'Aguilar', 'alejandro.aguilar@gmail.com', 'contrasenia29', 'activo'),
('Lorena', 'Valencia', 'lorena.valencia@gmail.com', 'contrasenia30', 'activo');

-- Insertar 4 cursos
INSERT INTO cursada (anio_division)
VALUES
    ('1-5'),
    ('1-6'),
    ('2-3'),
    ('2-5');

-- Asociar los alumnos a usuarios y cursos existentes
INSERT INTO alumno (id_usuario, id_cursada)
SELECT u.id_usuario, c.id_cursada FROM usuario u, cursada c
WHERE u.contraseña IN ('contrasenia1', 'contrasenia2', 'contrasenia3', 'contrasenia4', 'contrasenia5', 'contrasenia6', 'contrasenia7', 'contrasenia8')
AND c.anio_division IN ('1-5');

INSERT INTO alumno (id_usuario, id_cursada)
SELECT u.id_usuario, c.id_cursada FROM usuario u, cursada c
WHERE u.contraseña IN ('contrasenia9', 'contrasenia10', 'contrasenia11', 'contrasenia12', 'contrasenia13', 'contrasenia14', 'contrasenia15', 'contrasenia16')
AND c.anio_division IN ('1-6');

INSERT INTO alumno (id_usuario, id_cursada)
SELECT u.id_usuario, c.id_cursada FROM usuario u, cursada c
WHERE u.contraseña IN ('contrasenia17', 'contrasenia18', 'contrasenia19', 'contrasenia20', 'contrasenia21', 'contrasenia22', 'contrasenia23', 'contrasenia24')
AND c.anio_division IN ('2-3');

INSERT INTO alumno (id_usuario, id_cursada)
SELECT u.id_usuario, c.id_cursada FROM usuario u, cursada c
WHERE u.contraseña IN ('contrasenia25', 'contrasenia26', 'contrasenia27', 'contrasenia28', 'contrasenia29', 'contrasenia30')
AND c.anio_division IN ('2-5');

-- Insertar 15 profesores
INSERT INTO usuario (nombre, apellido, email, contraseña, estado)
VALUES
('José', 'López', 'profesor1@gmail.com', 'contrasenia31', 'activo'),
('María', 'García', 'profesor2@gmail.com', 'contrasenia32', 'activo'),
('Carlos', 'Martínez', 'profesor3@gmail.com', 'contrasenia33', 'activo'),
('Laura', 'Rodríguez', 'profesor4@gmail.com', 'contrasenia34', 'activo'),
('Pedro', 'Fernández', 'profesor5@gmail.com', 'contrasenia35', 'activo'),
('Ana', 'Pérez', 'profesor6@gmail.com', 'contrasenia36', 'activo'),
('Luis', 'Gómez', 'profesor7@gmail.com', 'contrasenia37', 'activo'),
('Carmen', 'Sánchez', 'profesor8@gmail.com', 'contrasenia38', 'activo'),
('Antonio', 'Ramírez', 'profesor9@gmail.com', 'contrasenia39', 'activo'),
('Elena', 'González', 'profesor10@gmail.com', 'contrasenia40', 'activo'),
('Miguel', 'Díaz', 'profesor11@gmail.com', 'contrasenia41', 'activo'),
('Sofía', 'Torres', 'profesor12@gmail.com', 'contrasenia42', 'activo'),
('José', 'Hernández', 'profesor13@gmail.com', 'contrasenia43', 'activo'),
('Isabel', 'Luna', 'profesor14@gmail.com', 'contrasenia44', 'activo'),
('David', 'Molina', 'profesor15@gmail.com', 'contrasenia45', 'activo');

-- Asociar los profesores a usuarios existentes
INSERT INTO profesor (id_usuario)
SELECT id_usuario FROM usuario
WHERE contraseña IN ('contrasenia31', 'contrasenia32', 'contrasenia33', 'contrasenia34', 'contrasenia35', 'contrasenia36', 'contrasenia37', 'contrasenia38', 'contrasenia39', 'contrasenia40', 'contrasenia41', 'contrasenia42', 'contrasenia43', 'contrasenia44', 'contrasenia45');

-- Insertar 2 administradores
INSERT INTO usuario (nombre, apellido, email, contraseña, estado)
VALUES
    ('Administrador1', 'Apellido1', 'administrador1@gmail.com', 'contrasenia46', 'activo'),
    ('Administrador2', 'Apellido2', 'administrador2@gmail.com', 'contrasenia47', 'activo');

-- Asociar los administradores a usuarios existentes (por ejemplo, usuarios 1 y 2)
INSERT INTO administrador (id_usuario)
SELECT id_usuario FROM usuario
WHERE contraseña IN ('contrasenia46', 'contrasenia47');

-- Insertar 10 materias
INSERT INTO materia (nombre)
VALUES
    ('Matemáticas'),
    ('Historia'),
    ('Ciencias Naturales'),
    ('Geografía'),
    ('Lengua y Literatura'),
    ('Inglés'),
    ('Educación Física'),
    ('Educación Artística'),
    ('Tecnología'),
    ('Formación Ética y Ciudadana');

-- Insertar relaciones entre cursos y profesores
INSERT INTO `secundariabd`.`profesor/cursada` (`id_cursada`, `id_profesor`)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (2, 5),
    (2, 6),
    (2, 7),
    (3, 8),
    (3, 9),
    (3, 10),
    (3, 11),
    (4, 12),
    (4, 13),
    (4, 14),
    (4, 15);

-- Insertar relaciones entre cursos y materias
INSERT INTO `secundariabd`.`cursada/materia` (`id_cursada`, `id_materia`)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (1, 5),
    (1, 6),
    (1, 7),
    (1, 8),
    (1, 9),
    (1, 10);

-- Insertar nuevas calificaciones para todos los alumnos en diferentes materias
INSERT INTO calificacion (nota, num_examen, id_alumno, id_materia)
VALUES
    (9, 1, 1, 1),  -- Matemáticas
    (7, 2, 1, 2),  -- Historia
    (8, 1, 1, 3),  -- Ciencias Naturales
    (6, 3, 1, 4),  -- Geografía
    (8, 2, 2, 1),  -- Matemáticas
    (6, 3, 2, 2),  -- Historia
    (7, 1, 2, 3),  -- Ciencias Naturales
    (9, 2, 2, 4),  -- Geografía
    (7, 3, 3, 1),  -- Matemáticas
    (9, 1, 3, 2),  -- Historia
    (8, 2, 3, 3),  -- Ciencias Naturales
    (7, 3, 3, 4),  -- Geografía
    (8, 1, 4, 1),  -- Matemáticas
    (9, 2, 4, 2),  -- Historia
    (6, 1, 4, 3),  -- Ciencias Naturales
    (7, 2, 4, 4),  -- Geografía
    (7, 2, 5, 1),  -- Matemáticas
    (9, 3, 5, 2),  -- Historia
    (8, 1, 5, 3),  -- Ciencias Naturales
    (6, 2, 5, 4);  -- Geografía