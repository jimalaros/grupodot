# Comienzo 🚀

## Instalación 🔧

_Estas instrucciones te permitirán correr el proyecto y realizar las pruebas_

1. Clona el repositorio en este [link](https://github.com/jimalaros/grupodot) e instala las dependencias.

3. Correr el proyecto.

4. Dirigirse al siguiente [link](http://localhost:8080/swagger-ui/index.html) para empezar a interactuar y hacer las pruebas.

5. En caso de no querer clonar, dirigirse al siguiente [link](https://grupodot.herokuapp.com/swagger-ui/index.html) para empezar a interactuar y hacer las pruebas.

6. El único usuario creado en util/users es:

|       correo       |    contraseña   |         ID        |
|--------------------|-----------------|-------------------|
|   user@gmail.com   |      123456     |    1667608142618  | 

Datos que se pueden observar en el endpoint de "users-controller"

7. Para generar el token, dirigirse al endpoint "auth-controller" y llenar todo el body, de la siguiente manera

```
{
  "email": "user@gmail.com",
  "password": "123456",
  "userId": "1667608142618"
}
```

8. En el endpoint "palindromo-controller" ingresa la cadena o frase a evaluar donde es requerido (como parametro)
