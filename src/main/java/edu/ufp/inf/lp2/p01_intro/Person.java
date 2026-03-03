package edu.ufp.inf.lp2.p01_intro;

import java.time.LocalDate;
import java.time.Period;

public class Person {

  private String idNumber;
  private String name;
  private String address;
  private LocalDate birth;

  public Person(String idNumber, String name, String address, LocalDate birth) {
    this.idNumber = idNumber;
    this.name = name;
    this.address = address;
    this.birth = birth;
  }

  public String getIdNumber() {
    return idNumber;
  }
  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }
  public LocalDate getBirth() {
    return birth;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public void setBirth(LocalDate birth) {
    this.birth = birth;
  }

  public int age() {
    return Period.between(birth, LocalDate.now()).getYears();
  }

  public boolean olderThan(Person p) {
    return this.birth.isBefore(p.birth);
  }

  @Override
  public String toString() {
    return "Person{" +
            "idNumber='" + idNumber + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", birth=" + birth +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;
    return idNumber.equals(person.idNumber);
  }

  @Override
  public int hashCode() {
    return idNumber.hashCode();
  }
}