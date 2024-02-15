import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    ClientStr cliente = new ClientStr();
    try{
      cliente.connetti();
      cliente.comunica();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}