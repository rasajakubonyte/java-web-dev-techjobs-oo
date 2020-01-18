package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    public int getId() {
        return id;
    }

    public int id;
    private static int nextId = 1;


    public String value;
    public JobField(){
        id=nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

//    public String getName() {
//        if(name == null){
//            return "Data not available";
//        } else{
//            return name;}
//    }



//    public Employer getEmployer() {
//        if (employer == null) {
//            return new Employer("Data not available");
//        } else {
//            return employer;
//        }};


//    public Location getLocation() {
//        if(location == null){
//            return new Location("Data not available");
//        } else {
//            return location;
//        }};



//    public PositionType getPositionType() {
//        if(positionType == null){
//            return new PositionType("Data not available");
//        } else {
//            return positionType;
//        }};



//    public CoreCompetency getCoreCompetency() {
////        if(coreCompetency == null){
////            return new CoreCompetency("Data not available");
////        } else {
////            return coreCompetency;
////        }};

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
