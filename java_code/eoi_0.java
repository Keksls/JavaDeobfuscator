/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eoi
 */
public final class eoi_0 {
    private static final Logger ab = Logger.getLogger(eoi_0.class);
    private static final acy_2<eoj> ac = new acy_2();
    public static final int a = 40960;
    public static final byte b = 6;
    public static final short c = 4;
    public static final byte d = 1;
    public static final byte e = 0;
    public static final byte f = 1;
    public static final byte g = 2;
    public static final byte h = 3;
    public static final byte i = 4;
    public static final byte j = 5;
    public static final int k = 4;
    public static final int l = 10;
    public static final int m = 4;
    public static final int n = 1;
    public static final int o = 4;
    public static final int p = 8;
    public static final int q = 4;
    public static final int r = 6;
    public static final short s = 10;
    public static final short t = 10;
    public static final String u = "[\\p{L} '\\-]+";
    public static final String v = "[\\p{L} '\\-\\u00b7\\[\\]]+";
    public static final short w = 15;
    public static final short x = 25;
    public static final short y = 29;
    public static final short z = 3;
    public static final short A = 2;
    public static final short B = 10;
    public static final short C = 4;
    public static final short D = 4;
    public static final short E = 2;
    public static final short F = 1;
    public static final short G = 1;
    public static final short H = 2;
    public static final short I = 3;
    public static final byte J = 5;
    public static final float K = 1.25f;
    public static final int L = 4000;
    public static final byte M = 0;
    public static final byte N = 1;
    public static final byte O = 2;
    public static final int P = 2145;
    public static final int Q = 219;
    public static final short R = 60;
    public static final short S = 6;
    public static final int T = 200;
    public static final int U = 30;
    public static final int V = 10;
    public static final int W = 6;
    public static final float X = 0.75f;
    public static final float Y = 0.8f;
    public static final int Z = 75;
    public static final int aa = 50;

    public static void a(int n, eoj eoj2) {
        ac.a(n, eoj2);
    }

    public static eoj a(short s2) {
        List<Long> list = enp_2.a.h(ens_2.bG);
        if (!list.isEmpty()) {
            return new eoj(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
        }
        eoj eoj2 = ac.g(s2);
        if (eoj2 == null) {
            ab.error((Object)("Breed " + s2 + " n'a pas de StartPoint"));
            return eoi_0.b();
        }
        return eoj2;
    }

    public static int a() {
        return enp_2.a.b(ens_2.u);
    }

    public static eoj b() {
        List<Long> list = enp_2.a.h(ens_2.w);
        return new eoj(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
    }

    public static eoj c() {
        List<Long> list = enp_2.a.h(ens_2.x);
        return new eoj(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
    }
}

