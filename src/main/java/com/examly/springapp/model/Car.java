package com.examly.springapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @Column
private String carId;
@Column
private String carModel;
@Column
private String carNo;
@Column
private String status;
public Car(){

}
public String getCarId() {
    return carId;
}
public void setCarId(String carId) {
    this.carId = carId;
}
public String getCarModel() {
    return carModel;
}
public void setCarModel(String carModel) {
    this.carModel = carModel;
}
public String getCarNo() {
    return carNo;
}
public void setCarNo(String carNo) {
    this.carNo = carNo;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
     
}
