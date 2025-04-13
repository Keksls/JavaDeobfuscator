/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cLa
extends cLf {
    private static final Logger c = Logger.getLogger(cLa.class);
    private final csm_1 d;
    private final int e;

    public cLa(csm_1 csm_12, int n) {
        super(new clg_1(true, true));
        this.d = csm_12;
        this.e = n;
    }

    @Override
    public fks_0 a() {
        return fks_0.c;
    }

    @Override
    protected void a(int n, int n2) {
        this.a.d();
        afe_1 afe_12 = this.a.getPatchCoordFromMouse(n, n2);
        short s2 = fkh_0.e(afe_12.a());
        short s3 = fkh_0.f(afe_12.b());
        if (cLa.a(this.a, s2, s3)) {
            afe_12.b(fkh_0.g(s2), fkh_0.h(s3));
            fkv_0 fkv_02 = this.a.a(this.e, afe_12);
            cLj[] cLjArray = this.d(s2, s3);
            this.b = new cLi(fkv_02, cLjArray);
        } else {
            this.a.setTool(this.d);
        }
    }

    private cLj[] d(int n, int n2) {
        ArrayList<cLj> arrayList = new ArrayList<cLj>();
        this.b(n, n2, arrayList);
        this.a(n, n2, arrayList);
        cLj[] cLjArray = new cLj[arrayList.size()];
        arrayList.toArray(cLjArray);
        return cLjArray;
    }

    private void a(int n, int n2, ArrayList<cLj> arrayList) {
        short s2 = fkh_0.g(n);
        short s3 = fkh_0.h(n2);
        fkj_0 fkj_02 = this.a.getWorkingHavenWorld();
        short[][] sArray = fkj_02.d();
        for (int k = s3 - 1; k <= s3 + 2; ++k) {
            for (int i2 = s2 - 1; i2 <= s2 + 2; ++i2) {
                short s4;
                if ((i2 == s2 || i2 == s2 + 1) && (k == s3 || k == s3 + 1) || (s4 = fkj_02.a(sArray, i2, k)) == 0) continue;
                etn_2 etn_22 = eti_2.a.d(s4);
                arrayList.add(this.a(etn_22, i2, k));
            }
        }
    }

    private void b(int n, int n2, ArrayList<cLj> arrayList) {
        etn_2 etn_22 = eti_2.a.d((short)0);
        short s2 = fkh_0.g(n);
        short s3 = fkh_0.h(n2);
        arrayList.add(this.a(etn_22, (int)s2, s3));
        arrayList.add(this.a(etn_22, s2 + 1, s3));
        arrayList.add(this.a(etn_22, (int)s2, s3 + 1));
        arrayList.add(this.a(etn_22, s2 + 1, s3 + 1));
    }

    private cLj a(etn_2 etn_22, int n, int n2) {
        fkw fkw2 = this.a.getGround(n, n2);
        fkw fkw3 = this.a.a(etn_22, n, n2);
        short s2 = fkw2 != null ? fkw2.h() : fkk_0.c;
        return new cLj(fkw3, s2);
    }

    public static boolean a(cks_2 cks_22, int n, int n2) {
        fkj_0 fkj_02 = cks_22.getWorkingHavenWorld();
        return new fke_0(fkj_02).a(n, n2);
    }
}

