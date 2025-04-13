/*
 * Decompiled with CFR 0.152.
 */
public class bqY
extends brn {
    private final long m;

    public bqY(eBt eBt2) {
        super(eBt2.e(), eBt2.a());
        this.m = eBt2.b();
    }

    @Override
    public long a() {
        return -this.m;
    }

    @Override
    public brn b() {
        eBt eBt2 = eBo.a.c(this.m);
        bqY bqY2 = new bqY(eBt2);
        return bqY2;
    }
}

