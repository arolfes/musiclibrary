package com.github.arolfes.music.musiclibrary;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.MySQLContainer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MusicLibraryApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("INTEGRATION_TEST")
@ContextConfiguration
public class MusicLibraryApplicationTests {

  @ClassRule
  public static MySQLContainer<MusicLibMySQLContainer> mysql = MusicLibMySQLContainer.getInstance();

	@Test
	public void contextLoads() {
	}

}
