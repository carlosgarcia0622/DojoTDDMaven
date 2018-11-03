# DojoTDDMaven
[ ![Codeship Status for carlosgarcia0622/DojoTDDMaven](https://app.codeship.com/projects/cf73e820-c1a0-0136-4ecd-36058d66dee7/status?branch=master)](https://app.codeship.com/projects/313711)

Piramide de pruebas propuesta por Mike Cohn:

Base: pruebas unitarias (Las hace el desarrollador). Probar un escenario concreto de la aplicacion. Ej: metodo sumar Se hace con: Gunit(Java), scala test, python test, moca (node)

Segundo: Pruebas de servicios: Pruebas de integracion como de Apis. ejm Api rest de una calculadora enviar dos nums y que devuelva el resultado. valida que se devuelva el json o lo que sea requerido

Tope: Interfaz grafica: hay plataformas que hacen pruebas de aceptacion a la IG 

Cobertura: Porcentaje de código cubierto por pruebas


TODAS LAS PRUEBAS DEBEN SER AUTOMATIZADAS!!!

TDD: Test Driven Development -> Primero hago la prueba y luego hago el codigo para que la prueba funcione.
	Pasos: 
	- 1 Prueba: 
			- Falla porque no hay codigo
	- 2 Codigo: 
			- Pasa la prueba (Basado en baby stps)
	- 3 Refactor:   
			- Si la prueba funciona se determina si hace falta un refactor, en ese caso se debe hacer una nueva prueba y volver al paso 1
			(Refactor puede ser cambiar nombre de variables por ejm)

	Se le llama baby stepts a esta metodologia porque la idea es hacer todo por pequenos pasos

	Cuando no se hacen pruebas desde el inicio se queda con algo denominado deuda tecnica

Ejm java:

Class CalculadoraTest{
	sumar_1_1(){				   //Los componentes necesarios en toda prueba unitaria son:
		Calculadora c = new Calculadora(); //Arranque: Todos los elementos que se necesitan para hacer la prueba
		int r = c.sumas(1,1);		   //Act: Actuar
		Assert(2,r);			   //Assert: Determinar si la prueba es exitosa o no
	}	
}

Al compilar sale error porque no existe la clase calculadora

Class CAlculadora{
	int sumar(int a, int b){
		return 2;		//Este es un baby stept con el que la prueba va a funcionar, luego se puede hacer el refactor
	}
}


//Otra prueba en CalculadoraTest:
	
	sumar-2-2(){
		Calculadora c = new Calculadora(); //Arranque: Todos los elementos que se necesitan para hacer la prueba
		int r = c.sumas(2,2);		   //Act: Actuar
		Assert(4,r);			   //Assert: Determinar si la prueba es exitosa o no
	}

// Ahora hacemos un refactor al metodo sumar:

Class CAlculadora{
	int sumar(int a, int b){
		return a+b;		//Este es un baby stept con el que la prueba va a funcionar, luego se puede hacer el refactor
	}
}


//Ahora se puede hacer un refactor en la clase CalculadoraTest y crear el objeto por fuera de los metodos


Concepto Coverage: Que porcentaje de mis lineas de codigo estan cubiertas por pruebas. En este ejemplo el 100% (Pueden ser cubiertas por pruebas unitarias o pruebas de servicio)
Una cosa es covertura y otra pertinencia: las pruebas de este codigo no cubren todos los escenarios posibles

_____________________________________________________________________________________________________________________________________________________________________________________________________________

Clase 27 Octubre: DOJO TDD

CODE BREAKER: Algoritmo que permite adivinar un número y dar una respuesta para ese número: El algoritmo tiene un número secreto


_____________________________________________________________________________________________________________________________________________________________________________________________________________

C.I Server: ejm jenkins, circle, travis, codeship, etc

Servidor de integración continua que detecta cuando se hace un cambio en el manejador de versiones. Cada que hay un cambio debe hacer:

	-configurar ambiente e instalar dependencias	//EStas tres cosas se conocen como: la build del proyecto
	-build (compilar)
	-Testear

EL objetivo principal de la integracion continua es que despues de cada cambio se pueda saber si el proyecto completo compila correctamente. Cheackout del proyecto

- En clase se va a usar codeship



