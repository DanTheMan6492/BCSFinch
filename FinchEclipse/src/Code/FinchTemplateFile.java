package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile {
	
	public static final int Wn = 1200;
	public static final int Hn = Wn/2;
	public static final int Qn = Hn/2;
	public static final int En = Qn/2;
	
	public static final int A2  = 110;
	public static final int C3  = 131;
	public static final int D3s = 156;
	public static final int E3  = 165;
	public static final int G3s = 208;
	public static final int A3  = 220;
	public static final int C4  = 262;
	public static final int D4  = 294;
	public static final int D4s = 311;
	public static final int E4  = 330;
	public static final int F4  = 350;
	public static final int G4  = 392;
	public static final int G4s = 415;
	public static final int A4  = 440;
	
	public static final int C5  = 523;
	public static final int C5s = 554;
	public static final int D5  = 587;
	public static final int D5s = 623;
	public static final int E5  = 659;
	
	public static void main(final String[] args){
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      // Write some code here!
      myFinch.playTone(A4 , 1000, Wn);
      myFinch.sleep(5);
      myFinch.playTone(D4s, 1000, Qn);
      
      myFinch.playTone(E4 , 1000, En);
      myFinch.playTone(C5s, 1000, En);
      myFinch.playTone(G4s, 1000, En);
      myFinch.playTone(E4 , 1000, Qn);
      myFinch.playTone(C5 , 1000, Wn);
      
      myFinch.playTone(E5 , 1000, Qn);
      myFinch.playTone(D5 , 1000, Qn);
      myFinch.playTone(C5 , 1000, En);
      myFinch.sleep(En);
      myFinch.playTone(A4 , 1000, Wn);
      
      myFinch.playTone(D4s, 1000, Qn);
      myFinch.playTone(E4 , 1000, En);
      myFinch.playTone(C5s, 1000, En);
      myFinch.playTone(G4s, 1000, En);
      myFinch.playTone(E4 , 1000, Qn);
      myFinch.playTone(C5 , 1000, Wn);
      
      myFinch.playTone(E5 , 1000, Qn);
      myFinch.playTone(D5 , 1000, Qn);
      myFinch.playTone(C5 , 1000, En);
      myFinch.sleep(En);
      myFinch.playTone(A4 , 1000, Wn);
      
      myFinch.playTone(D4 , 1000, Qn);
      myFinch.playTone(E4 , 1000, En);
      myFinch.playTone(C5s, 1000, En);
      myFinch.playTone(E4 , 1000, En);
      myFinch.playTone(A4 , 1000, Qn);
      myFinch.playTone(E3 , 2000, Hn);
      myFinch.playTone(G3s, 1000, Hn);
      
      myFinch.playTone(E5 , 1000, Qn);
      myFinch.playTone(D5s, 1000, Qn);
      myFinch.playTone(D5 , 1000, Qn);
      myFinch.playTone(C5 , 1000, Qn);
      myFinch.playTone(D4s, 1000, En);
      myFinch.sleep(1);
      myFinch.playTone(D4s, 2000, En);
      myFinch.playTone(C5 , 2000, En);
      myFinch.playTone(D5 , 2000, En);
      myFinch.playTone(A3 , 4000, Qn);
      myFinch.playTone(C4 , 4000, Qn);
      myFinch.playTone(A3 , 4000, Hn);
      
      
      
      //myFinch.playTone(660, 1000, Wn);
      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

