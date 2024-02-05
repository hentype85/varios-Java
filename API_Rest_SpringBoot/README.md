# API Rest - Spring Boot - Java

## JDK 17 para Windows
```
https://www.oracle.com/java/technologies/downloads/#java17
```
## Apache Maven para Windows
```
https://maven.apache.org/download.cgi
```

### Configurar variables de entorno
JAVA_HOME
Nombre de la variable: `JAVA_HOME`
Valor de la variable: `C:\Program Files\Java\jdk-17`
MAVEN_HOME
Nombre de la variable: `MAVEN_HOME`
Valor de la variable: `C:\Program Files\apache-maven`

### Agregar los directorios bin de JDK y Maven a la variable de entorno PATH del sistema
Agrega ruta para JDK 17:
```
%JAVA_HOME%\bin
```
Agregar ruta para Maven:
```
%MAVEN_HOME%\bin
```
```
echo %path%
java -version
mvn -v
```