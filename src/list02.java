import java.io.*;
import java.util.Scanner;

public class list02 {
    public static void arqOrigenDestino(String nomeArqOrigem, String nomeArqDestino) throws IOException, FileNotFoundException {
        //File arq = new File(nomeArqOrigem);
        InputStream is = new FileInputStream(nomeArqOrigem);
        OutputStream os = new FileOutputStream(nomeArqDestino);
        byte[] byteRead = is.readAllBytes();
        os.write(byteRead);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nomeArqOrig, nomeArqDest;
        Scanner sc = new Scanner((System.in));
        System.out.println("Digite o nome do aquivo origem com o .txt");
        nomeArqOrig = sc.nextLine();
        System.out.println("Digite o nome do aquivo destino com o .txt");
        nomeArqDest= sc.nextLine();
        long tempoInicio = System.currentTimeMillis();
        arqOrigenDestino(nomeArqOrig, nomeArqDest);
        System.out.println("O tempo da cópia foi de: "+(System.currentTimeMillis() - tempoInicio)+ " milisegundos");
    }
}