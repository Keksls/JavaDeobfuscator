/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from ezp
 */
public final class ezp_2 {
    public static final ezw_2 a = new ezw_2(1, ezp_2.a((short)2, (short)4));
    public static final ezw_2 b = new ezw_2(2, ezp_2.a((short)3, (short)4));
    public static final ezw_2 c = new ezw_2(3, ezp_2.a((short)4, (short)4));
    public static final ezw_2 d = new ezw_2(4, ezp_2.a((short)5, (short)4));
    public static final ezw_2 e = new ezw_2(5, new TIntArrayList(new int[]{40, 80, 120, 160}));

    private static TIntArrayList a(short s2, short s3) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        tIntArrayList.add((int)s2);
        for (short s4 = s2; s4 <= 200; s4 = (short)(s4 + 1)) {
            if (s4 % s3 != 0) continue;
            tIntArrayList.add((int)((short)(s4 + s2)));
        }
        return tIntArrayList;
    }

    static {
        a.a(ezo_2.c);
        a.a(ezo_2.d);
        a.a(ezo_2.e);
        a.a(ezo_2.f);
        a.a(ezo_2.g);
        b.a(ezo_2.h);
        b.a(ezo_2.i);
        b.a(ezo_2.j);
        c.a(ezo_2.l);
        c.a(ezo_2.m);
        c.a(ezo_2.n);
        c.a(ezo_2.o);
        d.a(ezo_2.r);
        d.a(ezo_2.s);
        d.a(ezo_2.t);
        d.a(ezo_2.u);
        d.a(ezo_2.v);
        d.a(ezo_2.w);
        d.a(ezo_2.x);
        e.a(ezo_2.y);
        e.a(ezo_2.z);
        e.a(ezo_2.A);
        e.a(ezo_2.B);
        e.a(ezo_2.C);
        e.a(ezo_2.D);
    }
}

