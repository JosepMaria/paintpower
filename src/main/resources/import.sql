/*Poblar taules*/
INSERT INTO clients (id, nom, cognoms, email, tipus, create_at) VALUES (1, 'Josep Maria', 'Mirada Donisa', 'jmmd.varis@gmail.com', 'particular', '2018-04-10');
INSERT INTO clients (id, nom, cognoms, email, tipus, create_at) VALUES (2, 'Jose Antonio', 'Alarcón Garcia', 'ja.alarcon@gmail.com', 'professional', '2018-04-10');


INSERT INTO pintures(id, descripcio, descripcio_detall, imatge, imatge_detall, marca, nom, preu, tipus) VALUES (1, 'Gilmacril Elite es una pintura plástica mate acrílica 100% de máxima calidad en cubrición, blancura, rendimiento y lavabilidad. Su blanco radiante, aumenta la luminisidad a la superficie, creando ambientes más grandes y acabados perfecto de tactos muy suaves.', 'a', LOAD_FILE('/home/josepmaria/Desenvolupament/EclipseWorkspace/paintpower/src/main/resources/static/images/gilmapin/G101.jpg'), LOAD_FILE('/home/josepmaria/Desenvolupament/EclipseWorkspace/paintpower/src/main/resources/static/images/gilmapin/G101.jpg'), 'Gilmapin', 'Gilmapin Elite Antimoho', '12.95', 'Pintura plástica mate');
INSERT INTO pintures(id, descripcio, descripcio_detall, imatge, imatge_detall, marca, nom, preu, tipus) VALUES (2, 'Gilmaplas mate extra plus es un pintura plástica mate lavable, con protección del moho y verdín que proporciona a la superficie acabados de gran calidad por su suavidad al tacto, blanco luminoso y gran cubrición, aportando agradable aroma a su aplicación y en posteriores días.', 'a', LOAD_FILE('/home/josepmaria/Desenvolupament/EclipseWorkspace/paintpower/src/main/resources/static/images/gilmapin/G102.jpg'), LOAD_FILE('/home/josepmaria/Desenvolupament/EclipseWorkspace/paintpower/src/main/resources/static/images/gilmapin/G102.jpg'), 'Gilmapin', 'Gilmaplas Mate Extra Plus Aroma', '12.95', 'Pintura plástica mate');
