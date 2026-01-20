Prerrequisitos
JDK 17 y Quarkus 3.30.6


1. Framework seleccionado

Para el desarrollo de la actividad se utilizó el framework Quarkus versión 3.30.6, el cual está orientado a la construcción de aplicaciones Java modernas y optimizadas para entornos cloud-native. Quarkus se caracteriza por su rápido tiempo de arranque, bajo consumo de recursos y soporte nativo para el desarrollo de APIs, lo que lo convierte en una alternativa eficiente para implementar servicios GraphQL.

2. Librería GraphQL utilizada

La implementación de GraphQL se realizó mediante la librería SmallRye GraphQL, integrada a Quarkus a través de la extensión quarkus-smallrye-graphql. Esta librería implementa la especificación MicroProfile GraphQL, permitiendo definir consultas GraphQL directamente desde clases Java utilizando anotaciones, sin necesidad de escribir manualmente el esquema.

3. Instalación y configuración de GraphQL

El proyecto fue generado utilizando la herramienta Quarkus Code, seleccionando el sistema de construcción Maven y agregando la extensión SmallRye GraphQL. Durante la configuración se ajustó el proyecto para trabajar con Java 17, garantizando compatibilidad con la versión instalada del JDK.
Posteriormente, el proyecto fue ejecutado en modo desarrollo utilizando el comando quarkus:dev, lo que permitió habilitar el live coding para detectar cambios automáticamente  
```shell script .\mvnw.cmd quarkus:dev```

4. Implementación de la funcionalidad GraphQL

Se definió un modelo de datos denominado Producto, el cual contiene los atributos id, nombre y precio.
A continuación, se implementó una clase de servicio encargada de retornar una lista de productos simulados. Finalmente, se creó un recurso GraphQL utilizando la anotación @GraphQLApi, donde se expuso una consulta llamada productos, permitiendo obtener la información de los productos disponibles.

5. Prueba de funcional

La funcionalidad GraphQL fue probada mediante la interfaz GraphiQL, disponible en el endpoint [/q/graphql-ui](http://localhost:8080/q/graphql-ui).
Desde esta interfaz se ejecutó la consulta GraphQL correspondiente, obteniendo una respuesta en formato JSON con la lista de productos definidos, lo que evidencia el correcto funcionamiento del servicio.




