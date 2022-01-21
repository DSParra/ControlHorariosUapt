-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-07-2021 a las 04:11:59
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `horariosuapt`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `id_horario` int(11) NOT NULL,
  `clave_materia` varchar(60) NOT NULL,
  `id_grupo` varchar(11) NOT NULL,
  `id_periodo` varchar(11) NOT NULL,
  `rfc` varchar(60) NOT NULL,
  `dia` varchar(60) NOT NULL,
  `hr_entrada` time DEFAULT NULL,
  `hr_salida` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `horarios`
--

INSERT INTO `horarios` (`id_horario`, `clave_materia`, `id_grupo`, `id_periodo`, `rfc`, `dia`, `hr_entrada`, `hr_salida`) VALUES
(1, '4        ', 'yryr6', 'URU74', 'GARL871229', '1', '09:00:00', '11:00:00'),
(2, '2        ', 'yryr6', '202', 'PAAS761104', '2', '09:00:00', '11:00:00'),
(3, '1        ', 'yryr6', '202', 'GARL871229', '1', '09:00:00', '11:00:00'),
(4, '1        ', 'S2', '202', 'GARL871229', '1', '07:00:00', '09:00:00'),
(5, '2        ', 'yryr6', 'URU74', 'PAAS761104', '1', '07:00:00', '09:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`id_horario`),
  ADD KEY `clave_materia` (`clave_materia`),
  ADD KEY `id_grupo` (`id_grupo`),
  ADD KEY `id_periodo` (`id_periodo`),
  ADD KEY `rfc` (`rfc`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `horarios`
--
ALTER TABLE `horarios`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD CONSTRAINT `horarios_ibfk_1` FOREIGN KEY (`clave_materia`) REFERENCES `materia` (`clave_materia`),
  ADD CONSTRAINT `horarios_ibfk_2` FOREIGN KEY (`id_grupo`) REFERENCES `grupo` (`id_grupo`),
  ADD CONSTRAINT `horarios_ibfk_3` FOREIGN KEY (`id_periodo`) REFERENCES `periodo_escolar` (`id_periodo`),
  ADD CONSTRAINT `horarios_ibfk_4` FOREIGN KEY (`rfc`) REFERENCES `profesores` (`rfc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
