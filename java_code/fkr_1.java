/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKR
 */
public class fkr_1
implements fko_2 {
    private float a;
    private azj_2 b;
    private azj_2 c;
    private azj_2 d;
    private String e;
    private boolean f = false;

    public fkr_1(float f2, azj_2 azj_22, azj_2 azj_23, azj_2 azj_24, String string) {
        this.a = f2;
        this.b = azj_22;
        this.c = azj_23;
        this.d = azj_24;
        this.e = string;
        this.f = true;
    }

    public fkr_1(aqx_2 aqx_22, fyw_0 fyw_02) {
        azj_2 azj_22;
        if (!aqx_22.b().equalsIgnoreCase("tooltip")) {
            return;
        }
        this.a = fip_1.e;
        aqx_2 aqx_23 = aqx_22.f("borderWidth");
        if (aqx_23 != null) {
            this.a = aqx_23.i();
        }
        this.b = fip_1.b;
        aqx_23 = aqx_22.f("backgroundColor");
        if (aqx_23 != null) {
            azj_22 = this.b;
            this.b = fyw_02.e(aqx_23.c());
            if (this.b == null) {
                this.b = fze.a().a(azj_2.class, aqx_23.c());
            }
            if (this.b == null) {
                this.b = azj_22;
            }
        }
        this.c = fip_1.a;
        aqx_23 = aqx_22.f("textColor");
        if (aqx_23 != null) {
            azj_22 = this.c;
            this.c = fyw_02.e(aqx_23.c());
            if (this.c == null) {
                this.c = fze.a().a(azj_2.class, aqx_23.c());
            }
            if (this.c == null) {
                this.c = azj_22;
            }
        }
        this.d = fip_1.c;
        aqx_23 = aqx_22.f("borderColor");
        if (aqx_23 != null) {
            azj_22 = this.d;
            this.d = fyw_02.e(aqx_23.c());
            if (this.d == null) {
                this.d = fze.a().a(azj_2.class, aqx_23.c());
            }
            if (this.d == null) {
                this.d = azj_22;
            }
        }
        this.e = null;
        aqx_23 = aqx_22.f("font");
        if (aqx_23 != null) {
            this.e = aqx_23.c();
        }
        this.f = true;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.f) {
            fyw_02.a(this.a, this.b, this.c, this.d, this.e);
        }
    }

    public String a(fyw_0 fyw_02, fkx_1 fkx_12) {
        if (!this.f) {
            return "";
        }
        return "InitLoaderManager.getInstance().addLoader(new TooltipInitLoader(" + this.a + "f, new " + azf_2.class.getSimpleName() + "(" + this.b.q() + "f, " + this.b.r() + "f, " + this.b.s() + "f, " + this.b.p() + "f), new " + azf_2.class.getSimpleName() + "(" + this.c.q() + "f, " + this.c.r() + "f, " + this.c.s() + "f, " + this.c.p() + "f), new " + azf_2.class.getSimpleName() + "(" + this.d.q() + "f, " + this.d.r() + "f, " + this.d.s() + "f, " + this.d.p() + "f), \"" + this.e + "\"));";
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.f) {
            return;
        }
        String string = fkb_22.k();
        fkb_22.a(new fkv_1(null, "loadTooltip", string, this.a + "f", "new " + azf_2.class.getSimpleName() + "(" + this.b.q() + "f, " + this.b.r() + "f, " + this.b.s() + "f, " + this.b.p() + "f)", "new " + azf_2.class.getSimpleName() + "(" + this.c.q() + "f, " + this.c.r() + "f, " + this.c.s() + "f, " + this.c.p() + "f)", "new " + azf_2.class.getSimpleName() + "(" + this.d.q() + "f, " + this.d.r() + "f, " + this.d.s() + "f, " + this.d.p() + "f)", "\"" + this.e + "\""));
    }

    @Override
    public boolean a() {
        return this.f;
    }
}

