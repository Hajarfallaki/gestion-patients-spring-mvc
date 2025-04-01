# Gestion des Patients - Spring MVC

Ce projet est une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients,utilisée pour gérer les informations des patients dans un établissement de santé.
  L'application doit permettre les fonctionnalités suivantes :
  
- **Afficher les patients**
- **Faire la pagination**
- **Chercher les patients**
- **Supprimer un patient**

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

## Partie 1:
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




## Partie 2:

**1. Interface Utilisateur:**

- Menu de navigation noir en haut avec liens "Home" et "Patients"

- Affichage du nom d'utilisateur connecté

- Tableau listant tous les patients avec leurs informations

**2. Gestion des Patients:**

- Affichage des données patients (ID, Nom, Date, Statut Malade, Score)

- Bouton "Edit" pour chaque patient permettant la modification

- Système de pagination complet (53 pages dans l'exemple)

**3. Recherche:**

Champ de recherche par mot-clé (keyword)


![Capture d'écran 2025-04-01 184950](https://github.com/user-attachments/assets/b56409fa-104b-4cca-b8ea-987941598c26)


## Mode d'Utilisation

1. **Ajouter un patient** :
   - Cliquer sur le bouton "Nouveau Patient"
   - Remplir les détails du patient
   - Soumettre le formulaire

2. **Rechercher des patients** :
   - Entrer un mot-clé dans le champ de recherche
   - Cliquer sur le bouton "Chercher"
   - Consulter les résultats filtrés

3. **Voir tous les patients** :
   - Laisser le champ de recherche vide
   - Cliquer sur "Chercher" pour voir la liste complète
  
     ![Capture d'écran 2025-04-01 184956](https://github.com/user-attachments/assets/dc3d9a80-839a-439a-a1a8-845385686988)
