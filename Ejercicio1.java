import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String comando = "";
        do {
            System.out.print("CALCULADORA BÁSICA\n\n" + 
                "Ingrese expresión a calcular ('fin' para terminar), por " +
                " ejemplo:\n\n7+4*6\n112/5-456\n7.2*6-90\n8/3\nsen(45)\ncos(32)\n" +
                "tan(12.2)\n6.23^4\n\n> ");
            comando = input.nextLine();
            if (!comando.toLowerCase().equals("fin")) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                try {
                    System.out.println("Resultado: " + engine.eval(comando) + "\n");
                } catch (ScriptException e) {
                    System.out.println("Error: expresión inválida o no soportada.\n");
                }
            }
        } while (!comando.toLowerCase().equals("fin"));
    }
}