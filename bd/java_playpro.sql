-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le :  mer. 27 nov. 2019 à 04:26
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

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
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `image` char(67) DEFAULT 'blueplay.png'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `equipe`
--

INSERT INTO `equipe` (`nom_equipe`, `id_capitaine`, `nom_sport`, `nb_parties_jouees`, `nb_joueurs`, `nb_max_joueurs`, `date_creation`, `image`) VALUES
('bravo', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'balla', 0, 4, 30, '2019-11-26 01:25:40', '6329392-l lawliet.png'),
('Killers', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'Soccer', 0, 4, 30, '2019-11-26 01:16:04', '6329392-l lawliet.png'),
('lkasjd', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'kjasghd', 0, 3, 30, '2019-11-26 01:26:55', '6329392-l lawliet.png'),
('testa', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'balla', 0, 3, 30, '2019-11-26 14:17:07', '6329392-l lawliet.png'),
('Testali', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'kjasghd', 0, 6, 30, '2019-11-26 14:53:42', '6329392-l lawliet.png'),
('Tueurs', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'Soccer', 0, 5, 30, '2019-11-25 15:28:22', 'Capture d’écran, le 2019-11-24 à 00.38.45.png');

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE `invitation` (
  `id_expediteur` char(36) NOT NULL,
  `id_destinataire` char(36) NOT NULL,
  `id_requete` varchar(1000) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `invitation`
--

INSERT INTO `invitation` (`id_expediteur`, `id_destinataire`, `id_requete`, `date_creation`) VALUES
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', '8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 'bravo', '2019-11-27 02:30:25'),
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'ebe2e2ec-0b79-4108-be69-f54b6654be50', 'bravo', '2019-11-27 02:33:08');

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
-- Structure de la table `lieusport`
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
  `photo` varchar(55) DEFAULT 'head01.png',
  `statut` varchar(10) DEFAULT 'Actif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `membre`
--

INSERT INTO `membre` (`id`, `pseudo`, `sexe`, `nom`, `prenom`, `annee_naiss`, `courriel`, `date_inscription`, `type_membre`, `niveau`, `sport`, `mdp`, `equipe`, `photo`, `statut`) VALUES
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'vivi', 'Femme', 'Vil', 'Vivianne', 1995, 'vivi@al.ca', '2019-10-24 02:16:43', 'Admin', 'PROFESSIONNEL', 'Basketball', '1000:a94d672c3840a1bbc37cde84d0a8b77bb181453ec7772a3f:e81e26e647b1d27127e19b843709d313900c9e8cd7d39d3c', NULL, 'head01.png', 'Actif'),
('8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 'jack', 'Femme', 'Ja', 'Jacky', 1995, 'jack@al.ca', '2019-10-24 02:10:20', 'Entraineur', 'DEBUTANT', 'KaratÃ©', '1000:2b26ce3cac8e6f8be3f2060ea85f00b91828b3110a52a197:3d180a72d4d9b41ce3bbfd08d960f4688561b53d065090e7', NULL, 'head01.png', 'Actif'),
('940e6b1f-9190-453e-8c39-3e03bbbd36a9', 'totor', 'Homme', 'Rogers', 'Toto', 1995, 'toto@al.ca', '2019-10-24 02:01:36', 'Joueur', 'INTERMEDIAIRE', '', '1000:891fbed7bcb15322b590f3942c1153880080f91f6cb3908c:a75aac427ef2483815461479f2418e517c5bb47393b914c9', NULL, 'head01.png', 'Actif'),
('a407418a-7683-4abc-8193-f083d86ae9f6', 'sar', 'Femme', 'Sars', 'Sarah', 1995, 'sar@al.ca', '2019-10-24 02:03:55', 'Entraineur', 'DEBUTANT', 'Volley Ball', '1000:ea9f47d68e53c54912b4f275742419af166d24acef58182a:f1abe74a17599a97fab092f8352f97fb28e8d0d9a58eabac', NULL, 'head01.png', 'Actif'),
('adbbc2a0-3ec9-4baa-97e7-6b3b0b301aee', 'rob', 'Homme', 'Bob', 'Robert', 1995, 'rob@al.ca', '2019-10-24 02:07:13', 'Entraineur', 'DEBUTANT', 'Rugby', '1000:062bd4d1165b7222de29caec7ef631a78faaa5ffb4910a93:3f01bff75c12ef30ed2cd771813907b48cb230448862b54c', NULL, 'head01.png', 'Actif'),
('ebe2e2ec-0b79-4108-be69-f54b6654be50', 'bill', 'Homme', 'James', 'Billy', 1995, 'bill@al.ca', '2019-10-24 02:02:45', 'Entraineur', 'DEBUTANT', 'Hockey', '1000:af18c2facefef686d732c45d562a8f050a19971bf6a06260:475b8017d892615e4b990a9ad0b3fc719a7b6935fb588d5d', NULL, 'head01.png', 'Actif'),
('fd6a948e-7f78-4c73-b54c-fe2e8085a6d5', 'lili', 'Femme', 'Lilas', 'Lilianne', 1995, 'lili@al.ca', '2019-10-24 02:04:33', 'Joueur', 'PROFESSIONNEL', '', '1000:c8a26d54c05a9b9bba9fa14f3e5ff283dfd37f02bd2bc267:d604d30fda2f510ba1f0cce7e4291f1a9bd036fe2c72b29d', NULL, 'head01.png', 'Actif');

-- --------------------------------------------------------

--
-- Structure de la table `participationEquipe`
--

CREATE TABLE `participationEquipe` (
  `id_joueur` char(36) NOT NULL,
  `id_equipe` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `participationPartie`
--

CREATE TABLE `participationPartie` (
  `id_equipe` varchar(100) NOT NULL,
  `id_partie` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
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
  `nom` varchar(30) NOT NULL,
  `nb_max` int(2) NOT NULL DEFAULT '2',
  `nb_min` int(1) NOT NULL DEFAULT '2',
  `image` char(67) DEFAULT 'blueplay.png'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `sport`
--

INSERT INTO `sport` (`id_sport`, `nom`, `nb_max`, `nb_min`, `image`) VALUES
('0df302b1-ae4d-497e-8a43-4bc188f8a83a', 'Soccer', 3, 2, 'banniere.jpg'),
('64f50de6-759f-48dc-83db-299ebd8b0aab', 'Man', 18, 2, 'Capture d’écran, le 2019-11-24 à 01.03.47.png'),
('db031a56-2a4f-485a-b463-7165df255302', 'kjasghd', 6, 2, 'Capture d’écran, le 2019-11-24 à 00.38.45.png'),
('eade52d3-1ccc-49ef-8d86-34023d9f35a2', 'balla', 21, 2, 'Capture d’écran, le 2019-11-24 à 00.38.45.png');

--
-- Index pour les tables déchargées
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
  ADD PRIMARY KEY (`id_expediteur`,`id_destinataire`);

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD KEY `Lieu_FK_id_lieu` (`id_lieu`),
  ADD KEY `Lieu_FK_codepost` (`code_postal`) USING BTREE;

--
-- Index pour la table `lieusport`
--
ALTER TABLE `lieusport`
  ADD PRIMARY KEY (`id_lieu`,`id_sport`),
  ADD KEY `Sport_FK_sport` (`id_sport`);

--
-- Index pour la table `membre`
--
ALTER TABLE `membre`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `pseudo` (`pseudo`),
  ADD KEY `Membre_FK_nom_equipe` (`equipe`);

--
-- Index pour la table `participationEquipe`
--
ALTER TABLE `participationEquipe`
  ADD PRIMARY KEY (`id_joueur`,`id_equipe`);

--
-- Index pour la table `participationPartie`
--
ALTER TABLE `participationPartie`
  ADD PRIMARY KEY (`id_equipe`,`id_partie`);

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
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD CONSTRAINT `Annonce_FK_pseudo` FOREIGN KEY (`id_createur`) REFERENCES `membre` (`id`);

--
-- Contraintes pour la table `lieusport`
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
