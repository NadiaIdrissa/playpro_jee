-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  jeu. 05 déc. 2019 à 16:50
-- Version du serveur :  5.7.27-0ubuntu0.18.04.1
-- Version de PHP :  7.2.24-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
  `id_lieu` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `date_event` timestamp NULL DEFAULT '2020-03-29 15:50:00',
  `montant` float(6,2) NOT NULL DEFAULT '0.00',
  `gratuit` tinyint(1) NOT NULL DEFAULT '1',
  `titre_annonce` varchar(100) CHARACTER SET utf8 NOT NULL,
  `description` text CHARACTER SET utf8 NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `annonce`
--

INSERT INTO `annonce` (`id_annonce`, `id_createur`, `nombreMax`, `id_lieu`, `date_event`, `montant`, `gratuit`, `titre_annonce`, `description`, `date_creation`) VALUES
('1bd83e10-28c2-4033-ada1-5f64c5989e58', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 6, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 0.00, 1, 'Pratique de soccer', 'Je vous propose un cours de soccer. Pour tous niveaux de joueurs.\r\n', '2019-11-29 00:41:00'),
('241ee6bd-ff8a-4b22-9bb1-d1710bfc8ed8', '8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 13, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 100.00, 0, 'Match de Baseball', 'Venez jouer au baseball dans notre league semi-professionnelle et participez à des tournois officiels!\r\nNiveau intermédiaire à avancé.\r\n', '2019-11-29 00:50:08'),
('3df681e1-f8aa-4b4a-8209-ba0e5bef50f5', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 6, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 0.00, 1, 'Volley-ball gratuit', 'Pratique de volley-ball tous les mercredis. Je suis un jeune entraîneur et souhaite me pratiquer.\r\n', '2019-11-29 00:36:40'),
('4ba68093-54a7-4f03-8ba8-fb87ffcfef9c', 'a407418a-7683-4abc-8193-f083d86ae9f6', 6, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 0.00, 1, 'Match de Tennis', 'Je vous attends nombreux.', '2019-11-29 00:37:44'),
('4eab0a9c-2319-47fb-a6e4-be8d01f78016', 'fd6a948e-7f78-4c73-b54c-fe2e8085a6d5', 13, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 50.00, 0, 'Cours de Baseball', 'Apprennez a jouer au baseball comme un pro !', '2019-11-29 00:48:42'),
('7c06c278-8936-48af-9ec5-0737cb613fd3', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 13, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 100.00, 0, 'Match de Baseball', 'Cours de baseball pour les débutants. Efficacité garantie. Durant ma carrière j\'ai entraîné des joueurs en league professionnelle.', '2019-11-29 00:41:50'),
('8c750e5f-4b0a-468f-b425-a66a85dc8c90', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 6, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 0.00, 1, 'Pratique de Tennis', 'Les rudiments du tennis offerts gratuitement pour tous niveaux de joueurs.', '2019-11-29 00:39:35'),
('a2dba22b-417a-4c5a-8a79-ae9ee29cc9cd', 'fd6a948e-7f78-4c73-b54c-fe2e8085a6d5', 13, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 80.00, 0, 'Cours de ballet', 'Danse classique pour tous dans un studio aménagé. Ballet prévu en fin d\'année.\r\n', '2019-11-29 00:44:12'),
('ca777a31-5348-478a-b639-2f9775744956', '29e405ab-2014-43e1-b01e-492d4dcc5ebd', 13, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 300.00, 0, 'Pratique salsa', 'Devenez danseur professionnel. Pour danseurs aguéris seulement. Répétitions avant show.', '2019-11-29 00:44:51'),
('fc87369e-1da1-4fd3-afb6-57e1c8422bae', 'a407418a-7683-4abc-8193-f083d86ae9f6', 6, 'aedf248d-a10a-4a5a-a55f-3a800c428db5', '2019-12-29 15:50:08', 0.00, 1, 'Cours de Tennis', 'Venez nombreux! Cours participatif.', '2019-11-29 00:35:48');

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE `equipe` (
  `nom_equipe` varchar(36) NOT NULL,
  `id_capitaine` char(36) NOT NULL,
  `id_sport` char(36) NOT NULL,
  `nb_parties_jouees` int(11) NOT NULL,
  `nb_joueurs` int(11) NOT NULL,
  `nb_max_joueurs` int(11) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `image` char(67) DEFAULT 'blueplay.png'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `equipe`
--

-- --------------------------------------------------------

--
-- Structure de la table `invitation`
--

CREATE TABLE `invitation` (
  `id_expediteur` char(36) NOT NULL,
  `id_destinataire` char(36) NOT NULL,
  `id_requete` varchar(36) NOT NULL,
  `date_creation` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `invitation`
--

INSERT INTO `invitation` (`id_expediteur`, `id_destinataire`, `id_requete`, `date_creation`) VALUES
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', '8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 'bravo', '2019-11-27 02:30:25'),
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', '940e6b1f-9190-453e-8c39-3e03bbbd36a9', 'bravo', '2019-11-28 23:52:47'),
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
  `image3` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `surCarte` varchar(255) CHARACTER SET utf8 DEFAULT 'https://www.google.com/maps/place/Parc+La+Fontaine/@45.5261636,-73.5714842,16.31z/data=!4m5!3m4!1s0x4cc91bc84bbfa227:0x45962228026ccc97!8m2!3d45.5270784!4d-73.5692815'

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lieu`
--

INSERT INTO `lieu` (`id_lieu`, `nom`, `numero`, `rue`, `code_postal`, `ville`, `pays`, `infos`, `image1`, `image2`, `image3`,`surCarte`) VALUES
('685c7074-42e0-4169-b4e9-706b8161e1e3', 'Complexe sportif C.Robillard', '1000', 'Avenue Emile-Journault', 'H2M 2E7', 'Montreal', 'Canada', 'Acces par l\'avenue Christophe Colomb', 'CRobillard3.jpg', 'CRobillard2.jpeg', 'CRobillard1.jpg','https://www.google.ca/maps/place/Stade+IGA/@45.5535874,-73.6381173,15.81z/data=!4m5!3m4!1s0x4cc9190fedc1e617:0xc3efd9e5fbb085a8!8m2!3d45.5329897!4d-73.6271729'),
('942bf489-d040-4115-9c2a-1909fd7e11de', 'Parc Jarry', '285', 'Rue Gary-Carter', 'H2R 2W1', 'Montreal', 'Canada', 'Parking gratuit sur place', 'Jarry1.jpg', 'Jarry2.jpg', 'Jarry3.jpg','https://www.google.ca/maps/place/Stade+IGA/@45.5336136,-73.6299097,16.05z/data=!4m5!3m4!1s0x4cc9190fedc1e617:0xc3efd9e5fbb085a8!8m2!3d45.5329897!4d-73.6271729'),
('aedf248d-a10a-4a5a-a55f-3a800c428db5', 'Parc Lafontaine', '3819', 'Avenue Calixa-Lavallée', 'H2L 3A7', 'Montreal', 'Canada', 'Cours de tennis gratuit sur réservation', 'Lafontaine1.jpg', 'Lafontaine2.jpg', 'Lafontaine3.jpeg','https://www.google.com/maps/place/Parc+La+Fontaine/@45.5261636,-73.5714842,16.31z/data=!4m5!3m4!1s0x4cc91bc84bbfa227:0x45962228026ccc97!8m2!3d45.5270784!4d-73.5692815');

-- --------------------------------------------------------

--
-- Structure de la table `lieusport`
--

CREATE TABLE `lieusport` (
  `id_lieu` char(36) NOT NULL,
  `id_sport` varchar(36) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lieusport`
--

INSERT INTO `lieusport` (`id_lieu`, `id_sport`) VALUES
('942bf489-d040-4115-9c2a-1909fd7e11de', '0df302b1-ae4d-497e-8a43-4bc188f8a83a'),
('aedf248d-a10a-4a5a-a55f-3a800c428db5', '0df302b1-ae4d-497e-8a43-4bc188f8a83a'),
('942bf489-d040-4115-9c2a-1909fd7e11de', '64f50de6-759f-48dc-83db-299ebd8b0aab'),
('aedf248d-a10a-4a5a-a55f-3a800c428db5', '64f50de6-759f-48dc-83db-299ebd8b0aab');

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
  `photo` varchar(55) DEFAULT NULL,
  `statut` varchar(10) DEFAULT 'Actif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `membre`
--

INSERT INTO `membre` (`id`, `pseudo`, `sexe`, `nom`, `prenom`, `annee_naiss`, `courriel`, `date_inscription`, `type_membre`, `niveau`, `sport`, `mdp`,  `photo`, `statut`) VALUES
('29e405ab-2014-43e1-b01e-492d4dcc5ebd', 'Vivi', 'Femme', 'Champagne', 'Vivianne', 1975, 'vivi@al.ca', '2019-10-24 02:16:43', 'Admin', 'PROFESSIONNEL', 'Basketball', '1000:a94d672c3840a1bbc37cde84d0a8b77bb181453ec7772a3f:e81e26e647b1d27127e19b843709d313900c9e8cd7d39d3c', 'vivi.png', 'Actif'),
('8a1d34ce-cd0b-490f-a47a-b3e39fadddb5', 'Jack', 'Homme', 'Henri', 'Jacques', 1968, 'jack@al.ca', '2019-10-24 02:10:20', 'Entraineur', 'PROFESSIONNEL', 'Soccer', '1000:2b26ce3cac8e6f8be3f2060ea85f00b91828b3110a52a197:3d180a72d4d9b41ce3bbfd08d960f4688561b53d065090e7', 'jack.png', 'Actif'),
('940e6b1f-9190-453e-8c39-3e03bbbd36a9', 'Tom', 'Homme', 'Rogers', 'Thomas', 1995, 'tom@al.ca', '2019-10-24 02:01:36', 'Joueur', 'INTERMEDIAIRE', '', '1000:891fbed7bcb15322b590f3942c1153880080f91f6cb3908c:a75aac427ef2483815461479f2418e517c5bb47393b914c9', 'tom.png', 'Actif'),
('a407418a-7683-4abc-8193-f083d86ae9f6', 'Sar', 'Femme', 'Manning', 'Sarah', 1990, 'sar@al.ca', '2019-10-24 02:03:55', 'Entraineur', 'PROFESSIONNEL', 'Volley Ball', '1000:ea9f47d68e53c54912b4f275742419af166d24acef58182a:f1abe74a17599a97fab092f8352f97fb28e8d0d9a58eabac', 'sar.png', 'Actif'),
('adbbc2a0-3ec9-4baa-97e7-6b3b0b301aee', 'Bob', 'Homme', 'Malik', 'Robert', 1983, 'rob@al.ca', '2019-10-24 02:07:13', 'Joueur', 'DEBUTANT', 'Rugby', '1000:062bd4d1165b7222de29caec7ef631a78faaa5ffb4910a93:3f01bff75c12ef30ed2cd771813907b48cb230448862b54c', 'bob.png', 'Actif'),
('ebe2e2ec-0b79-4108-be69-f54b6654be50', 'Bill', 'Homme', 'Billion', 'James', 1984, 'bill@al.ca', '2019-10-24 02:02:45', 'Entraineur', 'PROFESSIONNEL', 'Hockey', '1000:af18c2facefef686d732c45d562a8f050a19971bf6a06260:475b8017d892615e4b990a9ad0b3fc719a7b6935fb588d5d', 'man.jpg', 'Actif'),
('fd6a948e-7f78-4c73-b54c-fe2e8085a6d5', 'Lili', 'Femme', 'Graham', 'Lilianne', 1975, 'lili@al.ca', '2019-10-24 02:04:33', 'Joueur', 'PROFESSIONNEL', '', '1000:c8a26d54c05a9b9bba9fa14f3e5ff283dfd37f02bd2bc267:d604d30fda2f510ba1f0cce7e4291f1a9bd036fe2c72b29d', 'lili.png', 'Actif');

-- --------------------------------------------------------

--
-- Structure de la table `participationequipe`
--

CREATE TABLE `participationequipe` (
  `id_joueur` char(36) NOT NULL,
  `nom_equipe` varchar(36) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `participationpartie`
--

CREATE TABLE `participationpartie` (
  `nom_equipe` varchar(36) NOT NULL,
  `id_partie` char(36) NOT NULL,
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
('0df302b1-ae4d-497e-8a43-4bc188f8a83a', 'Soccer', 22, 2, 'soccer.jpg'),
('48b957f8-1a7c-47a4-b8d3-770c91b32f21', 'Tennis', 4, 2, 'tennis.jpg'),
('64f50de6-759f-48dc-83db-299ebd8b0aab', 'Football', 18, 2, 'football.jpg'),
('db031a56-2a4f-485a-b463-7165df255302', 'Basketball', 22, 2, 'basket.jpg'),
('eade52d3-1ccc-49ef-8d86-34023d9f35a2', 'Water polo', 21, 2, 'waterpolo.jpg');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD PRIMARY KEY (`id_annonce`),
  ADD KEY `Annonce_FK_pseudo` (`id_createur`) USING BTREE,
  ADD KEY `AnnonceLieu_FK_lieu` (`id_lieu`) USING BTREE;

--
-- Index pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD PRIMARY KEY (`nom_equipe`),
  ADD KEY `Capitaine_FK_membre` (`id_capitaine`) USING BTREE,
  ADD KEY `id_sport_FK_sport` (`id_sport`) USING BTREE;

--
-- Index pour la table `invitation`
--
ALTER TABLE `invitation`
  ADD PRIMARY KEY (`id_expediteur`,`id_destinataire`,`id_requete`);

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD PRIMARY KEY (`id_lieu`),
  ADD KEY `Lieu_FK_codepost` (`code_postal`) USING BTREE,
  ADD KEY `Lieu_FK_id_lieu` (`id_lieu`) USING BTREE;

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
  ADD UNIQUE KEY `pseudo` (`pseudo`);

--
-- Index pour la table `participationequipe`
--
ALTER TABLE `participationequipe`
  ADD PRIMARY KEY (`id_joueur`,`nom_equipe`);

--
-- Index pour la table `participationpartie`
--
ALTER TABLE `participationpartie`
  ADD PRIMARY KEY (`nom_equipe`,`id_partie`);

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
-- Contraintes pour la table `partie`
--
ALTER TABLE `partie`
  ADD CONSTRAINT `Partie_FK_nom_equipe1` FOREIGN KEY (`equipe_1`) REFERENCES `equipe` (`nom_equipe`),
  ADD CONSTRAINT `Partie_FK_nom_equipe2` FOREIGN KEY (`equipe_2`) REFERENCES `equipe` (`nom_equipe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
