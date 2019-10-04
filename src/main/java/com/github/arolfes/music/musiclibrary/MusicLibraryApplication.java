package com.github.arolfes.music.musiclibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication(scanBasePackageClasses = { MusicLibraryApplication.class })
public class MusicLibraryApplication {

	public static void main(String[] args) {
	  SpringApplication springApplication = new SpringApplication(MusicLibraryApplication.class);
      springApplication.addListeners(new ApplicationPidFileWriter());
      springApplication.run(args);
	}

}
