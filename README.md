# DAW1-ED-Pruebas-Ejemplo1


[![Build Status](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg?branch=master)](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo1)
[![codecov](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo1/branch/master/graph/badge.svg)](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo1)

![JDK 8](https://img.shields.io/badge/JDK-8-blue.svg)
![Gradle](https://img.shields.io/badge/gradle-2-blue.svg)
![JUnit 4](https://img.shields.io/badge/JUnit-4-blue.svg)

[![GitHub issues](https://img.shields.io/github/issues/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1/issues) 
[![GitHub forks](https://img.shields.io/github/forks/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1/network)
[![GitHub stars](https://img.shields.io/github/stars/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1/stargazers)
[![GitHub license](https://img.shields.io/github/license/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1/blob/master/LICENSE)
[![HitCount](http://hits.dwyl.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1.svg)](http://hits.dwyl.com/jamj2000/DAW1-ED-Pruebas-Ejemplo1)



## Pruebas unitarias en **Java** con **JUnit4** 

### Código a testear (pruebas de unidad)

El código de la aplicación lo componen 3 clases:

- Main  (Clase principal)
- Aritmética
- Utilidades

La clase Main es la que hace uso de los métodos definidos en Aritmética y Utilidades.

Dentro de **Aritmética** tenemos 4 métodos estáticos:
- `suma`
- `resta`
- `multiplicacion`
- `division`
 
Dentro de **Utilidades** tenemos 1 métodos estático:
- `ordenar`  (para ordenar un array de 3 enteros)


### Requisitos

Es necesario el uso del sistema de construcción (build) **gradle**. Si trabajamos con NetBeans deberemos instalar el plugin para gradle. 

Asimismo, en el archivo [build.gradle](build.gradle) añadiremos la línea *apply plugin: "jacoco"* (Java Code Coverage), para poder realizar cobertura de código.


### Clases de prueba

Las clases de prueba son:

- MainTest
- AritméticaTest
- UtilidadesTest


### Servicios web utilizados

Se utilizan 2 servicios web:

- [Travis-CI.org](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo1): para ***integración continua*** (construcción y paso de tests)
- [Codecov.io](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo1): para ***cobertura de código***

Es importante tener un archivo **`.travis.yml`** adecuado. Aquí tienes el utilizado en este proyecto:

- [.travis.yml](.travis.yml)
