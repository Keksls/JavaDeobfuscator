/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVO
 */
public class bvo_0
extends ajb_1 {
    private static final String c = "accountPreferences%d.properties";
    private final long d;

    public bvo_0(long l) {
        super(String.format(c, l));
        this.d = l;
        this.b(false);
        this.a(true);
    }

    public long o() {
        return this.d;
    }
}

