/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMB
 */
public class amb_2
extends abj_2<String, ama_2> {
    public static final amb_2 b = new amb_2();

    private amb_2() {
        super(50);
    }

    public long g() {
        long l = 0L;
        for (ama_2 ama_22 : this.a.values()) {
            l += (long)ama_22.e();
        }
        return l;
    }
}

