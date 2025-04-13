/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eYo
 */
public class eyo_1<R extends ezr_0>
implements tv_0<exk_2, vf_2>,
eww_2,
exu_1,
eyn_1 {
    protected static final Logger a = Logger.getLogger(eyo_1.class);
    protected final TIntObjectHashMap<R> b = new TIntObjectHashMap();
    protected final TIntObjectHashMap<exk_2> c = new TIntObjectHashMap();
    private static eyo_1 d = new eyo_1();

    public static eyo_1 g() {
        return d;
    }

    public static void a(eyo_1 eyo_12) {
        d = eyo_12;
    }

    protected eyo_1() {
    }

    @Override
    public void a(R r2) {
        this.b.put(((ezr_0)r2).n(), r2);
    }

    @Deprecated
    public boolean f(int n) {
        return this.b.containsKey(n);
    }

    public R d(int n) {
        return (R)((ezr_0)this.b.get(n));
    }

    public Collection<R> h() {
        return this.b.valueCollection();
    }

    public static List<exk_2> a(int[] nArray) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        for (int n : nArray) {
            arrayList.add(eyo_1.g().g(n));
        }
        return arrayList;
    }

    public exk_2 g(int n) {
        exk_2 exk_22 = (exk_2)this.c.get(n);
        if (exk_22 == null) {
            R r2 = this.d(n);
            if (r2 == null) {
                return null;
            }
            exk_22 = exk_2.a(r2);
            this.c.put(n, (Object)exk_22);
        }
        return exk_22;
    }

    @Override
    public exk_2 a(vf_2 vf_22) {
        exk_2 exk_22 = this.e();
        if (exk_22.b(vf_22)) {
            return exk_22;
        }
        return null;
    }

    @Override
    public exk_2 e() {
        return new exk_2();
    }

    @Override
    public vf_2 f() {
        return new vf_2();
    }

    public TIntObjectIterator<R> i() {
        return this.b.iterator();
    }

    public Collection<R> j() {
        return this.b.valueCollection();
    }

    public exw_1 h(int n) {
        ezr_0 ezr_02 = (ezr_0)this.b.get(n);
        if (ezr_02 == null) {
            return null;
        }
        return ezr_02.M();
    }

    public void k() {
        this.b.clear();
    }

    @Override
    public /* synthetic */ ewv_2 e(int n) {
        return this.d(n);
    }
}

