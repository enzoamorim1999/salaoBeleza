CREATE TABLE usuarios ( 
id int NOT NULL Primary key AUTO_INCREMENT,
 nome VARCHAR(30) NOT NULL,
 cpf int(11) NOT NULL,
 telefone int(11),
 cidade VARCHAR(20),
 estado varchar(2) );
 
 CREATE TABLE servicos ( 
 id int NOT NULL Primary key AUTO_INCREMENT,
 nome VARCHAR(30) NOT NULL,
 tipoServico VARCHAR(30) NOT NULL
 );
 
 CREATE TABLE agendamento ( 
 id int NOT NULL Primary key AUTO_INCREMENT,
 nome VARCHAR(30) NOT NULL,
 servico varchar(15) not null,
 horario VARCHAR(5) NOT NULL,
 data varchar(8) not null
 );
 
use salaoservico
INSERT INTO `servicos`(`nome`,`preco`) VALUES ('teste'10)

INSERT INTO `usuarios`(`nome`,`cpf`,`telefone`,`cidade`,`estado`)VALUES('enzo',123123,123123,null,null)
select * from servicos
SELECT * FROM usuarios
DELETE FROM usuarios WHERE id = 4



SELECT * FROM usuarios WHERE cpf=123
