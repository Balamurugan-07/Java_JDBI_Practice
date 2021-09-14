package com.balamurugan.persistence;

import org.skife.jdbi.v2.DBI;

public class DBConnection {
  private String url = "jdbc:mysql://localhost:3306/carsDemo?useSSL=false&allowPublicKeyRetrieval=true";
  private String uname = "root";
  private String pass = "bala";
  public final DBI connect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      DBI dbi = new DBI(url, uname, pass);
      return dbi;
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
