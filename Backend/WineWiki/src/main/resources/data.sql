INSERT INTO manufacturer(name,country) VALUES
('Valpolicella region of Veneto', 'Italy'),
('Tokaj region', 'Hungary'),
('Antinori', 'Italy'),
('Various wineries in Germany and Alsace', 'Germany'),
('Various Argentine wineries', 'Argentina'),
('Various wineries in France and around the world', 'France'),
('Various wineries in Tuscany', 'Italy'),
('Château d''Yquem', 'France'),
('Various wineries in the Chianti region of Tuscany', 'Italy'),
('Various wineries in the Rhône Valley', 'France'),
('Various wineries in Austria', 'Austria'),
('Various wineries in the Northern Rhône', 'France'),
('Various wineries in the Abruzzo region', 'Italy'),
('Various wineries in South Africa', 'South Africa'),
('Various wineries in the Burgundy region', 'France');


INSERT INTO wine(name, quantity, price, URL, manufacturer_id, description) VALUES
('Amarone della Valpolicella',1025, 85.00,'https://images.ctfassets.net/6jpeaipefazr/1CVNQzcDoA2EAcGQkKkcSS/1ea6c30515972dded5f890356d1eda8e/villa-annaberta-amarone-della-valpolicella-761359.png?fm=avif&q=65&w=400&h=400&fit=pad',1,'Amarone is a rich, full-bodied red wine made from dried grapes. It typically has flavors of dark fruits, chocolate, and sometimes a hint of tobacco.'),
('Tokaji Aszú',55,175.00,'https://shop.grofdegenfeld.com/cdn/shop/products/6paszu2017.png?v=1649680609',2,'Tokaji Aszú is a sweet white wine known for its unique production method, which involves using botrytized ("noble rot") grapes. It has flavors of honey, apricot, and citrus.'),
('Tignanello',642,55.00,'https://images.vivino.com/thumbs/LtqnB-H2QFmN6ixL3FQcdw_pb_600x600.png',3,'Tignanello is a renowned Super Tuscan wine produced in Tuscany, Italy. It''s a blend of Sangiovese, Cabernet Sauvignon, and Cabernet Franc grapes, known for its depth and complexity.'),
('Gewürztraminer',333,63.00,'https://www.roner.com/sw-media/30/21/f0/1671708172/ritterhof-gewuerztraminer.png',4,'Gewürztraminer is a white wine known for its aromatic and spicy characteristics, often with notes of lychee, rose petals, and exotic spices.'),
('Malbec Reserva',101022,145.00,'https://www.terrazasdelosandes.com/sites/default/files/styles/wine_thumbnail/public/node/wine/field_bottle/TDA-Reserva-malbec_Pack-Shoot-sin-anada_12.png.webp?itok=qBGeLNul',5,'Malbec Reserva wines are typically made from the Malbec grape variety. They are known for their deep color, dark fruit flavors, and velvety texture.'),
('Viognier',101,500.00,'https://degrendel.co.za/cdn/shop/products/Viognier.png?v=1656496289',6,'Viognier is a white wine known for its floral and fruity aromas, often with notes of peach, apricot, and honeysuckle.'),
('Brunello di Montalcino',5431,64.00,'https://shop.leonardodavinci.it/pub/media/catalog/product/cache/6c18c24b9cf46034c1bd785e77b2771b/b/r/brunello_di_montalcino.png',7,'Brunello di Montalcino is a red wine made from 100% Sangiovese grapes. It is known for its robust structure, complex flavors, and aging potential.'),
('Château d Yquem',625,35.00,'https://static.millesima.com/s3/attachements/h531px/1082_2018_c.png',8,'Château d Yquem is a renowned French sweet wine from the Sauternes region. It is known for its exceptional quality, richness, and sweetness.'),
('Chianti Classico',25,200.00,'https://www.totalwine.com/dynamic/490x/media/sys_master/twmmedia/h30/h7c/17158589186078.png',9,'Chianti Classico is a red wine known for its medium body, bright acidity, and flavors of cherry, plum, and spice.'),
('Côtes du Rhône',555,25.00,'https://rogcowines.com/wp-content/uploads/2022/11/GetImage_clipped_rev_1.png',10,'Côtes du Rhône wines are known for their versatility, offering both red and white varieties with rich flavors and a good balance between fruit and spice.'),
('Grüner Veltliner',25625,55.00,'https://www.thewinearcade.co.uk/wp-content/uploads/2021/07/stift-klosterneuburg-gruner-veltliner.png',11,'Grüner Veltliner is a white wine known for its crisp acidity, citrus flavors, and peppery finish, often with notes of white pepper and green apple.'),
('Hermitage',821,100.00,'https://www.vins-prives.com/969/hermitage-rouge-2012.jpg',12,'Hermitage is a full-bodied red wine made from Syrah grapes. It is known for its powerful structure, dark fruit flavors, and hints of earth and spice.'),
('Montepulciano d Abruzzo',7562,75.00,'https://www.ninetypluscellars.com/cdn/shop/products/lot188-montepulciano_bf968439-86d8-46f4-8eab-2007be921a00_200x.png?v=1638212087',13,'Montepulciano d Abruzzo is a red wine with rich flavors of dark berries, chocolate, and spice, known for its approachability and food-friendly character.'),
('Pinotage',1201,63.00,'https://www.landskroonwines.com/wp-content/uploads/2021/03/Landskroon_Pinotage.png',14,'Pinotage is a red wine known for its smoky and earthy flavors, often with notes of red fruit, and is considered a signature grape of South Africa.'),
('Pouilly-Fuissé',64,15.00,'https://www.domaineseve.com/wp-content/uploads/2020/07/pouilly-fuisse-vieilles-vignes-2022-1.png',15,'Pouilly-Fuissé is a white wine known for its richness and buttery texture, often with flavors of ripe fruit and a touch of minerality.');