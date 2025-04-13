/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQo
 */
public class bqo_1
extends bqm_1<esb_1> {
    public static final String h = "amount";

    public bqo_1(esb_1 esb_12) {
        super(esb_12);
    }

    @Override
    public Object b(String string) {
        if (string.equals(h)) {
            return bae.h().a(Math.abs(((esb_1)this.g).c())) + "\u00a7";
        }
        return super.b(string);
    }

    @Override
    protected int a() {
        return 1;
    }
}

