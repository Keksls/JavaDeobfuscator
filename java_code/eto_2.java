/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTO
 */
public class eto_2
extends RuntimeException {
    private final esz_1 a;

    public eto_2(esz_1 esz_12, String string) {
        super(esz_12 + " : " + string);
        this.a = esz_12;
    }

    public eto_2(esz_1 esz_12, String string, Throwable throwable) {
        super(esz_12 + " : " + string, throwable);
        this.a = esz_12;
    }

    public esz_1 a() {
        return this.a;
    }
}

