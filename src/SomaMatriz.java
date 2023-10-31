import java.security.SecureRandom;

public class SomaMatriz {
    public static void main(String[] args){
        int linhaA = 2;
        int colunaA = 2;
        
        int linhaB = 2;
        int colunaB = 2;
        
        int linhaC = 2;
        int colunaC = 2;
        
        int[][] numerosA = new int[linhaA][colunaA];
        int[][] numerosB = new int[linhaB][colunaB];
        int[][] matrizC = new int[linhaC][colunaC];

        for(int l=0;l<linhaA;l++){
            for(int c=0;c<colunaA;c++){
                numerosA[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for(int l=0;l<linhaB;l++){
            for(int c=0;c<colunaB;c++){
                numerosB[l][c] = new SecureRandom().nextInt(100);
            }
        }

        for(int l=0;l<linhaC;l++){
            for(int c=0;c<colunaC;c++){
                matrizC[l][c] = numerosA[l][c] + numerosB[l][c];
            }
        }

        for(int l=0;l<linhaC;l++){
            for(int c=0;c<colunaC;c++){
                System.out.printf("| %d | ", numerosA[l][c]);
            }
            System.out.println("\n");
        } 

        for(int l=0;l<linhaC;l++){
            for(int c=0;c<colunaC;c++){
                System.out.printf("| %d | ", numerosB[l][c]);
            }
            System.out.println("\n");
        }
        
        for(int l=0;l<linhaC;l++){
            for(int c=0;c<colunaC;c++){
                System.out.printf("| %d | ", matrizC[l][c]);
            }
            System.out.println("\n");
        }
    }
}
