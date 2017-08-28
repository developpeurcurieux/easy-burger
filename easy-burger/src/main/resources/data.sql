use easyburger;

ALTER DATABASE easyburger charset=utf8;

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


INSERT INTO tva (taux_tva)
VALUES
(5.5),
(7.0),
(10.0);


INSERT INTO categorie(nom) 
VALUES
("entrees"),
("plats"),
("desserts"),
("boissons");

INSERT INTO sous_categorie(nom_sous_categorie, fk_categorie) 
VALUES 
("brick", "entrees"),
("salade", "entrees"),
("pain traditionnel", "entrees"),


("viandes", "plats"),
("poissons", "plats"),

("gateau", "desserts"), 
("glace", "desserts"), 

("boisson froide", "boissons"),
("boisson chaude", "boissons");


INSERT INTO produit(reference, nom, description, prixht, stock, fk_souscategorie)
VALUES
("2525REFS12", "Samosa", "Triangles de brick, une entrée agréable à deguster, entre equilibre et gout, faites vous plaisir entre trois Légumes, Viande et Chicken", 1, 20,  "brick"),
("2525REFS13", "Nan", "Pain traditionnel nature ou fromage, un accompagnement en douceur avec votre plat", 1, 25,  "brick");