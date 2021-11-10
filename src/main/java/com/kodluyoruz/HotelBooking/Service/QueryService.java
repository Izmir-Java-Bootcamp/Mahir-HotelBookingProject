package com.kodluyoruz.HotelBooking.Service;

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
public class QueryService {

//    @NotBlank
//    @LastModifiedDate
    @Column(length = 100)
    private String dateOfEnter ;

//    @NotBlank
//    @LastModifiedDate
    @Column(length = 100)
    private String dateOfExit ;

}
