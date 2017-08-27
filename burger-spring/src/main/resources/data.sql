

use easyresto;

ALTER DATABASE easyresto charset=utf8;

INSERT INTO poste(nom_poste)
VALUES
("Directeur"),
("Serveur"),
("Cuisinier"),
("Serveur-Caissier"),
("Chef de cuisine"),
("Plongeur"),
("Manager");

INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Zachary","Rooney",2297),("Abraham","Melodie",3213),("Cruz","Rashad",3935),("Dylan","Octavia",2443),("Bevis","Inga",3290),("Ishmael","Hayley",1181),("Clarke","Mallory",2279),("Alec","Casey",3758),("Moses","Russell",1651),("Alden","Kirsten",2933);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Francis","Jordan",2665),("Caldwell","Charissa",1582),("Amery","Selma",2536),("Stone","Ina",3287),("Xanthus","Olivia",1678),("Steven","Ginger",3728),("Caleb","Kiona",1763),("Malcolm","Hamish",2033),("Chase","Alexandra",1970),("Christopher","Sara",3249);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Oscar","Jenna",2697),("Matthew","Mary",1906),("Cole","Kirby",3145),("Zachary","Zahir",2631),("Hamilton","Jackson",1316),("Dante","Keefe",1907),("Bradley","Isadora",2676),("Xenos","Orla",2603),("Silas","Mark",1848),("Xander","Xerxes",1254);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Ross","Shannon",2361),("Ulric","Preston",1183),("Alexander","Mariam",3134),("Paul","Lavinia",2195),("Talon","Maxwell",3728),("Deacon","Amir",1076),("Orlando","Katelyn",1963),("Lucas","Finn",1854),("Hilel","Signe",3271),("Anthony","Risa",2816);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Calvin","Sean",1882),("Colt","Emi",3858),("Malik","Marcia",2579),("Howard","Zorita",2840),("Guy","Fletcher",1486),("Sawyer","Quail",3746),("Stewart","Uriah",2550),("Colton","Nelle",2199),("Scott","Quamar",3623),("Otto","Garrett",2474);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Aristotle","Hilel",2043),("Jason","Hadassah",2035),("Declan","Eliana",1905),("Hunter","Astra",1654),("Keaton","Shaeleigh",3334),("Caleb","Drew",3096),("Kermit","Stephanie",1270),("Graiden","Keefe",1514),("Hop","Sasha",2798),("Damian","Rhoda",3133);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Merritt","Francesca",2253),("Hu","Ivan",2761),("Sebastian","Halla",3032),("Omar","Doris",2041),("Len","Halla",1194),("Edan","Mara",1419),("Randall","Carissa",2431),("Daniel","Alma",2181),("Jeremy","Amy",2190),("Amos","Jin",3628);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Alec","Dominique",1220),("Graiden","Tarik",3510),("Carl","Megan",3517),("Cyrus","Cruz",3296),("Tanek","Melodie",3352),("Emerson","Whitney",3772),("Lamar","Jeremy",2184),("Fulton","Sebastian",2730),("Hamilton","Hyacinth",3629),("Gil","Abel",1205);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Reuben","Luke",3893),("Todd","Craig",2080),("Jason","Callum",2978),("Ignatius","Mariam",1000),("August","Samantha",2038),("Allistair","Lacy",3227),("Simon","Hedley",3952),("Reece","Odette",2464),("Seth","Wanda",1048),("Elijah","Price",1008);
INSERT INTO `employe` (`nom`,`prenom`,`mdp`) VALUES ("Dolan","Emily",2085),("Hayes","Carly",2168),("Fritz","Ethan",2978),("Hedley","Kasimir",2155),("Rooney","Nelle",1128),("Camden","Victor",1097),("Rogan","Raya",1170),("Dorian","Suki",3962),("Anthony","Cole",1626),("Bert","Cole",1879);


INSERT INTO emp_poste(employes_id_employe, postes_nom_poste)
VALUES
(1, "serveur"),
(2, "serveur"),
(3, "serveur"),
(4, "serveur"),
(5, "serveur"),
(6, "serveur"),
(7, "serveur"),
(8, "serveur"),
(9, "Serveur-Caissier"),
(10, "Serveur-Caissier"),
(11, "Serveur-Caissier"),
(12, "Cuisinier"),
(13, "Cuisinier"),
(14, "Cuisinier"),
(15, "Cuisinier"),
(16, "Cuisinier"),
(17, "Manager"),
(18, "Manager"),
(19, "Chef de cuisine"),
(20, "Directeur");


INSERT INTO tva (taux)
VALUES
(5.5),
(7.0),
(10.0);


INSERT INTO categorie(id_categorie) 
VALUES
("entrees"),
("plats"),
("desserts"),
("boissons");

INSERT INTO sous_categorie(id_sous_categorie, fk_categorie) 
VALUES 
("soupe", "entrees"),
("salade", "entrees"),
("taboulé", "entrees"),

("pates", "plats"),
("viandes", "plats"),
("poissons", "plats"),
("vegetarien", "plats"),

("gateau", "desserts"), 
("glace", "desserts"), 
("flan", "desserts"), 

("boisson froide", "boissons"),
("boisson chaude", "boissons");

INSERT INTO produit(reference, nom, description, prixht, stock, fk_souscategorie)
VALUES
("2525REFS12", "Le sambar", "Cette soupe de lentilles corail est un peu ce qu’est la soupe à l’oignon dans les bistrots parisiens, un incontournable du sud de l’Inde, plus précisément de l’état du Kerala ! Cela va sans dire, elle est épicée, comme à peu près tout ce que l’on peut manger là-bas. Et si vous voulez vraiment vous mettre aux couleurs locales, sachez qu’elle se déguste traditionnellement avec des galettes de farine de pois chiches ou de lentilles noires, les dosas.", 5, 12.5,  "soupe"),
("2525REFS13", "La soupe Phô", "Première mise au point : cette soupe s’écrit  Phô  mais se dit  feu , donc ne vous ridiculisez pas quand vous irez au Viet’ du coin, vous ne vous en remettrez pas. Puis ne vous attendez pas à un petit potage façon, ici on vous apportera un immense bol que vous devrez finir parce que c’est pas beau de gaspiller. À l’intérieur, des lamelles de boeuf épicé, de longues nouilles de riz impossibles à attraper avec les baguettes, et de la coriandre, du basilic thaï ou de la menthe. Un délice.", 7, 10.5, "soupe"),
("2525REFS14", "Le gaspacho", "Quand on pense soupe, en pense souvent à feu de cheminée et petites mimines qui se réchauffent sur les rebords du bol. Oubliez tout ça. Le gaspacho est une soupe certes, mais qui se consomme froide, voire glacée en été. Originaire d’Andalousie, elle est préparée avec de la mie de pain, du jus de légumes, de l’huile d’olive et un peu d’ail. Elle ne donne pas très bonne haleine donc, mais est bourrée de vitamines et fait un parfait allié détox. Alors on l’aime…", 10, 13, "soupe"),
--salade
("2525REFS15", "Salade du Chef", "Salade verte, tomates, concombres, olives, maïs, oeufs durs, pommes de terre", 25, 9, "salade"),
("2525REFS16", "Salade poulet tikka", "Salade verte, carottes rapées, tomates, concombre, olives, maïs, citron", 7, 5.80, "salade"),
("2525REFS17", "Salade César de Luxe", "Salade romaine, poulet émince pané, croûtons, tomates cerises et vinaigrette au miel", 16, 11.5, "salade"),
        --taboulé
("2525REFS18", "Taboulé à l'agneau", "Dans cette fameuse recette du Moyen-Orient, le boulgour est mélangé à des légumes très frais, des herbes aromatiques et une sauce citronnette légèrement", 14, 9.60, "taboulé"),
("2525REFS19", "Taboulé oriental", "Le taboulé oriental, une salade de semoule de couscous facile et rapide. Une recette maison à la menthe avec raisins secs et pois chiches", 9, 8.50, "taboulé"),
("2525REFS20", "Taoulé aux crevettes", "Un taboulé original, très coloré et parfumé : des crevettes roses, des poivrons croquants, des petits pois fondants, des tomates juteuses et une douce sauce", 36, 6.5, "taboulé"),
        


  --pates
        ("2525REFS21", "Pâte large bolognaise", "Steak pur boeuf français, sauce tomate, oignons, pesto, fromage au choix", 50, 11.5, "pates"),
        ("2525REFS22", "Pâte large pollo alla crema", "Poulet, crème fraîche, champignons, fromage au choix", 15, 14.5, "pates"),
        ("2525REFS23", "Pâte large crazy", "Bleu, emmental, mozzarella, cheddar, raclette, crème fraîche, fromage au choix", 5, 12.5, "pates"),
      
        --Viandes
        ("2525REFS24", "Butter chicken", "Curry filet de poulet grillé au tandoor, crème fraîche, beurre, noix de cajou, raisins secs et diverses épices.", 6, 15.5, "viandes"),
        ("2525REFS25", "Agneau tikka massala", "Curry d'agneau désossé grillé au tandoor, crème fraîche, noix de cajou, raisins secs et diverses épices.", 4, 14.5, "viandes"),
        ("2525REFS26", "Agneau maison", "Curry d'agneau désossé aux noix de cajou, raisins secs, coco, légumes, lentilles, oeuf durs et diverses épices.", 2, 9.5, "viandes"),
      
        --Pizza
        ("2525REFS27", "Pizza Georges Clooney", "30 cm Base crème fraîche, emmental, mozzarella, cheddar, coulommiers, raclette, chèvre, bleu", 5, 17.5, "poissons"),
        ("2525REFS28", "Pizza burger", "30 cm Ketchup, mozzarella, steak pur boeuf français, cheddar, tomates, oignons",  5, 17.5, "poissons"),
        ("2525REFS29", "Pizza barbecue", "30 cm Sauce barbecue, mozzarella, steak pur boeuf français, lardons aux champignons et fondue de poireaux, oignons frais", 7, 10.5, "poissons"),
    
        --Crepes
        ("2525REFS30", "Crêpe salée incontournable", "Chèvre, miel, emmental, noix", 3, 14.5, "vegetarien"),
        ("2525REFS31", "Crêpe salée indienne", "Poulet, curry, tomates, emmental", 6, 14.5, "vegetarien"),
        ("2525REFS32", "Crêpe elias time", "Poulet, champignons, oignons, poivrons, emmental", 12, 7.5, "vegetarien"),
        
-- Desserts --
--gateau
        ("2525REFS33", "Gâteau au chocolat facile", "Gâteau au chocolat facile", 3, 5.2, "gateau"),
        ("2525REFS34", "Gâteau au yaourt", "Gâteau au yaourt", 6, 11, "gateau"),
        ("2525REFS35", "Gâteau 3 chocolats", "Gâteau 3 chocolats", 12, 7.5, "gateau"),
        --glace
        ("2525REFS36", "Sorbet citron Thermomix", "Sorbet citron Thermomix", 3, 4.5, "glace"),
        ("2525REFS37", "Glace Nutella Thermomix", "Glace Nutella Thermomix", 6, 6.5, "glace"),
        ("2525REFS38", "Glace italienne aux fruits Thermomix", "Glace italienne aux fruits Thermomix", 12, 7.5, "glace"),
        --flan
        ("2525REFS39", "Pastizzu ou flan corse à la semoule", "Pastizzu ou flan corse à la semoule", 3, 7.5, "flan"),
        ("2525REFS40", "Flan coco", "Flan coco", 6, 5.50, "flan"),
        ("2525REFS41", "Flan vanille chocolat", "Flan vanille chocolat", 2, 7.5, "flan"),
        
        -- boissons
        ("2525REFS42", "Coca Cola", "Coca Cola", 13, 2.50, "boisson froide"),
        ("2525REFS43", "Fanta", "Fanta", 6, 2.50, "boisson froide"),
        ("2525REFS44", "Jus de fruits", "Jus de fruits", 2, 3.5, "boisson froide"),
        
        ("2525REFS45", "Expresso", "Expresso", 3, 1.5, "boisson chaude"),
        ("2525REFS46", "Café créme", "Café créme", 6, 3.50, "boisson chaude"),
        ("2525REFS47", "Chocolat chaud", "Chocolat chaud", 2, 3.50, "boisson chaude");
      