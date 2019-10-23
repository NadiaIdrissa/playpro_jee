-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  mer. 23 oct. 2019 à 11:36
-- Version du serveur :  5.7.27-0ubuntu0.18.04.1
-- Version de PHP :  7.2.19-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `java_playpro`
--

-- --------------------------------------------------------

--
-- Structure de la table `annonce`
--

CREATE TABLE `annonce` (
  `id_annonce` char(36) NOT NULL,
  `pseudo_createur` varchar(255) CHARACTER SET utf8 NOT NULL,
  `titre_annonce` varchar(100) CHARACTER SET utf8 NOT NULL,
  `message` text CHARACTER SET utf8 NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE `equipe` (
  `nom_equipe` varchar(100) NOT NULL,
  `id_capitaine` char(36) NOT NULL,
  `nom_sport` varchar(30) NOT NULL,
  `nb_parties_jouees` int(11) NOT NULL,
  `nb_joueurs` int(11) NOT NULL,
  `nb_max_joueurs` int(11) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE `invitation` (
  `id_equipe` char(36) NOT NULL,
  `id_membre` char(36) NOT NULL,
  `date_invit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `statut` varchar(10) NOT NULL DEFAULT 'en cours'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

CREATE TABLE `lieu` (
  `id_lieu` char(36) NOT NULL,
  `nom` varchar(255) CHARACTER SET utf8 NOT NULL,
  `numero` int(7) NOT NULL,
  `rue` varchar(255) CHARACTER SET utf8 NOT NULL,
  `code_postal` varchar(6) CHARACTER SET utf8 NOT NULL,
  `ville` varchar(255) CHARACTER SET utf8 NOT NULL,
  `pays` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT 'Canada',
  `infos` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `lieu_sport`
--

CREATE TABLE `lieu_sport` (
  `id_lieu_sport` char(36) NOT NULL,
  `nom_sport` varchar(30) NOT NULL,
  `zone_sport` varchar(6) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE `membre` (
  `id` char(36) NOT NULL,
  `pseudo` varchar(255) NOT NULL,
  `sexe` varchar(20) DEFAULT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `annee_naiss` date DEFAULT NULL,
  `courriel` varchar(255) NOT NULL,
  `date_inscription` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `type_membre` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `equipe` varchar(100) DEFAULT NULL,
  `photo` longblob,
  `statut` varchar(10) NOT NULL DEFAULT 'Actif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `partie`
--

CREATE TABLE `partie` (
  `id_partie` char(36) NOT NULL,
  `date_partie_heure` date NOT NULL,
  `sport` varchar(30) NOT NULL,
  `equipe_1` varchar(100) DEFAULT NULL,
  `equipe_2` varchar(100) DEFAULT NULL,
  `lieu_partie` varchar(300) NOT NULL,
  `score` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `sport`
--

CREATE TABLE `sport` (
  `id_sport` char(36) NOT NULL,
  `nom_sport` varchar(30) NOT NULL,
  `nb_joueurs_max` int(2) NOT NULL DEFAULT '2',
  `nb_joueurs_min` int(1) NOT NULL DEFAULT '2'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD PRIMARY KEY (`id_annonce`),
  ADD KEY `Annonce_FK_pseudo` (`pseudo_createur`) USING BTREE;

--
-- Index pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD PRIMARY KEY (`nom_equipe`),
  ADD KEY `Capitaine_FK_membre` (`id_capitaine`) USING BTREE,
  ADD KEY `Nom_sport_FK_sport` (`nom_sport`) USING BTREE;

--
-- Index pour la table `invitation`
--
ALTER TABLE `invitation`
  ADD KEY `id_membre_FK_Membre` (`id_membre`) USING BTREE,
  ADD KEY `id_equipe_FK_Equipe` (`id_equipe`) USING BTREE;

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD KEY `Lieu_FK_id_lieu` (`id_lieu`),
  ADD KEY `Lieu_FK_codepost` (`code_postal`) USING BTREE;

--
-- Index pour la table `lieu_sport`
--
ALTER TABLE `lieu_sport`
  ADD PRIMARY KEY (`id_lieu_sport`),
  ADD KEY `Zone_sport_FK_cp_Lieu` (`zone_sport`) USING BTREE,
  ADD KEY `Nom_sport_FK_Sport` (`nom_sport`) USING BTREE;

--
-- Index pour la table `membre`
--
ALTER TABLE `membre`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `pseudo` (`pseudo`),
  ADD KEY `Membre_FK_nom_equipe` (`equipe`);

--
-- Index pour la table `partie`
--
ALTER TABLE `partie`
  ADD PRIMARY KEY (`id_partie`),
  ADD KEY `Partie_FK_nom_equipe1` (`equipe_1`),
  ADD KEY `Partie_FK_nom_equipe2` (`equipe_2`),
  ADD KEY `Partie_FK_sport` (`sport`) USING BTREE;

--
-- Index pour la table `sport`
--
ALTER TABLE `sport`
  ADD PRIMARY KEY (`id_sport`),
  ADD UNIQUE KEY `nom_sport` (`nom_sport`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `lieu_sport`
--
ALTER TABLE `lieu_sport`
  ADD CONSTRAINT `Lieu_FK_codepostale` FOREIGN KEY (`zone_sport`) REFERENCES `lieu` (`code_postal`),
  ADD CONSTRAINT `Sport_FK_sport` FOREIGN KEY (`nom_sport`) REFERENCES `sport` (`nom_sport`);

--
-- Contraintes pour la table `membre`
--
ALTER TABLE `membre`
  ADD CONSTRAINT `Membre_FK_nom_equipe` FOREIGN KEY (`equipe`) REFERENCES `equipe` (`nom_equipe`);

--
-- Contraintes pour la table `partie`
--
ALTER TABLE `partie`
  ADD CONSTRAINT `Partie_FK_nom_equipe1` FOREIGN KEY (`equipe_1`) REFERENCES `equipe` (`nom_equipe`),
  ADD CONSTRAINT `Partie_FK_nom_equipe2` FOREIGN KEY (`equipe_2`) REFERENCES `equipe` (`nom_equipe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
