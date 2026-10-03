import java.util.ArrayList;
public class descodificar{
    
    private int clau; 
    private int numeroRandom;
    private int contadorRandom = 0;
    private int contadorPi = 0;
    private ArrayList<Integer> senseClau = new ArrayList<>();
    private ArrayList<Character> missatgeDesencriptat = new ArrayList<>();

    private String pi = String.valueOf(Math.PI);
    private ArrayList<Integer> numeroPi = new ArrayList<>();
    
    
    public String desencriptar(ArrayList<Integer> missatgeEncriptat){

        numeroRandom = missatgeEncriptat.get(missatgeEncriptat.size()-1);
        clau = missatgeEncriptat.get(missatgeEncriptat.size()-2);
        System.out.println(missatgeEncriptat.size()-2);

          for(int j = 0; j < missatgeEncriptat.size()-2; j++){
            numeroPi.add(pi.charAt(contadorPi+2) - '0');
            contadorPi++;
            if(contadorPi == 15){
                contadorPi =0;
            }
        }
        for(int i = 0; i < missatgeEncriptat.size()-2; i++){
            contadorRandom++;
            if(contadorRandom == numeroRandom){
                senseClau.add(missatgeEncriptat.get(i)/numeroPi.get(i)/clau);
                contadorRandom = 0;
            }
            else{
                senseClau.add(missatgeEncriptat.get(i)/numeroPi.get(i));
            }
        }
      System.out.println(senseClau.size());
       

        for(int p = 0; p < senseClau.size(); p++){
            if(senseClau.get(p) == 1){
                missatgeDesencriptat.add('A');
            }
            else if(senseClau.get(p) == 2){
                missatgeDesencriptat.add('B');
            }
            else if(senseClau.get(p) == 3){
                missatgeDesencriptat.add('C');
            }
            else if(senseClau.get(p) == 4){
                missatgeDesencriptat.add('D');
            }
            else if(senseClau.get(p) == 5){
                missatgeDesencriptat.add('E');
            }
            else if(senseClau.get(p) == 6){
                missatgeDesencriptat.add('F');
            }
            else if(senseClau.get(p) == 7){
                missatgeDesencriptat.add('G');
            }
            else if(senseClau.get(p) == 8){
                missatgeDesencriptat.add('H');
            }
            else if(senseClau.get(p) == 9){
                missatgeDesencriptat.add('I');
            }
            else if(senseClau.get(p) == 10){
                missatgeDesencriptat.add('J');
            }
            else if(senseClau.get(p) == 11){
                missatgeDesencriptat.add('K');
            }
            else if(senseClau.get(p) == 12){
                missatgeDesencriptat.add('L');
            }
            else if(senseClau.get(p) == 13){
                missatgeDesencriptat.add('M');
            }
            else if(senseClau.get(p) == 14){
                missatgeDesencriptat.add('N');
            }
            else if(senseClau.get(p) == 15){
                missatgeDesencriptat.add('O');
            }
            else if(senseClau.get(p) == 16){
                missatgeDesencriptat.add('P');
            }
            else if(senseClau.get(p) == 17){
                missatgeDesencriptat.add('Q');
            }
            else if(senseClau.get(p) == 18){
                missatgeDesencriptat.add('R');
            }
            else if(senseClau.get(p) == 19){
                missatgeDesencriptat.add('S');
            }
            else if(senseClau.get(p) == 20){
                missatgeDesencriptat.add('T');
            }
            else if(senseClau.get(p) == 21){
                missatgeDesencriptat.add('U');
            }
            else if(senseClau.get(p) == 22){
                missatgeDesencriptat.add('V');
            }
            else if(senseClau.get(p) == 23){
                missatgeDesencriptat.add('W');
            }
            else if(senseClau.get(p) == 24){
                missatgeDesencriptat.add('X');
            }
            else if(senseClau.get(p) == 25){
                missatgeDesencriptat.add('Y');
            }
            else if(senseClau.get(p) == 26){
                missatgeDesencriptat.add('Z');
            }
            else if(senseClau.get(p) == 27){
                missatgeDesencriptat.add(',');
            }
            else if(senseClau.get(p) == 28){
                missatgeDesencriptat.add('.');
            }
            else if(senseClau.get(p) == 0){
                missatgeDesencriptat.add(' ');
            }
        }
         String paraula = "";
        for(int i = 0; i < missatgeDesencriptat.size(); i++){
            paraula = paraula + missatgeDesencriptat.get(i);
        }
        return paraula;
    }

    
}