/**
 * The MusicPlayer class is responsible for playing a sequence of musical tones using multithreading.
 * It creates two threads that are synchronized to play specific tones at the correct sequence.
 * Each thread handles different musical tones, and the sequence is coordinated using semaphores to ensure 
 * proper synchronization between threads.
 * The tones include do, re, mi, fa, sol, la, si, and do-octave, played in the correct order to create a melody.
 * 
 * @author Bolatito Akinyemi
 * @version 1.0
 * @since 2024-12-02
 */




package FilePlayer;

import java.util.concurrent.Semaphore;

public class MusicPlayer {
    public static void main(String[] args) {
        FilePlayer player = new FilePlayer();

        // Semaphores for synchronization
        Semaphore semThread1 = new Semaphore(1); // Thread 1 starts
        Semaphore semThread2 = new Semaphore(0); // Thread 2 waits

        Thread thread1 = new Thread(() -> {
            try {
                String[] tonesThread1 = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
                for (String tone : tonesThread1) {
                    semThread1.acquire();
                    player.play(tone);
                    semThread2.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                String[] tonesThread2 = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
                for (String tone : tonesThread2) {
                    semThread2.acquire();
                    player.play(tone);
                    semThread1.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
