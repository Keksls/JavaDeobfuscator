/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fKB
 */
public class fkb_2
extends fkr_2<fkc_2> {
    static final String h = "doc";
    private final fyw_0 i;

    public fkb_2(PrintWriter printWriter, String string, String string2, fyw_0 fyw_02) {
        super(printWriter, string, string2);
        this.a(fyo_0.class);
        this.a(fyw_0.class);
        this.a(fyr_0.class);
        this.a(azf_2.class);
        this.f = printWriter;
        this.i = fyw_02;
    }

    public String k() {
        return h;
    }

    public fyw_0 l() {
        return this.i;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        this.a(new fkc_2(fyw_02, h, "method" + this.g++, (fkc_2)this.e, false));
    }

    @Override
    public void h() {
        fkv_1 fkv_12 = new fkv_1(null, ((fkc_2)this.e).g(), null, ((fkc_2)this.e).a());
        super.h();
        ((fkc_2)this.e).a(fkv_12);
    }

    @Override
    public void a(fkc_2 fkc_22) {
        this.a(fkc_22);
    }

    @Override
    public void j() {
        for (Object object : this.d) {
            for (fkt_1 fkt_12 : ((fks_1)object).e()) {
                Class<?> clazz = fkt_12.a();
                if (clazz == null) continue;
                this.a(clazz);
            }
        }
        if (this.b != null) {
            this.f.println("package " + this.b + ";");
        }
        this.f.println();
        for (Object object : this.c) {
            this.f.println("import " + ((Class)object).getCanonicalName() + ";");
        }
        this.f.println();
        this.f.println("public class " + this.a + " implements ThemeLoader {");
        this.f.println();
        for (Object object : this.d) {
            ((fkc_2)object).a(this.f);
            this.f.println();
        }
        this.f.println("}");
        this.f.flush();
    }
}

