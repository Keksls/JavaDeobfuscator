/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

/*
 * Renamed from fee
 */
public class fee_0
extends fde<feE> {
    static final fdi_0 c = new fdi_0(new aqi_2("Default", new aqt_2("Somme minimum", aov_1.b), new aqt_2("Ids des Elements interactifs", aov_1.d)));
    public static final fdv_0<fee_0> b = new fef_0();
    private int d;
    private final TLongHashSet e = new TLongHashSet();

    fee_0(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
        aoq_1 aoq_12 = (aoq_1)list.get(0);
        this.d = (int)aoq_12.a(null, null, null, null);
        aom_1 aom_12 = (aom_1)list.get(1);
        this.e.addAll(aom_12.a(null, null, null, null).toArray());
    }

    @Override
    public fdj_0 i() {
        return fdj_0.b;
    }

    @Override
    public boolean a(feE feE2) {
        return this.e.contains(feE2.e()) && feE2.f() >= (long)this.d;
    }
}

