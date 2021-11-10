package com.kodluyoruz.HotelBooking.model.mapper;

import com.kodluyoruz.HotelBooking.Service.UpdateService;
import com.kodluyoruz.HotelBooking.model.entity.Dto.RoomDto;
import com.kodluyoruz.HotelBooking.model.entity.Room;
import com.kodluyoruz.HotelBooking.model.request.CreateUpdateProductRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-10T11:31:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class RoomMapperImpl implements RoomMapper {

    @Override
    public RoomDto toRoomDto(Room room) {
        if ( room == null ) {
            return null;
        }

        RoomDto roomDto = new RoomDto();

        roomDto.setCity( room.getCity() );
        roomDto.setId( room.getId() );
        roomDto.setHotelName( room.getHotelName() );
        roomDto.setType( room.getType() );
        roomDto.setPriceOfNight( room.getPriceOfNight() );
        roomDto.setEmpty( room.isEmpty() );
        roomDto.setDateOfEnter( room.getDateOfEnter() );
        roomDto.setDateOfExit( room.getDateOfExit() );

        return roomDto;
    }

    @Override
    public List<RoomDto> toRoomDtoList(List<Room> room) {
        if ( room == null ) {
            return null;
        }

        List<RoomDto> list = new ArrayList<RoomDto>( room.size() );
        for ( Room room1 : room ) {
            list.add( toRoomDto( room1 ) );
        }

        return list;
    }

    @Override
    public Room createRoom(CreateUpdateProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Room room = new Room();

        room.setCity( request.getCity() );
        room.setHotelName( request.getHotelName() );
        room.setType( request.getType() );
        room.setPriceOfNight( request.getPriceOfNight() );
        room.setEmpty( request.isEmpty() );

        return room;
    }

    @Override
    public void updateRoom(Room room, UpdateService updateService) {
        if ( updateService == null ) {
            return;
        }

        room.setEmpty( updateService.isEmpty() );
        room.setDateOfEnter( updateService.getDateOfEnter() );
        room.setDateOfExit( updateService.getDateOfExit() );
    }
}
