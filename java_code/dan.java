/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dan
implements ahr_1,
fjt_1 {
    private static final Logger a = Logger.getLogger(dan.class);
    private static final dan b = new dan();
    private static final boolean c = false;
    private cSN d = null;

    public static dan a() {
        return b;
    }

    private dan() {
    }

    public cSN c() {
        return this.d;
    }

    @Override
    public void d() {
        if (this.d != null) {
            this.d.d();
            this.d = null;
        }
    }

    public void a(cSN cSN2) {
        this.d = cSN2;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    public static void a(cSN cSN2, abz_0 abz_02) {
        if (abz_02 instanceof biI) {
            biI biI2 = (biI)abz_02;
            blx_1 blx_12 = biI2.bI();
            if (blx_12 != null) {
                cSN2.a(blx_12, abz_02);
            } else {
                a.error((Object)"Le mobile s\u00e9lectionn\u00e9 n'a pas de CharacterInfo associ\u00e9 !");
            }
        } else if (abz_02 instanceof bfr_0) {
            bfr_0 bfr_02 = (bfr_0)abz_02;
            pj_0 pj_02 = bfr_02.d();
            if (pj_02.N()) {
                cSN2.a((bFZ)pj_02, abz_02);
            }
        } else if (abz_02 instanceof bNK) {
            cSN2.a(((bNK)abz_02).aL(), abz_02);
        } else if (abz_02 instanceof cUM) {
            cSN2.a((cUM)((Object)abz_02), abz_02);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a(this);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = null;
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(aNF aNF2, int n, int n2) {
        ArrayList<abz_0> arrayList = aNF2.e(n, n2);
        if (arrayList.isEmpty()) {
            return;
        }
        this.d = new cSN();
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            abz_0 abz_02 = arrayList.get(k);
            dan.a(this.d, abz_02);
        }
        if (this.d.c()) {
            this.d.a();
            return;
        }
        this.d = null;
    }

    public void a(cSS ... cSSArray) {
        if (cSSArray.length == 0) {
            return;
        }
        this.d = new cSN();
        this.d.a(cSSArray, null);
        if (!this.d.c()) {
            this.d = null;
            return;
        }
        this.d.a();
    }
}

