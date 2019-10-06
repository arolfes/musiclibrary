package com.github.arolfes.music.musiclibrary;

import org.testcontainers.containers.MySQLContainer;

public class MusicLibMySQLContainer extends MySQLContainer<MusicLibMySQLContainer> {

  private static MusicLibMySQLContainer container;

  private MusicLibMySQLContainer() {
      super();
  }

  public static MusicLibMySQLContainer getInstance() {
      if (container == null) {
          container = new MusicLibMySQLContainer();
          container.withDatabaseName("musiclibdb");
      }
      return container;
  }

  @Override
  public void start() {
      super.start();
      System.setProperty("DB_URL", container.getJdbcUrl());
      System.setProperty("DB_USERNAME", container.getUsername());
      System.setProperty("DB_PASSWORD", container.getPassword());
  }

  @Override
  public void stop() {
      // do nothing, JVM handles shut down
  }

}
