
INSERT INTO HERD (location) VALUES ('TANDIL');


INSERT INTO COW (electronic_id,fecha_nacimiento,ultima_fecha_parto,cantidad_partos,peso,herd_id) VALUES (1,parsedatetime('17-09-2012','dd-MM-yyyy'),parsedatetime('17-09-2012','dd-MM-yyyy'),2,300.5,1);
INSERT INTO COW (electronic_id,fecha_nacimiento,ultima_fecha_parto,cantidad_partos,peso,herd_id) VALUES (2,parsedatetime('17-09-2020','dd-MM-yyyy'),null,0,100.5,1);

INSERT INTO COW_BCS(condicion_corporal,fecha,cow_id) VALUES (5,parsedatetime('17-09-2018','dd-MM-yyyy'),1);
INSERT INTO COW_BCS(condicion_corporal,fecha,cow_id) VALUES (7,parsedatetime('17-09-2020','dd-MM-yyyy'),1)

INSERT INTO COW_BCS(condicion_corporal,fecha,cow_id) VALUES (9,parsedatetime('17-09-2025','dd-MM-yyyy'),2);