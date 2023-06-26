package com.ttknpdev.commonsresponsettknpdev.constants;

import com.ttknpdev.commonsresponsettknpdev.enums.CommonsStatus;
import org.springframework.http.HttpStatus;

public class CommonsConstants {
    // good status in below
    public static final Short STATUS_CREATED = (short) HttpStatus.CREATED.value();
    public static final String STRING_CREATED = CommonsStatus.created.toString();
    public static final Short STATUS_ACCEPTED = (short) HttpStatus.ACCEPTED.value();
    public static final String STRING_ACCEPTED = CommonsStatus.accepted.toString();
    public static final Short STATUS_OK = (short) HttpStatus.OK.value();
    public static final String STRING_OK = CommonsStatus.ok.toString();

    // bad status in below
    public static final Short STATUS_UNACCEPTABLE = (short) HttpStatus.NOT_ACCEPTABLE.value();
    public static final String STRING_UNACCEPTABLE = CommonsStatus.unacceptable.toString();
    public static final Short STATUS_UNSOURCED = (short) HttpStatus.BAD_REQUEST.value();
    public static final String STRING_UNSOURCED = CommonsStatus.unsourced.toString();
}
