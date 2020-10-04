import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws Exception {

        File f = new File("newFile.txt");
       FileOutputStream fout = new FileOutputStream(f);
       DataOutputStream dos = new DataOutputStream(fout);
       dos.writeUTF("Hello My name is Ayush.");

       FileInputStream fis = new FileInputStream(f);
       DataInputStream dis = new DataInputStream(fis);
       String s = dis.readUTF();
       System.out.println(s);

       pencil p = new pencil();
       ObjectOutputStream oos = new ObjectOutputStream(fout);
       oos.writeObject(p);

       ObjectInputStream ois = new ObjectInputStream(fis);
       pencil pe = (pencil) ois.readObject();
       System.out.println(pe.cost +" "+pe.name);



    }
}
class pencil implements Serializable{
    int cost=1;
    String name="Ayush";
}
