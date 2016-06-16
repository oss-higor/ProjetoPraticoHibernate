-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 16-Jun-2016 às 06:24
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
('1', 'a', 'a', 'a', 'a', '1', 'a', 'a', 'a', 'a', 'aa', 'a', '', '', '', '', '', ''),
('111111', 'amanda', 'amanda', 'amanda', 'amanda', '111111', 'amanda', 'amanda', 'amanda', 'amanda', 'amanda', 'amanda', '', '', '', '', '', ''),
('21424', 'higggor', 'higor1', 'higor', 'higor', '21424', 'higor', 'higor', 'higor', 'higor', 'higor', 'higor', '', '', '', '', '', ''),
('32142', 'higor', 'higor', 'higor', 'higor', '32142', 'higor', 'higor', 'higor', 'higor', 'higor', 'higor', '', '', '', '', '', '');

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
('1', '111.0', '1', 'aa', '1', '111.0', '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE IF NOT EXISTS `tbproduto` (
  `cod_produto` int(11) NOT NULL,
  `descricao_produto` varchar(100) NOT NULL,
  `categoria_produto` varchar(100) NOT NULL,
  `valor_produto` varchar(100) NOT NULL,
  `estoque_produto` int(11) NOT NULL,
  PRIMARY KEY (`cod_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbproduto`
--

INSERT INTO `tbproduto` (`cod_produto`, `descricao_produto`, `categoria_produto`, `valor_produto`, `estoque_produto`) VALUES
(11, 'aa', 'aa', '111.0', 111);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvenda`
--

CREATE TABLE IF NOT EXISTS `tbvenda` (
  `cod_venda` varchar(100) NOT NULL,
  `cpf_cliente` varchar(100) NOT NULL,
  `data_venda` varchar(30) NOT NULL,
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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
