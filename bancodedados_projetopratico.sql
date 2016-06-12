-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 12-Jun-2016 às 21:00
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
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcliente`
--

INSERT INTO `tbcliente` (`idcliente`, `nome_cliente`, `email_cliente`, `telefone_cliente`, `senha_cliente`, `cpf_cliente`, `cep_cliente`, `cidade_cliente`, `estado_cliente`, `bairro_cliente`, `rua_cliente`, `numero_cliente`, `cep2_cliente`, `cidade2_cliente`, `estado2_cliente`, `bairro2_cliente`, `rua2_cliente`, `numero2_cliente`) VALUES
('111', 'TesteNome', 'testeemail', 'Testetelefone', 'Testesenha', 'Testecpf', 'Testecep', 'Testecidade', 'TesteEstado', 'TesteBairro', 'Testerua', 'Testenumero', '', '', '', '', '', '');

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
(1, 'a', 'a', '12', 12),
(2, 'a', 'a', 'a', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
