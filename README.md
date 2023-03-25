# MetroMendeley
Proyecto 2 EDD
MetroMendeley: Tablas de Dispersión.
(Hash Table)
-Contexto preliminar:
En el siguiente proyecto, usted tendrá que realizar una investigación documental que le permita obtener información sobre el contexto del problema. En tal sentido, se sugiere que comience por realizar la siguiente lectura relativa a Hash Tables, pero tome en cuenta que es solo un recurso inicial que debe ser complementado con la búsqueda autónoma de información por parte de los integrantes del equipo de trabajo:

https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/
-El problema:
Se requiere que su equipo de trabajo construya un programa en Java para la administración de artículos científicos. Dicho sistema es concebido como un recurso de apoyo al trabajo de los investigadores, permitiéndoles realizar búsquedas y revisar los resúmenes. El sistema deberá leer un archivo de texto contentivo del resumen de una investigación, registrando la frecuencia con la que aparezcan cada una de las palabras claves registradas en el repositorio del sistema. 
Requerimientos funcionales:
1.	Agregar resumen. Un resumen está contenido en un archivo de texto, tal y como se muestra en el anexo 1. Esta funcionalidad consiste en:
a.	Cargar el archivo en el que se encuentra el resumen y almacenarlo en una tabla de dispersión. Es decir, se debe diseñar una función hash que genere una clave única que permita tanto almacenar como buscar dicho resumen en la tabla con una complejidad lo más cercana a O(1). Dicha clave debe ser generada a partir del título de la investigación.
b.	Por cada resumen, se guarda: título, autores, cuerpo del resumen y palabras claves.
c.	El programa deberá validar que no se introduzca dos veces al mismo resumen. 
2.	Analizar resumen.  Para la ejecución de esta funcionalidad, la secuencia de pasos es la siguiente:
a.	El sistema muestra la lista de las investigaciones guardadas, preferiblemente en orden alfabético.
b.	El usuario selecciona la investigación.
c.	El sistema analiza el texto correspondiente al resumen y se imprime en pantalla las estadísticas correspondientes, tal y como se describió en el planteamiento del problema. A continuación se muestra en detalle la forma en la que debería aparecer la información:
Nombre del trabajo.
Autores:
palabra clave 1: frecuencia con la cual la palabra clave 1, almacenada en el repositorio del sistema aparece en el resumen
palabra clave 2: frecuencia con la cual frecuencia palabra clave 2, almacenada en el repositorio del sistema aparece en el resumen
…
palabra clave n: frecuencia con la cual la palabra clave n, almacenada en el repositorio del sistema aparece en el resumen

3.	Buscar Investigaciones por palabra clave: Dada una palabra clave, ver listado de las investigaciones relacionadas. Esta operación debe ser lo más cercano a O(1). El usuario podrá seleccionar uno de los documentos para ver detalles.
4.	Buscar Investigaciones por Autor: El usuario selecciona un nombre de una lista desplegable y el sistema muestra la o las investigaciones en las que él es autor o coautor. El usuario podrá seleccionar uno de los documentos para ver detalles.
5.	Salir del sistema: se deben guardar la información de los resúmenes de manera que el usuario pueda acceder a dicha información en una siguiente oportunidad.

Requerimientos Técnicos:
1.	La solución debe ser implementada con base en la utilización de tablas de dispersión. Puede, sin embargo, utilizar otros TDA auxiliares.
2.	La aplicación debe ofrecer una interfaz gráfica al usuario.
3.	Al comenzar el sistema, un conjunto de investigaciones deben ser precargadas.
Consideraciones:

-	Los proyectos podrán ser sometidos a defensa, es decir, el facilitador convocará al equipo para una revisión presencial.
-	Los equipos de trabajo deberán utilizar GitHub para el control de versiones y facilitar el trabajo en equipo de manera remota. En el registro se deberá reflejar la participación activa y significativa de los integrantes. Los proyectos que no tengan interfaz gráfica, serán calificados con 0 (cero).
-	Los proyectos que sean iguales o parecidos, serán calificados con 0 (cero).
-	Los programas que “no corran”, serán calificados con 0 (cero).
-	Los equipos pueden tener como máximo 3 personas.
-	El nombre del archivo del proyecto deberá contener los apellidos de los integrantes del equipo.
Criterios de evaluación

-	Funcionalidad: Capacidad para proporcionar las funcionalidades que satisfacen las necesidades explícitas e implícitas bajo unas ciertas condiciones. (40%)
-	Adecuación: El programa ofrece todas funcionalidades que respondan a las necesidades, tanto explícitas (contenidas en el documento descriptivo del proyecto) como implícitas; entendiendo como necesidades implícitas, aquellas que no estando descritas en el documento, surgen como resultado de un concienzudo análisis del problema planteado y que aseguran el correcto funcionamiento del programa.
-	Exactitud: El programa genera los resultados o efectos correctos o acordados, con el grado necesario de precisión.
-	Fiabilidad: Capacidad para mantener un nivel especificado de prestaciones cuando se usa bajo ciertas condiciones.
-	Madurez: El programa no presenta fallas originadas por errores de programación, análisis o diseño. (10%)
-	Tolerancia a fallos: El programa responde adecuadamente al manejo inadecuado del usuario; es decir, mantiene su correcto funcionamiento aun cuando el usuario introduzca datos erróneos o manipule inadecuadamente las interfaces de usuario. (10%)
-	Usabilidad: Capacidad del proyecto para ser entendido, aprendido, usado y al mismo tiempo, ser atractivo para el usuario, cuando se usa bajo condiciones específicas.
-	Comprensibilidad: El programa ofrece una interfaz de fácil comprensión, facilitando su aprendizaje y correcta utilización. El programa emite mensajes de alerta cuando se introducen valores erróneos. Existen elementos informativos que indican al usuario como operar el programa. (5%)
-	Capacidad de ser atractivo: El diseño de la interfaz de usuario, esto es: disposición de controles, esquema de colores, utilización de cajas de diálogo y demás elementos gráficos; es atractivo para el usuario. (5%)
-	Eficiencia: Capacidad para proporcionar prestaciones apropiadas, relativas a la cantidad de recursos usados, bajo condiciones determinadas.
-	Estructuras de datos: Utiliza eficientemente las estructuras de datos para la solución del problema. (30%)
 






## Anexo 1: Ejemplos de resúmenes.


 
Complemento de software para el diseño de fundaciones.

Autores
Raquel Sandoval 
Iván Loscher 
Christian Guillén-Drija

Resumen
El adelanto tecnológico presente hoy en día ha traído una gran cantidad de herramientas útiles para los ingenieros, incorporando el uso de sistemas de información para la toma de decisiones en los procesos de cálculo y la visualización de materiales creados a través de los cálculos; así como avanza las tecnologías a usar, también deben actualizarse las herramientas para asegurar su durabilidad y fiabilidad en el tiempo. El siguiente trabajo presenta una herramienta que, con ayuda de métodos de cálculo existentes para fundaciones directas e indirectas, genera el diseño de las mismas en conjunto a través de valores ingresados por el usuario, estableciendo así un medio en el que pueda visualizarse de manera eficiente y sencilla los resultados del cálculo previamente establecido, pues automatiza el proceso de dibujo y cálculo en AutoCAD. Dicha herramienta se implementó como un complemento o extensión de software que permite el diseño y dibujo de las fundaciones con base en las librerías, funciones y modelos de AutoCAD. La extensión obtenida puede ser modificada en el tiempo para extender sus funcionalidades. La misma implementa diversos métodos para diseño de fundaciones, entre los que se cuenta Caquot-Kerisel y Meyerhof, aplicado en las fundaciones indirectas. En el caso de las fundaciones directas, implementa el método de Terzaghi y Vesic. Igualmente, se realizó un modelo de cálculo para el diseño de todas las fundaciones de la estructura, el cual fue implementado en el complemento obtenido en este trabajo de investigación.

Palabras claves: fundaciones directas, AutoCAD, complemento, C#
Arquitectura referencial para mecanismos de Internacionalización y localización en PHP.
Autores
Christian Guillén Drija 
Andrea Pérez
Carlos Maldonado
Resumen
Los procesos de internacionalización y localización inciden directamente en la usabilidad de un sistema web al facilitar su adaptación a diferentes elementos culturales tales como la moneda, idioma, formato de fecha, sistema de medidas, entre otros. Algunos frameworks para aplicaciones web cuentan con soporte para dichos procesos. Sin embargo, en muchas ocasiones, la información sobre la arquitectura de los mecanismos utilizados en cada framework, así como su funcionamiento interno resulta insuficiente. La arquitectura de software se corresponde a visión abstracta de un sistema en la que se representan los componentes del mismo, el comportamiento de cada uno de dichos elementos y la forma en que se relacionan. Su uso adecuado conlleva a la disminución de los costos de manutención del software, mayor facilidad en la toma de decisiones de diseño, disminución de las fallas, entre otras ventajas. Por otra parte, la generación de una Arquitectura de Referencia (AR), es el producto con mayor relevancia generado en la etapa de Análisis del Dominio (AD), dentro de la denominada disciplina de Ingeniería del Dominio (ID), la cual tiene gran relevancia para el desarrollo de software basado en componentes. En este trabajo, se aplica un AD, asumiendo un enfoque ascendente (“bottom-up”) sobre una muestra de frameworks de desarrollo para PHP, específicamente centrado en los mecanismos que cada framework implementa para posibilitar la internacionalización y la localización en aplicaciones web. Para lograr lo anterior, se aplicó ingeniería inversa sobre las distintas arquitecturas y se modelaron en UML. Del análisis de las variantes e invariantes de las mismas, se obtuvo una Arquitectura de Referencia para un subsistema de internacionalización y localización. Si bien la muestra de arquitecturas analizadas en este trabajo se circunscriben a frameworks de desarrollo en PHP, la Arquitectura de Referencia obtenida puede ser considerada de carácter genérico, con el suficiente nivel de abstracción de manera que pueda ser asumida como una arquitectura base sobre la cual comenzar un desarrollo basado en componentes; sin embargo, su validación puede realizarse a través de la ampliación de la muestra inicial de frameworks seleccionados y el análisis de las posibles variantes que puedan generarse. No obstante, la Arquitectura de Referencia obtenida en este ejercicio de Análisis de Dominio puede utilizarse como referente dentro de una organización para evaluar la mejor opción al momento de seleccionar la alternativa arquitectónica más robusta al considerar un conjunto de frameworks de desarrollo.

Palabras Claves: análisis de dominio, ingeniería de dominio, PHP, arquitectura referencial, internacionalización y localización.


Sistema de diseño basado en Grid
Autores
José Invernón
Christian Guillén-Drija

Resumen
Los frameworks de diseño son conjuntos articulados de elementos y componentes gráficos que se rigen por patrones o guías de diseño. Estos favorecen el desarrollo rápido de aplicaciones web sobre la base de criterios de diseño consistentes. La mayoría de los frameworks de Frontend, basan su implementación en elementos que se distribuyen en una sola dimensión, es decir, hacen uso de Flexbox, lo cual limita el control estructural del contenido. El presente estudio, estuvo centrado en la realización de un sistema de diseño basado en Grid para interfaces gráficas de aplicaciones web. Para ello, se categorizaron los elementos de las guías de diseño de UX/UI del sistema planteado, los cuales componen los patrones que permiten definir el estilo de sus componentes. Posteriormente, se hizo una comparación entre los siguientes frameworks: Bootstrap, Clarity Design y Material Design, con el fin de seleccionar los componentes de interfaz que constituyesen el sistema de diseño propuesto en este trabajo de investigación. En una siguiente fase, se procedió a construir tales componentes con base en las propiedades de Grid. Además, se construyó un caso de estudio al que se le aplicó un conjunto de escenarios de pruebas que permitió validar la efectividad del sistema de diseño basado en Grid como herramienta para la construcción de los componentes de interfaz de usuario en el ámbito del desarrollo de aplicaciones Web. Posteriormente el sistema de diseño obtenido se aplicó a un caso de estudio que consistió en un catálogo de componentes y guías de estilo. Ambos productos son de dominio público, de manera que los potenciales usuarios del sistema de diseño pueden acceder de manera gratuita a la hoja de estilo que especifica las clases constituyentes, así como a una documentación detallada y extensa sobre su uso. Esta investigación permitió demostrar que es posible diseñar componentes de interfaz de usuario basados en propiedades Grid. Dichas propiedades permiten ordenar y posicionar los elementos del HTML de forma práctica y sencilla, haciendo uso de dos dimensiones; además de facilitar el desarrollo de sitios web responsivos. Aun cuando es posible crear elementos de interfaz de usuario solo con la propiedad Grid, como se demostró en este trabajo, su combinación con Flexbox, potencia la creación tanto de componentes como de aplicaciones debido a que con el primero, se define la estructura y con el segundo, se distribuye el contenido en cada sección.
Palabras claves: diseño, componentes, sistema de diseño, Grid, hojas de estilo, UX/UI.

 
GraphQL vs REST: una comparación desde la perspectiva de eficiencia de desempeño.
Autores
Christian Guillén Drija
Reynaldo Quintero
Asher Kleiman
Resumen
El estilo arquitectónico conocido como Transferencia de Estado Representacional (REST según sus siglas en inglés) ha modelado y estandarizado  la  comunicación cliente-servidor a través del protocolo de transferencia de hipertexto (HTTP). Según Roy Fielding, creador de REST,  este estilo consiste en un conjunto de restricciones arquitectónicas que enfatizan la escalabilidad de las interacciones entre los componentes, así co mo la generalidad las interfaces utilizadas, el despliegue independiente de dichos componentes, la aplicación de componentes intermediarios para la reducción de la latencia, la preponderancia de la seguridad y la encapsulación de los sistemas Legacy. Como consecuencia, REST se ha convertido en el estilo más aplicado en la comunicación con una Interfaz de Programación de Aplicaciones (API). Por otra parte, GraphQL es una tecnología basada en un lenguaje de consultas de datos para API’s que se ha constituido en una alternativa al estilo REST. En este trabajo de investigación, se realizó una comparación de REST y GraphQL como mecanismos arquitectónicos desde una perspectiva de calidad, específicamente  centrada en la  Eficiencia de Desempeño, en el marco del estándar ISO/IEC 9126 e ISO/IEC 25000. Las subcaracterísticas de Eficiencia de Desempeño evaluadas fueron: Comportamiento Temporal, Utilización de Recursos y Capacidad. Para cada una de dichas subcaracterísticas, se aplicaron métricas, a saber: para el Comportamiento Temporal se aplicaron las métricas Tiempo de Respuesta y Rendimiento; para la Utilización de Recursos, se aplicaron las métricas: Utilización de la Memoria, Utilización de Caché, Overfetching y Underfetching; y para Capacidad, se aplicaron las métricas Capacidad y Velocidad Bajo Estrés. Para el desarrollo de este trabajo se seleccionó un caso de estudio que permitiera evidenciar las características de los dos mecanismos. Asimismo, para la obtención de datos cuantitativos que permitiesen establecer comparaciones, se diseñaron dos API’s que con base en el caso de estudio escogido, respondieran fielmente a las restricciones que caracterizan a los dos mecanismos arquitectónicos. Los resultados obtenidos, una vez ejecutados los casos de prueba, permiten inferir que REST posee una mayor rapidez de respuesta que GraphQL. Debido a la naturaleza dinámica de las peticiones que pueden realizarse en las que se puede especificar con mayor granularidad la información requerida a través de consultas anidadas, GraphQL parece ser más eficiente en lo relativo al underfetching y al overfetching. En general, GraphQL debería utilizarse cuando se requiere menor utilización de la memoria, cuando los recursos que la API maneja están estrechamente relacionados y cuando no sea necesario utilizar la totalidad de la información obtenida. Por otra parte, REST debería utilizarse en caso de necesitarse mayor velocidad de respuesta y cuando se requiera utilizar la totalidad de la información de los recursos manejados. 

Palabras Claves: REST, GraphQL, cliente-servidor, mecanismo arquitectónico, calidad de software.
