# UrgenciasMedicas
Un proyecto que tuve de estructura de datos


PROYECTO URGENCIAS MÉDICAS
Hacer un programa que controle las atenciones en el área de Urgencias del Inseguro Social. En el Inseguro, los médicos atienden a los pacientes en consultorios, pero no todo el tiempo hay suficientes para la atención requerida. Los médicos llevan un incentivo, que es prácticamente una comisión de $100.00 por cada consulta terminada. 
MENÚ DE OPCIONES:
1.	Alta de Médicos
2.	Llegada de Pacientes
3.	Atender un Paciente
4.	Fin de consulta
5.	Pacientes en la cola
6.	Pacientes que están siendo atendidos
7.	Historial de consultas
8.	Incentivos de los Médicos
9.	Salir

Alta de Médicos
Se requiere pedir el ID y el nombre del médico. Cada doctor deberá tener un estado: ocupado / desocupado. Los datos se guardarán en un arreglo. NOTA: no puede haber ID’s duplicados. El estado inicial del Médico será Desacupado. Si el ID del médico ya existe, se deberá desplegar un mensaje y regresar al menú principal.

Llegada de Pacientes
Al momento de la llegada de un paciente se le asigna un número (automáticamente iniciando del 1), se le pregunta su nombre y la enfermedad. Estos tres datos se guardarán y se ingresarán a un arreglo de pacientes, la cual se insertarán según llegada. NOTA: realmente se va a simular una cola, pero se va a ocupar solamente un arreglo de objetos.

Atender un Paciente
Primeramente, debemos asegurarnos de que haya pacientes en la cola, en segunda, que haya un Dr. desocupado; y en tercera, que haya un consultorio desocupado. En caso de que NO se cumpla alguna de las condiciones anteriores, mostrar un mensaje en pantalla y regresarse al menú principal. En cambio, si se cumplen las 3 condiciones, el paciente deberá ser eliminado de la Cola (habrá que recorrer el arreglo) y deberá ser pasado a otra estructura llamada Consultorios (debe ser un arreglo de objetos), la cual contendrá los datos del paciente (número, nombre y enfermedad) y deberá contener el número del Dr. que lo está atendiendo (va a tomar el primer Dr. que esté desocupado y se debe guardar únicamente el número del Dr.). El Dr. cambiará su estado a Ocupado, al igual que el Consultorio.

Fin de consulta
Debemos preguntar qué paciente es el que se va a terminar de atender, para ello, se ocupa listar los pacientes que estén en consulta, y el usuario escribirá el número de paciente (asegurarse de que ese número pertenezca a un paciente que está siendo consultado, si no, mandar un mensaje de error). Si sí está siendo consultado el Dr. cambiará de status, al igual que el consultorio (a Desocupados). Los siguientes datos pasan al arreglo de Historial: número y nombre del paciente, nombre del médico, nombre de la enfermedad y número de consultorio. Al médico se le agrega $100.00 por la consulta.

Pacientes en la Cola
Se deberá verificar si hay pacientes en la Cola. Si no los hay, imprimir un aviso y regresar al menú principal; y si los hay, listar su nombre y enfermedad.

Pacientes que están siendo atendidos
Se deberá listar los pacientes que están siendo atendidos, si es que los hay. Se deberá imprimir el nombre del paciente, enfermedad y el nombre del doctor que lo está atendiendo, así como el número de consultorio.

Historial de Consultas
Se lista los pacientes que han sido consultados en base a los siguientes datos:
Num Paciente	  Nom Paciente	     Nom. Médico	Enfermedad		Consultorio

Incentivos de los médicos
Se deberá mostrar los nombres de cada médico con su respectivo incentivo (total de comisiones).


ESTRUCTURA DEL PROGRAMA:
•	Se ocuparán 4 arreglos de objetos:
o	De Médicos
o	De Pacientes (el que simula la cola)
o	De consultorios. Se deberán crear 3 consultorios ya con los números pre-establecidos (del 1 al 3).
o	Historial de pacientes.
•	Por lo anterior se ocuparán al menos 9 clases: la principal, las 4 clases de cada estructura, y los 4 Oper (uno para casa estructura).


CRITERIO DE EVALUACIÓN:
1.	Alta de Médicos			
a.	Estructura de Médicos			5 puntos
b.	Funcionalidad				10 puntos
2.	Llegada de Pacientes
a.	Estructura de Pacientes		5 puntos
b.	Funcionalidad				10 puntos
3.	Atender un Paciente
a.	Funcionalidad				20 puntos
4.	Fin de consulta
a.	Funcionalidad				20 puntos
5.	Pacientes en la cola
a.	Funcionalidad				5 puntos
6.	Pacientes que están siendo atendidos
a.	Funcionalidad				5 puntos
7.	Historial de consultas
a.	Funcionalidad				10 puntos
8.	Incentivos de médicos.
a.	Funcionalidad				5 puntos
9.	Consultorios
a.	Estructura				5 puntos

Consultorio:
NumConsultorio  Estado     NumPaciente    NomPaciente    Enfermendad    NumMedico
2		 Ocupado       5                       Juan	     Covid	          8
