import java.io.*;
import java.util.ArrayList;

public class ManejadorArchivo {

 public ArrayList<Integer> leer() throws IOException {
     String rutaArchivo = "C:/Users/PC/Documents/archivo.txt";
     File archivo = new File(rutaArchivo);
     ArrayList<Integer> numberList = new ArrayList<>();

     InputStream inputStream = new FileInputStream(archivo);
     InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
     BufferedReader reader = new BufferedReader(inputStreamReader);


     try {

      String line;
       while ((line = reader.readLine()) != null) {
       int number = Integer.parseInt(line);
       numberList.add(number);
      }
     }catch(Exception e){
      System.out.println("error en la ejecucion del programa"+ e.getMessage());

     }finally {
      try {
       // Cierra el BufferedReader y el InputStream al finalizar
       if (reader != null) {
        reader.close();
       }
       if (inputStream != null) {
        inputStream.close();
       }
      } catch (IOException e) {
       e.printStackTrace();
      }
     }
     return numberList;
  }
}
