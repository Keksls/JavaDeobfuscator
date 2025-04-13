/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from eIH
 */
public final class eih_0 {
    private static final Logger a = LoggerFactory.getLogger(eih_0.class);

    public static eig_0 a(int n, So<efh_0> so, aff_1 aff_12) {
        ekk_0 ekk_02 = elg_0.a().i(n);
        if (ekk_02 == null) {
            NullPointerException nullPointerException = new NullPointerException("Unknown effect area for following id : " + n);
            a.error(nullPointerException.getMessage(), (Throwable)nullPointerException);
            throw nullPointerException;
        }
        int n2 = ekk_02.w();
        if (n2 == ele_0.d.a()) {
            return eIM.a(so, aff_12, n);
        }
        if (n2 == ele_0.c.a()) {
            return eIA.a(so, aff_12, n);
        }
        if (n2 == ele_0.b.a()) {
            return eIJ.a(so, aff_12, n);
        }
        if (n2 == ele_0.j.a()) {
            return eIB.a(so, aff_12, n);
        }
        return eig_0.a(so, aff_12, n);
    }
}

