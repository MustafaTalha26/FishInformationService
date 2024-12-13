SOAP request -> Hibernate Query -> Hibernate entity -> SOAP response.

It's usage is up to you. 

![image](https://github.com/user-attachments/assets/355ffd97-77b9-4ee2-95a1-da142d7751cd)

https://www.kaggle.com/datasets/arifmia/marine-fish-dataset
Used dataset for PostgreSQL

CREATE TABLE public.denizbalik
(
    "id" bigint NOT NULL,
    "specieName" character varying(45) NOT NULL,
    "region" character varying(45) NOT NULL,
    "season" character varying(45) NOT NULL,
    "fishingMethod" character varying(45) NOT NULL,
    "fishPopulation" bigint NOT NULL,
    "averageSize" double precision,
    "overfishingRisk" character varying(45) NOT NULL,
    "waterTemperature" double precision,
    "waterPollutionLevel" character varying(45) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.denizbalik
    OWNER to postgres;

Used JAXB externally. 

xjc -d [destination_folder] [xsd_file]

