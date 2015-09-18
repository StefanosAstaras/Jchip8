package jchip8;

class Display {
    ;
}

class Keyboard {
    ;
}

class Timer {
    ;
}

class SoundTimer extends Timer {
    ;
}

public class Jchip8 {
    byte opcode;
    byte[] memory = new byte[4096];
    byte[] registers = new byte[16];
    byte index_register;
    byte program_counter;
    Display screen;
    Keyboard keys;
    Timer delay_timer;
    SoundTimer sound_timer;
    
    public static void main(String[] args) {
        ;
    }

}