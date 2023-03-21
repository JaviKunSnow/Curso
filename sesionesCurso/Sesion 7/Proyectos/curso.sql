-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-03-2022 a las 00:22:23
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `curso`
--
CREATE DATABASE IF NOT EXISTS `curso` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `curso`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `apellidos` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id`, `nombre`, `apellidos`, `telefono`) VALUES
(1, 'Pepe', 'Rubio Crespo', '678453412'),
(2, 'Pepe', 'Rubio Crespo', '678453412'),
(3, 'Pepe', 'Rubio Crespo', '678453412'),
(4, 'Pepe', 'Rubio Crespo', '678453412');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `PAIS` varchar(30) COLLATE latin1_spanish_ci NOT NULL,
  `FECHA_NACIMIENTO` date NOT NULL,
  `SEXO` varchar(1) COLLATE latin1_spanish_ci NOT NULL,
  `CURSO` varchar(20) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`ID`, `NOMBRE`, `PAIS`, `FECHA_NACIMIENTO`, `SEXO`, `CURSO`) VALUES
(0, 'fasdf', 'sadfas', '2019-10-14', 'H', 'asdf'),
(1, 'Pepito Gonzalez', 'Rumania', '0000-00-00', 'H', 'Bases de datos'),
(2, 'Laura Sanz', 'Mexico', '0000-00-00', 'M', 'Contabilidad'),
(12, 'fasdf', 'sadfas', '2019-10-14', 'H', 'asdf'),
(123, 'Miriam Ruiz', 'Cuba', '0000-00-00', 'M', 'Contabilidad'),
(129, 'Cristian Lopez', 'España', '0000-00-00', 'H', 'Economia'),
(213, 'Luis Perez', 'Argentina', '0000-00-00', 'H', 'Cocina'),
(6235, 'Simone Simons', 'Holanda', '0000-00-00', 'M', 'Ballet'),
(10012, 'Mustafa Kemal', 'Turquia', '0000-00-00', 'H', 'Ballet'),
(12321, 'Susana Perez', 'España', '0000-00-00', 'M', 'Java'),
(12322, 'Fernando Torres', 'España', '0000-00-00', 'H', 'Java');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `idArticulo` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `telefono`) VALUES
(1, 'NombreCliente1', '1063780581'),
(2, 'NombreCliente2', '993730224'),
(3, 'NombreCliente3', '1002919202'),
(4, 'NombreCliente4', '595007928'),
(5, 'NombreCliente5', '731557108'),
(6, 'NombreCliente6', '784266740'),
(7, 'NombreCliente7', '582567029'),
(8, 'NombreCliente8', '1040269988'),
(9, 'NombreCliente9', '691110820'),
(10, 'NombreCliente10', '968186523'),
(11, 'j', '6'),
(14, 'j', '6'),
(15, 'j', '6'),
(16, 'j', '6'),
(17, 'j', '6'),
(18, 'j', '6'),
(19, 'j', '6'),
(20, 'j', '6'),
(21, 'Javier', '4'),
(22, 'j', '6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `apellidos` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nombre`, `apellidos`, `telefono`) VALUES
(1, 'c1', 'am', '1'),
(2, 'c2', 'am', '2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplo1`
--

CREATE TABLE `ejemplo1` (
  `id` int(11) NOT NULL,
  `valor1` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `valor2` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `ejemplo1`
--

INSERT INTO `ejemplo1` (`id`, `valor1`, `valor2`) VALUES
(1, 'Valor1-1', 'Valor2-1'),
(2, 'Valor1-2', 'Valor2-2'),
(3, 'Valor1-3', 'Valor2-3'),
(4, 'Valor1-4', 'Valor2-4'),
(5, 'Valor1-5', 'Valor2-5'),
(6, 'Valor1-6', 'Valor2-6'),
(7, 'Valor1-7', 'Valor2-7'),
(8, 'Valor1-8', 'Valor2-8'),
(9, 'Valor1-9', 'Valor2-9'),
(10, 'Valor1-10', 'Valor2-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplo2`
--

CREATE TABLE `ejemplo2` (
  `id` int(11) NOT NULL,
  `valor1` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `valor2` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `ejemplo2`
--

INSERT INTO `ejemplo2` (`id`, `valor1`, `valor2`) VALUES
(1, 'Valor1-1', 'Valor2-1'),
(2, 'Valor1-2', 'Valor2-2'),
(3, 'Valor1-3', 'Valor2-3'),
(4, 'Valor1-4', 'Valor2-4'),
(5, 'Valor1-5', 'Valor2-5'),
(6, 'Valor1-6', 'Valor2-6'),
(7, 'Valor1-7', 'Valor2-7'),
(8, 'Valor1-8', 'Valor2-8'),
(9, 'Valor1-9', 'Valor2-9'),
(10, 'Valor1-10', 'Valor2-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `granjeros`
--

CREATE TABLE `granjeros` (
  `id` int(11) DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `edad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `granjeros`
--

INSERT INTO `granjeros` (`id`, `nombre`, `edad`) VALUES
(1, 'PepeGranjeros', 21),
(2, 'JoséGranjeros', 45),
(1, 'PepeGranjeros', 21),
(2, 'JoséGranjeros', 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla1`
--

CREATE TABLE `tabla1` (
  `clave_tabla_1` int(11) NOT NULL,
  `campo1_tabla_1` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `campo2_tabla1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `tabla1`
--

INSERT INTO `tabla1` (`clave_tabla_1`, `campo1_tabla_1`, `campo2_tabla1`) VALUES
(1, 'valor1', 0),
(2, 'valor2', 0),
(3, 'valor3', 0),
(4, 'valor4', 0),
(5, 'valor5', 0),
(6, 'valor6', 0),
(7, 'valor7', 0),
(8, 'valor8', 0),
(9, 'valor9', 0),
(10, 'valor1', 0),
(11, 'valor2', 0),
(12, 'valor3', 0),
(13, 'valor4', 0),
(14, 'valor5', 0),
(15, 'valor6', 0),
(16, 'valor7', 0),
(17, 'valor8', 0),
(18, 'valor9', 0),
(19, 'valor1', 0),
(20, 'valor2', 0),
(21, 'valor3', 0),
(22, 'valor4', 0),
(23, 'valor5', 0),
(24, 'valor6', 0),
(25, 'valor7', 0),
(26, 'valor8', 0),
(27, 'valor9', 0),
(28, 'valor1', 0),
(29, 'valor2', 0),
(30, 'valor3', 0),
(31, 'valor4', 0),
(32, 'valor5', 0),
(33, 'valor6', 0),
(34, 'valor7', 0),
(35, 'valor8', 0),
(36, 'valor9', 0),
(37, 'valor1', 0),
(38, 'valor2', 0),
(39, 'valor3', 0),
(40, 'valor4', 0),
(41, 'valor5', 0),
(42, 'valor6', 0),
(43, 'valor7', 0),
(44, 'valor8', 0),
(45, 'valor9', 0),
(46, 'valor1', 0),
(47, 'valor2', 0),
(48, 'valor3', 0),
(49, 'valor4', 0),
(50, 'valor5', 0),
(51, 'valor6', 0),
(52, 'valor7', 0),
(53, 'valor8', 0),
(54, 'valor9', 0),
(200, 'asdfasdf', 323),
(205, 'qwerqwer', 55324),
(206, 'xcvxv', 221556),
(208, 'qwerqwer', 55324),
(209, 'xcvxv', 221556),
(211, 'qwerqwer', 55324),
(212, 'xcvxv', 221556),
(214, 'qwerqwer', 55324),
(215, 'xcvxv', 221556),
(217, 'qwerqwer', 55324),
(218, 'xcvxv', 221556),
(220, 'qwerqwer', 55324),
(221, 'xcvxv', 221556),
(223, 'qwerqwer', 55324),
(224, 'xcvxv', 221556),
(227, 'qwerqwer', 55324),
(228, 'xcvxv', 221556),
(230, 'qwerqwer', 55324),
(231, 'xcvxv', 221556),
(233, 'qwerqwer', 55324),
(234, 'xcvxv', 221556);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla2`
--

CREATE TABLE `tabla2` (
  `clave_tabla_2` int(11) NOT NULL,
  `campo1_tabla_2` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `tabla2`
--

INSERT INTO `tabla2` (`clave_tabla_2`, `campo1_tabla_2`) VALUES
(1, '2019-10-06'),
(2, '2019-10-06'),
(3, '2019-10-06'),
(4, '2019-10-06'),
(5, '2019-10-06'),
(6, '2019-10-06'),
(7, '2019-10-06'),
(8, '2019-10-06'),
(9, '2019-10-06'),
(10, '2019-10-06'),
(11, '2019-10-06'),
(12, '2019-10-06'),
(13, '2019-10-06'),
(14, '2019-10-06'),
(15, '2019-10-06'),
(16, '2019-10-06'),
(17, '2019-10-06'),
(18, '2019-10-06'),
(19, '2019-10-06'),
(20, '2019-10-06'),
(21, '2019-10-06'),
(22, '2019-10-06'),
(23, '2019-10-06'),
(24, '2019-10-06'),
(25, '2019-10-06'),
(26, '2019-10-06'),
(27, '2019-10-06'),
(28, '2019-10-06'),
(29, '2019-10-06'),
(30, '2019-10-06'),
(31, '2019-10-06'),
(32, '2019-10-06'),
(33, '2019-10-06'),
(34, '2019-10-06'),
(35, '2019-10-06'),
(36, '2019-10-06'),
(37, '2019-10-06'),
(38, '2019-10-06'),
(39, '2019-10-06'),
(40, '2019-10-06'),
(41, '2019-10-06'),
(42, '2019-10-06'),
(43, '2019-10-06'),
(44, '2019-10-06'),
(45, '2019-10-06'),
(46, '2019-10-06'),
(47, '2019-10-06'),
(48, '2019-10-06'),
(49, '2019-10-06'),
(50, '2019-10-06'),
(51, '2019-10-06'),
(52, '2019-10-06'),
(53, '2019-10-06'),
(54, '2019-10-06');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla3`
--

CREATE TABLE `tabla3` (
  `clave_tabla_3` int(11) NOT NULL,
  `campo1_tabla_3` float DEFAULT NULL,
  `clave_tabla_2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `tabla3`
--

INSERT INTO `tabla3` (`clave_tabla_3`, `campo1_tabla_3`, `clave_tabla_2`) VALUES
(1, 10, 5),
(2, 20, 5),
(3, 30, 4),
(4, 40, 1),
(5, 50, 9),
(6, 60, 5),
(7, 70, 6),
(8, 80, 7),
(9, 90, 1),
(10, 10, 5),
(11, 20, 5),
(12, 30, 4),
(13, 40, 1),
(14, 50, 9),
(15, 60, 5),
(16, 70, 6),
(17, 80, 7),
(18, 90, 1),
(19, 10, 5),
(20, 20, 5),
(21, 30, 4),
(22, 40, 1),
(23, 50, 9),
(24, 60, 5),
(25, 70, 6),
(26, 80, 7),
(27, 90, 1),
(28, 10, 5),
(29, 20, 5),
(30, 30, 4),
(31, 40, 1),
(32, 50, 9),
(33, 60, 5),
(34, 70, 6),
(35, 80, 7),
(36, 90, 1),
(37, 10, 5),
(38, 20, 5),
(39, 30, 4),
(40, 40, 1),
(41, 50, 9),
(42, 60, 5),
(43, 70, 6),
(44, 80, 7),
(45, 90, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `id` int(11) DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `edad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`id`, `nombre`, `edad`) VALUES
(1, 'PepeVendedores', 21),
(2, 'JoséVendedores', 45),
(1, 'PepeVendedores', 21),
(2, 'JoséVendedores', 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVenta` int(11) NOT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idArticulo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`idArticulo`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `ejemplo1`
--
ALTER TABLE `ejemplo1`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ejemplo2`
--
ALTER TABLE `ejemplo2`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tabla1`
--
ALTER TABLE `tabla1`
  ADD PRIMARY KEY (`clave_tabla_1`);

--
-- Indices de la tabla `tabla2`
--
ALTER TABLE `tabla2`
  ADD PRIMARY KEY (`clave_tabla_2`);

--
-- Indices de la tabla `tabla3`
--
ALTER TABLE `tabla3`
  ADD PRIMARY KEY (`clave_tabla_3`),
  ADD KEY `clave_tabla_2` (`clave_tabla_2`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `idArticulo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ejemplo1`
--
ALTER TABLE `ejemplo1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `ejemplo2`
--
ALTER TABLE `ejemplo2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tabla1`
--
ALTER TABLE `tabla1`
  MODIFY `clave_tabla_1` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=235;

--
-- AUTO_INCREMENT de la tabla `tabla2`
--
ALTER TABLE `tabla2`
  MODIFY `clave_tabla_2` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de la tabla `tabla3`
--
ALTER TABLE `tabla3`
  MODIFY `clave_tabla_3` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tabla3`
--
ALTER TABLE `tabla3`
  ADD CONSTRAINT `tabla3_ibfk_1` FOREIGN KEY (`clave_tabla_2`) REFERENCES `tabla2` (`clave_tabla_2`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
