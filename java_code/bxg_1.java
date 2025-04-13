/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxg
 */
public class bxg_1
implements ajh_1,
Comparable<bxg_1> {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "isHero";
    public static final String e = "isMonster";
    public static final String f = "isCompanion";
    public static final String g = "isDead";
    public static final String h = "kamas";
    public static final String i = "loots";
    public static final String j = "plusLootText";
    public static final String k = "hasLotOfLoots";
    public static final String l = "backgroundIllustration";
    public static final String m = "quantity";
    public static final String n = "isDownscaled";
    public static final String o = "displayedLevel";
    public static final String p = "popupLevelText";
    public static final String q = "gainedXp";
    public static final String r = "oldPercentLevel";
    public static final String s = "percentLevel";
    public static final String t = "levelUp";
    public static final String u = "popupXpText";
    public static final String v = "meritText";
    public static final String w = "rankingText";
    public static final String x = "rankName";
    private static final int y = 8;
    private final Optional<jg_0> z;
    private final Optional<jc_0> A;
    private final boolean B;
    private List<exi_2> C;
    private fhp D;

    public bxg_1(jg_0 jg_02, boolean bl) {
        this.z = Optional.of(jg_02);
        this.A = Optional.empty();
        this.B = bl;
    }

    public bxg_1(jc_0 jc_02, boolean bl) {
        this.z = Optional.empty();
        this.A = Optional.of(jc_02);
        this.B = bl;
    }

    @Override
    public String[] d() {
        return new String[]{i, j, k, m, p, q, r, t, u, v, w, x};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.A.map(jc_0::c).orElseGet(() -> this.z.map(jg_0::c).orElse(-1L));
        }
        if (b.equals(string)) {
            return this.A.map(jc_02 -> bae.h().a(7, (long)jc_02.g(), new Object[0])).orElseGet(() -> this.z.map(jg_0::g).orElse(null));
        }
        if (d.equals(string)) {
            return this.f();
        }
        if (e.equals(string)) {
            return this.A.isPresent();
        }
        if (f.equals(string)) {
            return this.g();
        }
        if (g.equals(string)) {
            return this.z.isPresent() && this.z.get().x();
        }
        if (h.equals(string)) {
            return this.z.map(jg_0::v).orElse(null);
        }
        if (i.equals(string)) {
            if (this.C == null) {
                this.h();
            }
            if (this.C.isEmpty()) {
                return null;
            }
            return this.C;
        }
        if (j.equals(string)) {
            if (this.C == null) {
                this.h();
            }
            if (this.C.isEmpty()) {
                return null;
            }
            ani_2 ani_22 = new ani_2();
            this.C.forEach(exi_22 -> ani_22.a(azs_0.a().d(exi_22.I()), 32, 32, "west").i().a(exi_22.e()).a((CharSequence)"x ").a().a(bhc_0.b(exi_22.G())).a((CharSequence)exi_22.N()).b().m().j());
            return ani_22.r();
        }
        if (k.equals(string)) {
            return this.C.size() > 8;
        }
        if (l.equals(string)) {
            if (this.A.isPresent()) {
                bpb_1 bpb_12 = bpc_1.a().a((short)this.A.get().g());
                if (bpb_12 == null) {
                    return null;
                }
                int n = bpb_12.c() == -1 ? bpb_12.b() : bpb_12.c();
                return azs_0.a().b(n);
            }
            return this.z.map(jg_02 -> azs_0.a().a(jg_02.j(), jg_02.l() ? 0 : 1)).orElse(null);
        }
        if (m.equals(string)) {
            return this.A.map(jc_0::o).orElse(null);
        }
        if (n.equals(string)) {
            ja_0 ja_02 = this.i();
            if (ja_02 == null) {
                return false;
            }
            return ja_02.l() && ja_02.m() > 0;
        }
        if (o.equals(string)) {
            ja_0 ja_03 = this.i();
            if (ja_03 == null) {
                return null;
            }
            return ja_03.l() && ja_03.m() > 0 ? ja_03.m() : ja_03.k();
        }
        if (t.equals(string)) {
            ja_0 ja_04 = this.i();
            if (ja_04 == null) {
                return false;
            }
            return ja_04.i() != ja_04.k();
        }
        if (q.equals(string)) {
            ja_0 ja_05 = this.i();
            if (ja_05 == null) {
                return Float.valueOf(1.0f);
            }
            return ja_05.e();
        }
        if (r.equals(string)) {
            ja_0 ja_06 = this.i();
            if (ja_06 == null) {
                return Float.valueOf(1.0f);
            }
            return Float.valueOf(Oz.c.a((short)ja_06.k(), ja_06.c() - ja_06.e()));
        }
        if (s.equals(string)) {
            ja_0 ja_07 = this.i();
            if (ja_07 == null) {
                return Float.valueOf(1.0f);
            }
            return Float.valueOf(Oz.c.a((short)ja_07.k(), ja_07.c()));
        }
        if (u.equals(string)) {
            ja_0 ja_08 = this.i();
            if (ja_08 == null) {
                return null;
            }
            if (ja_08.k() == 245) {
                return bae.h().a("fight.report.maxLevelReached", new Object[0]);
            }
            long l = Oz.c.a(ja_08.k() + 1);
            long l2 = ja_08.e() - ja_08.o();
            return bae.h().a("fight.report.gained.xp.popup", l - ja_08.c(), l2);
        }
        if (p.equals(string)) {
            ja_0 ja_09 = this.i();
            if (ja_09 == null) {
                return null;
            }
            if (!ja_09.l()) {
                return null;
            }
            return bae.h().a("fight.report.downscaled.level.popup", ja_09.k());
        }
        if (v.equals(string)) {
            if (this.D == null) {
                return null;
            }
            if (this.D.d() < 0) {
                return "-";
            }
            return bxg_1.a(this.D.b(), this.D.a(), false);
        }
        if (w.equals(string)) {
            if (this.D == null) {
                return null;
            }
            if (this.D.d() < 0) {
                return "-";
            }
            return bxg_1.a(this.D.d() + 1, this.D.c() + 1, true);
        }
        if (x.equals(string)) {
            if (this.D == null) {
                return null;
            }
            if (this.D.d() < 0) {
                return "-";
            }
            return bae.h().a("nation.pvpRank." + this.D.f(), new Object[0]);
        }
        return null;
    }

    private void h() {
        this.C = new ArrayList<exi_2>();
        List list = this.z.map(jg_0::o).orElse(this.A.map(jc_0::h).orElse(null));
        if (list == null) {
            return;
        }
        for (iy_0 iy_02 : list) {
            this.C.add(new exi_2(iy_02));
        }
        Collections.sort(this.C);
    }

    @Nullable
    private ja_0 i() {
        return this.z.map(jg_0::s).orElse(this.A.map(jc_0::l).orElse(null));
    }

    public Optional<jg_0> a() {
        return this.z;
    }

    public Optional<jc_0> b() {
        return this.A;
    }

    public long c() {
        return this.z.map(jg_0::c).orElse(0L);
    }

    public long e() {
        return this.z.map(jg_0::e).orElse(this.A.map(jc_0::e).orElse(0L));
    }

    public boolean f() {
        return this.z.map(jg_0::n).orElse(false);
    }

    public boolean g() {
        return this.A.map(jc_02 -> brP.a.a((short)jc_02.g())).orElse(false);
    }

    private static String a(int n, int n2, boolean bl) {
        ani_2 ani_22 = new ani_2();
        int n3 = bl ? n2 - n : n - n2;
        ani_22.i().a(n3 < 0 ? azf_2.h : azf_2.k);
        ani_22.a(n3 >= 0 ? Character.valueOf('+') : "").d(n3);
        String string = ani_22.r();
        return bae.h().a("pvp.fightResult.scoreDeltaDescription", n, n3 != 0 ? string : null);
    }

    public void a(fhp fhp2) {
        this.D = fhp2;
    }

    public void a(jv jv2) {
        if (this.C == null) {
            this.C = new ArrayList<exi_2>();
        } else {
            this.C.clear();
        }
        jv2.d().forEach(iy_02 -> this.C.add(new exi_2((iy_0)iy_02)));
    }

    public int a(@NotNull bxg_1 bxg_12) {
        long l = this.e();
        long l2 = bxg_12.e();
        long l3 = azu_0.j().n().u();
        if (l == l3 && l2 != l) {
            return -1;
        }
        if (l2 == l3 && l != l2) {
            return 1;
        }
        if (l2 == l) {
            boolean bl = this.f();
            boolean bl2 = bxg_12.f();
            if (bl && bl2) {
                return Long.compare(this.c(), bxg_12.c());
            }
            if (bl && bxg_12.g()) {
                return -1;
            }
            if (this.g() && bl2) {
                return 1;
            }
            if (bl2) {
                return -1;
            }
        }
        return Long.compare(l, l2);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bxg_1)object);
    }
}

