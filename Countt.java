import java.io.File;
import java.io.FileInputStream;

class Countt {
    public static void main(String[] args) {
        
        try{
            int count =0;
            File f1 = new File("File.txt");
              FileInputStream fin = new FileInputStream(f1);
             

            
        String data =" ";
        while(true)
        {
     int x= fin.read();
     if(x=='t' || x=='T')
     {
        count++;
     }

     else if(x==-1)
     {
        break;
     }

     data = data + (char)x;
        }

        System.out.println(data);
        System.out.println(count);
        System.out.println();
    }
     catch (Exception e) {
          e.printStackTrace();
        }
    }
}
