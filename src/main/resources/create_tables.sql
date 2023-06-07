create table address (
    addressId serial primary key,
    streetNumber varchar(30) not null,
    apartmentNumber varchar(10),
    roadName varchar(150) not null,
    cityName varchar(150),
    zipCode varchar(15) not null,
    stateName varchar(100) not null
);

create table customer (
    customerId serial primary key,
    firstName varchar(150) not null,
    lastName varchar(150) not null,
    username varchar(150) unique and not null,
    password varchar(1024) not null,
    email varchar(150) not null,
    phone varchar(15),
    addressId integer not null references address (addressId),
    streetNumber varchar(30) not null,
    apartmentNumber varchar(30)
);

create table product (
    productId serial primary key,
    itemNumber varchar(50) not null,
    itemName varchar(100) not null,
    itemShortDesc varchar(150),
    itemFullDesc varchar(1000) not null,
    itemCost integer not null,
    itemPic bytea null
);

create table order (
    customerId integer not null references customer (customerId),
    productId integer not null references product (productId),
    timestampWhenPlaced timestamp not null default current_timestamp
);

create table customer_addresses (
    customerId integer not null references customer (customerId),
    addressId integer not null references address (addressId)
);
