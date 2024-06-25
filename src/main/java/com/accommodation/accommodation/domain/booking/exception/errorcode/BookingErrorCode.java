package com.accommodation.accommodation.domain.booking.exception.errorcode;

import com.accommodation.accommodation.global.handler.exception.errorcode.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum BookingErrorCode implements ErrorCode {

    WRONG_ROOM_ID("객실 정보가 존재하지 않습니다.", HttpStatus.NOT_FOUND),
    WRONG_OPTIONS("잘못된 옵션이 선택되어 있습니다.", HttpStatus.BAD_REQUEST),
    CONFLICT_BOOKING("예약이 불가능한 날자가 포함되어 있습니다.", HttpStatus.CONFLICT)
    ;

    private final String statusText;
    private final HttpStatus statusCode;

}