/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fKJ
 */
public class fkj_2
implements fko_2 {
    private boolean a;
    private String b;
    private azj_2 c;
    private String d;

    public fkj_2(aqx_2 aqx_22, String string) {
        if (!aqx_22.b().equalsIgnoreCase("color") || aqx_22.f("color") == null || aqx_22.f("id") == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("color");
        this.b = aqx_22.f("id").c();
        this.c = fze.a().a(aqx_23.c());
        this.d = string;
        this.a = true;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.a) {
            fyw_02.a(this.b, this.c);
        }
    }

    @Override
    public void a(fkb_2 fkb_22) {
        String string;
        String string2;
        if (!this.a) {
            return;
        }
        if (Cz.f(this.d)) {
            return;
        }
        String string3 = fkb_22.k();
        if (this.c instanceof fyr_0) {
            string2 = fyr_0.class.getSimpleName();
            fyr_0 fyr_02 = (fyr_0)this.c;
            string = fyr_02.B() != null ? String.format("\"%s\", %sf", fyr_02.A(), fyr_02.B()) : String.format("\"%s\"", fyr_02.A());
        } else {
            string2 = azf_2.class.getSimpleName();
            string = String.format("%sf, %sf, %sf, %sf", Float.valueOf(this.c.q()), Float.valueOf(this.c.r()), Float.valueOf(this.c.s()), Float.valueOf(this.c.p()));
        }
        fkb_22.a(new fkv_1(null, "loadColor", string3, this.d + "." + this.b.toUpperCase(), String.format("new %s(%s)", string2, string)));
    }

    @Override
    public boolean a() {
        return this.a;
    }

    public void a(@NotNull fke_2 fke_22) {
        if (!this.a) {
            return;
        }
        fke_22.a(this.b);
    }
}

