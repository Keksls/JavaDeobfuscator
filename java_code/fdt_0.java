/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.List;

/*
 * Renamed from fdt
 */
public class fdt_0
extends fde<fet> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]), new aqi_2("Team filter", new aqt_2("Team id (0 : attackers, 1 : defenders)", aov_1.b)));
    public static final fdu_0 b = new fdu_0();
    private int d;

    fdt_0(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
        if (list.size() >= 1) {
            aoq_1 aoq_12 = (aoq_1)list.get(0);
            long l = aoq_12.a(null, null, null, null);
            this.d = Ints.saturatedCast((long)l);
        } else {
            this.d = -1;
        }
    }

    @Override
    public fdj_0 i() {
        return fdj_0.A;
    }

    @Override
    public boolean a(fet fet2) {
        if (this.d < 0) {
            return true;
        }
        return this.d == fet2.e();
    }
}

