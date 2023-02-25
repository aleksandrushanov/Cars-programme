package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HETCHBACK("Хэтчбэк"),
    COPE("Купе"),
    UNIVERSAL("Уневерсал"),
    VNEDOROJNIK("Внедорожник"),
    CROSSOVER("Кроссоввер"),
    PIKAP("Пикап"),
    FURGON("Фургон"),
    MINEVAN("Миневэн");

    private final String typeBody;

    BodyType (String typeBody) {
        this.typeBody = typeBody;
    }

    public String getTypeBody() {
        return typeBody;
    }

    @Override
    public String toString() {
        return " тип кузова '" + getTypeBody() +"' ";
    }
}
