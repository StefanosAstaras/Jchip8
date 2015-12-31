package Jchip8;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import javax.swing.*;

class Display extends JFrame
{
    public Display(KeyListener keyboard)
    {
		super("Jchip8");
        addKeyListener(keyboard);
        setSize(1280, 720);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Keyboard extends JFrame implements KeyListener
{
    public Keyboard()
    {
		super();
	}
    public void keyPressed(KeyEvent e)
    {
        System.out.println("Key!");
    }
    public void keyReleased(KeyEvent e)
    {
        System.out.println("No Key!");
    }
    public void keyTyped(KeyEvent e)
    {
        ;
    }
}

class Timer
{
    ;
}

class SoundTimer extends Timer
{
    ;
}

public class Jchip8
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Hello, world!");
        byte opcode;
		byte[] memory = new byte[4096];
		byte[] registers = new byte[16];
		byte index_register;
		byte program_counter;
		Timer delay_timer;
		SoundTimer sound_timer;
        Keyboard keys = new Keyboard();
        Display screen = new Display(keys);
    }
}
