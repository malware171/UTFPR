------------------------------------------------------------------------
INSERÇÃO DE REGISTROS

CREATE TABLE cliente {
    "id_cliente" INT PRIMARY KEY AUTO_INCREMENT,
    "nome" VARCHAR(45) NOT NULL,
    "endereco" VARCHAR(45) NULL,
    "id_cidade" INT NULL,
    "telefone" VARCHAR(11) NULL,
};

MODELO 1
INSERT INTO 'cliente', 'nome', 'endereco', 'telefone';
VALUES NULL, 'Henrique', 'Rua dos Imigrantes', '42998247591';

MODELO 2 
INSERT INTO cliente VALUES(NULL, 'Migel Borja', 'Rua João, 40', '6',);

------------------------------------------------------------------------

ALTERAÇÃO DE REGISTROS

CREATE TABLE cliente {
    "id_cliente" INT PRIMARY KEY AUTO_INCREMENT,
    "nome" VARCHAR(45) NOT NULL,
    "endereco" VARCHAR(45) NULL,
    "id_cidade" INT NULL,
    "telefone" VARCHAR(11) NULL,
};

UPDATE 'cliente' SET 'endereco' = 'Rua tiradentes, 56',
'telefone' = '4296657413',


