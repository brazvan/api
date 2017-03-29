/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.sun.org.apache.xalan.internal.XalanConstants;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.Scanner;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import sun.misc.BASE64Encoder;

public class API {
    
    private static Scanner scanner = new Scanner (System.in);
    private static SendGet sg = new SendGet();
    private static SendDelete sd = new SendDelete();
    private static SendPut sp = new SendPut();
    private static SendPost sendPost = new SendPost();
            
    public static void main(String[] args) throws Exception{
        
        
        
        boolean quit = false;
        
        while(!quit) {
            System.out.println("\nAlege:");
            printActions();
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch(action){
                case 0:
                    System.out.println("\nOprire");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Ai ales GET");
                    sg.sendGet();
                    break;
                case 2:
                    System.out.println("Ai ales PUT");
                    sp.sendPut();
                    break;
                case 3:
                    System.out.println("Ai ales DELETE");
                    sd.sendDelete();
                    break;
                case 4:
                    System.out.println("Ai ales POST");
                    //sendPost.sendPost();
                    break;
                case 5:
                    printActions();
                    break;
                default:
                    System.out.println("Nu e disponibil");
            }
        }
        
        
        
        
        
    } 
    
    private static void printActions(){
        System.out.println("\nActiuni: \n");
        System.out.println("0  - Oprire\n" +
                           "1  - GET\n" +
                           "2  - PUT\n" + 
                           "3  - DELETE\n" +
                           "4  - POST\n" +
                           "5  - Lista optiuni\n");
        System.out.println("Alege: ");
    }
    
    
    private static void verifyPut(String url){
        
    }
    
}
