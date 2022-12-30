package parallel;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static parallel.atmserver.ser;

public class atmserver {
    static ServerGui2 ser;
    static String data="";
    static final int PORT = 8001;
    static  int c_num=1;

     
    static ArrayList<ThreadServer> clients = new ArrayList<>();

    public static void main(String[] args) {
         ser=new ServerGui2();
        ser.setVisible(true);

        ServerSocket serverSocket = null;
        ser.jTextArea1.append("Witing for clients to connect \n");
///////////////////////////////////////////


Socket s = null;

/////////////////////////////////////
        try {

            serverSocket = new ServerSocket(PORT);

            while (!serverSocket.isClosed()){

                Socket socket = serverSocket.accept();
                System.out.println("A new client is connected : " + socket);
                
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    /////////////////////////////////////////////////
                
                    data = dis.readUTF();
                    
                    System.out.println(data);
                    
                    ser.jTextArea1.append(data+" is connected on " + socket.getLocalPort()+"\n");

                    dos.writeUTF("you are connected");
                    dos.flush();
                    ///////////////////////////////////////////////
                    
                ThreadServer threadedClient = new ThreadServer(socket,dis,dos,data);
                 

                clients.add(threadedClient);

                threadedClient.start();

            }
            
            
            
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}



class ThreadServer extends Thread
{

    private Socket socket;
    final DataInputStream dis;
    final DataOutputStream dos;

    boolean exist;
    double balance=5000;
    double money=0;
    String data="";
    public ThreadServer(Socket socket, DataInputStream dis, DataOutputStream dos, String data){
        
        this.socket = socket;
        this.dis=dis;
        this.dos=dos;
        this.data=data;
        //this.pass=pass;
        //this.name = name;
    }
@Override
    public void run(){
 
        System.out.println(" new client on " + socket.getLocalPort());

        String received;
        String toreturn;
         boolean fL=true;
         boolean fL2=true;
         boolean fB=true;
         boolean fW=true;
         boolean fD=true;
         boolean fT=true;
    
        while (true){
        
        
            
            try {

                //dis = new DataInputStream(socket.getInputStream());
                //dos = new DataOutputStream(socket.getOutputStream());
                
                received = dis.readUTF();

                if(received.equals("exitttt"))
                {
                      toreturn = data+" closed connection";
                   
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
                this.socket.close();
                ser.jTextArea1.append("Connection. closed\n");
                break;
                }

                if (received.contains("logged") && fL==true)
                        {
                          fL=false;
                    toreturn = data+received+" on"+socket.getLocalPort();
                 
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
            
                    }
                
                 if (received.contains("login") && fL2==true)
                        {
                      fL2=false;
                    toreturn = data+received+" on"+socket.getLocalPort();
                  
                    dos.writeUTF(toreturn);
                    
                    ser.jTextArea1.append(toreturn+"\n");
               
                    }
                   
                if (received.contains("deposite")&& fD==true)
                        {
                           fD=false;
                    toreturn = data+received;
                  
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
                    
                        }
              if (received.contains("withdraw")&& fW==true)
                        {
                          fW=false;
                    toreturn = data+received;
                   
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
                    
                    }
                    
                  if (received.contains("balance")&& fB==true)
                        {
                           fB=false;
                    toreturn = data+received;
                  
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
                    
                    }
                   if (received.contains("transacted")&& fT==true)
                        {
                           fT=false;
                    toreturn = data+" "+received;
                 
                    dos.writeUTF(toreturn);
                    ser.jTextArea1.append(toreturn+"\n");
                    
                    }
                   
                
                
              

            } catch (IOException ex) {
                Logger.getLogger(ThreadServer.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        
        
        //end while
        }
/*catch (IOException e){
                
                try {
                    socket.setSoTimeout(600000);
                } catch (SocketException ex) {
                    Logger.getLogger(ThreadServer.class.getName()).log(Level.SEVERE, null, ex);
                }
}
            
        }
        
        //end while*/

try
{
// closing resources
this.dis.close();
this.dos.close();

}catch(IOException e){
}////////////////////////
        

    }

}