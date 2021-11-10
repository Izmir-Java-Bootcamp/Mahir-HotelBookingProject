package com.kodluyoruz.HotelBooking.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateService {

    @NotBlank
    @Size(max=100)
    @Column(length = 100,nullable = false)
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
