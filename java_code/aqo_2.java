/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqO
 */
public class aqo_2 {
    private String a = "";

    public aqo_2(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Nom de param\u00e8tre ne peut \u00eatre null.");
        }
        this.a = string;
    }

    public final String a() {
        return this.a;
    }
}

