# Gestion des candidatures en master

Ce projet permet de gérer les candidatures en master

## Contexte

La gestion des candidatures en Master au sein d’une institution académique requiert un outil performant pour assurer le suivi et le traitement des demandes d’admission. Une solution centralisée permettra de regrouper toutes les informations concernant les masters, les candidats et leurs dossiers, optimisant ainsi le processus de sélection. Grâce à cet outil, l’administration pourra gérer plus efficacement les inscriptions, trier les candidatures par filière et faciliter l’évaluation des dossiers.

## Problématique

Actuellement, la gestion des masters est réalisée de manière peu centralisée, avec des processus manuels et des outils non intégrés. Cela engendre des difficultés dans le suivi des candidatures, la coordination entre les départements et la production de statistiques précises. Les informations sont souvent dispersées, ce qui ralentit la prise de décision et complique la communication entre les différents acteurs impliqués dans le processus. Une solution plus structurée et automatisée est nécessaire pour améliorer l'efficacité et la transparence de la gestion des masters.

## Objectifs

•Centraliser les informations : Regrouper toutes les données relatives aux masters, aux candidats et aux responsables pédagogiques dans une base de données unique et accessible.

•Faciliter la gestion : Proposer une interface intuitive pour la création, la modification et la suppression des masters, ainsi que la gestion des candidatures.

•Améliorer le suivi : Permettre aux responsables de suivre l'état des candidatures et de générer des rapports détaillés sur les inscriptions et les places disponibles.

•Optimiser la recherche : Offrir des fonctionnalités de recherche et de filtrage avancées pour accéder rapidement aux informations sur les masters, les candidats et les statuts des candidatures.

## Fonctionnalités

• Ajouter un master 
• Enregistrer une candidature 
• Filtrer les candidatures par filière 
• Rechercher un candidat par nom

## Base de données

### Schéma relationnel

• Master (id, intitule, filiere, places_disponibles)
• Candidat (id, nom, prénom, diplôme, mention)
• Candidature (id, master_id, candidat_id, statut)

### Tables SQL

```sql
-- Table: Compétition
CREATE TABLE Master (
    id INT PRIMARY KEY AUTO_INCREMENT,
    intitule VARCHAR(255) NOT NULL,
    filiere VARCHAR(255) NOT NULL,
    places_disponibles INT NOT NULL
);

-- Table: admin
CREATE TABLE admin (
 id INT PRIMARY KEY AUTO_INCREMENT,
 username varchar(255) NOT NULL,
 password varchar(255) NOT NULL
);

-- Table: condidats
CREATE TABLE condidats (
 id INT PRIMARY KEY AUTO_INCREMENT,
 code varchar(50) NOT NULL,
 nom varchar(100) NOT NULL,
 prenom varchar(100) NOT NULL,
 diplome varchar(100) NOT NULL,
 mention enum('PASSABLE','ASSEZ_BIEN','BIEN','TRES_BIEN','EXCELLENT') NOT NULL
);

-- Table: condidatures
CREATE TABLE condidatures (
master_id INT NOT NULL,
condidats_id INT NOT NULL,
date date NOT NULL,
note text DEFAULT NULL,
status enum('PENDING','WAITING','SELECTED','REJECTED') NOT NULL DEFAULT 'PENDING',
PRIMARY KEY(master_id, condidats_id),
FOREIGN KEY (master_id) REFERENCES master(id),
FOREIGN KEY (condidats_id) REFERENCES condidats(id),
);
