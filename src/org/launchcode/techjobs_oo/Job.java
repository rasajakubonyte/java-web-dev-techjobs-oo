package org.launchcode.techjobs_oo;
import  org.launchcode.techjobs_oo.JobField;

import java.util.Objects;

public class Job {
    public int id;
    private static int nextId = 1;
    public String name;
    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        if(name == null){
            return "Data not available";
        } else{
        return name;}
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {

            return employer;
        }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    };

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    };

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    };

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    @Override
    public String toString() {
        if (location.getValue() == null) {
            location.setValue("Data not available");
        }

        String output = "\n" +
                "Id: "+ id + "\n" +
                "Name: " + name+ "\n"+
                "Employer: " + employer + "\n"+
                "Location: " + location +"\n"+
                "Position Type: " + positionType + "\n"+
                "Core Competency: " + coreCompetency+"\n";

        return output;

        }

    };
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

