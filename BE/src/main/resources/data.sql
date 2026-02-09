-- 1. Insert Countries (Adding to the previous list)
INSERT INTO country (id, name, iso_code) VALUES (7, 'India', 'IN');
INSERT INTO country (id, name, iso_code) VALUES (8, 'Luxembourg', 'LU');

-- 2. Insert Cities (linked by country_id)

-- India (ID: 7)
INSERT INTO city (name, population, country_id) VALUES ('Mumbai', 12442000, 7);
INSERT INTO city (name, population, country_id) VALUES ('Delhi', 11034000, 7);
INSERT INTO city (name, population, country_id) VALUES ('Bangalore', 8443000, 7);
INSERT INTO city (name, population, country_id) VALUES ('Hyderabad', 6731000, 7);
INSERT INTO city (name, population, country_id) VALUES ('Chennai', 4646000, 7);

-- Luxembourg (ID: 8)
INSERT INTO city (name, population, country_id) VALUES ('Luxembourg City', 132000, 8);
INSERT INTO city (name, population, country_id) VALUES ('Esch-sur-Alzette', 36000, 8);
INSERT INTO city (name, population, country_id) VALUES ('Differdange', 28000, 8);
INSERT INTO city (name, population, country_id) VALUES ('Dudelange', 21000, 8);



-- 1. Insert Countries
INSERT INTO country (id, name, iso_code) VALUES (1, 'United States', 'US');
INSERT INTO country (id, name, iso_code) VALUES (2, 'France', 'FR');
INSERT INTO country (id, name, iso_code) VALUES (3, 'Japan', 'JP');
INSERT INTO country (id, name, iso_code) VALUES (4, 'Brazil', 'BR');
INSERT INTO country (id, name, iso_code) VALUES (5, 'Germany', 'DE');
INSERT INTO country (id, name, iso_code) VALUES (6, 'Canada', 'CA');

-- 2. Insert Cities (linked by country_id)
-- USA (ID: 1)
INSERT INTO city (name, population, country_id) VALUES ('New York City', 8336000, 1);
INSERT INTO city (name, population, country_id) VALUES ('Los Angeles', 3822000, 1);
INSERT INTO city (name, population, country_id) VALUES ('Chicago', 2665000, 1);

-- France (ID: 2)
INSERT INTO city (name, population, country_id) VALUES ('Paris', 2161000, 2);
INSERT INTO city (name, population, country_id) VALUES ('Marseille', 861000, 2);
INSERT INTO city (name, population, country_id) VALUES ('Lyon', 513000, 2);

-- Japan (ID: 3)
INSERT INTO city (name, population, country_id) VALUES ('Tokyo', 13960000, 3);
INSERT INTO city (name, population, country_id) VALUES ('Osaka', 2750000, 3);
INSERT INTO city (name, population, country_id) VALUES ('Kyoto', 1475000, 3);

-- Brazil (ID: 4)
INSERT INTO city (name, population, country_id) VALUES ('São Paulo', 12330000, 4);
INSERT INTO city (name, population, country_id) VALUES ('Rio de Janeiro', 6748000, 4);

-- Germany (ID: 5)
INSERT INTO city (name, population, country_id) VALUES ('Berlin', 3645000, 5);
INSERT INTO city (name, population, country_id) VALUES ('Munich', 1472000, 5);
INSERT INTO city (name, population, country_id) VALUES ('Hamburg', 1841000, 5);

-- Canada (ID: 6)
INSERT INTO city (name, population, country_id) VALUES ('Toronto', 2731000, 6);
INSERT INTO city (name, population, country_id) VALUES ('Vancouver', 675000, 6);
INSERT INTO city (name, population, country_id) VALUES ('Montreal', 1704000, 6);