/*
 * Copyright (C) 2015 theta4j project
 */

package org.theta4j.ptp.type;

import org.theta4j.ptp.code.Code;
import org.theta4j.util.Validators;

import java.util.HashMap;
import java.util.Map;

/**
 * A set of data types defined in PTP standard.
 */
public enum DataType implements Code<UINT16> {
    UNDEF(0x0000),
    INT8(0x0001),
    UINT8(0x0002),
    INT16(0x0003),
    UINT16(0x0004),
    INT32(0x0005),
    UINT32(0x0006),
    INT64(0x0007),
    UINT64(0x0008),
    INT128(0x0009),
    UINT128(0x000A),
    AINT8(0x4001),
    AUINT8(0x4002),
    AINT16(0x4003),
    AUINT16(0x4004),
    AINT32(0x4005),
    AUINT32(0x4006),
    AINT64(0x4007),
    AUINT64(0x4008),
    AINT128(0x4009),
    AUINT128(0x400A),
    STR(0xFFFF);

    // Map for valueOf method

    private static final Map<UINT16, DataType> DATA_TYPE_MAP = new HashMap<>();

    static {
        for (DataType dataType : DataType.values()) {
            DATA_TYPE_MAP.put(dataType.value, dataType);
        }
    }

    // Property

    private final UINT16 value;

    // Constructor

    DataType(int value) {
        this.value = new UINT16(value);
    }

    // Code

    @Override
    public UINT16 value() {
        return value;
    }

    // valueOf

    public static DataType valueOf(UINT16 value) {
        Validators.notNull("value", value);

        if (!DATA_TYPE_MAP.containsKey(value)) {
            throw new IllegalArgumentException("Unknown DataType Value: " + value);
        }

        return DATA_TYPE_MAP.get(value);
    }
}
