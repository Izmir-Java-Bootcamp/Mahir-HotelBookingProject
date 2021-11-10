package com.kodluyoruz.HotelBooking.model.mapper;

import com.kodluyoruz.HotelBooking.Service.UpdateService;
import com.kodluyoruz.HotelBooking.model.entity.Dto.RoomDto;
import com.kodluyoruz.HotelBooking.model.entity.Room;
import com.kodluyoruz.HotelBooking.model.request.CreateUpdateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    RoomMapper ROOM_MAPPER = Mappers.getMapper(RoomMapper.class);

    RoomDto toRoomDto(Room room);

    List<RoomDto> toRoomDtoList (List<Room> room);

    Room createRoom(CreateUpdateProductRequest request);


    void updateRoom(@MappingTarget Room room, UpdateService updateService);

}
