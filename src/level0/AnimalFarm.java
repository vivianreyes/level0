package level0;


	import java.io.File;

	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.swing.JOptionPane;

	public class AnimalFarm {

		AnimalFarm() {
			/*
			 * 1. Ask the user which animal they want, then play the sound of that
			 * animal.
			 */

			/* 2. Make it so that the user can keep entering new animals. *
			 * 
			 */
			
			String input = JOptionPane.showInputDialog("Which animal do you want? A cow, a duck, a dog, a cat, or a llama?");
			if(input.equals("cow"))
				playMoo();
			if(input.equals("duck"))
				playQuack();
			if(input.equals("dog"))
				playWoof();
			if(input.equals("cat"))
				playMeow();
			if(input.equals("llama"))
				playLlama();
				
		}
			
			void playMoo() {
			playNoise(mooFile);
		}

		void playQuack() {
			playNoise(quackFile);
		}

		void playWoof() {
			playNoise(woofFile);
		}
		void playLlama() {
			playNoise(llamaFile);
		}
		void playMeow() {
			playNoise(meowFile);
		}

		  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
		String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
		String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
		String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
		String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


		/* Ignore this stuff */

		public void playNoise(String soundFile) {
	    	try {
	   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(audioInputStream);
	   		 clip.start();
	   		 Thread.sleep(3400);
	    	} catch (Exception ex) {
	        	ex.printStackTrace();
	    	}
		}

		public static void main(String[] args) {
			new AnimalFarm();
		}

	}




