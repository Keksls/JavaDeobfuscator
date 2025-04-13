/*
 * Decompiled with CFR 0.152.
 */
public enum eyJ {
    a("none"),
    b("caster"),
    c("target"),
    d("eventTriggerer"),
    e("eventTarget"),
    f("position");

    private final String g;

    private eyJ(String string2) {
        this.g = string2;
    }

    public String a() {
        return this.g;
    }

    public static eyJ a(String string) {
        for (eyJ eyJ2 : eyJ.values()) {
            if (!eyJ2.g.equals(string)) continue;
            return eyJ2;
        }
        return a;
    }
}

