package 解释器模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PianoContext pianoContext=new PianoContext(new ArrayList<>());
        Note note=new Note();
        note.translate(pianoContext);
    }
}
