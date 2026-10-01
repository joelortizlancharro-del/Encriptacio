import java.util.ArrayList;

public class encriptar {

    private ArrayList <Integer> missatgeEncriptat = new ArrayList<>();

    private ArrayList <Character> missatgePerIncriptar = new ArrayList<>();

    private  ArrayList <Integer> numerosPi = new ArrayList<>();

    private ArrayList <Integer> missatgeFinal = new ArrayList<>();

    private String pi = String.valueOf(Math.PI);

    private int A = 1;
    private int B = 2;
    private int C = 3;
    private int D = 4;
    private int E = 5;
    private int F = 6;
    private int G = 7;
    private int H = 8;
    private int I = 9;
    private int J = 10;
    private int K = 11;
    private int L = 12;
    private int M = 13;
    private int N = 14;
    private int O = 15;
    private int P = 16;
    private int Q = 17;
    private int R = 18;
    private int S = 19;
    private int T = 20;
    private int U = 21;
    private int V = 22;
    private int W = 23;
    private int X = 24;
    private int Y = 25;
    private int Z = 26;

    public ArrayList<Integer> encriptacio(String missatge, int clau){
        int recorreClau = 0;
        int contador = 0;

        for(int i = 0; i < missatge.length(); i++){
            if(missatge.charAt(i) == ' '){
                missatgePerIncriptar.add('0');
            }
            else{
                missatgePerIncriptar.add(missatge.charAt(i));
                missatgePerIncriptar.set(i, Character.toUpperCase(missatgePerIncriptar.get(i)));
            }
        
            if(missatgePerIncriptar.get(i) == 'A'){
                missatgeEncriptat.add(A);
            }
            else if(missatgePerIncriptar.get(i) == 'B'){
                missatgeEncriptat.add(B);
            } else if(missatgePerIncriptar.get(i) == 'C'){
                missatgeEncriptat.add(C);
            } else if(missatgePerIncriptar.get(i) == 'D'){
                missatgeEncriptat.add(D);
            } else if(missatgePerIncriptar.get(i) == 'E'){
                missatgeEncriptat.add(E);
            } else if(missatgePerIncriptar.get(i) == 'F'){
                missatgeEncriptat.add(F);
            } else if(missatgePerIncriptar.get(i) == 'G'){
                missatgeEncriptat.add(G);
            } else if(missatgePerIncriptar.get(i) == 'H'){
                missatgeEncriptat.add(H);
            } else if(missatgePerIncriptar.get(i) == 'I'){
                missatgeEncriptat.add(I);
            } else if(missatgePerIncriptar.get(i) == 'J'){
                missatgeEncriptat.add(J);
            } else if(missatgePerIncriptar.get(i) == 'K'){
                missatgeEncriptat.add(K);
            } else if(missatgePerIncriptar.get(i) == 'L'){
                missatgeEncriptat.add(L);
            } else if(missatgePerIncriptar.get(i) == 'M'){
                missatgeEncriptat.add(M);
            } else if(missatgePerIncriptar.get(i) == 'N'){
                missatgeEncriptat.add(N);
            } else if(missatgePerIncriptar.get(i) == 'O'){
                missatgeEncriptat.add(O);
            } else if(missatgePerIncriptar.get(i) == 'P'){
                missatgeEncriptat.add(P);
            } else if(missatgePerIncriptar.get(i) == 'Q'){
                missatgeEncriptat.add(Q);
            } else if(missatgePerIncriptar.get(i) == 'R'){
                missatgeEncriptat.add(R);
            } else if(missatgePerIncriptar.get(i) == 'S'){
                missatgeEncriptat.add(S);
            } else if(missatgePerIncriptar.get(i) == 'T'){
                missatgeEncriptat.add(T);
            } else if(missatgePerIncriptar.get(i) == 'U'){
                missatgeEncriptat.add(U);
            } else if(missatgePerIncriptar.get(i) == 'V'){
                missatgeEncriptat.add(V);
            } else if(missatgePerIncriptar.get(i) == 'W'){
                missatgeEncriptat.add(W);
            } else if(missatgePerIncriptar.get(i) == 'X'){
                missatgeEncriptat.add(X);
            } else if(missatgePerIncriptar.get(i) == 'Y'){
                missatgeEncriptat.add(Y);
            } else if(missatgePerIncriptar.get(i) == 'Z'){
                missatgeEncriptat.add(Z);
            }
            else if(missatgePerIncriptar.get(i) == '0'){
                missatgeEncriptat.add(0);
            }
        }
        
        for(int i = 0; i < missatgeEncriptat.size(); i++){
            
            if(contador == 0){
                int num = pi.charAt(contador+2) - '0';
                numerosPi.add(num);
                contador++;
            }
            else if(contador == 1){
                int num = pi.charAt(contador+2) - '0';
                numerosPi.add(num);
                contador++;
            }
            else{
                int num = pi.charAt(contador+2) - '0';
                numerosPi.add(num);
                contador++;
            }
            if(contador == 15){
                contador = 0;
            }
        }
        
        
        int numeroRandom = (int) (Math.random() * (missatgeEncriptat.size()-1)) + 1;
        for(int i = 0; i < missatgeEncriptat.size(); i++){
            recorreClau++;
            if(recorreClau != numeroRandom){
                missatgeFinal.add(missatgeEncriptat.get(i)*numerosPi.get(i));
            }
            else if(recorreClau == numeroRandom){
                missatgeFinal.add(missatgeEncriptat.get(i) * numerosPi.get(i) * clau);
                recorreClau = 0;
            }
        }
        missatgeFinal.add(clau);
        missatgeFinal.add(numeroRandom);
        return missatgeFinal;
    }

    

    
}