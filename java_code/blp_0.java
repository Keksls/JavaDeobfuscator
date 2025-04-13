/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLp
 */
public class blp_0
extends bLO {
    private final blh_1 a;
    private final byte b;

    public blp_0(xd_0 xd_02, int n, blh_1 blh_12, String string, byte by, String string2, String string3, long l) {
        super(xd_02, n, null, string, null, (byte)0, string2, string3, l, blh_12.b());
        this.a = blh_12;
        this.b = by;
    }

    public blh_1 a() {
        return this.a;
    }

    @Override
    public byte b() {
        return this.b;
    }

    @Override
    public boolean c() {
        bLP bLP2 = blg_1.a().b(this.a, this.j());
        return bLP2 != null;
    }

    @Override
    public void a(ble_1 ble_12) {
        blb_1 blb_12;
        bLP bLP2 = blg_1.a().b(this.a, this.j());
        if (bLP2 != null && this.a == blh_1.c && !(blb_12 = (blb_1)bLP2).g()) {
            blb_12.h();
        }
        ble_12.a(bLP2);
    }

    @Override
    public String d() {
        return blf_1.a(this.j());
    }

    @Override
    public boolean e() {
        return true;
    }
}

