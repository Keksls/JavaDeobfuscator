/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteByteIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteByteIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eLc
 */
public class elc_0
extends rt_0<rx_0> {
    protected static final Logger c = Logger.getLogger(elc_0.class);
    private ry_0 d = null;

    public void a(ry_0 ry_02) {
        this.d = ry_02;
    }

    private void a(rx_0 rx_02, rz_0 rz_02) {
        if (this.d != null) {
            this.d.a(rx_02, rz_02);
        }
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
        boolean bl = true;
        for (xq_2 xq_22 : xp_22.a) {
            eld_0 eld_02 = eld_0.a(xq_22.a);
            if (eld_02 != null) {
                this.b.put(xq_22.a, xq_22.b);
                continue;
            }
            c.error((Object)("erreur \u00e0 la d\u00e9s\u00e9rialisation : property inconnue : " + xq_22.a));
            bl = false;
        }
        this.a(null, rz_0.b);
        return bl;
    }

    @Override
    public byte c(rx_0 rx_02) {
        byte by = super.c(rx_02);
        this.a(rx_02, rz_0.c);
        return by;
    }

    @Override
    public byte d(rx_0 rx_02) {
        byte by = super.d(rx_02);
        this.a(rx_02, rz_0.e);
        return by;
    }

    @Override
    public void e(rx_0 rx_02) {
        super.e(rx_02);
        this.a(rx_02, rz_0.d);
    }

    @Override
    public void b() {
        super.b();
        this.a(null, rz_0.f);
    }
}

