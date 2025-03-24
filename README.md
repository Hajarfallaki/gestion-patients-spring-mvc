# Gestion des Patients - Spring MVC

Ce projet est une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients,utilisée pour gérer les informations des patients dans un établissement de santé.
  L'application doit permettre les fonctionnalités suivantes :
Afficher les patients
Faire la pagination
Chercher les patients
Supprimer un patient
Faire des améliorations supplémentaires.

## Prérequis

Avant de pouvoir exécuter ce projet, vous devez vous assurer d'avoir installé les éléments suivants sur votre machine :

- **JDK 11 ou supérieur**
- **Maven** pour la gestion des dépendances
- **MySQL** (si vous utilisez une base de données MySQL)
- **IDE** comme [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/)
- **Serveur d'application** comme [Apache Tomcat](http://tomcat.apache.org/)

## Configuration

1. Clonez ce projet dans votre répertoire local :

   ```bash
   git clone https://github.com/VotreNomUtilisateur/gestion-patients-spring-mvc.git

## Captures d'écran

### Connexion à la base de données H2

![Capture d'écran 2025-03-22 231409](https://github.com/user-attachments/assets/48dacaed-ea9a-4be1-bbf0-194ea9892668)

Cette capture d'écran montre l'interface de connexion à la base de données H2 embarquée, utilisée pour le développement et les tests.

### Affichage des données des patients

![Capture d'écran 2025-03-22 231612](https://github.com/user-attachments/assets/80ef3fe3-3dc1-4c1b-95c4-83624c0e036b)

Cette capture d'écran affiche les résultats d'une requête SQL sur la table `patient`, illustrant la gestion des données des patients.

### Exécution d'une requête SQL

![Capture d'écran 2025-03-23 155138](https://github.com/user-attachments/assets/3fea71b6-02ca-4b66-8a5a-bc9b8e44c59a)

Cette capture d'écran montre l'exécution d'une requête SQL dans l'interface H2, avec les détails des patients récupérés depuis la base de données.

### Liste des patients
![image](https://github.com/user-attachments/assets/ed5fb387-67a5-4811-84e0-e3541368c3e8)
Cette capture d'écran montre une liste de patients extraite de la base de données. Le tableau affiche des informations telles que l'**ID**, le **nom**, la **date**, le **statut de maladie**, et le **score** de chaque patient. Une pagination en bas permet de naviguer entre les pages de résultats.
