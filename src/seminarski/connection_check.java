package seminarski;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static seminarski.Funkcije.PORT_NUMBER_SERVER;

public class connection_check implements Runnable{
    
    public connection_check() {
    }

    @Override
    public void run() {
       ServerSocket server;
        try {
            server = new ServerSocket(PORT_NUMBER_SERVER);
            Socket client = server.accept();
            InputStream response = client.getInputStream();  
            BufferedReader response_rdr = new BufferedReader(new InputStreamReader(response));
            String response_msg = response_rdr.readLine();
            System.out.println(response_msg);
            server.close();
            client.close();
            response.close();
            response_rdr.close();
        } 
            catch (IOException ex) {
                Logger.getLogger(connection_check.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
