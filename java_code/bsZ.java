/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSortedMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableSortedMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class bsZ
implements ajh_1 {
    public static final String a = "currentFilter";
    public static final String b = "currentDungeon";
    public static final String d = "filters";
    public static final String e = "dungeons";
    public static final String f = "rankedPlayers";
    public static final String g = "hero";
    public static final String h = "heroesPartyExists";
    public static final String i = "pageDescription";
    public static final String j = "canGoForward";
    public static final String k = "canGoBack";
    public static final String l = "ladderType";
    public static final String m = "filterType";
    public static final String n = "isAvailableRewardsMode";
    public static final String o = "hasRewards";
    public static final String p = "rewards";
    public static final String q = "displayRewardsInfo";
    public static final String r = "progrestBarCurrentPercent";
    public static final String s = "progrestBarCap";
    public static final String t = "progrestBarCurrentValue";
    public static final String u = "progrestBarRatioText";
    public static final String v = "rewardType";
    public static final String w = "dungeonGameplayList";
    private final ArrayList<bsX> x = new ArrayList();
    final TIntObjectHashMap<btb> y = new TIntObjectHashMap();
    private final ArrayList<ArrayList<btk>> z = new ArrayList();
    private final HashMap<Long, btk> A = new HashMap();
    private int B;
    private bsX C;
    private final ArrayList<btb> D = new ArrayList();
    private int E = -1;
    private int F;
    private int G;
    private int H;
    private long I = 0L;
    private eEG J = eEG.c;
    private eEC K = eEC.a;
    private String L = "";
    private short M = (short)-1;
    private short N = Short.MAX_VALUE;
    private ezc_2 O;
    private boolean P;

    public bsZ() {
        this.t();
        this.u();
        this.v();
    }

    private void t() {
        for (bsV bsV2 : bsV.values()) {
            this.x.add(new bsX(bsV2));
        }
        this.C = this.x.get(0);
    }

    private void u() {
        ezd_2.a.a(new bta(this));
        ban_2.a.a().forEach((n, bao_22) -> this.y.put(n.intValue(), (Object)new btd((int)n, (bao_2)bao_22)));
    }

    public void a(hy_1 hy_12) {
        this.a();
        Map<Integer, hD> map = hy_12.j();
        for (Map.Entry<Integer, hD> entry : map.entrySet()) {
            hD hD2 = entry.getValue();
            btm btm2 = new btm(hD2, entry.getKey());
            for (Map.Entry<Long, hr_0> entry2 : hD2.q().d().entrySet()) {
                Long l = entry2.getKey();
                hr_0 hr_02 = entry2.getValue();
                btk btk2 = new btk(l, hr_02, btm2);
                btm2.a(btk2);
                Object t = euw_2.a.d(l);
                if (t == null || ((epq_2)t).U_() != azu_0.j().k().U_() || !hr_02.e()) continue;
                this.A.put(l, btk2);
            }
        }
        euw_2.a.b(azu_0.j().k().U_(), epq_22 -> {
            if (!this.A.containsKey(epq_22.a_())) {
                btk btk2 = new btk((bnh_1)epq_22);
                this.A.put(epq_22.a_(), btk2);
            }
            return true;
        });
        fis_1.a().a((ajf_1)this, g);
        fis_1.a().a((ajf_1)this, v);
    }

    public void a() {
        for (Map.Entry<Long, btk> entry : this.A.entrySet()) {
            btm btm2 = entry.getValue().f();
            if (btm2 == null) continue;
            btm2.c();
        }
        this.A.clear();
    }

    public void a(hy_1 hy_12, long l) {
        this.b();
        this.H = hy_12.c();
        this.G = hy_12.e();
        this.F = 0;
        Map<Integer, hD> map = hy_12.j();
        ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.copyOf(map);
        int n = hy_12.g();
        int n2 = 0;
        long l2 = azu_0.j().k().eV().b();
        for (Map.Entry entry : immutableSortedMap.entrySet()) {
            hD hD2 = (hD)entry.getValue();
            btm btm2 = new btm(hD2, (Integer)entry.getKey());
            Map<Long, hr_0> map2 = hD2.q().d();
            ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.copyOf(map2);
            for (Map.Entry entry2 : immutableSortedMap2.entrySet()) {
                Long l3 = (Long)entry2.getKey();
                hr_0 hr_02 = (hr_0)entry2.getValue();
                btk btk2 = new btk(l3, hr_02, btm2);
                btm2.a(btk2);
                if (!hr_02.e()) continue;
                if (n2 < n) {
                    ++n2;
                    continue;
                }
                if (this.K == eEC.b && hr_02.l() != l2 || l > 0L && l3 != l) continue;
                if (this.z.isEmpty()) {
                    this.z.add(new ArrayList());
                }
                if (this.z.get(0).size() >= 12 && this.K != eEC.b) continue;
                int n3 = this.z.size() - 1;
                ArrayList<btk> arrayList = this.z.get(n3);
                if (arrayList.size() >= 12) {
                    this.z.add(new ArrayList());
                    arrayList = this.z.get(n3 + 1);
                }
                arrayList.add(btk2);
            }
        }
        fis_1.a().a((ajf_1)this, f, i, k, j, l, m);
    }

    public void b() {
        for (ArrayList<btk> arrayList : this.z) {
            for (btk btk2 : arrayList) {
                btm btm2 = btk2.f();
                if (btm2 == null) continue;
                btm2.c();
            }
            arrayList.clear();
        }
        this.z.clear();
    }

    public void b(hy_1 hy_12) {
        this.a(hy_12, 0L);
    }

    public void c() {
        this.H -= 12;
    }

    public void e() {
        this.H += 12;
    }

    public int f() {
        return this.B;
    }

    public int g() {
        return this.E;
    }

    public eEG h() {
        return this.J;
    }

    public eEC i() {
        return this.K;
    }

    public void a(int n) {
        this.E = n;
        fis_1.a().a((ajf_1)this, b);
        fis_1.a().a((ajf_1)this, v);
    }

    public void a(byte by) {
        int n = this.x.size();
        for (int k = 0; k < n; ++k) {
            bsX bsX2 = this.x.get(k);
            if (bsX2.a().a() != by) continue;
            this.a(bsX2);
            return;
        }
    }

    public void a(bsX bsX2) {
        if (this.C == bsX2) {
            return;
        }
        this.C = bsX2;
        this.v();
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.k();
        }
        if (string.equals(e)) {
            return this.D;
        }
        if (string.equals(d)) {
            return this.x;
        }
        if (string.equals(a)) {
            return this.C;
        }
        if (string.equals(f)) {
            if (this.z.isEmpty()) {
                return null;
            }
            return this.z.get(this.F);
        }
        if (string.equals(g)) {
            return this.j();
        }
        if (string.equals(h)) {
            return euw_2.a.h(azu_0.j().k().U_()) > 1;
        }
        if (string.equals(i)) {
            return this.w();
        }
        if (string.equals(k)) {
            return this.p();
        }
        if (string.equals(j)) {
            return this.q();
        }
        if (string.equals(l)) {
            return (int)this.J.b();
        }
        if (string.equals(m)) {
            return this.K.a();
        }
        if (string.equals(n)) {
            return this.P;
        }
        if (string.equals(o)) {
            BG bG = azu_0.j().n().c();
            return bG != null && !bG.b().isEmpty();
        }
        if (string.equals(q)) {
            return this.k() != null && this.k().l();
        }
        if (string.equals(p)) {
            BG bG = azu_0.j().n().c();
            if (bG == null) {
                return null;
            }
            ArrayList<bvk_1> arrayList = new ArrayList<bvk_1>(5);
            for (bl_0 bl_02 : bG.b()) {
                for (bc_0 bc_02 : bl_02.g()) {
                    AY aY = bc_02.e();
                    int n = (int)aY.g();
                    arrayList.add(new bvk_1(new brk_1(n, (ezr_0)eyo_1.g().d(bc_02.c()), bl_02, aY)));
                }
                for (AY aY : bl_02.l()) {
                    arrayList.add(new bvk_1(new brk_1(1, (ezr_0)eyo_1.g().d(8050), bl_02, aY)));
                }
            }
            for (int k = arrayList.size(); k < 5; ++k) {
                arrayList.add(null);
            }
            return arrayList;
        }
        if (string.equals(r)) {
            int n = enp_2.a.b(ens_2.bl);
            if ((long)n < this.I) {
                return 1.0;
            }
            return Float.valueOf((float)this.I / (float)n);
        }
        if (string.equals(s)) {
            return enp_2.a.b(ens_2.bl);
        }
        if (string.equals(t)) {
            return this.I;
        }
        if (string.equals(v)) {
            btb btb2 = this.k();
            if (btb2 == null) {
                return "";
            }
            if (!btb2.l()) {
                return bae.h().a("dungeon.ladder.reward.not.competitive", new Object[0]);
            }
            btk btk2 = this.j();
            if (btk2 == null) {
                return "";
            }
            btm btm2 = btk2.f();
            return btm2 == null ? bae.h().a("dungeon.ladder.reward.participate.to.dungeon", new Object[0]) : bae.h().a("dungeon.ladder.reward.gain", new Object[0]);
        }
        if (string.equals(u)) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = enp_2.a.b(ens_2.bl);
            stringBuilder.append(bae.h().a("xpRatio", bae.h().a(this.I), bae.h().a((long)n)));
            return stringBuilder.toString();
        }
        if (string.equals(w)) {
            return bsY.a();
        }
        return null;
    }

    @Nullable
    public btk j() {
        List list = (List)fis_1.a().e("heroesParty");
        bmr_1 bmr_12 = (bmr_1)list.get(this.B);
        return bmr_12 == null ? this.A.get(azu_0.j().k().a_()) : this.A.get(bmr_12.a_());
    }

    public btb k() {
        return (btb)this.y.get(this.E);
    }

    private void v() {
        this.D.clear();
        this.y.forEachValue(btb2 -> {
            if (this.C.a().a((btb)btb2)) {
                if (btb2.o() < this.M) {
                    return true;
                }
                if (btb2.o() > this.N) {
                    return true;
                }
                if (!this.L.isEmpty() && !Cz.a(btb2.n(), this.L)) {
                    return true;
                }
                if (this.O != null && this.O != btb2.k()) {
                    return true;
                }
                this.D.add((btb)btb2);
            } else if (this.E == btb2.m()) {
                this.E = -1;
                fis_1.a().a((ajf_1)this, b);
            }
            return true;
        });
        this.D.sort(btc.a);
        if (this.E == -1 && !this.D.isEmpty()) {
            this.E = this.D.get(0).m();
        }
        fis_1.a().a((ajf_1)this, e, b);
    }

    public void a(String string) {
        this.L = string;
        this.v();
    }

    public void a(short s2) {
        this.M = s2;
        this.v();
    }

    public void b(short s2) {
        this.N = s2;
        this.v();
    }

    public void a(ezc_2 ezc_22) {
        this.O = ezc_22;
        this.v();
    }

    public String l() {
        return this.L;
    }

    public short m() {
        return this.M;
    }

    public short n() {
        return this.N;
    }

    public ezc_2 o() {
        return this.O;
    }

    public void b(int n) {
        this.B = n;
    }

    private String w() {
        int n = Math.max(0, this.d(this.H));
        return n + this.F + 1 + "/" + (this.d(this.G - 1) + 1);
    }

    private int d(int n) {
        return n / 12;
    }

    public boolean p() {
        return this.d(this.H) + this.F > 0;
    }

    public boolean q() {
        return this.d(this.H) + this.F < this.d(this.G - 1);
    }

    public boolean c(int n) {
        int n2;
        int n3 = this.d(this.H);
        int n4 = n3 + (n2 = this.z.size()) - 1;
        if (n > n4 || n < n3) {
            return false;
        }
        this.F = n - n3;
        fis_1.a().a((ajf_1)this, f, i, k, j);
        return true;
    }

    public void a(eEG eEG2) {
        this.J = eEG2;
    }

    public int r() {
        return this.d(this.G - 1);
    }

    public int s() {
        return this.d(this.H) + this.F;
    }

    public void a(eEC eEC2) {
        this.K = eEC2;
    }

    public void a(boolean bl) {
        this.P = bl;
        fis_1.a().a((ajf_1)this, n);
    }

    public void a(long l) {
        this.I = l;
        fis_1.a().a((ajf_1)this, r, t);
    }
}

