/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQL
 */
public class bql_0
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bql_0.class);
    public static final String b = "currentName";
    public static final String d = "linksByIsland";
    public static final String e = "iconUrl";
    public static final String f = "transportType";
    private final acy_2<bqk_0> h = new acy_2();
    private long i;
    private int j;
    public static String g;

    public boolean a(long l, bFN bFN2) {
        this.h.c();
        this.i = l;
        Object Info = fjs.a.a(fjv.d, l);
        this.j = ((fjB)Info).g();
        bmr_1 bmr_12 = azu_0.j().k();
        fjs.a.a(new bqm_0(this, l, bmr_12, bFN2));
        return true;
    }

    void a(fjx fjx2, long l, bmr_1 bmr_12, bFN bFN2) {
        List<Long> list;
        emg_0 emg_02;
        fjw fjw2;
        int n;
        if ((long)fjx2.b() != l && (long)fjx2.c() != l) {
            return;
        }
        int n2 = n = (long)fjx2.b() == l ? fjx2.c() : fjx2.b();
        if (!fjx2.b(bmr_12, bFN2)) {
            return;
        }
        TByteHashSet tByteHashSet = new TByteHashSet();
        boolean bl = true;
        if (!fjx2.a(bmr_12, bFN2)) {
            bl = false;
            tByteHashSet.add((byte)1);
        }
        if ((fjw2 = (fjw)fjs.a.a(fjv.d, (long)n)) == null) {
            return;
        }
        int n3 = fjw2.c();
        eny_0 eny_02 = enz_0.a.a(n3, (emg_02 = bmr_12.N_()).c());
        if (eny_02 == eny_0.d && !emg_02.a(enw_0.t)) {
            bl = false;
            tByteHashSet.add((byte)3);
        }
        if ((list = enp_2.a.h(ens_2.h)).contains(n3)) {
            return;
        }
        bqk_0 bqk_02 = this.h.g(n3);
        if (bqk_02 == null) {
            bqk_02 = new bqk_0(n3);
            this.h.a(n3, bqk_02);
        }
        bqk_02.a(new bqj_0(fjx2, this.i, bl, tByteHashSet));
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(e)) {
            return azs_0.a().a("zaapTypeIconPath", "defaultIconPath", this.j == -1 ? bqn_0.b.a() : this.j);
        }
        if (string.equals(f)) {
            return bqn_0.b.a();
        }
        return null;
    }

    @Nullable
    public List<bqk_0> a() {
        if (this.h.g()) {
            return null;
        }
        ArrayList<bqk_0> arrayList = new ArrayList<bqk_0>();
        for (bqk_0 bqk_02 : this.h) {
            if (bqk_02.c().isEmpty()) continue;
            arrayList.add(bqk_02);
        }
        return arrayList;
    }

    public void a(String string) {
        g = string;
        fis_1.a().a((ajf_1)this, d);
    }

    private String c() {
        return bae.h().a(83, (long)((int)this.i), new Object[0]);
    }

    public String b() {
        ani_2 ani_22 = new ani_2();
        if (this.h.d() != 0) {
            boolean bl = true;
            for (bqk_0 bqk_02 : this.h) {
                ArrayList<bqj_0> arrayList = bqk_02.b();
                String string = bqk_02.a();
                int n = arrayList.size();
                for (int k = 0; k < n; ++k) {
                    if (bl) {
                        bl = false;
                    } else {
                        ani_22.m();
                    }
                    bqj_0 bqj_02 = arrayList.get(k);
                    ani_22.a((CharSequence)bqj_02.b()).a((CharSequence)" (").a((CharSequence)string).a((CharSequence)")");
                }
            }
        } else {
            ani_22.a((CharSequence)bae.h().a("boat.noDestinationsAvailable", new Object[0]));
        }
        return ani_22.r();
    }
}

