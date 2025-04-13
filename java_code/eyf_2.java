/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYF
 */
public class eyf_2
implements eyc_2 {
    private eyh_1 a;
    private boolean b;

    public eyf_2(eyh_1 eyh_12) {
        this.a = eyh_12;
    }

    public eyf_2(eyh_1 eyh_12, boolean bl) {
        this.a = eyh_12;
        this.b = bl;
    }

    @Override
    public eyh_1 a() {
        return this.a;
    }

    @Override
    public void a(wl_2 wl_22) {
        wl_22.a = this.a.a();
        wl_22.b = this.b;
    }

    @Override
    public void b(wl_2 wl_22) {
        this.a = eyh_1.a(wl_22.a);
        this.b = wl_22.b;
    }

    @Override
    public void b() {
        this.b = true;
    }

    @Override
    public boolean c() {
        return this.b || this.a.c();
    }

    @Override
    public eyc_2 d() {
        return new eyf_2(this.a, this.b);
    }

    @Override
    public boolean a(eyc_2 eyc_22) {
        return eyc_22 != null && eyc_22.a() == this.a && eyc_22.c() == this.b;
    }
}

