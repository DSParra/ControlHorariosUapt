DROP DATABASE horariosuapt;
CREATE DATABASE horariosuapt;
USE horariosuapt;

CREATE TABLE profesores(
                    rfc VARCHAR(60) NOT NULL,
                    apellido_paterno VARCHAR (60) NOT NULL,
                    apellido_materno VARCHAR (60) NOT NULL,
                    nombres VARCHAR (60) NOT NULL,
                    grado_academico VARCHAR (60) NOT NULL,
                    correo VARCHAR (60) NOT NULL,
                    telefono VARCHAR (10) NOT NULL,
                    PRIMARY KEY (rfc),
                    UNIQUE(correo)
                    );

CREATE TABLE usuarios(
                    id_usuario VARCHAR(60),
                    rfc VARCHAR(60) NOT NULL,
                    usuario VARCHAR(60) NOT NULL,
                    contrasenia VARCHAR(60) NOT NULL,
                    pregunta_seguridad VARCHAR(250) NOT NULL,
                    respuesta_seguridad VARCHAR(250) NOT NULL,
                    UNIQUE(rfc,usuario),
                    PRIMARY KEY (id_usuario),
                    FOREIGN KEY (rfc) REFERENCES profesores(rfc)
                    );

CREATE TABLE licenciatura(
                    id_licenciatura VARCHAR(30) NOT NULL,
                    nombre VARCHAR(60) NOT NULL,
                    rfc_coordinador varchar(60) NOT NULL, 
                    PRIMARY KEY (id_licenciatura),
                    FOREIGN KEY (rfc_coordinador) REFERENCES profesores(rfc),
                    UNIQUE(nombre)
                    );

CREATE TABLE plan_estudios(
                    id_plan_estudios INT(11),
                    plan_estudios VARCHAR(60) NOT NULL,
                    id_licenciatura VARCHAR(60) NOT NULL,
                    PRIMARY KEY (id_plan_estudios),
                    FOREIGN KEY (id_licenciatura) REFERENCES licenciatura(id_licenciatura),
                    UNIQUE(plan_estudios)
                    );

CREATE TABLE periodo_escolar(
                    id_periodo INT(11),
                    periodo VARCHAR(60) NOT NULL,
                    PRIMARY KEY (id_periodo),
                    UNIQUE(periodo)
                    );

CREATE TABLE grupo(
                    id_grupo INT(11), 
                    nombre_grupo VARCHAR(60) NOT NULL,
                    id_licenciatura VARCHAR(60) NOT NULL,
                    PRIMARY KEY (id_grupo),
                    FOREIGN KEY (id_licenciatura) REFERENCES licenciatura(id_licenciatura),
                    UNIQUE(nombre_grupo)
                    );

CREATE TABLE materia(
                    clave_materia VARCHAR(60) NOT NULL,
                    unidad_aprendizaje VARCHAR(60) NOT NULL,
                    horas INT(11),
                    creditos INT(11),
                    numero_periodo INT(11),
                    nucleo VARCHAR(60) NOT NULL,
                    tipo VARCHAR(60) NOT NULL,
                    id_licenciatura VARCHAR(60) NOT NULL,
                    id_plan_estudios INT(11),
                    PRIMARY KEY (clave_materia),
                    FOREIGN KEY (id_licenciatura) REFERENCES licenciatura(id_licenciatura),
                    FOREIGN KEY (id_plan_estudios) REFERENCES plan_estudios(id_plan_estudios),
                    UNIQUE(unidad_aprendizaje)
                    );

CREATE TABLE horarios(
                    id_horario VARCHAR(60) NOT NULL,
                    clave_materia VARCHAR(60) NOT NULL,
                    id_grupo INT(11),
                    id_periodo INT(11),
                    rfc VARCHAR(60) NOT NULL,
                    dia VARCHAR(60) NOT NULL,
                    hr_entrada time,
                    hr_salida time, 
                    PRIMARY KEY (id_horario),
                    FOREIGN KEY (clave_materia) REFERENCES materia(clave_materia),
                    FOREIGN KEY (id_grupo) REFERENCES grupo(id_grupo),
                    FOREIGN KEY (id_periodo) REFERENCES periodo_escolar(id_periodo),
                    FOREIGN KEY (rfc) REFERENCES profesores(rfc)
                    );