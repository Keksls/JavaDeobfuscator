/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eMw
 */
public class emw_2
implements apt_2<Su> {
    private static final Logger A = Logger.getLogger(emw_2.class);
    public static final long a = 1L;
    public static final long b = 2L;
    public static final long c = 4L;
    public static final long d = 8L;
    public static final long e = 16L;
    public static final long f = 32L;
    public static final long g = 64L;
    public static final long h = 128L;
    public static final long i = 256L;
    public static final long j = 4096L;
    public static final long k = 8192L;
    public static final long l = 16384L;
    public static final long m = 0x400000000L;
    public static final long n = 0x10000000000L;
    public static final long o = 0x20000000000L;
    public static final long p = 0x40000000000L;
    public static final long q = 0x80000000000L;
    public static final long r = 0x100000000000L;
    public static final long s = 0x200000000000L;
    public static final long t = 0x400000000000L;
    public static final long u = 0x800000000000L;
    public static final long v = 0x1000000000000L;
    public static final long w = 0x2000000000000L;
    public static final long x = 0x4000000000000L;
    public static final long y = 0x8000000000000L;
    protected final long[] z;
    private static final long[] B = new long[0];

    public emw_2(long[] lArray) {
        this.z = lArray == null || lArray.length == 0 ? B : lArray;
    }

    @Override
    public boolean a(long l) {
        for (int k = 0; k < this.z.length; ++k) {
            if ((this.z[k] & l) == 0L) continue;
            return true;
        }
        return false;
    }

    @Override
    public abo_2<apu_2, ArrayList<Su>> a(apq_2 apq_22, apq_2 apq_23) {
        apu_2 apu_22 = apu_2.c;
        if (this.z == null || this.z == B) {
            return new abo_2<apu_2, ArrayList<Su>>(apu_2.a, new ArrayList());
        }
        if (!apq_22.an()) {
            return new abo_2<apu_2, ArrayList<Su>>(apu_2.c, new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int k = 0; k < this.z.length; ++k) {
            Su su;
            long l = this.z[k];
            if ((2L & l) != 0L && apq_22 != apq_23 || (0x100L & l) != 0L && apq_22 == apq_23 || (0x80L & l) != 0L && (apq_22 == apq_23 || apq_23 == null || !(apq_22 instanceof app_2) || !(apq_23 instanceof app_2) || ((app_2)apq_22).Y() != ((app_2)apq_23).Y()) || (0x40000000000L & l) != 0L && (apq_23 == null || !(apq_23 instanceof epq_2) || apq_22 != ((epq_2)apq_23).cl()) || (0x200000000000L & l) != 0L && (apq_23 == null || !(apq_23 instanceof epq_2) || apq_22 != ((epq_2)apq_23).ci()) || (4L & l) != 0L && (apq_23 == null || !(apq_22 instanceof app_2) || !(apq_23 instanceof app_2) || ((app_2)apq_22).Y() != ((app_2)apq_23).Y()) || (8L & l) != 0L && (apq_23 == null || !(apq_22 instanceof app_2) || !(apq_23 instanceof app_2) || ((app_2)apq_22).Y() == ((app_2)apq_23).Y()) || (0x10L & l) != 0L && (!(apq_22 instanceof epq_2) || apq_22.a_() <= 0L) || (0x20000000000L & l) != 0L && (!(apq_22 instanceof epq_2) || apq_22.a_() > 0L) || (0x20L & l) != 0L && (!(apq_22 instanceof epq_2) || !((epq_2)apq_22).C_()) || (0x100000000000L & l) != 0L && (!(apq_22 instanceof epq_2) || ((epq_2)apq_22).C_()) || (0x1000L & l) != 0L && (!(apq_22 instanceof epq_2) || !((epq_2)(su = (epq_2)apq_22)).C_() || su.cl() != apq_23 || ((epq_2)apq_22).p() || ((epq_2)apq_22).t()) || (0x4000L & l) != 0L && (!(apq_22 instanceof epq_2) || !((epq_2)apq_22).p()) || (0x10000000000L & l) != 0L && (!(apq_22 instanceof epq_2) || !((epq_2)apq_22).o()) || (0x400000000L & l) != 0L && (!(apq_23 instanceof epq_2) || apq_22 instanceof epq_2 && ((epq_2)(su = (epq_2)apq_22)).C_() && su.cl() == apq_23) || (0x40L & l) != 0L && !(apq_22 instanceof sr_0) || (0x800000000000L & l) != 0L && !(apq_22 instanceof epq_2) || (0x80000000000L & l) != 0L && (!(apq_22 instanceof sr_0) || ((sr_0)apq_22).v() != apq_23) || (0x400000000000L & l) != 0L && (!(apq_23 instanceof sr_0) || ((sr_0)apq_23).v() != apq_22) || (0x1000000000000L & l) != 0L && (!(apq_23 instanceof sr_0) || ((sr_0)apq_23).v() == apq_22) || (0x4000000000000L & l) != 0L && ((ti_0)((Object)apq_22)).Z() < 0 || (0x2000000000000L & l) != 0L && apq_22 instanceof sr_0 || apq_22 instanceof sr_0 && !((sr_0)(su = (sr_0)apq_22)).ad() && (0x8000000000000L & l) == 0L) continue;
            if ((1L & l) != 0L) {
                if (apq_23 instanceof epq_2 && apq_22 instanceof epq_2 && ((epq_2)(su = (epq_2)apq_22)).a(eoz_1.u)) continue;
                apu_22 = apu_2.e;
                continue;
            }
            return new abo_2<apu_2, ArrayList<Su>>(apu_2.a, arrayList);
        }
        return new abo_2<apu_2, ArrayList<Su>>(apu_22, arrayList);
    }

    private static boolean a(apq_2 apq_22, short s2) {
        if (!(apq_22 instanceof epq_2)) {
            return false;
        }
        epq_1 epq_12 = ((epq_2)apq_22).Z_();
        if (epq_12 == null) {
            return false;
        }
        return s2 == epq_12.s();
    }
}

