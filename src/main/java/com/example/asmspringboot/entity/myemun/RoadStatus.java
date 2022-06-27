package com.example.asmspringboot.entity.myemun;

public enum RoadStatus {

    USING(1), UNDERCONSTRUCTION(0),UNDERREPAIR(-1), UNDEFINED(-2);
    private int value;

    RoadStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static RoadStatus of(int value){
        for (RoadStatus roadStatus: RoadStatus.values()
        ) {
            if (roadStatus.getValue() == value) {
                return roadStatus;
            }
        }
        return UNDEFINED;
    }
}
