// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(1, 2, 3)
    
    fun matricular(usuario: Usuario) {
        
    }
}

fun main() {
    val nivel = Nivel.BASICO
    val message = when (nivel) {                     
        Nivel.BASICO -> "Nível: Básico"
        Nivel.INTERMEDIARIO -> "Nível: Intermediário"
        Nivel.AVANÇADO -> "Nível: Avançado"
    }
    println(message)
    val conteudoEducacional = ConteudoEducacional("Conteúdo 1", 1)
    println(conteudoEducacional)                                          
}
