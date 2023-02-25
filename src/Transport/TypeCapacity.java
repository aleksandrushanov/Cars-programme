package Transport;

public enum TypeCapacity {
    AVERAGE(40, 50),
    BIG(60, 80),
    ESPECIALLY_BIG(100, 120),
    ESPECIALLY_SMALL(10),
    MINI(25);

    private int minCapacity;
    private int maxCapacity;

    TypeCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
    }

    TypeCapacity(int minCapacity, int maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        if (minCapacity <= 10) {
            return " Особо малая классификация ";
        } else if (minCapacity >= 11 && minCapacity <= 25) {
            return "Малая класификация ";
        } else {
            return "Вместимость:" + getMinCapacity() + "-"+ getMaxCapacity() + " мест";
        }
    }
}
