package Transport;

public enum LoadCapacity {
    N1(0F,3.5F),
    N2(3.5F,12.0F),
    N3(12.0F,0F);

    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    public float getLowerBound() {
        return lowerBound;
    }
    public float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == 0.0) {
            return "Грузоподъемность до: " + getUpperBound() + " тонн.";
        } else if (upperBound == null) {
            return "Грузоподъемность от: " + getLowerBound() + " тонн.";
        } else {
            return "Грузоподъемность от: " + getLowerBound() + " тонн, до " + getUpperBound() + " тонн";
        }

    }
}
