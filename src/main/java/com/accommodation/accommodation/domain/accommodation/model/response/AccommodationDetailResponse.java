package com.accommodation.accommodation.domain.accommodation.model.response;

import com.accommodation.accommodation.domain.room.model.response.RoomResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccommodationDetailResponse {
    private double longitude;
    private double latitude;
    private String title;
    private String info;
    private long price;
    private String checkIn;
    private String checkOut;
    private boolean shower;
    private boolean aircone;
    private boolean tv;
    private boolean pc;
    private boolean internet;
    private boolean refrigerator;
    private boolean toiletries;
    private boolean kitchenware;
    private boolean parkingLodging;
    private String address;
    private String tel;
    private boolean dryer;
    private int roomCount;
    private List<String> img;
    private List<RoomResponse> room;

}