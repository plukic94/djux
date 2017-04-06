package seminarski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static seminarski.Funkcije.PORT_NUMBER_CLIENT;

public class threads implements Runnable {

    public static volatile Socket client = null;
    @Override
    public void run() {
        try {
            while (true) {
                if(GUI.program == GUI.TipPrograma.SERVER){
                    ServerSocket server = new ServerSocket(PORT_NUMBER_CLIENT);
                    client = server.accept();
                    InputStream in = client.getInputStream();  
                    BufferedReader inTitle = new BufferedReader(new InputStreamReader(in));
                    String title = inTitle.readLine();
                    String folder_name = "projekti/" +title.substring(0,8)+ "-"+title.charAt(8);
                    File folder=new File(folder_name);
                    if(!folder.isDirectory())
                        folder.mkdir();
                    String file_name = "projekti/"+folder.getName()+"/"+title.substring(9);
                    File new_file = new File(file_name);
                    if(!new_file.isFile())
                        new_file.createNewFile();
                    OutputStream out = new FileOutputStream(file_name);
                    byte bytes[] = new byte[4*4096];
                    int count;
                    while ((count = in.read(bytes)) > 0) {
                        System.out.println(count);
                        out.write(bytes, 0, count);
                    }
                    in.close();
                    out.close();
                    client.close();
                    server.close();
                    client = new Socket(Funkcije.HOST_NAME[0],PORT_NUMBER_CLIENT);
                    OutputStream output= client.getOutputStream();
                    PrintWriter pw=new PrintWriter(output);
                    pw.write("Послато");
                    client.close();
                    output.close();
                    pw.close();
                    }
                }
                }
             catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                String errorMessage=ex.getMessage();
                 JOptionPane.showMessageDialog(IndentityCheck.frame,errorMessage);
            }
    }
}