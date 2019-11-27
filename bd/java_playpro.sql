-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Jeu 24 Octobre 2019 à 02:17
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `playpro2`
--

-- --------------------------------------------------------

--
-- Structure de la table `annonce`
--

CREATE TABLE `annonce` (
  `id_annonce` char(36) NOT NULL,
  `id_createur` varchar(255) CHARACTER SET utf8 NOT NULL,
  `nombreMax` int(11) NOT NULL,
  `montant` int(11) NOT NULL DEFAULT 0,
  `gratuit`boolean NOT NULL DEFAULT TRUE,
  `titre_annonce` varchar(100) CHARACTER SET utf8 NOT NULL,
  `description` text CHARACTER SET utf8 NOT NULL,
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
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `image` char(67)  NULL DEFAULT "blueplay.png" 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE `invitation` (
  `id` varchar(36) NOT NULL,
  `nom_equipe` char(36) NOT NULL,
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
  `numero` varchar(10) NOT NULL,
  `rue` varchar(255) CHARACTER SET utf8 NOT NULL,
  `code_postal` varchar(10) CHARACTER SET utf8 NOT NULL,
  `ville` varchar(255) CHARACTER SET utf8 NOT NULL,
  `pays` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT 'Canada',
  `infos` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `image1` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `image2` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `image3` varchar(255) CHARACTER SET utf8 DEFAULT NULL
  
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `lieu_sport`
--

CREATE TABLE `lieusport` (
  `id_lieu` char(36) NOT NULL,
  `id_sport` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE `membre` (
  `id` char(36) NOT NULL,
  `pseudo` varchar(255) DEFAULT NULL,
  `sexe` varchar(20) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `annee_naiss` int(5) DEFAULT '1995',
  `courriel` varchar(255) DEFAULT NULL,
  `date_inscription` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `type_membre` varchar(255) DEFAULT 'Joueur',
  `niveau` varchar(30) DEFAULT NULL,
  `sport` varchar(30) DEFAULT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  `equipe` varchar(100) DEFAULT NULL,
  `photo` varchar(255) DEFAULT "head01.png",
  `statut` varchar(10) DEFAULT 'Actif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `membre`
--

INSERT INTO `membre` (`id`, `pseudo`, `sexe`, `nom`, `prenom`, `annee_naiss`, `courriel`, `date_inscription`, `type_membre`, `niveau`, `sport`, `mdp`, `equipe`, `photo`, `statut`) VALUES
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'vivi', 'Femme', 'Vil', 'Vivianne', 1995, 'vivi@al.ca', '2019-10-24 02:16:43', 'Admin', 'PROFESSIONNEL', 'Basketball', '1000:a94d672c3840a1bbc37cde84d0a8b77bb181453ec7772a3f:e81e26e647b1d27127e19b843709d313900c9e8cd7d39d3c', NULL, "woman.jpg", 'Actif'),
('8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 'jack', 'Femme', 'Ja', 'Jacky', 1995, 'jack@al.ca', '2019-10-24 02:10:20', 'Entraineur', 'DEBUTANT', 'KaratÃ©', '1000:2b26ce3cac8e6f8be3f2060ea85f00b91828b3110a52a197:3d180a72d4d9b41ce3bbfd08d960f4688561b53d065090e7', NULL, "woman.jpg", 'Actif'),
('940e6b1f-9190-453e-8c39-3e03bbbd36a9', 'totor', 'Homme', 'Rogers', 'Toto', 1995, 'toto@al.ca', '2019-10-24 02:01:36', 'Joueur', 'INTERMEDIAIRE', '', '1000:891fbed7bcb15322b590f3942c1153880080f91f6cb3908c:a75aac427ef2483815461479f2418e517c5bb47393b914c9', NULL, "man.jpg", 'Actif'),
('a407418a-7683-4abc-8193-f083d86ae9f6', 'sar', 'Femme', 'Sars', 'Sarah', 1995, 'sar@al.ca', '2019-10-24 02:03:55', 'Entraineur', 'DEBUTANT', 'Volley Ball', '1000:ea9f47d68e53c54912b4f275742419af166d24acef58182a:f1abe74a17599a97fab092f8352f97fb28e8d0d9a58eabac', NULL, "woman.jpg", 'Actif'),
('adbbc2a0-3ec9-4baa-97e7-6b3b0b301aee', 'rob', 'Homme', 'Bob', 'Robert', 1995, 'rob@al.ca', '2019-10-24 02:07:13', 'Entraineur', 'DEBUTANT', 'Rugby', '1000:062bd4d1165b7222de29caec7ef631a78faaa5ffb4910a93:3f01bff75c12ef30ed2cd771813907b48cb230448862b54c', NULL, "man.jpg", 'Actif'),
('ebe2e2ec-0b79-4108-be69-f54b6654be50', 'bill', 'Homme', 'James', 'Billy', 1995, 'bill@al.ca', '2019-10-24 02:02:45', 'Entraineur', 'DEBUTANT', 'Hockey', '1000:af18c2facefef686d732c45d562a8f050a19971bf6a06260:475b8017d892615e4b990a9ad0b3fc719a7b6935fb588d5d', NULL, "man.jpg", 'Actif'),
('fd6a948e-7f78-4c73-b54c-fe2e8085a6d5', 'lili', 'Femme', 'Lilas', 'Lilianne', 1995, 'lili@al.ca', '2019-10-24 02:04:33', 'Joueur', 'PROFESSIONNEL', '', '1000:c8a26d54c05a9b9bba9fa14f3e5ff283dfd37f02bd2bc267:d604d30fda2f510ba1f0cce7e4291f1a9bd036fe2c72b29d', NULL, "woman.jpg", 'Actif');

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
  `nom` varchar(30) NOT NULL,
  `nb_max` int(2) NOT NULL DEFAULT '2',
  `nb_min` int(1) NOT NULL DEFAULT '2',
  `image` char(67)  NULL DEFAULT "blueplay.png" 

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD PRIMARY KEY (`id_annonce`),
  ADD KEY `Annonce_FK_pseudo` (`id_createur`) USING BTREE;

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_membre_FK_Membre` (`id_membre`) USING BTREE,
  ADD KEY `nom_equipe_FK_Equipe` (`nom_equipe`) USING BTREE;

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD KEY `Lieu_FK_id_lieu` (`id_lieu`),
  ADD KEY `Lieu_FK_codepost` (`code_postal`) USING BTREE;

--
-- Index pour la table `lieu_sport`
--

ALTER TABLE `lieuSport`
  ADD PRIMARY KEY (`id_lieu`, `id_sport`);

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
  ADD UNIQUE KEY `nom_sport` (`nom`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD CONSTRAINT `Annonce_FK_pseudo` FOREIGN KEY (`id_createur`) REFERENCES `membre` (`id`);

--
-- Contraintes pour la table `invitation`
--
ALTER TABLE `invitation`
  ADD CONSTRAINT `Invitation_FK_equipe` FOREIGN KEY (`nom_equipe`) REFERENCES `equipe` (`nom_equipe`),
  ADD CONSTRAINT `Invitation_FK_membre` FOREIGN KEY (`id_membre`) REFERENCES `membre` (`id`);

--
-- Contraintes pour la table `lieu_sport`
--
ALTER TABLE `lieusport`
  ADD CONSTRAINT `Lieu_FK_codepostale` FOREIGN KEY (`id_lieu`) REFERENCES `lieu` (`id_lieu`),
  ADD CONSTRAINT `Sport_FK_sport` FOREIGN KEY (`id_sport`) REFERENCES `sport` (`id_sport`);

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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
