/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilePlayer;

/**
 *
 * @author Bolatito Akinyemi
 */


import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FilePlayer {
    public void play(String filePath) {
        try {
            // Use absolute path for debugging or relative path for deployment
            File file = new File(filePath);
            System.out.println("Playing: " + file.getAbsolutePath());

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Ensure the audio plays completely
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
}
