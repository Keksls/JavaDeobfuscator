/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKK
 */
public class fkk_2
implements fko_2 {
    private int a;
    private int b;
    private frb_0 c;
    private String d;
    private boolean e = false;

    public fkk_2(int n, int n2, frb_0 frb_02, String string) {
        this.a = n;
        this.b = n2;
        this.c = frb_02;
        this.d = string;
        this.e = true;
    }

    public fkk_2(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("cursor") || aqx_22.f("path") == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("path");
        if (aqx_23 != null) {
            aqx_2 aqx_24 = aqx_22.f("x");
            aqx_2 aqx_25 = aqx_22.f("y");
            aqx_2 aqx_26 = aqx_22.f("type");
            this.a = aqx_24 == null ? 0 : aqx_24.g();
            this.b = aqx_25 == null ? 0 : aqx_25.g();
            this.c = aqx_26 == null ? frb_0.a : frb_0.valueOf(aqx_26.c().toUpperCase());
            this.d = aqx_23.c();
            this.e = true;
        }
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.e) {
            fyw_02.a(this.d, this.c, this.a, this.b);
        }
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.e) {
            return;
        }
        fkb_22.a(frb_0.class);
        String string = fkb_22.k();
        fkb_22.a(new fkv_1(null, "loadCursor", string, "\"" + this.d + "\"", frb_0.class.getSimpleName() + "." + this.c.name(), String.valueOf(this.a), String.valueOf(this.b)));
    }

    @Override
    public boolean a() {
        return this.e;
    }
}

