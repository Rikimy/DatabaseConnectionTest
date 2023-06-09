- TP JDBC

  Nous utiliserons une base de données H2 : Java in-memory SQL database

    - install / config
        - Télécharger jar H2
            - http://www.h2database.com/html/download.html
            - Binary JAR
        - Ajouter H2 à un projet IntelliJ
            1. Cliquez sur le menu "File" et sélectionnez "Project Structure".
            2. Dans la fenêtre "Project Structure", sélectionnez "Libraries" dans le panneau de gauche.
            3. Cliquez sur le bouton "+" en haut de la fenêtre pour ajouter une nouvelle bibliothèque.
            4. Sélectionnez "From Java" dans le menu déroulant.
            5. Sélectionnez le jar
            6. Cliquez sur le bouton "OK" pour ajouter la bibliothèque à votre projet
        - Ajouter H2 à un projet Eclipse
            1. Dans Eclipse, faites un clic droit sur le projet dans le "Package Explorer" et sélectionnez "Properties"
            2. Dans la fenêtre "Properties", sélectionnez "Java Build Path" dans le panneau de gauche.
            3. Cliquez sur l'onglet "Libraries" dans le panneau central.
            4. Cliquez sur le bouton "Add External JARs"
            5. Parcourez les fichiers jusqu'à ce que vous trouviez le fichier jar que vous voulez ajouter et cliquez sur "OK".
            6. Le fichier jar sera maintenant ajouté à votre projet. Cliquez sur "OK" pour fermer la fenêtre "Properties".
            7. Eventuellement ajouter dans le fichier [module-info.java](http://module-info.java) la ligne : `requires java.sql`

               Utiliser le menu de résolution des problèmes, c'est plus simple pour mettre à jour ce fichier