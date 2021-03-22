package miranda.fernanda.mydigimind_miranda_fernanda

import java.io.Serializable

class Carrito: Serializable {
    var recordatorios = ArrayList<Recordatorio>()

    fun agregar(p: Recordatorio): Boolean{
        return recordatorios.add(p)
    }
}