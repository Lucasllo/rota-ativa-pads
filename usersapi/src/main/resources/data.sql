
  
INSERT INTO "administrador" ("id","nome","cpf","email","nascimento","senha")
VALUES
(1,'Buffy Cooley','409.178.650-22','Buffy@gmail.com','1975-07-24','4532134'),
(2,'Rahor','029.683.090-99','Rahor@gmail.com','1980-05-09','3432543'),
(3,'Teibieza','369.294.690-25','Teibieza@gmail.com','1995-06-15','342342345');
  

INSERT INTO "usuario" ("id","cpf","nome","acessibilidade","email","senha","nascimento","estado","ticket")
VALUES
  (1,'172.495.494-87','Miriam Valenzuela','1','suscipit.est@hotmail.ca','TVG67VPB6MS','2003-07-11', true,1),
  (2,'377.148.018-76','Maxwell Thornton','1','eros.proin.ultrices@aol.ca','MSY92HCJ6TY','2009-07-27', true,6),
  (3,'422.039.759-53','Brett Keith','1','turpis.nulla.aliquet@google.ca','SVY82APS5DD','2022-04-30', false,7),
  (4,'297.769.650-34','Raja Montoya','0','gravida.praesent.eu@google.org','UXV22YTM3GX','2022-03-18', true,0),
  (5,'415.651.414-38','Jasmine Horne','0','est.mauris@protonmail.net','YFU68ILT1KQ','2009-02-8', false,6);


INSERT INTO "vaga" ("id","logradouro","bairro","acessibilidade","nome","longitude_inicial","longitude_final","latitude_inicial","latitude_final")
VALUES
  (1,'Cundinamarca','Messejana','1','A',582512,698435,238663,1670784),
  (2,'Saskatchewan','Pedras','1','B',605023,247620,773261,78026),
  (3,'Heredia','Jabuti','1','C',482111,1026024,816287,1100786),
  (4,'Wielkopolskie','Aldeota','1','D',689873,1075199,201218,1304796),
  (5,'Vestfold og Telemark','Itaitinga','1','E',673375,425530,590523,695340);


  INSERT INTO "tipo_pagamento" ("id","nome","descricao")
VALUES
  (1,'credito','sem molestie sodales.'),
  (2,'debito','pretium neque. '),
  (3,'debito','commodo auctor velit.'),
  (4,'credito','Integer tincidunt '),
  (5,'credito','per conubia nostral');
  
INSERT INTO "veiculo" values

  (1,'azul','MOA-2877','corola'),
  (2,'vermelhor','HPC-9087','uno'),
  (3,'rosa','NEY-5840','camaro'),
  (4,'azul','JUW-5533','fiesta'),
  (5,'vermelhor','NAK-1275','polo');
  
INSERT INTO "telefone" ("id","usuario_id","numero")
VALUES
  (1,1,'(95)3489-4683'),
  (2,2,'(92)2444-7743'),
  (3,3,'(84)3515-4566'),
  (4,4,'(61)2058-7217'),
  (5,5,'(97)3735-4126');
  
INSERT INTO "transacao" ("id","vaga_id","usuario_id","ticket_usado","entrada","saida")
VALUES
  (1,1,1,7,'2022-07-11','2022-07-11'),
  (2,2,2,8,'2022-07-27','2022-07-27'),
  (3,3,3,10,'2022-03-18','2022-03-18'),
  (4,4,4,5,'2009-02-8','2009-02-8'),
  (5,5,5,4,'2003-07-11','2003-07-11'),
  (6,5,5,4,'2003-07-13','2003-07-12');


  
INSERT INTO "rel_usuario__veiculos" ("usuario_id","veiculos_id")
VALUES
	
  (1,1),
  (2,2),
  (3,3),
  (4,4),
  (5,5);
  
  
INSERT INTO "pagamento" ("id","data_compra","valor","quantidade_ticket","usuario_id","tipo_pagamento_id")
VALUES
  (1,'2022-01-16',7,1,1,1),
  (2,'2022-05-1',86,8,2,2),
  (3,'2022-06-15',75,12,3,3),
  (4,'2023-01-12',71,7,4,1),
  (5,'2023-08-23',23,1,5,3);
  





