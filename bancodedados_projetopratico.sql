-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17-Jun-2016 às 15:58
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bancodedados_projetopratico`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

CREATE TABLE IF NOT EXISTS `tbcliente` (
  `idcliente` varchar(11) NOT NULL,
  `nome_cliente` varchar(100) NOT NULL,
  `email_cliente` varchar(30) NOT NULL,
  `telefone_cliente` varchar(30) NOT NULL,
  `senha_cliente` varchar(30) NOT NULL,
  `cpf_cliente` varchar(11) NOT NULL,
  `cep_cliente` varchar(30) NOT NULL,
  `cidade_cliente` varchar(30) NOT NULL,
  `estado_cliente` varchar(30) NOT NULL,
  `bairro_cliente` varchar(30) NOT NULL,
  `rua_cliente` varchar(30) NOT NULL,
  `numero_cliente` varchar(30) NOT NULL,
  `cep2_cliente` varchar(30) DEFAULT NULL,
  `cidade2_cliente` varchar(30) DEFAULT NULL,
  `estado2_cliente` varchar(30) DEFAULT NULL,
  `bairro2_cliente` varchar(30) DEFAULT NULL,
  `rua2_cliente` varchar(30) DEFAULT NULL,
  `numero2_cliente` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idcliente`),
  UNIQUE KEY `email_cliente` (`email_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcliente`
--

INSERT INTO `tbcliente` (`idcliente`, `nome_cliente`, `email_cliente`, `telefone_cliente`, `senha_cliente`, `cpf_cliente`, `cep_cliente`, `cidade_cliente`, `estado_cliente`, `bairro_cliente`, `rua_cliente`, `numero_cliente`, `cep2_cliente`, `cidade2_cliente`, `estado2_cliente`, `bairro2_cliente`, `rua2_cliente`, `numero2_cliente`) VALUES
('11111111111', '1', '1', '11111111111111', '11111111111111111111', '11111111111', '11111111', '1', '1', '1', '1', '1111111', '        ', '', '', '', '', '       '),
('14704299775', 'higor', 'oss.higor@gmail.com', '22981329635', 'secreta', '14704299775', '38810000', 'rio paranaiba', 'mg', 'universitario', 'avenida paraniba', '23', '', '', '', '', '', ''),
('43136932897', 'amanda', 'amandagabriellat@gmail.com', '11982229180', 'amanda', '43136932897', '38810000', 'rio paranaiba', 'mg', 'centro', 'coronel teodomiro rocha', '870', '320000', 'barueri ', 'sp', 'alphaville', 'alameda belgrado', '234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcomprados`
--

CREATE TABLE IF NOT EXISTS `tbcomprados` (
  `CPF_` varchar(11) NOT NULL,
  `VALORUNITARIO_` varchar(40) NOT NULL,
  `QUANTIDADE_` varchar(11) NOT NULL,
  `DESCRICAO_` varchar(100) NOT NULL,
  `CODVENDA_` varchar(11) NOT NULL,
  `VALORPARCIAL_` varchar(30) NOT NULL,
  `CHAVE_` varchar(11) NOT NULL,
  PRIMARY KEY (`CHAVE_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcomprados`
--

INSERT INTO `tbcomprados` (`CPF_`, `VALORUNITARIO_`, `QUANTIDADE_`, `DESCRICAO_`, `CODVENDA_`, `VALORPARCIAL_`, `CHAVE_`) VALUES
('11111111111', '9999', '2', 'dorflex', '1', '19998.0', '1'),
('11111111111', '4', '8', 'fralda', '1', '32.0', '2'),
('11111111111', '9999', '3', 'dorflex', '1', '29997.0', '3'),
('11111111111', '9999', '2', 'dorflex', '4', '19998.0', '4'),
('11111111111', '4', '10', 'fralda', '4', '40.0', '5'),
('11111111111', '9999', '1', 'dorflex', '6', '9999.0', '6'),
('11111111111', '4', '1', 'fralda', '6', '4.0', '7'),
('11111111111', '9999', '9', 'dorflex', '8', '89991.0', '8');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE IF NOT EXISTS `tbproduto` (
  `cod_produto` varchar(11) NOT NULL,
  `descricao_produto` varchar(100) NOT NULL,
  `categoria_produto` varchar(100) NOT NULL,
  `valor_produto` varchar(100) NOT NULL,
  `estoque_produto` varchar(11) NOT NULL,
  `caracteristica_prod` varchar(100) NOT NULL,
  PRIMARY KEY (`cod_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbproduto`
--

INSERT INTO `tbproduto` (`cod_produto`, `descricao_produto`, `categoria_produto`, `valor_produto`, `estoque_produto`, `caracteristica_prod`) VALUES
('1', 'dorflex', 'Remédios', '9999', '60', 'Genérico'),
('2', 'cheiroso', 'Perfumaria', '11', '0', 'Importado'),
('3', 'fralda', 'Higiene Pessoal', '4', '49', 'Ifantil');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvenda`
--

CREATE TABLE IF NOT EXISTS `tbvenda` (
  `cod_venda` double NOT NULL,
  `cpf_cliente` varchar(100) NOT NULL,
  `data_venda` int(11) NOT NULL,
  `status_venda` varchar(100) NOT NULL,
  `valor_total` varchar(100) NOT NULL,
  `cep_venda` varchar(100) NOT NULL,
  `estado_venda` varchar(100) NOT NULL,
  `cidade_venda` varchar(100) NOT NULL,
  `bairro_venda` varchar(100) NOT NULL,
  `rua_venda` varchar(100) NOT NULL,
  `numero_venda` varchar(100) NOT NULL,
  PRIMARY KEY (`cod_venda`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbvenda`
--

INSERT INTO `tbvenda` (`cod_venda`, `cpf_cliente`, `data_venda`, `status_venda`, `valor_total`, `cep_venda`, `estado_venda`, `cidade_venda`, `bairro_venda`, `rua_venda`, `numero_venda`) VALUES
(1, '11111111111', 21212121, 'pendente', '50027.0', '11111111111', '1', '1', '1', '1', '1111111'),
(4, '11111111111', 11212121, 'pendente', '20038.0', '11111111111', '1', '1', '1', '1', '1111111'),
(6, '11111111111', 78677587, 'pendente', '10003.0', '11111111111', '1', '1', '1', '1', '1111111'),
(8, '11111111111', 21212121, 'pendente', '89991.0', '11111111111', '1', '1', '1', '1', '1111111');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
