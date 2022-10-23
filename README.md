# Tenpo-Calculate-Api

Tenpo Calculate Api es una aplicación orientada a resolver el challenge de ingreso a Tenpo y cuenta con 4 endpoints:

```bash
Create user: POST /tenpo/users
```
Consideraciones: 
 - La contraseña requiere una Mayúscula, 1 número y un carácter como mínimo.
 - El email debe respetar el formato xxx@xx.x.

```bash
Login: POST /tenpo/users/login
```
Consideraciones: 
 - La contraseña requiere una Mayúscula, 1 número y un carácter como mínimo.
 - El email debe respetar el formato xxx@xx.x.
 - El email debe estar previamente registrado y se valida la password.

```bash
Calculate: GET /tenpo/calculate
```
Consideraciones: 
 - Tanto él valorA como el valorB son obligatorios.
 - Requiere header con token de autenticación.

```bash
History: GET /tenpo/history
```
Consideraciones: 
 - Tanto page como operation son filtros opcionales, en caso de no enviarlo se buscará la primer pagina con filtro all.

 -  Requiere header con token de autenticación.


```bash
Header de autenticacion: 'tokenApiKey'
```




## Installation

Requiere Java, Maven y Docker instalados

- En primer lugar se debe clonar este repositorio e ingresar en la carpeta en donde lo clonamos. 

```bash
https://github.com/tagualba/tenpo-calculate-api.git

cd tenpo-calculate-api 
```
- Una vez ahi empaquetamos la aplicación de maven en un .Jar

```bash
mvn clean package
```
- Ahora copiamos el .jar resultante dentro del directorio que usaremos en docker

```bash
cp target/calculate.api-1.0-SNAPSHOT.jar src/main/docker
```

- Por ultimo con el siguiente comando ejecutaremos la aplicación junto a su base de datos.
 
```bash
docker-compose -f ./src/main/docker/docker-compose.yml up
```

Una vez ejecutado podemos desde POSTMAN pegar importando la batería de request de ejemplos que viene eh [ tenpo-calculate-api.postman_collection.json ] 
