-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2023 at 03:38 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_akmal`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `nobp` int(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`nobp`, `nama`, `alamat`, `jenis_kelamin`) VALUES
(2111082008, 'farhan', 'lolong', 'L');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kodebuku` int(20) NOT NULL,
  `judulbuku` varchar(50) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `nobp` int(20) NOT NULL,
  `kodebuku` int(20) NOT NULL,
  `tglpinjaman` date NOT NULL,
  `tglkembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `nobp` int(20) NOT NULL,
  `kodebuku` int(20) NOT NULL,
  `tglpinjaman` date NOT NULL,
  `tglkembalian` date NOT NULL,
  `terlambat` int(20) NOT NULL,
  `denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`nobp`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kodebuku`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD KEY `nobp` (`nobp`),
  ADD KEY `kodebuku` (`kodebuku`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD KEY `kodebuku` (`kodebuku`),
  ADD KEY `nobp` (`nobp`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `nobp` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2111082009;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `kodebuku` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67146;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`nobp`) REFERENCES `anggota` (`nobp`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`);

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`),
  ADD CONSTRAINT `pengembalian_ibfk_2` FOREIGN KEY (`nobp`) REFERENCES `anggota` (`nobp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
