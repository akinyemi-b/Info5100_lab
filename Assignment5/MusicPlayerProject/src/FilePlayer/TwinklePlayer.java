/**
 * The TwinklePlayer class extends the MusicPlayer functionality to play the song 
 * "Twinkle Twinkle Little Star" using multithreading and synchronization.
 * The class defines the melody of the song and uses semaphores to ensure that
 * the two threads alternate their playback of musical tones in a synchronized manner.
 * 
 * @author Bolatito Akinyemi
 * @version 1.0
 * @since 2024-12-02
 */




package FilePlayer;

import java.util.concurrent.Semaphore;

public class TwinklePlayer {
    public static void main(String[] args) {
        FilePlayer player = new FilePlayer();

        // Semaphores for synchronization
        Semaphore semThread1 = new Semaphore(1); // start the thread 1 
        Semaphore semThread2 = new Semaphore(0); // to start thread 2

        // Twinkle Twinkle sequence
        String[][] sequence = {
            {"do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav"},
            {"fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"},
            {"sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav"},
            {"do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav"},
            {"fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"}
        };

        Thread thread1 = new Thread(() -> {
            try {
                for (String[] part : sequence) {
                    for (String tone : part) {
                        if (tone.contains("do.wav") || tone.contains("mi.wav") || tone.contains("sol.wav")) {
                            semThread1.acquire();
                            player.play(tone);
                            semThread2.release();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                for (String[] part : sequence) {
                    for (String tone : part) {
                        if (tone.contains("re.wav") || tone.contains("fa.wav") || tone.contains("la.wav")) {
                            semThread2.acquire();
                            player.play(tone);
                            semThread1.release();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
