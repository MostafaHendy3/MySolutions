class ParkingSystem {
    int bigSlot=0;
    int smallSlot=0;
    int mediumSlot=0;
    public ParkingSystem(int big, int medium, int small) {
        this.bigSlot=big;
        this.smallSlot=small;
        this.mediumSlot=medium;
    }
    
    public boolean addCar(int carType) {
     if (carType == 3) {
            smallSlot--;
            if (smallSlot < 0) {
                return false;
            }
            return true;
        }
        if (carType == 2) {
            mediumSlot--;
            if (mediumSlot < 0) {
                return false;
            }
            return true;
        }
        if (carType == 1) {
            bigSlot--;
            if (bigSlot < 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */