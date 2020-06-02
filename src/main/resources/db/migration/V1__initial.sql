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
	phoneNumber INTEGER
);
CREATE TABLE flat(
	id UUID PRIMARY KEY NOT NULL,
	country VARCHAR(255),
	city VARCHAR(255),
	neighborhood VARCHAR(255),
	price INTEGER,
	sqm INTEGER,
	numberOfRooms INTEGER,
	parking BOOLEAN,
	airConditions BOOLEAN,
	landlord_id UUID not null references landlord(id),
	flor INTEGER,
	numberOfFlors INTEGER,
	elevator BOOLEAN
);
CREATE TABLE house(
	id UUID PRIMARY KEY NOT NULL,
	country VARCHAR(255),
	city VARCHAR(255),
	neighborhood VARCHAR(255),
	price INTEGER,
	sqm INTEGER,
	numberOfRooms INTEGER,
	parking BOOLEAN,
	airConditions BOOLEAN,
	landlord_id UUID not null references landlord(id),
	numberOfFlors INTEGER,
	garden BOOLEAN,
	yard BOOLEAN
);

