# Foro-challenge-alura
Proyecto de Maven basado en un foro interactivo utilizando el lenguaje de programación Java, Spring Boot, agregando dependencias como: Spring Boot Devtools, Lombok y Spring Web.

Utilizamos base de datos MySQL y accederemos a los datos creados y guardados con Insomnia.

Este es un proyecto Maven, simulando un foro interactivo en Insomnia, donde los usuarios tendrán la oportunidad de crear un token basado en su usuario para poder acceder a varias opciones, tales como: Solicitar un token (clave encriptada) para poder acceder a las distintas opciones y funciones: crear un tópico, ver la lista de tópicos creados, eliminar un tópico y editar tópicos.

<h1>Vista de Insomnia y explicación de sus diferentes opciones</h1>

![image](https://github.com/user-attachments/assets/5dc6e103-53e9-4e82-a7bb-1cc4513f0c23)

<h1>Explicación técnica de cada función</h1>

![image](https://github.com/user-attachments/assets/9f6e0218-5029-476d-8e6f-81d33661a795)

En la imagen se muestran 5 botones que hacen referencia a 5 funciones diferentes, las cuales son:

![image](https://github.com/user-attachments/assets/cf077bc5-a650-4b63-a098-db0f2e4a98e8)

**Post - Login de Usuario**: cumple la función de crear un token basado en un usuario y una clave. El **TOKEN** (contraseña encriptada) se utilizará para ingresar y tener acceso a las diferentes opciones del menú.

![image](https://github.com/user-attachments/assets/547149cd-0b96-4908-92e4-8ae73032e156)

**Delete**: Eliminar un tópico. Su función básica es eliminar un tópico.

![image](https://github.com/user-attachments/assets/0857ca20-df89-49a7-b10c-e13ddfbf8bf1)

**Actualizar Tópico**: Su función es permitir el acceso al tópico para poder modificar sus distintos valores. Imagen de un tópico y sus diferentes valores.

![image](https://github.com/user-attachments/assets/1e232b3b-48c7-4af1-b1da-c58964a7c98a)

![image](https://github.com/user-attachments/assets/b5040d46-0815-4127-b532-5eaaf58a7362)

**Post - Registrar Tópico**: Su principal función es crear completamente un tópico y guardarlo en la base de datos.

![image](https://github.com/user-attachments/assets/931ad550-96ef-4923-8f8d-73cd89f8fa57)

**Get - Listado de Tópicos**: Tiene como función el poder acceder a toda la lista de tópicos guardados en la base de datos y mostrarlos en pantalla.

<h1> ¿Cómo se desarrolló este proyecto? </h1>

Para desarrollar este proyecto fue necesario utilizar varias herramientas como:

**Spring Initializr**: Para poder crear el proyecto de Spring Boot, se utilizaron distintas dependencias y librerías, así también como configuraciones, como se muestra en la imagen:

![image](https://github.com/user-attachments/assets/5839257c-0c8d-4297-8f40-bf5529ebb9e5)

Se utilizó un entorno de desarrollo, en este caso fue IntelliJ IDEA:

![image](https://github.com/user-attachments/assets/e2133095-21ad-4c4e-be6b-4c2878f40095)

Como base de datos para guardar y disponer de la información, como los tópicos, fue necesario utilizar MySQL Workbench.

![image](https://github.com/user-attachments/assets/b54837e0-8989-43a9-869f-61e3148b444d)

Como herramienta de desarrollo que se utiliza principalmente para probar y depurar APIs REST, utilizamos **Insomnia**:

![image](https://github.com/user-attachments/assets/ef73fd66-aa2a-483e-b3a0-109b9b02ed75)

Por último, para generar y autenticar un token en formato JSON, fue importante utilizar la página y herramienta de **JWT** (JSON Web Token):

![image](https://github.com/user-attachments/assets/41ff1dd0-19e5-49f1-b70e-a6aceef9b7d4)

Con esta información proporcionada, será posible utilizar, interactuar y disfrutar de la aplicación ya disponible en el archivo guardado en este repositorio.
