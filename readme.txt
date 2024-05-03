 # Cómo leer este proyecto.

## Nota para los desarrolladores.
    
    1. Este proyecto al final lo hice compatible con versionado en git, por lo que
    todos los nombres de los archivos tienen una marca verde, lo cual está en
    "staging". Al final de que hagan los cambios pertinentes:
        
        Dan click derecho a ☕ FinalLógica [xxxxxx]
        Van a la sección Git -> Commit.
        Escriben brevemente los cambios que hicieron y le dan commit.

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

    4. Si quieren un mejor control de cambios, se puede hostear en Github, para
    que puedan llegar notificaciones de los cambios hechos ¯\_(ツ)_/¯

# Explicación las clases principales.

## Repaso general

finallógica               Paquete principal del proyecto.
      ||-> .Clases        Contiene todas las clases necesarias del programa.
      ||     ||-> .Fijas  Contiene clases que tienen valores por omisión.
      ||-> .Interfaz      Contiene los archivos de interfaz del programa.
      ||-> .Modelo        Contiene todas las operaciones del programa.

