/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

public class fek
extends fde<feG> {
    static final fdi_0 c = new fdi_0(new aqi_2("Default", new aqt_2("Ids des Elements interactifs", aov_1.d)));
    public static final fdv_0<fek> b = new fel();
    private final TLongHashSet d = new TLongHashSet();

    fek(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
        aom_1 aom_12 = (aom_1)list.get(0);
        this.d.addAll(aom_12.a(null, null, null, null).toArray());
    }

    @Override
    public fdj_0 i() {
        return fdj_0.a;
    }

    @Override
    public boolean a(feG feG2) {
        return this.d.contains(feG2.e());
    }
}

