package com.kodluyoruz.HotelBooking.Service;

import com.kodluyoruz.HotelBooking.model.entity.Dto.RoomDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class DateService {


    public boolean dateControl(QueryService queryService, RoomDto roomDto) throws Exception {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date dt_1 = objSDF.parse(queryService.getDateOfEnter());
        Date dt_2 = objSDF.parse(roomDto.getDateOfExit());
        if (dt_1.compareTo( dt_2 ) > 0) {
            return true;
        }
        throw new Exception("Not Found and Room");
    }
}
