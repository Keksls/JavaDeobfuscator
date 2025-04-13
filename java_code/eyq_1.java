/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eYq
 */
public class eyq_1
implements tt_0<exk_2> {
    private static boolean o = false;
    private static final Logger p = Logger.getLogger(eyq_1.class);
    private final int[] q;
    private final tt_0<exk_2> r;

    public eyq_1(int[] nArray, tt_0<exk_2> tt_02) {
        this.q = nArray;
        this.r = tt_02;
    }

    @Override
    public int a(tr_0<exk_2> tr_02, exk_2 exk_22) {
        if (!this.a(exk_22.U())) {
            return -3;
        }
        return this.r.a(tr_02, exk_22);
    }

    @Override
    public int a(tr_0<exk_2> tr_02, exk_2 exk_22, short s2) {
        if (!this.a(exk_22.U())) {
            return -3;
        }
        return this.r.a(tr_02, exk_22, (exk_2)s2);
    }

    @Override
    public int a(tr_0<exk_2> tr_02, exk_2 exk_22, exk_2 exk_23) {
        if (!this.a(exk_23.U())) {
            return -3;
        }
        return this.r.a(tr_02, exk_22, exk_23);
    }

    @Override
    public int b(tr_0<exk_2> tr_02, exk_2 exk_22) {
        return this.r.b(tr_02, exk_22);
    }

    @Override
    public boolean a(exk_2 exk_22, Su su, So so) {
        return this.r.a(exk_22, su, so);
    }

    @Override
    public boolean a(tr_0<exk_2> tr_02, Su su, So so) {
        return this.r.a(tr_02, su, so);
    }

    private boolean a(exq_1<exq_1> exq_12) {
        if (o) {
            return true;
        }
        if (this.q == null || this.q.length == 0) {
            return true;
        }
        do {
            if (!Cn.a(this.q, (int)exq_12.d())) continue;
            return true;
        } while ((exq_12 = exq_12.f()) != null);
        return false;
    }

    public static void a(boolean bl) {
        o = bl;
    }
}

