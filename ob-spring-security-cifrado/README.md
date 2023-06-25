## Cifrado
Es el proceso de codificar la informacion de representacion original (texto plano) a texto
cifrado, de manera que solamente pueda ser descifrado utilizando una clave.

1- Almacenar contraseñas con una funcion hash.
2- Almacenar contraseñas con una función hash + salt.
3- Almacenar contraseñas con una función adaptativa + factor de trabajo.

La seguridad se gana haciendo que la validacion de contraseñas sea costosa computacionalmente.

## Algoritmos en Spring Security

* BCrypt
* PBKDF2
* scrypt
* argon2