/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

public class bgt
implements agw_0 {
    private static final Logger b = Logger.getLogger(bgt.class);
    public static final bgt a = new bgt();
    final TIntIntHashMap c = new TIntIntHashMap();

    public void a(YK yK) {
        asw_2.a().a(new aQr(), new bgu(this));
        yK.b(this);
    }

    @Override
    public String m_() {
        return null;
    }

    public bgx a(int n) {
        return this.b(this.c.get(n));
    }

    public bgx b(int n) {
        bgx bgx2 = new bgx(n);
        try {
            asw_2.a().a(n, new aQr(), new bgv(this, bgx2));
        }
        catch (Exception exception) {
            b.error((Object)("Probl\u00e8me avec le donjon " + n), (Throwable)exception);
            return null;
        }
        return bgx2;
    }

    bgw a(int n, float f2) {
        aqq_0 aqq_02 = new aqq_0();
        if (asw_2.a().a(n, aqq_02)) {
            return new bgw(aqq_02.c(), f2);
        }
        throw new Exception("Pas de d\u00e9fi avec id=" + n);
    }

    public String c(int n) {
        return bae.h().a(113, (long)n, new Object[0]);
    }

    public String d(int n) {
        return bae.h().a(118, (long)n, new Object[0]);
    }

    public String e(int n) {
        return bae.h().a(112, (long)n, new Object[0]);
    }
}

