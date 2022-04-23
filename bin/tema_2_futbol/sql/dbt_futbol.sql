-- Generado por Oracle SQL Developer Data Modeler 18.3.0.268.1208
--   en:        2019-02-19 10:33:46 CET
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE equipos (
    id_equipo   NUMBER(5) NOT NULL,
    nombre      VARCHAR2(100) NOT NULL,
    localidad   VARCHAR2(100) NOT NULL
);

ALTER TABLE equipos ADD CONSTRAINT equipos_pk PRIMARY KEY ( id_equipo );

CREATE TABLE jugadores (
    id_jugador   NUMBER NOT NULL,
    nombre       VARCHAR2(100) NOT NULL,
    dni          VARCHAR2(9) NOT NULL,
    edad         NUMBER(2) NOT NULL,
    posicion     VARCHAR2(100) NOT NULL,
    id_equipo    NUMBER(5) NOT NULL
);

ALTER TABLE jugadores ADD CONSTRAINT jugadores_pk PRIMARY KEY ( id_jugador );

ALTER TABLE jugadores
    ADD CONSTRAINT jugadores_equipos_fk FOREIGN KEY ( id_equipo )
        REFERENCES equipos ( id_equipo );


-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             2
-- CREATE INDEX                             0
-- ALTER TABLE                              4
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
