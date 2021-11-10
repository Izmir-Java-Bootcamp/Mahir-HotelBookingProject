package com.kodluyoruz.HotelBooking.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateProductRequest {


    private String city;

    @Size(max=100)
    @Column(unique = false,length = 100 )
    private String hotelName;

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





}
