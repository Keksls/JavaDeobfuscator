/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bod
 */
public class bod_2
implements bnx_2 {
    public static final int a = 6771;
    public static final int b = 6772;
    public static final String c = "xelorTickTackImage";
    public static final String d = "xelorTick";
    public static final String e = "xelorTack";
    private final bnh_1 f;
    private fsk_0 g;

    public bod_2(bnh_1 bnh_12) {
        this.f = bnh_12;
        fyy_0 fyy_02 = fpm_0.b().h().d("worldAndFightBarDialog");
        if (fyy_02 == null) {
            return;
        }
        this.g = (fsk_0)fyy_02.a(c);
    }

    @Override
    public void a(tk_0 tk_02) {
        if (tk_02.a() == 1000) {
            ejh_0 ejh_02 = ((epz_0)tk_02).b();
            if (ejh_02.bt_() != efc_0.b.a()) {
                return;
            }
            if (ejh_02.i() != this.f) {
                return;
            }
            fie_0 fie_02 = ((eja_0)ejh_02).aF();
            if (fie_02.p() == 6771) {
                this.g.setStyle(d);
            } else if (fie_02.p() == 6772) {
                this.g.setStyle(e);
            }
        }
    }

    @Override
    public void a() {
        boe_2.a.a((abu_1)this.f);
    }

    public String toString() {
        return "EcaflipFightListener{m_character=" + this.f + "}";
    }
}

