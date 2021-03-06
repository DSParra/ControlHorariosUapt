-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-02-2021 a las 03:23:06
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `horariosescuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `clave_carrera` varchar(250) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `cordinador_rfc` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `id_grupo` int(11) NOT NULL,
  `nombre_grupo` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `clave_materia` varchar(250) NOT NULL,
  `unidad_aprendizaje` varchar(250) NOT NULL,
  `horas_practicas` int(11) NOT NULL,
  `horas_teoricas` int(11) NOT NULL,
  `creditos` int(11) NOT NULL,
  `numero de periodo` int(11) NOT NULL,
  `nucleo` varchar(250) NOT NULL,
  `tipo` varchar(250) NOT NULL,
  `clave_carrera` varchar(250) NOT NULL,
  `id_plan_estudios` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo_escolar`
--

CREATE TABLE `periodo_escolar` (
  `id_periodo` int(11) NOT NULL,
  `periodo` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo_horarios`
--

CREATE TABLE `periodo_horarios` (
  `clave_materia` varchar(250) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_periodo` int(11) NOT NULL,
  `rfc` varchar(250) NOT NULL,
  `dia` int(11) NOT NULL,
  `entrada` time NOT NULL,
  `salida` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plan_estudios`
--

CREATE TABLE `plan_estudios` (
  `id_plan` int(11) NOT NULL,
  `plan_estudios` varchar(250) NOT NULL,
  `clave_carrera` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesores` (
  `rfc` varchar(250) NOT NULL,
  `apellido_paterno` varchar(250) NOT NULL,
  `apellido_materno` varchar(250) NOT NULL,
  `nombres` varchar(250) NOT NULL,
  `grado_academico` varchar(250) NOT NULL,
  `correo` varchar(250) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(250) NOT NULL,
  `contra` varchar(250) NOT NULL,
  `correo` varchar(250) NOT NULL,
  `pregunta_seg` varchar(250) NOT NULL,
  `respuesta_seg` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`clave_carrera`),
  ADD KEY `cordinador_prof` (`cordinador_rfc`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`id_grupo`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`clave_materia`),
  ADD KEY `clave_carrera` (`clave_carrera`),
  ADD KEY `id_plan_estudios` (`id_plan_estudios`);

--
-- Indices de la tabla `periodo_escolar`
--
ALTER TABLE `periodo_escolar`
  ADD PRIMARY KEY (`id_periodo`);

--
-- Indices de la tabla `periodo_horarios`
--
ALTER TABLE `periodo_horarios`
  ADD KEY `clave_materia` (`clave_materia`),
  ADD KEY `id_grupo` (`id_grupo`),
  ADD KEY `rfc` (`rfc`),
  ADD KEY `id_periodo` (`id_periodo`);

--
-- Indices de la tabla `plan_estudios`
--
ALTER TABLE `plan_estudios`
  ADD PRIMARY KEY (`id_plan`),
  ADD KEY `id_carrera` (`clave_carrera`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`rfc`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `periodo_escolar`
--
ALTER TABLE `periodo_escolar`
  MODIFY `id_periodo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `plan_estudios`
--
ALTER TABLE `plan_estudios`
  MODIFY `id_plan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD CONSTRAINT `carrera_ibfk_1` FOREIGN KEY (`cordinador_rfc`) REFERENCES `profesor` (`rfc`);

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `materia_ibfk_1` FOREIGN KEY (`clave_carrera`) REFERENCES `carrera` (`clave_carrera`),
  ADD CONSTRAINT `materia_ibfk_2` FOREIGN KEY (`id_plan_estudios`) REFERENCES `plan_estudios` (`id_plan`);

--
-- Filtros para la tabla `periodo_horarios`
--
ALTER TABLE `periodo_horarios`
  ADD CONSTRAINT `periodo_horarios_ibfk_1` FOREIGN KEY (`id_grupo`) REFERENCES `grupo` (`id_grupo`),
  ADD CONSTRAINT `periodo_horarios_ibfk_2` FOREIGN KEY (`rfc`) REFERENCES `profesor` (`rfc`),
  ADD CONSTRAINT `periodo_horarios_ibfk_3` FOREIGN KEY (`clave_materia`) REFERENCES `materia` (`clave_materia`),
  ADD CONSTRAINT `periodo_horarios_ibfk_4` FOREIGN KEY (`id_periodo`) REFERENCES `periodo_escolar` (`id_periodo`);

--
-- Filtros para la tabla `plan_estudios`
--
ALTER TABLE `plan_estudios`
  ADD CONSTRAINT `plan_estudios_ibfk_1` FOREIGN KEY (`clave_carrera`) REFERENCES `carrera` (`clave_carrera`);

--
-- Filtros para la tabla `profesor`
--
ALTER TABLE `profesores`
  ADD CONSTRAINT `profesor_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
