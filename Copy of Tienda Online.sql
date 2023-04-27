CREATE TABLE `producto` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255),
  `descripcion` varchar(255),
  `marca` varchar(255),
  `categoria_id` int,
  `precio` double,
  `impuesto` double,
  `stock` int,
  `baja` boolean
);

CREATE TABLE `categorias` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255)
);

CREATE TABLE `usuario` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `rol_id` int,
  `email` varchar(255),
  `clave` varchar(255),
  `nombre` varchar(255),
  `apellidos` varchar(255),
  `baja` boolean
);

CREATE TABLE `rol` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255)
);

CREATE TABLE `pedido` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `usuario_id` int,
  `fecha` datetime,
  `metodopago` varchar(255),
  `numfactura` varchar(255),
  `total` double
);

CREATE TABLE `detalle` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `pedido_id` int,
  `producto_id` int,
  `unidades` int,
  `preciounidad` double,
  `impuesto` double,
  `total` double
);

CREATE TABLE `configuracion` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `clave` varchar(255),
  `valor` varchar(255)
);

ALTER TABLE `pedido` ADD FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`);

ALTER TABLE `detalle` ADD FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`);

ALTER TABLE `detalle` ADD FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`);

ALTER TABLE `usuario` ADD FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`);

ALTER TABLE `producto` ADD FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`);
