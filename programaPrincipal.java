import java.util.ArrayList;
import java.util.Scanner;

public class programaPrincipal {

    Scanner sc = new Scanner(System.in);

    encriptar e = new encriptar();
    descodificar d = new descodificar();

    public static void main(String[] args) {
        programaPrincipal p = new programaPrincipal();
        p.principal();
    }

    public void principal(){
        System.out.print("Quina es la clau, ha de ser un numero sencer: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Diguem el missatge per incriptar: ");
        String missatge = sc.nextLine();
        ArrayList<Integer> missatges = e.encriptacio(missatge, num);
        System.out.println(missatges);
        String holaa = d.desencriptar(missatges);
        System.out.println(holaa);
        
    }
}