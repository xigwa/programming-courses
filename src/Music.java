//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.UnsupportedAudioFileException;
//import java.io.File;
//import java.io.IOException;
//
//public class Music {
//
//    public void Music(String filePath) {
//        try {
//            File musicFile = new File(filePath);
//
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
//
//            Clip clip = AudioSystem.getClip();
//
//            clip.open(audioStream);
//
//            clip.start();
//
//            Thread.sleep(clip.getMicrosecondLength() / 1000);
//        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
//            e.printStackTrace();
//        }
//    }
//}
