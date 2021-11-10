package com.kodluyoruz.HotelBooking.controller;

import com.kodluyoruz.HotelBooking.Service.QueryService;
import com.kodluyoruz.HotelBooking.Service.RezervationService;


import com.kodluyoruz.HotelBooking.Service.UpdateService;
import com.kodluyoruz.HotelBooking.model.entity.Dto.RoomDto;

import com.kodluyoruz.HotelBooking.model.request.CreateUpdateProductRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping("rooms")
@RequiredArgsConstructor

public class RezervationController {

    private  final RezervationService service;




    @PostMapping
    public RoomDto createRoom(@RequestBody CreateUpdateProductRequest request){
        return service.createRoom(request);
    }


    @GetMapping
    public List<RoomDto> getAllRoom(@RequestParam(required = false) String city, QueryService queryService) throws Exception {

         return service.getAllRoom(city,queryService);
    }

    @PutMapping("{id}")
    public RoomDto updateRoom(@PathVariable int id, @RequestBody UpdateService updateService ){
        return service.updateRoom(id , updateService);
    }


}
