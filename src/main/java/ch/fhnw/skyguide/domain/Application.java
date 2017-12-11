package ch.fhnw.skyguide.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Application {

    private Integer id;
    private String viewKey;
    private String adminKey;
    private String name;
    private String company;
    private String reference;
    private Integer phone;
    private String email;
    private String callsign;
    private String departure;
    private String destination;
    private String dateFromUntil;
    private String timeFrom;
    private String timeUntil;
    private String duration;
    private String location;
    private String beamDirection;
    private String payloadAttachedObj;
    private String amount;
    private String radius;
    private String selfDeclaration;
    private String remark;
    private ActivityType activityType;
    private AircraftType aircraftType;
    private HeightType heightType;
    private Set<Coordinate> coordinates;

    public Application(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public String getViewKey() {
        return viewKey;
    }

    public void setViewKey(String viewKey) {
        this.viewKey = viewKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateFromUntil() {
        return dateFromUntil;
    }

    public void setDateFromUntil(String dateFromUntil) {
        this.dateFromUntil = dateFromUntil;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeUntil() {
        return timeUntil;
    }

    public void setTimeUntil(String timeUntil) {
        this.timeUntil = timeUntil;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBeamDirection() {
        return beamDirection;
    }

    public void setBeamDirection(String beamDirection) {
        this.beamDirection = beamDirection;
    }

    public String getPayloadAttachedObj() {
        return payloadAttachedObj;
    }

    public void setPayloadAttachedObj(String payloadAttachedObj) {
        this.payloadAttachedObj = payloadAttachedObj;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getSelfDeclaration() {
        return selfDeclaration;
    }

    public void setSelfDeclaration(String selfDeclaration) {
        this.selfDeclaration = selfDeclaration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @OneToOne
    @JoinColumn(name = "activity_type_id")
    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    @ManyToOne
    @JoinColumn(name = "aircraft_type_id")
    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    @ManyToOne
    @JoinColumn(name = "height_type_id")
    public HeightType getHeightType() {
        return heightType;
    }

    public void setHeightType(HeightType heightType) {
        this.heightType = heightType;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "application_coordinate", joinColumns = @JoinColumn(name = "application_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "coordinate_id", referencedColumnName = "id"))
    public Set<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Set<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
}
