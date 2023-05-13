# Funcionarios IUDIGITAL App

Funcionarios App es una aplicación de escritorio desarrollada en Netbeans con Java Swing y DAO, diseñada para gestionar funcionarios de la IUDIGITAL.

## Uso

La aplicación cuenta con las siguientes funciones:

- Registrar nuevos funcionarios.
- Ver la lista de funcionarios registrados.
- Actualizar la información de un funcionario.
- Eliminar un empleado.

## Tecnologías utilizadas

- Java SE Development Kit 8 (JDK)
- Netbeans IDE 17
- Java Swing
- MySQL Database
- DAO

## Estructura del proyecto

El proyecto está estructurado de la siguiente manera:

```
Funcionarios/
├── src/
│   ├── com.iudigital.funcionarios/
│   │   ├── FUNCIONARIOS.java
│   ├── dao/
│   │   ├── DAOFuncionarios.java
│   ├── modelo/
│   │   ├── Database.java
│   │   ├── Funcionarios.java
│   │   ├── Operaciones.java
│   ├── vistas/
│   │   ├── vistaFuncionarios.java
├── README.md
```

- `src/dao/funcionarios/dao`: contiene las clases para acceder a la base de datos mediante DAO.
- `src/modelo/funcionarios/models`: contiene la definición de la clase `Empleado`.
- `src/vistas/funcionarios/views`: contiene las clases que definen las interfaces gráficas de la aplicación.
- `README.md`: archivo con la información de la aplicación.

## MODELO DE BASE DE DATOS
![MODELO DE BASE DE DATOS](https://github.com/darvcodev/funcionarios-iudigital/blob/master/screenshots/modelado.png)

## CRUD FUNCIONARIOS
![CRUD FUNCIONARIOS](https://github.com/darvcodev/funcionarios-iudigital/blob/master/screenshots/CRUD-DA0-FUNCIONARIOS.png)

## Contribuir

Si deseas contribuir a la aplicación, puedes hacer un fork del proyecto y enviar tus pull requests.

## Licencia

La aplicación está disponible bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más información.
