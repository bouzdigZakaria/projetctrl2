# Gestion des candidatures en master

Ce projet permet de gérer les candidatures en master

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
