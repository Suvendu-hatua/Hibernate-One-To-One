package com.spring_boot.hibernate.One_To_One_Hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instructor-details")
public class InstructorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube-channel")
    private String youTubeChannel;

    @Column(name = "hobbies")
    private String hobbies;

    //Adding Constructor.

    public InstructorDetails(String youTubeChannel, String hobbies) {
        this.youTubeChannel = youTubeChannel;
        this.hobbies = hobbies;
    }


    //Adding setter and Getter methods-->

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYouTubeChannel() {
        return youTubeChannel;
    }

    public void setYouTubeChannel(String youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "InstructorDetails{" +
                "id=" + id +
                ", youTubeChannel='" + youTubeChannel + '\'' +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
