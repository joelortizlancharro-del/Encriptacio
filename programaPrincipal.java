import java.util.Scanner;

public class programaPrincipal {

    Scanner sc = new Scanner(System.in);

    encriptar e = new encriptar();

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
        System.out.println(e.encriptacio(missatge, num));
    }
}