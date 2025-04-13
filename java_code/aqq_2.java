/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqQ
 */
public abstract class aqq_2 {
    private String a = "";
    private aqo_2[] b = null;

    public aqq_2(String string, aqo_2 ... aqo_2Array) {
        if (string == null) {
            throw new IllegalArgumentException("Nom de liste ne peut \u00eatre null.");
        }
        this.a = string;
        this.b = aqo_2Array;
    }

    public aqq_2(aqo_2 ... aqo_2Array) {
        this("", aqo_2Array);
    }

    public final int b() {
        return this.b != null ? this.b.length : 0;
    }

    public final String c() {
        return this.a;
    }

    public aqo_2 a(int n) {
        return this.b[n];
    }

    public abstract aqo_2[] a();
}

