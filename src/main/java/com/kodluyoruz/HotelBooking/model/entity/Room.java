package com.kodluyoruz.HotelBooking.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="rooms")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Room {

    @NotBlank
    @Size(max=100)
    @Column(unique = false,length = 100)
    private String city;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @NotBlank
    @Size(max=100)
    @Column(unique = false,length = 100 )
    private String hotelName;

//    @NotBlank
    @Size(max=100)
    @Column(unique = false,length = 100)
    private String type;

    @Min(1)
//    @Column(nullable = false)
    private double priceOfNight;

    @NotBlank
    @Size(max=100)
    @Column(length = 100,nullable = false)
    private boolean isEmpty=true;

//    @NotBlank
//    @CreatedDate
    @Column(length = 100,nullable = true)
    private String dateOfEnter;

//    @NotBlank
//    @LastModifiedDate
    @Column(length = 100,nullable = true)
    private String dateOfExit;


}
