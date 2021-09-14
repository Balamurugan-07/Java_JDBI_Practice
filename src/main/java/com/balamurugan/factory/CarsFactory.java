package com.balamurugan.factory;
import com.balamurugan.persistence.CarsDAO;
import com.balamurugan.persistence.DBConnection;
import com.balamurugan.model.*;
import java.util.List;
public class CarsFactory {
  protected CarsFactory() {

  }
  public static CarsDAO dao() {
    DBConnection db = new DBConnection();
    return db.connect().onDemand(CarsDAO.class);
  }
  
  public static List<Cars> getAllCars() {
    return dao().listAllCars();
  }

}
