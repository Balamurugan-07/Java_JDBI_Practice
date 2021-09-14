package com.balamurugan.persistence;
import java.util.List;
import com.balamurugan.model.Cars;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface CarsDAO {
  @SqlQuery("SELECT * FROM CARS")
  @Mapper(CarsMapper.class)
  List<Cars> listAllCars();

}