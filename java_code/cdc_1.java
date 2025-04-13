/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cdc
 */
class cdc_1
extends aet
implements fki_0 {
    private static final Logger e = Logger.getLogger(cdc_1.class);
    private cdd_1 f;

    cdc_1() {
    }

    @Override
    public void a(fkk_0 fkk_02, fkk_0 fkk_03, fkk_0 fkk_04, fkk_0 fkk_05) {
        this.f = new cdd_1(fkk_02, fkk_03, fkk_04, fkk_05);
    }

    @Override
    public void a(@NotNull esy_2[] esy_2Array) {
        this.f.a(esy_2Array);
        this.a(this.f);
        this.f = null;
    }

    private void a(cdd_1 cdd_12) {
        this.a = new aes[this.f.a() * 324];
        int n = this.a();
        int n2 = this.b();
        this.a(cdd_12.a, n, n2);
        this.a(cdd_12.b, n + 9, n2);
        this.a(cdd_12.c, n, n2 + 9);
        this.a(cdd_12.d, n + 9, n2 + 9);
        for (esy_2 esy_22 : cdd_12.e) {
            cdj_1 cdj_12 = (cdj_1)esy_22;
            cdb_1 cdb_12 = ((cdl_1)cdj_12.m()).a();
            this.a(esy_22.h(), esy_22.i(), cdj_12.a(), cdb_12);
        }
    }

    private void a(ccj_2 ccj_22, int n, int n2) {
        if (ccj_22 == null) {
            return;
        }
        this.a(n, n2, 0, ccj_22.b());
    }

    private void a(int n, int n2, int n3, cdb_1 cdb_12) {
        int n4;
        int n5;
        ArrayList<aes> arrayList = cdb_12.d();
        if (arrayList.isEmpty()) {
            return;
        }
        int n6 = arrayList.size();
        for (n5 = 0; n5 < n6; ++n5) {
            aes aes2 = arrayList.get(n5);
            n4 = this.b.indexOf(aes2);
            if (n4 != -1) continue;
            this.b.add(aes2);
        }
        n5 = cdb_12.a();
        for (n6 = 0; n6 < cdb_12.c(); ++n6) {
            int n7 = n6 + n2;
            if (n7 < this.b() || n7 >= this.b() + 18) continue;
            for (n4 = 0; n4 < cdb_12.b(); ++n4) {
                int n8 = n4 + n;
                if (n8 < this.a() || n8 >= this.a() + 18) continue;
                for (int k = 0; k < n5; ++k) {
                    int n9;
                    aes aes3 = cdb_12.a(n4, n6, k);
                    if (aes3 != null && (n9 = this.b.indexOf(aes3)) != -1) {
                        aes3 = (aes)this.b.get(n9);
                    }
                    this.a[this.b((int)n8, (int)n7, (int)(n3 + k))] = aes3;
                }
            }
        }
    }
}

