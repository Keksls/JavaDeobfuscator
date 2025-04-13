/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from bix
 */
public class bix_2
extends bin_2 {
    public static final int l = -1;
    public static final String[] m = new String[]{"name", "achievements", "isHistory"};

    public bix_2(long l) {
        super(l);
        this.h = -1;
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    protected String e() {
        return bae.h().a("achievement.history", new Object[0]);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int g() {
        return -1;
    }

    @Override
    public void a(biu_2 biu_22) {
    }

    @Override
    public TIntObjectHashMap<biu_2> h() {
        return null;
    }

    @Override
    protected ArrayList<biw_2> i() {
        ArrayList<biw_2> arrayList = new ArrayList<biw_2>();
        for (bhm_1 bhm_12 : this.j.c()) {
            biw_2 biw_22 = biz_2.a.b(this.i, bhm_12.b());
            if (biw_22 == null || !biw_22.t() || biz_2.a.e(this.i, biw_22.i())) continue;
            arrayList.add(biw_22);
        }
        return arrayList;
    }

    protected boolean k() {
        return false;
    }
}

