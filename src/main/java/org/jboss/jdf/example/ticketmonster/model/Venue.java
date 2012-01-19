package org.jboss.jdf.example.ticketmonster.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Represents a single venue
 *
 * @author Shane Bryzak
 */
@Entity
public class Venue implements Serializable {
    private static final long serialVersionUID = -6588912817518967721L;


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private String description;

    @ManyToOne
    @JoinColumn(name = "PICTURE_ID")
    private MediaItem picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public MediaItem getPicture() {
        return picture;
    }

    public void setPicture(MediaItem description) {
        this.picture = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
