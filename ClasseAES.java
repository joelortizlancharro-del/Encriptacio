import javax.crypto.Cipher; 
import javax.crypto.spec.SecretKeySpec; 
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner; 
import  java.util.Arrays;


public class ClasseAES {

    Scanner sc = new Scanner(System.in);   

    public static void main(String[] args) {
        ClasseAES p = new ClasseAES();
        p.principal();
    }

    public void principal(){
        

        System.out.print("Introdueix la clau: ");
        String clau = sc.nextLine();

        System.out.print("Introdueix el missatge: ");
        String missatge = sc.nextLine();

        String encriptat = encripta(missatge, clau);
        System.out.println(encriptat);

        String finalMissatge = desencripta(encripta("jewfongofdlndolgbunfdgn", clau), clau);
        System.out.println(finalMissatge);
    }   
    
     public static String encripta(String missatge, String clau){
        
        Cipher cipher;
        byte[] missatgePreparat;
        String res = "";
        
        byte[] missatgeCifrat = missatge.getBytes(StandardCharsets.UTF_8);
        
        byte[] clauBytesMal = clau.getBytes(StandardCharsets.UTF_8);
        byte[] clauBytes = Arrays.copyOf(clauBytesMal, 16);
      
        SecretKeySpec clauSecreta = new SecretKeySpec(clauBytes, "AES");

        try {
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, clauSecreta);
            missatgePreparat = cipher.doFinal(missatgeCifrat);
            res = Base64.getEncoder().encodeToString(missatgePreparat);
        } catch (Exception e) {
            // TODO: handle exception
        }  
        return res;
    }

    public static String desencripta(String res, String clau){
        String missatgeFinal = null;
        byte[] missatgeXifrat;
        byte[] finalByte;

        Cipher cipher;

        byte[] bytesMal = clau.getBytes(StandardCharsets.UTF_8);
        byte[] byteCorrecte = Arrays.copyOf(bytesMal, 16);

        SecretKeySpec clauSecreta = new SecretKeySpec(byteCorrecte, "AES");

        try {
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, clauSecreta);
            missatgeXifrat = Base64.getDecoder().decode(res);
            finalByte = cipher.doFinal(missatgeXifrat);
            missatgeFinal = new String(finalByte, StandardCharsets.UTF_8);  
        } catch (Exception e) {
            // TODO: handle exception
        }

        return missatgeFinal;
    }
}
