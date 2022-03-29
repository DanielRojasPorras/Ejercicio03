
abstract class Empleados{ // abstract nunca va a permitir crear un objeto de Empleados o sea de su clase
    var nombre : String = ""
    var edad : Int = 0
    var salario : Float = 0F
    val PLUS = 300

    constructor(nombre:String,edad:Int,salario:Float){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }
    abstract  fun Plus()
    override fun toString(): String {
        return "Empleados(nombre='$nombre', edad=$edad, salario=$salario, PLUS=$PLUS)"
    }

}

class Comercial(nombre:String,edad :Int, salario : Float , pcomision:Double) : Empleados(nombre,edad, salario) {

    var comision : Double

    init {
        comision = pcomision
    }

    override fun Plus() {
        if(this.edad > 30 && this.comision > 200){
            this.salario = this.salario + PLUS
        }
    }

//    override fun toString(): String {
//        return super.toString()
//    }
}

class  Repartidor (nombre:String,edad :Int, salario : Float , pzona : String) : Empleados(nombre,edad, salario) {
    var zona : String

    init {
        zona = pzona
    }

    override fun Plus() {
        if(this.edad < 25 && this.zona == "zona 3"){
            this.salario = this.salario + PLUS
        }
    }

}


fun main(args: Array<String>) {
    var comercial1 = Comercial("Daniel Rojas Porras",24,100.4F, 65.33)
    println("Comsion sin metodo Plus aplicado " + comercial1.nombre+" es: " + comercial1.salario )
    comercial1.Plus()
    println("Comsion con metodo Plus aplicado " + comercial1.nombre+" es: " + comercial1.salario )

    var comercial2 = Comercial("Juan Rojas Porras",32,300.4F, 355.33)
    println("Comsion sin metodo Plus aplicado " + comercial2.nombre+" es: " + comercial2.salario )
    comercial2.Plus()
    println("Comsion con metodo Plus aplicado " + comercial2.nombre+" es: " + comercial2.salario )

    var repartidor1 = Repartidor("Daniel Rojas Porras",24,2000.48F, "zona 3")
    println("Comsion sin metodo Plus aplicado " + repartidor1.nombre+" es: " + repartidor1.salario )
    repartidor1.Plus()
    println("Comsion con metodo Plus aplicado " + repartidor1.nombre+" es: " + repartidor1.salario )

    var repartidor2 = Repartidor("Juan Rojas Porras",32,600.4F, "zona 4")
    println("Comsion sin metodo Plus aplicado " + repartidor2.nombre+" es: " + repartidor2.salario )
    repartidor2.Plus()
    println("Comsion con metodo Plus aplicado " + repartidor2.nombre+" es: " + repartidor2.salario )


}