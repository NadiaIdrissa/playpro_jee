-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  jeu. 10 oct. 2019 à 12:23
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
  `id_annonce` int(11) NOT NULL,
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
  `capitaine` int(11) DEFAULT NULL,
  `sport` varchar(255) DEFAULT NULL,
  `nb_parties_jouees` int(11) NOT NULL,
  `nb_joueurs` int(11) NOT NULL,
  `nb_max_joueurs` int(11) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `equipe`
--

INSERT INTO `equipe` (`nom_equipe`, `capitaine`, `sport`, `nb_parties_jouees`, `nb_joueurs`, `nb_max_joueurs`, `date_creation`) VALUES
('AS Vital', 7, 'Hockey', 0, 3, 8, '2019-05-01 04:00:00'),
('Aviron aviron', 7, 'Badminton', 0, 1, 7, '2019-05-01 04:00:00'),
('FC Champions', 7, 'Soccer', 0, 1, 11, '2019-05-01 04:00:00'),
('Fc Concorde', 14, 'Soccer', 0, 1, 9, '2019-05-01 04:00:00'),
('impact', 2, 'Soccer', 3, 4, 11, '2019-04-03 04:00:00'),
('Invité', 3, NULL, 0, 2, 11, '2019-04-16 04:00:00'),
('Real Madrid', 3, 'Soccer', 1, 0, 11, '2019-04-01 04:00:00'),
('Saint-Vainqueurs', 7, 'Badminton', 0, 1, 6, '2019-05-01 04:00:00'),
('stars', 3, 'Hochey', 0, 1, 6, '2019-04-16 04:00:00');

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

CREATE TABLE `lieu` (
  `id_lieu` int(11) NOT NULL,
  `nom` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
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
  `id_lieu_sport` int(11) NOT NULL,
  `nom_du_sport` varchar(30) NOT NULL,
  `zone_sport` varchar(6) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE `membre` (
  `id` int(11) NOT NULL,
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
  `photo` longblob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `membre`
--

INSERT INTO `membre` (`id`, `pseudo`, `sexe`, `nom`, `prenom`, `annee_naiss`, `courriel`, `date_inscription`, `type_membre`, `mdp`, `equipe`, `photo`) VALUES
(1, 'yami', NULL, 'yoyo', 'yoyo', NULL, 'y.d@ggg.com', '2019-04-12 04:00:00', '', '$2y$10$Gf7g8Xj43KpSkRWrV4dzoevxB/B4Aajv/5ouL4ofcL32hnuP59WcK', 'AS Vital', ''),
(2, 'ken', 'Femme', 'Kalomba', 'Kennedy', NULL, 'ra@g.c', '2019-04-13 04:00:00', 'admin', '$2y$10$x5I9CN06da8HezX1DRDf..JNVK9ZMn4TR5DvnDQJKseBiBxcIZEPy', NULL, ''),
(3, 'root', 'Homme', 'Meilleur', 'Julien', NULL, 'root@root.ca', '2019-04-20 04:00:00', 'admin', '$2y$10$Gf7g8Xj43KpSkRWrV4dzoevxB/B4Aajv/5ouL4ofcL32hnuP59WcK', 'Aviron aviron', ''),
(4, 'lala', 'Homme', 'lala', 'lala', NULL, 'y@k.co', '2019-04-30 04:00:00', 'admin', '$2y$10$D2N2Zrr85tYpAHY5kCt6ruT/HnJ76ZYeUwCb7EFhLUhCbeOmR91uO', NULL, ''),
(5, 'bebe', 'Femme', 'bebe', 'bebe', NULL, 'bebe@b.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$dURiXdGWpSm90jHv8wCjAulrIe1c8x/iEFGt/V3cnRZEppOUzN2hO', NULL, ''),
(6, 'baba', 'Homme', 'baba', 'baba', NULL, 'b@b.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$7/HZXXe4HiAH/LTDjPZSJOZrrgPlUbXoBlnQpCjF/dtJvh7IPGoiq', NULL, ''),
(7, 'haha', 'Homme', 'haha', 'haha', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'admin', '$2y$10$Ebz0.VSh9YY9Tvdi.WC2rOI23sizUWPdvjTNY4eOq0o3MXnfmpwya', NULL, ''),
(8, 'jojo', 'Femme', 'Lemieux', 'Joel', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$nIta0boEFBhpPMnWxP.hLOD4X8a0njJqPc3O9CcW/wV71GQMA4bqS', NULL, ''),
(9, 'bob', 'Homme', 'Robert', 'Bob', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$aFE9jJiEf/IYXqozRf.SSeAtrPt8fNrsCTbK5JUBEfQ.x5hnXGYhy', NULL, ''),
(10, 'rob', 'Homme', 'Robert', 'Robert', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$Tyw51VWC4sHqF4p8/CHF6.y64ie8Q9AkyXROELL6toEU11JAzDja.', NULL, ''),
(11, 'val', 'Femme', 'Valois', 'Valerie', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$gRfCY1m4p4Vmm2ZFU1n4bOjYCwfRuihPsHjyqhtrkJWxHmYM3aRnC', 'Fc Concorde', ''),
(12, 'fany', 'Femme', 'Dadou', 'Fany', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$pwVlMM/bSILBWKZXzKUVJu2jVf0HqTS6rpg2jXjUDLcVXKVsykHzW', NULL, ''),
(13, 'ely', 'Femme', 'lili', 'ely', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$MeqYzEpwStZMWZ7e5Ma4XukBBETkJGtWo8VjrDyvsf12GlaNMYxFi', NULL, ''),
(14, 'lowis', 'Femme', 'lewis', 'lowis', NULL, 'al@al.ca', '2019-05-01 04:00:00', 'joueur', '$2y$10$8cKfMzTK0ueDLOq7eUIl9uZD2CK3ngI5H/USx868ZYFV4DNp5E4ye', NULL, '');

-- --------------------------------------------------------

--
-- Structure de la table `partie`
--

CREATE TABLE `partie` (
  `id_partie` int(11) NOT NULL,
  `date_partie_heure` date NOT NULL,
  `sport` varchar(30) NOT NULL,
  `equipe_1` varchar(100) DEFAULT NULL,
  `equipe_2` varchar(100) DEFAULT NULL,
  `lieu_partie` varchar(300) NOT NULL,
  `score` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `partie`
--

INSERT INTO `partie` (`id_partie`, `date_partie_heure`, `sport`, `equipe_1`, `equipe_2`, `lieu_partie`, `score`) VALUES
(1, '2019-04-01', 'Soccer', 'impact', 'Real Madrid', 'Montréal', '0 - 0'),
(2, '2019-04-01', 'Soccer', 'Real Madrid', 'impact', 'Montréal', '0 - 0'),
(3, '2019-04-01', 'Soccer', 'stars', 'impact', 'Anjou', '0 - 0'),
(4, '2019-04-01', 'Badminton', 'impact', 'Real Madrid', 'Montréal', '0 - 0'),
(5, '2019-05-28', 'Soccer', 'impact', 'stars', 'saint loin ', '0 - 0'),
(6, '2019-05-28', 'Soccer', 'impact', 'stars', 'saint loin ', '0 - 0'),
(7, '2019-05-28', 'Soccer', 'impact', 'stars', 'saint loin ', '0 - 0'),
(8, '2019-05-28', 'Hockey', 'impact', 'stars', 'saint loin ', '0 - 0'),
(9, '2019-05-28', 'Soccer', 'impact', 'stars', 'saint loin ', '0 - 0'),
(10, '2019-05-28', 'Soccer', 'impact', 'stars', 'saint loin ', '0 - 0'),
(11, '2019-05-29', 'Soccer', 'Real Madrid', 'Saint-Vainqueurs', 'montreal', '0 - 0'),
(12, '2019-07-19', 'Hockey', 'FC Champions', 'Invité', 'Roberval', '0 - 0'),
(13, '2019-06-06', 'Soccer', 'Fc Concorde', 'Invité', 'Laval', '0 - 0'),
(14, '2019-07-26', 'Hockey', 'Real Madrid', 'impact', 'Rosemont', '0 - 0'),
(15, '2019-07-18', 'Badminton', 'Saint-Vainqueurs', 'Fc Concorde', 'Paris', '0 - 0'),
(16, '2019-08-30', 'Badminton', 'AS Vital', 'Invité', 'Louvres', '0 - 0'),
(17, '2019-07-10', 'Soccer', 'Real Madrid', 'Invité', 'Rosemont', '0 - 0'),
(18, '2019-06-28', 'Badminton', 'AS Vital', 'Invité', 'Laval', '0 - 0'),
(19, '2019-06-14', 'Hockey', 'Invité', 'Invité', 'Montréal', '0 - 0');

-- --------------------------------------------------------

--
-- Structure de la table `sport`
--

CREATE TABLE `sport` (
  `id_sport` int(11) NOT NULL,
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
  ADD KEY `Equipe_FK_capitaine` (`capitaine`),
  ADD KEY `Equipe_FK_sport` (`sport`) USING BTREE;

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
  ADD KEY `Lieu_FK_codepostale` (`zone_sport`),
  ADD KEY `Sport_FK_sport` (`nom_du_sport`) USING BTREE;

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
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `annonce`
--
ALTER TABLE `annonce`
  MODIFY `id_annonce` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `lieu_sport`
--
ALTER TABLE `lieu_sport`
  MODIFY `id_lieu_sport` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `membre`
--
ALTER TABLE `membre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `partie`
--
ALTER TABLE `partie`
  MODIFY `id_partie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT pour la table `sport`
--
ALTER TABLE `sport`
  MODIFY `id_sport` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD CONSTRAINT `Equipe_FK_capitaine` FOREIGN KEY (`capitaine`) REFERENCES `membre` (`id`);

--
-- Contraintes pour la table `lieu_sport`
--
ALTER TABLE `lieu_sport`
  ADD CONSTRAINT `Lieu_FK_codepostale` FOREIGN KEY (`zone_sport`) REFERENCES `lieu` (`code_postal`),
  ADD CONSTRAINT `Sport_FK_sport` FOREIGN KEY (`nom_du_sport`) REFERENCES `sport` (`nom_sport`);

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
