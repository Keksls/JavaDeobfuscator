/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcC
 */
public class fcc_0
extends fcz_0
implements fcd_0 {
    private String a = "";

    fcc_0() {
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public void a(String string) {
        this.a = string;
    }

    @Override
    public void a(wt_2 wt_22) {
        wt_22.a = this.a;
    }

    @Override
    public void b(wt_2 wt_22) {
        this.a = wt_22.a;
    }
}

