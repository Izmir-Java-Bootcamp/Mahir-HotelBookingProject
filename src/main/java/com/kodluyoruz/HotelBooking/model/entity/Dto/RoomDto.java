package com.kodluyoruz.HotelBooking.model.entity.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {

    private String city;

    private int id;
    private String hotelName;
    private String type;
    private double priceOfNight;
    private boolean isEmpty;

    @NotBlank
//    @LastModifiedDate
    @Column(length = 100,nullable = false)
    private String dateOfEnter ;

    @NotBlank
//    @LastModifiedDate
    @Column(length = 100,nullable = false)
    private String dateOfExit ;


}
