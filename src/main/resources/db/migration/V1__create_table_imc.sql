create table imc(
    id bigint not null AUTO_INCREMENT,
    nome varchar(50) not null,
    peso decimal(3,1) not null,
    altura decimal(3,1) not null,
    imc decimal(3,1) not null,
    primary key(id)
);