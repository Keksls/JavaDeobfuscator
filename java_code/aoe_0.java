/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

/*
 * Renamed from aOE
 */
public class aoe_0 {
    private static final Logger a = Logger.getLogger(aoe_0.class);
    private final abu b;
    private final String c;
    private final String d;
    private Anm e;
    private Anm f;

    private aoe_0(abu abu2, String string, String string2) {
        this.b = abu2;
        this.c = string;
        this.d = string2;
    }

    public void a() {
        this.b.a(atm_1.d, null);
        this.b.a(atm_1.e, null);
        if (this.e != null) {
            this.b.an().b(this.e);
            this.e = null;
        }
        if (this.f != null) {
            this.b.an().b(this.f);
            this.f = null;
        }
    }

    public void a(azj_2 azj_22, azj_2 azj_23, short s2, short s3) {
        Anm anm;
        this.b.a(atm_1.d, azj_22.v());
        this.b.a(atm_1.e, azj_23.v());
        boolean bl = false;
        Anm anm2 = this.a(this.c, s2, this.e);
        if (anm2 != null) {
            bl = true;
            this.e = anm2;
        }
        if ((anm = this.a(this.d, s3, this.f)) != null) {
            bl = true;
            this.f = anm;
        }
        if (bl) {
            this.b.C();
        }
    }

    private Anm a(String string, int n, Anm anm) {
        if (string == null) {
            return null;
        }
        String string2 = string + n;
        try {
            String string3 = azs_0.a().a("ANMEquipmentPath");
            String string4 = String.format(string3, string2);
            if (anm != null && anm.e().equals(string2)) {
                return null;
            }
            Anm anm2 = abu.c(string4);
            if (anm2 == null) {
                a.error((Object)("Pas de blason trouv\u00e9 ID=" + string2));
                return null;
            }
            this.b.an().a(anm2);
            this.b.C();
            return anm2;
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
            return null;
        }
    }

    public static aoe_0 a(abu abu2, bos_2 bos_22, String string, String string2) {
        return aoe_0.a(abu2, bos_22.b(), string, string2);
    }

    public static aoe_0 a(abu abu2, long l, String string, String string2) {
        if (l == 0L) {
            return null;
        }
        try {
            eqd_2 eqd_22 = new eqd_2(l);
            azj_2 azj_22 = bxm_1.a().a(eqd_22.b());
            azj_2 azj_23 = bxm_1.a().a(eqd_22.d());
            aoe_0 aoe_02 = new aoe_0(abu2, string, string2);
            aoe_02.a(azj_22, azj_23, eqd_22.c(), eqd_22.a());
            return aoe_02;
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
            return null;
        }
    }
}

