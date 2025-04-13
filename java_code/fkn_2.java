/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKN
 */
public class fkn_2
implements fko_2 {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e = false;

    public fkn_2(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("font") || aqx_22.f("font") == null || aqx_22.f("id") == null) {
            return;
        }
        if (aqx_22.f("modifier") != null) {
            this.d = aqx_22.f("modifier").c();
        }
        this.b = aqx_22.f("definition").c();
        this.c = aqx_22.f("font").c();
        this.a = aqx_22.f("id").c();
        this.e = true;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.e) {
            fyw_02.a(this.a, this.b, this.c, this.d);
        }
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.e) {
            return;
        }
        String string = fkb_22.k();
        fkb_22.a(new fkv_1(null, "loadFont", string, new String[]{"\"" + this.a + "\"", "\"" + this.b + "\"", "\"" + this.c + "\"", this.d == null ? "null" : "\"" + this.d + "\""}));
    }

    @Override
    public boolean a() {
        return true;
    }
}

