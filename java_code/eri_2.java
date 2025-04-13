/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteByteIterator
 */
import gnu.trove.iterator.TByteByteIterator;
import java.util.Set;

/*
 * Renamed from eri
 */
public class eri_2<T extends rx_0>
extends rt_0<T> {
    public static final Set<rx_0> c = Set.of(erl_2.i);
    public static final byte d = 0;
    public static final byte e = 1;
    public static final byte f = 4;
    private final erj_2 g = new erj_2();
    private final adi_1<ry_0> h = new adi_1<ry_0>(this.g);

    public static eri_2 a(byte by, ry_0 ry_02) {
        eri_2 eri_22;
        switch (by) {
            case 0: {
                eri_22 = new eri_2();
                break;
            }
            case 1: {
                eri_22 = new eri_2();
                break;
            }
            default: {
                a.fatal((Object)"type de manager de propri\u00e9t\u00e9 inconnu");
                return null;
            }
        }
        eri_22.h.a(ry_02);
        return eri_22;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h.b();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h.b();
    }

    public void a(ry_0 ry_02) {
        this.h.a(ry_02);
    }

    @Override
    public boolean b(ry_0 ry_02) {
        return this.h.b(ry_02);
    }

    private void a(T t, rz_0 rz_02) {
        if (this.g.a != null) {
            a.error((Object)"Attention, \u00e9crasement de propri\u00e9t\u00e9 dans le notifier", (Throwable)new Exception());
        }
        this.g.a = t;
        this.g.b = rz_02;
        this.h.a();
        this.g.a = null;
        this.g.b = rz_0.a;
    }

    @Override
    public boolean a(xp_2 xp_22) {
        xp_22.c();
        TByteByteIterator tByteByteIterator = this.b.iterator();
        int n = this.b.size();
        while (n-- > 0) {
            tByteByteIterator.advance();
            xq_2 xq_22 = new xq_2();
            xq_22.a = tByteByteIterator.key();
            xq_22.b = tByteByteIterator.value();
            xp_22.a.add(xq_22);
        }
        return true;
    }

    @Override
    public boolean b(xp_2 xp_22) {
        this.b.clear();
        for (xq_2 xq_22 : xp_22.a) {
            this.b.put(xq_22.a, xq_22.b);
        }
        this.a(null, rz_0.b);
        return true;
    }

    @Override
    public byte c(T t) {
        byte by = super.c(t);
        this.a(t, rz_0.c);
        return by;
    }

    @Override
    public byte d(T t) {
        byte by = super.d(t);
        this.a(t, rz_0.e);
        return by;
    }

    @Override
    public void e(T t) {
        super.e(t);
        this.a(t, rz_0.d);
    }

    @Override
    public void b() {
        super.b();
        this.a(null, rz_0.f);
    }
}

