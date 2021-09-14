package com.balamurugan.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.balamurugan.model.Cars;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class CarsMapper implements ResultSetMapper<Cars> {
  public Cars map(int idx, ResultSet rs, StatementContext ctx) throws SQLException {
    int carID = rs.getInt("carID");
    String carName = rs.getString("carName");
    double carPrice = rs.getDouble("carPrice");
    
    return new Cars(carID, carName, carPrice);
  }  
}
