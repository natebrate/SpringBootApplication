-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 30, 2020 at 07:36 PM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vyhs1bMBpj`
--

-- --------------------------------------------------------

--
-- Table structure for table `animalInfo`
--

CREATE TABLE `animalInfo` (
  `animalID` int(7) NOT NULL,
  `name` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `trainerID` int(7) NOT NULL,
  `speciesID` int(11) NOT NULL,
  `age` int(2) NOT NULL,
  `sex` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `weight` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `animalInfo`
--

INSERT INTO `animalInfo` (`animalID`, `name`, `trainerID`, `speciesID`, `age`, `sex`, `weight`) VALUES
(201, 'Larry', 101, 2, 4, 'Male', 36.80);

-- --------------------------------------------------------

--
-- Table structure for table `SpeciesInfo`
--

CREATE TABLE `SpeciesInfo` (
  `SpecId` int(3) NOT NULL,
  `Species` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `FeedingType` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `quantity` int(2) NOT NULL,
  `Description` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `LocationID` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `SpeciesInfo`
--

INSERT INTO `SpeciesInfo` (`SpecId`, `Species`, `FeedingType`, `quantity`, `Description`, `LocationID`) VALUES
(2, 'Lion', 'Carnivore', 4, 'A big cat', 2),
(9, 'Komodo Dragon', 'Carnivores', 1, 'Big Lizzard', 4),
(34, 'Salt Water Crocodile', 'Carnivores', 1, 'Big Lizzard with teeth', 4),
(40, 'Siberian Tigers', 'Carnivores', 1, 'Another Big Cat', 0),
(43, 'CHeetah', 'Carnivores', 1, 'Big Lizzard', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Staff`
--

CREATE TABLE `Staff` (
  `StaffID` int(7) NOT NULL,
  `Fname` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Lname` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Role` varchar(225) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(225) COLLATE utf8_unicode_ci DEFAULT '1234',
  `username` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `enabled` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `Staff`
--

INSERT INTO `Staff` (`StaffID`, `Fname`, `Lname`, `Role`, `password`, `username`, `enabled`) VALUES
(82, 'John', 'Doe', 'Admin', 'password', 'nopnop', 0),
(101, 'Nate', 'Brate', 'Trainer', '1234', 'nate', 1),
(156, 'Rayna', 'Howard', 'Trainer', 'password', 'IlikeCows', 1),
(276, 'Sandra', 'Royland', 'Trainer', 'password', 'IlikeLions', 1),
(483, 'Todd', 'Howard', 'Trainer', 'password', 'ILikeTigers', 1),
(661, 'Tobby', 'Royland', 'Trainer', 'password', 'IlikeDogs', 0),
(822, 'Ryan', 'Johnson', 'Trainer', 'password', 'BigBird', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `animalInfo`
--
ALTER TABLE `animalInfo`
  ADD PRIMARY KEY (`animalID`),
  ADD KEY `trainerID` (`trainerID`),
  ADD KEY `speciesID` (`speciesID`);

--
-- Indexes for table `SpeciesInfo`
--
ALTER TABLE `SpeciesInfo`
  ADD PRIMARY KEY (`SpecId`);

--
-- Indexes for table `Staff`
--
ALTER TABLE `Staff`
  ADD PRIMARY KEY (`StaffID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `animalInfo`
--
ALTER TABLE `animalInfo`
  MODIFY `animalID` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=202;

--
-- AUTO_INCREMENT for table `SpeciesInfo`
--
ALTER TABLE `SpeciesInfo`
  MODIFY `SpecId` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `animalInfo`
--
ALTER TABLE `animalInfo`
  ADD CONSTRAINT `animalInfo_ibfk_1` FOREIGN KEY (`trainerID`) REFERENCES `Staff` (`staffid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `animalInfo_ibfk_2` FOREIGN KEY (`speciesID`) REFERENCES `SpeciesInfo` (`specid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
