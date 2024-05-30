# PROJECTO FINAL AMWS1: PLANET WARS
Primer proyecto
https://github.com/KaitoKidd28/Proyect_Arnau_Jose_Mario_Moha

## Authors
Arnau Calvo
Mohammad el Bourkhissi
Jose Hurtado
Mario Pes

## Description

PlanetWars es un juego de estrategia en tiempo real ambientado en un vasto universo lleno de planetas por conquistar. Como comandante de tu propio imperio galáctico, tu misión es expandir tu dominio, gestionar recursos y liderar tu flota espacial hacia la victoria. El juego se juega en la terminal, ofreciendo una experiencia de juego pura y centrada en la estrategia, con desafíos que mantendrán a los jugadores inmersos en épicas batallas interplanetarias.

## Archivos

Los archivos como tal ya se encuentran descargados junto a este documento.

## Installation
Antes de poder disfrutar de este juego, es necesario un pequeño indice de todo lo necesario para que el juego funcione:

 - Eclipse con jdk21. 
 - Servidor Oracle o cliente SQLDeveloper

Si no tiene Servidor de Oracle, a continuación se deja un video para hacer la instalación: https://youtu.be/uoxd5oloEQY?si=GAMev1O34gqEWHm4

Para que todo sea más ameno, a continuación se dejan unos pasos para la puesta en marcha de todo:

### 1. Configuración Base de Datos
En los archivos descragardos, podemos navegar hasta la carpeta de M2, dónde ahí tenemos dos documentos sql:
- En el llamado PlanetWarsUser.sql, podemos encontrar la creación de usuarios:
https://github.com/KaitoKidd28/Proyect_Arnau_Jose_Mario_Moha/blob/main/M2/PlanetWarsUser.sql
- Tenemos otro docuumento en el que se muestra la creación de tablas:
https://github.com/KaitoKidd28/Proyect_Arnau_Jose_Mario_Moha/blob/main/M2/Create_PlanetWars.sql

### Paso extra 1 : Añadir el proyecto a Eclipse

Desde nuestro editor de codigo preferido vamos a la opcion:   

- [Open Projects From File System...]
Desde la ventana emergente, pulsamos el botón Directory y navegamos hasta el directorio del proyecto (la localización puede variar, normalmente esta donde lo hayas descargado).


Para que se importe bien, es recomendable, una vez dentro del directorio del proyecto, seleccionar la carpeta M3.

### Paso extra 2 : Driver para conectar Java - Oracle 
Una vez establecido como proyecto, es necesario añadir un componente extra, el archivo: ojdbc8-23.4.0.24.05

Este archivo lo encontrás adjunto en los archivos del proyecto (dentro de src), en caso contrario puedes descargarlo aqui: https://www.oracle.com/es/database/technologies/appdev/jdbc-downloads.html

Click derecho sobre el proyecto, entramos en la opción build path, add external archives. Navegamos hasta el driver y lo seleccionamos (la ubicación puede variar).
Una vez realizado esto, debería conectarse el eclipse con la base de datos.

## Fin de la Instalación

Y listo, una vez hemos acabado esta breve configuración ya puedes disfrutar del juego. 

Ejecuta el archivo Main situado en la carpeta Main para empezar a jugar.






