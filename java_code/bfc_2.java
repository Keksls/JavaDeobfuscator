/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfC
 */
public class bfc_2
implements agw_0 {
    private static final Logger a = Logger.getLogger(bfc_2.class);

    public void a(YK yK) {
        asw_2.a().a(new ats_0(), new bfd_2(this));
        yK.b(this);
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.resource", new Object[0]);
    }

    public static bNI a(ats_0 ats_02) {
        bNI bNI2;
        int n = ats_02.c();
        HashMap<Long, int[]> hashMap = ats_02.r();
        int n2 = ats_02.d();
        int n3 = ats_02.q();
        boolean bl = ats_02.h();
        short s2 = ats_02.p();
        int[] nArray = ats_02.m();
        short s3 = ats_02.f();
        short s4 = ats_02.g();
        boolean bl2 = ats_02.i();
        fhj_0 fhj_02 = fhj_0.a(ats_02.e());
        if (ats_02.k()) {
            bNI2 = new bNF(n, (short)n2, s3, s4, fhj_02, bl, s2, hashMap, n3, bl2);
            ((bNF)bNI2).a(ats_02.n());
            ((bNF)bNI2).a(ats_02.l());
        } else {
            bNI2 = new bNI(n, (short)n2, s3, s4, fhj_02, bl, s2, hashMap, n3, bl2);
        }
        for (int k = 0; k < nArray.length; ++k) {
            int n4 = nArray[k];
            fhr_0 fhr_02 = fhr_0.a(n4);
            if (fhr_02 == null) {
                a.error((Object)("Impossible de trouver la propri\u00e9t\u00e9 " + n4 + " d\u00e9finie pour la ressource " + n));
                continue;
            }
            bNI2.a(fhr_02);
        }
        bNR bNR2 = new bNR(0, 0, fjz_0.d, null, 0.0f);
        bNI2.a(bNR2);
        bNI2.b(ats_02.o().length);
        for (att_0 att_02 : ats_02.o()) {
            bfc_2.a(bNI2, att_02);
        }
        return bNI2;
    }

    private static void a(bNI bNI2, att_0 att_02) {
        int n = att_02.c();
        int n2 = att_02.a();
        byte by = (byte)att_02.a();
        int n3 = att_02.d();
        fjz_0[] fjz_0Array = fjz_0.values();
        float[] fArray = null;
        float f2 = 0.0f;
        int n4 = att_02.f();
        if (n4 != 0) {
            fArray = new azf_2(n4).v();
            f2 = att_02.e();
        }
        bNR bNR2 = new bNR(n, by, fjz_0Array[n3], fArray, f2);
        bNI2.a(bNR2);
        bNR2.a(att_02.b().length);
        for (aTu aTu2 : att_02.b()) {
            brw_1 brw_12 = bfc_2.a(bNI2.h(), n2, aTu2);
            bNR2.a(brw_12);
        }
    }

    @Nullable
    private static brw_1 a(int n, int n2, aTu aTu2) {
        apc_2 apc_22;
        int n3 = aTu2.a();
        int n4 = aTu2.c();
        int n5 = aTu2.b();
        int n6 = aTu2.d();
        int n7 = aTu2.f();
        int n8 = aTu2.e();
        int n9 = aTu2.n();
        int n10 = aTu2.g();
        byte by = (byte)aTu2.p();
        String string = aTu2.j();
        boolean bl = aTu2.k();
        int n11 = aTu2.h();
        int n12 = aTu2.i();
        int[] nArray = aTu2.o();
        boolean bl2 = aTu2.q();
        float f2 = aTu2.m();
        bru_1 bru_12 = new bru_1(n11, n12);
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur de compilation du crit\u00e8rre sur l'action de collecte de ressource " + aTu2.a() + " de la ressource " + n));
            return null;
        }
        return new brw_1(n3, n2, n5, n6, n8, n10, n9, n7, apc_22, bl, n4, by, bru_12, bl2, nArray, f2);
    }
}

