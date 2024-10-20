package com.bookingapp.backendapi.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingRequestDto {

    private Long availablePlaces;

    private OffsetDateTime startsAt;

}
