 # Cómo leer este proyecto.

## Nota para los desarrolladores.
    
    1. Este proyecto al final lo hice compatible con versionado en git, por lo que
    todos los nombres de los archivos que estan azules, quieren decir que fueron
    modificados, si están verdes, es que fueron creados.
    Si un archivo se guarda entran en "staging". No tienen que agregarlos después.
    Al final de que hagan los cambios pertinentes:
        
        - Dan click derecho a ☕ FinalLógica [xxxxxx]
        - Van a la sección Git -> Commit.
        - Escriben brevemente los cambios que hicieron (en menos de 20 palabras)
        y le dan commit.

    2. Los archivos los comentaremos en la parte superior. Después de que tenga-
    mos la "base que funciona", podemos documentar todo. El código va a estar en
    español, por lo que no creo que vaya a haber confusión con los nombres de
    las clases, los métodos y atributos.

    Clases: NombreClase (Primera en mayúscula)
    Métodos: metodoAccion (Primera en minúscula, resto de palabras en mayúscula)
    Atributos: atributo_de_clase (Todo en minuscula, camel_case si es muy largo)

    Sigamos estas condiciones, para entendernos mejor.

    3. Todo cambio que hacemos, comentemoslo en el grupo, aunque sea decir que
    hicimos algo.

# Explicación las clases principales.

## Repaso general

finallógica                     Paquete principal del proyecto.
      ||==| .Clases              Contiene todas las clases necesarias del programa.
      ||     \|-> .Fijas        Contiene clases que tienen valores por omisión.
      ||==| .Interfaz            Contiene los archivos de interfaz del programa.
      ||     ||-> .Modelos      Contiene los modelos de cada una de las tablas en el
      ||     ||                 programa.
      ||     ||-> .Registros    Contiene toda la interfaz que el directivo puede
      ||     ||                 acceder para ver, modificar y eliminar datos.
      ||     \|-> .img          Recursos de imágenes usadas en el proyecto.
      ||     
      \|==| .Modelo             Contiene todas las operaciones, métodos y funciones
             ||                 del programa.
             ||-> .BasesDeDatos Contiene las bases de datos del programa (dentro de
                                build) y los lectores y escritores de tablas.


## Clases

    Carrera             Es una clase abstracta, para hacerla base de los tipos de
       ||               carrera que ofrece la universidad.
       ||
       ||-> Pregrado    Los pregrados de la universidad (carrera por defecto)
       ||               
       \|-> Posgrado    Los posgrados de la universidad, se dividen en maestrías
                        y especializaciones.

    Directivo           Es aquel que tiene acceso a las bases de datos, solo debe
                        haber uno por programa, pero se hizo una clase para más
                        flexibilidad a futuro. No se relaciona con nada.

    Director            Es aquel que verifica los trabajos de grado de los estu-
                        diantes de posgrado. Relacionado con TrabajoDeGrado. Tiene
                        ninguno o varios trabajos de grado

    Estudiante          La fuente principal de la universidad. Estos tienen varios
                        datos y una extensa funcionalidad en la plataforma. Estos
                        pueden iniciar sesión y verificar su estado, mientras que
                        los directivos pueden administrarlos desde su interfaz. 
                        Pueden tener una y solo una carrera.

    Graduando           Cuando se acepta una presolicitud (Sea egresado) se crea
                        esta clase con todos los requisitos, los cuales un direc-
                        tivo debe aceptar para así llegar a ser admitidos para
                        grados. Tiene siempre un estudiante relacionado y un trabajo
                        de grado relacionado si o si.
        
