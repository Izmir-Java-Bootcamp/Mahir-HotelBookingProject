package com.kodluyoruz.HotelBooking.Service;

import com.kodluyoruz.HotelBooking.model.entity.Dto.RoomDto;
import com.kodluyoruz.HotelBooking.model.entity.Room;
import com.kodluyoruz.HotelBooking.model.request.CreateUpdateProductRequest;
import com.kodluyoruz.HotelBooking.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodluyoruz.HotelBooking.model.mapper.RoomMapper.ROOM_MAPPER;

@Service
@RequiredArgsConstructor

public class RezervationService {
    private final RoomRepository repository;
    private final DateService dateService;


    public RoomDto createRoom(CreateUpdateProductRequest request) {
        Room room = ROOM_MAPPER.createRoom(request);
        Room savedRoom = repository.save(room);
        return ROOM_MAPPER.toRoomDto(savedRoom);
    }

    public RoomDto updateRoom(int id, UpdateService updateService) {
        Room room = repository.getById(id);
        ROOM_MAPPER.updateRoom(room, updateService);

        Room updateRoom = repository.save(room);
        return ROOM_MAPPER.toRoomDto(updateRoom);
    }


    public List<RoomDto> getAllRoom(String city, QueryService queryService) throws Exception {

        List<RoomDto> roomList = new ArrayList<>();
        List<RoomDto>  roomDtoList = ROOM_MAPPER.toRoomDtoList
                        (repository.findAllBycityContains(city));
        for (RoomDto rt :
                roomDtoList) {
            if(rt.getDateOfEnter() !=null && rt.getDateOfExit()!=null){
                if(dateService.dateControl(queryService,rt)){
                    roomList.add(rt);
                }
            }else{
                roomList.add(rt);
            }
        }
        return roomList;
    }

}






