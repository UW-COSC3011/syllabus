/**
 * @author Kim Buckner
 * Date: Feb 01, 2017
 *
 *
 * A starting point for the COSC 3011 programming assignment
 * Probably need to fix a bunch of stuff, but this compiles and runs.
 *
 * This COULD be part of a package but I choose to make the starting point NOT a
 * package. However all other added elements can certainly be sub-packages, and
 * probably should be. 
 *
 * Main should NEVER do much more than this in any program that is
 * user-interface intensive, such as this one. 
 */

import javax.swing.*;
import java.awt.*;

public class Main 
{

  // Probably should declare any buttons here
  public JButton lbutton, rbutton, mbutton;
  

  public static void main(String[] args)
  {
    // This is the play area
    // HEY FIX THE NAME, WHAT IS ****YOUR**** GROUP
    GameWindow game = new GameWindow("Group X aMaze");
    
    // have to override the default layout to reposition things!!!!!!!

    game.setSize(new Dimension(900, 1000));
    
    // So the debate here was, do I make the GameWindow object the game
    // or do I make main() the game, manipulating a window?
    // Should GameWindow methods know what they store?
    // Answer is, have the "game" do it.

    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    game.getContentPane().setBackground(Color.cyan);
    game.setUp();
    
    // May or may not need this
    
    game.setVisible(true);

    // You will HAVE to read some documentation and catch exceptions so get used
    // to it. 

    try {
      // The 4 that are installed on Linux here
      // May have to test on Windows boxes to see what is there.
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
      // This is the "Java" or CrossPlatform version and the default
      //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
      // Linux only
      //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
      // really old style Motif 
      //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    } 
    catch (UnsupportedLookAndFeelException e) {
     // handle possible exception
    }
    catch (ClassNotFoundException e) {
     // handle possible exception
    }
    catch (InstantiationException e) {
     // handle possible exception
    }
    catch (IllegalAccessException e) {
     // handle possible exception
    }
  
  }
  
};
