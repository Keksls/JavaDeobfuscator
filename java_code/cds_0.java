/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cDs
 */
public class cds_0
implements ako_0,
cde_0 {
    public static final byte a = 0;
    public static final byte b = 1;
    private final acy_2<cDt> c = new acy_2();
    private String d;
    private float e = 1.0f;

    @Override
    public akr_0 a(byte by, byte by2) {
        cDt cDt2 = this.c.g(by);
        if (cDt2 == null) {
            return null;
        }
        return cDt2.a(by2);
    }

    @Override
    public float a() {
        return this.e;
    }

    public void b() {
        this.a(this.d);
    }

    public void a(String string) {
        this.d = string;
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        this.c.c();
        ati_2 ati_22 = ath_22.a();
        ArrayList<aqx_2> arrayList = ati_22.e("fightFspGain");
        if (arrayList != null) {
            for (aqx_2 aqx_22 : arrayList) {
                aqx_2 aqx_23 = aqx_22.f("value");
                if (aqx_23 == null) continue;
                this.e = aqx_23.i();
                break;
            }
        }
        for (aqx_2 aqx_22 : ati_22.e("ground")) {
            int n = 0;
            aqx_2 aqx_24 = aqx_22.f("type");
            if (aqx_24 != null) {
                n = aqx_24.g();
            }
            cDt cDt2 = new cDt();
            aqx_2 aqx_25 = aqx_22.c("walk");
            for (aqx_2 aqx_23 : aqx_25.e("sound")) {
                Object object = this.a(aqx_23);
                if (object == null) continue;
                cDt2.a((akr_0)object, (byte)0);
            }
            aqx_2 aqx_26 = aqx_22.c("run");
            for (Object object : aqx_26.e("sound")) {
                akr_0 akr_02 = this.a((aqx_2)object);
                if (akr_02 == null) continue;
                cDt2.a(akr_02, (byte)1);
            }
            this.c.a(n, cDt2);
        }
    }
}

