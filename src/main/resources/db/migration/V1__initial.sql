CREATE TABLE tenant(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	email VARCHAR(255),
	password VARCHAR(255)
);
CREATE TABLE landlord(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	email VARCHAR(255),
	password VARCHAR(255),
	phone_number INTEGER
);
CREATE TABLE flat(
	id UUID PRIMARY KEY NOT NULL,
	country VARCHAR(255),
	city VARCHAR(255),
	neighborhood VARCHAR(255),
	price INTEGER,
	sqm INTEGER,
	number_of_rooms INTEGER,
	parking BOOLEAN,
	air_conditions BOOLEAN,
	landlord_id UUID not null references landlord(id),
	flor INTEGER,
	number_of_flors INTEGER,
	elevator BOOLEAN
);
CREATE TABLE house(
	id UUID PRIMARY KEY NOT NULL,
	country VARCHAR(255),
	city VARCHAR(255),
	neighborhood VARCHAR(255),
	price INTEGER,
	sqm INTEGER,
	number_of_rooms INTEGER,
	parking BOOLEAN,
	air_conditions BOOLEAN,
	landlord_id UUID not null references landlord(id),
	number_of_flors INTEGER,
	garden BOOLEAN,
	yard BOOLEAN
);

