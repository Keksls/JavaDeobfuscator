/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fKQ
 */
public class fkq_2
implements fko_2 {
    private static final Logger a = Logger.getLogger(fkq_2.class);
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f = false;

    public fkq_2(String string, String string2) {
        this.b = string;
        this.c = string2;
        this.d = false;
        this.f = true;
    }

    public fkq_2(String string, String string2, boolean bl) {
        this.b = string;
        this.c = string2;
        this.d = bl;
        this.f = true;
    }

    public fkq_2(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("texture") || aqx_22.f("path") == null || aqx_22.f("id") == null) {
            return;
        }
        try {
            aqx_2 aqx_23;
            this.c = aqx_22.f("path").c();
            aqx_2 aqx_24 = aqx_22.f("permanent");
            if (aqx_24 != null) {
                this.d = aqx_24.d();
            }
            if ((aqx_23 = aqx_22.f("overridable")) != null) {
                this.e = aqx_23.d();
            }
            this.b = aqx_22.f("id").c();
            this.f = true;
        }
        catch (Exception exception) {
            a.error((Object)"Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.f) {
            fyw_02.a(this.b, this.c, this.d, this.e);
        }
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.f) {
            return;
        }
        String string = fkb_22.k();
        fkb_22.a(new fkv_1(null, "loadTexture", string, "\"" + this.b + "\"", "\"" + this.c + "\"", String.valueOf(this.d), String.valueOf(this.e)));
    }

    @Override
    public boolean a() {
        return this.f;
    }
}

