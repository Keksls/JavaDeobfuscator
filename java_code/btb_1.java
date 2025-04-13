/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btB
 */
public class btb_1
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(btb_1.class);
    public static final String b = "panelId";
    public static final String d = "panelOrdinalId";
    public static final String e = "panelContentTranslation";
    public static final String f = "currentItem";
    public static final String g = "consumedItem";
    public static final String h = "isConsumedItemValid";
    public static final String i = "searchResult";
    public static final String j = "internalShardsDisplayer";
    public static final String k = "shardIconUrl";
    public static final String l = "consumeText";
    public static final String m = "invertedConsumeText";
    public static final String n = "availableShardsAmount";
    public static final String o = "hasShardsModifications";
    public static final String p = "resultMessage";
    public static final String q = "resultStyle";
    public static final String r = "hasOccupation";
    public static final String s = "applyButtonTranslation";
    public static final String t = "enoughShards";
    private static final String v = "enchantmentResultContainer";
    private static final String w = "itemSearchContainer";
    public static final int u = 120;
    private static final int x = 140;
    private static final int y = 500;
    private static final String z = "LightRedBold";
    private static final String A = "GreenBold";
    private static final Predicate<ezb_0> B = ezb_02 -> ezb_02.a() == ezc_0.d || ezb_02.a() == ezc_0.c;
    private fso C;
    private btu_1 D = btu_1.f;
    private btu_1 E;
    private exk_2 F;
    private fhy_0 G;
    private exk_2 H;
    private btx_0 I;
    private bia_0 J;
    private int K;
    private int L;
    private String M;
    private String N = "GreenBold";
    private fhx_0 O;
    private boolean P;
    private boolean Q;
    private final Map<Byte, LinkedList<ezb_0>> R = new HashMap<Byte, LinkedList<ezb_0>>();

    public void a() {
        this.D = btu_1.f;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.c();
        this.I = null;
        this.J = null;
        this.K = 0;
        this.L = 0;
        this.P = false;
        this.m();
        this.f();
    }

    @Override
    public String[] d() {
        return new String[]{b, e, f, g, p, q, s, l, m, t};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.D.a();
        }
        if (string.equals(d)) {
            return this.D.ordinal();
        }
        if (string.equals(e)) {
            bae bae2 = bae.h();
            if (this.D == btu_1.c) {
                return bae2.a("enchantment.item.choice.roll.color", new Object[0]);
            }
            if (this.D == btu_1.b) {
                return bae2.a("enchantment.item.choice.roll.number", new Object[0]);
            }
            if (this.D == btu_1.d) {
                return bae2.a("enchantment.item.choice.roll.order", new Object[0]);
            }
            return this.D.name();
        }
        if (string.equals(f)) {
            return this.F;
        }
        if (string.equals(g)) {
            return this.H;
        }
        if (string.equals(h)) {
            return this.H != null || this.F != null && this.F.C().d() > 0;
        }
        if (string.equals(i)) {
            return this.I;
        }
        if (string.equals(j)) {
            return this.J;
        }
        if (string.equals(k)) {
            return azs_0.a().f(81127083);
        }
        if (string.equals(n)) {
            return this.K;
        }
        if (string.equals(l)) {
            return this.L;
        }
        if (string.equals(m)) {
            return -this.L;
        }
        if (string.equals(o)) {
            return !this.R.isEmpty();
        }
        if (string.equals(p)) {
            return this.M == null ? null : bae.h().a(this.M, new Object[0]);
        }
        if (string.equals(q)) {
            return this.N;
        }
        if (string.equals(r)) {
            return this.Q;
        }
        if (string.equals(s)) {
            if (this.F == null) {
                return null;
            }
            if (!this.F.y()) {
                return null;
            }
            if (this.F.C().d() > 0) {
                return bae.h().a("enchantment.apply.with.charge.consumption", new Object[0]);
            }
            return bae.h().a("enchantment.apply.with.item.consumption", new Object[0]);
        }
        if (string.equals(t)) {
            return this.K >= this.L;
        }
        return null;
    }

    public void a(@NotNull btu_1 btu_12) {
        this.f();
        if (this.D == btu_12) {
            return;
        }
        if (!this.Q && btu_12.d()) {
            this.a(btu_1.e);
            return;
        }
        if (btu_12.b() == btu_1.c.b() && this.F != null && this.F.z()) {
            this.a("enchantment.error.item.must.not.have.shards.slotted");
        }
        this.b(false);
        this.E = this.D;
        this.D = btu_12;
        this.a(this.E, btu_12);
        fis_1.a().a((ajf_1)this, b, d, e);
        bua_0.a.a(new bua_1(this.D.name()));
    }

    public void a(@Nullable exk_2 exk_22) {
        if (exk_22 != null && !exk_22.T().ac() && !exk_22.B()) {
            this.a("enchantment.error.item.cant.be.enchanted");
            return;
        }
        if (exk_22 != null && exk_22.ae()) {
            this.a("enchantment.error.item.must.have.shards.slots");
            return;
        }
        if (exk_22 != null && exk_22.z() && !this.D.e()) {
            this.a("enchantment.error.item.must.not.have.shards.slotted");
        } else {
            this.f();
        }
        this.F = exk_22;
        fis_1.a().a("itemDetail", (Object)this.F, "enchantmentDialog");
        if (exk_22 != null) {
            this.J = new bia_0(exk_22);
            this.G = fhx_0.a(exk_22.a(), azu_0.j().k());
            if (this.I != null) {
                this.I.a(this.F.U().h());
            }
            if (exk_22.y()) {
                if (exk_22.z()) {
                    this.a(btu_1.e);
                } else if (exk_22.A() < 4) {
                    this.a(btu_1.b);
                } else if (exk_22.A() >= 4) {
                    this.a(btu_1.c);
                }
            }
        } else {
            this.a(btu_1.f);
            this.G = null;
        }
        this.H = null;
        fis_1.a().a((ajf_1)this, f, g, j, h, s);
    }

    public void b(@Nullable exk_2 exk_22) {
        if (this.F == null) {
            return;
        }
        if (!this.F.T().ac() && this.F.B()) {
            this.a("enchantment.error.item.cant.be.enchanted");
            return;
        }
        if (exk_22 != null && this.F.aT_() != exk_22.aT_()) {
            this.a("enchantment.error.item.must.be.same.item.ref");
            return;
        }
        if (exk_22 != null && this.F.a() == exk_22.a()) {
            this.a("enchantment.error.item.cant.be.same.item");
            return;
        }
        if (exk_22 != null && euu_2.c(azu_0.j().n().u(), exk_22.a()) == null) {
            this.a("enchantment.error.item.must.be.in.bags");
            return;
        }
        this.f();
        this.H = exk_22;
        fis_1.a().a((ajf_1)this, g, h);
    }

    public void a(btx_0 btx_02) {
        this.I = btx_02;
        fis_1.a().a((ajf_1)this, i);
    }

    public void a(btu_1 btu_12, btu_1 btu_13) {
        boolean bl;
        boolean bl2 = btu_13 == btu_1.f;
        boolean bl3 = btu_13 == btu_1.g;
        boolean bl4 = bl = btu_1.a(btu_13) >= 0;
        if (bl2 || bl3 || bl) {
            btx_0 btx_02 = new btx_0();
            dfx_0 dfx_02 = new dfx_0();
            fhv_0 fhv_02 = new fhv_0().a(true).a(fhw_0.b).a((exk_2 exk_22) -> btx_0.a.apply(dfx_02, (exk_2)exk_22));
            if (bl2 || bl3) {
                if (bl3) {
                    fhv_02.a(this.F.aT_()).a(this.F.a());
                    dfx_02.c(0);
                }
                btx_02.a(new fhx_0(fhv_02, azu_0.j().k()).a());
            } else if (bl) {
                eze_0 eze_02 = this.F.C().b(btu_1.a(btu_13));
                btx_02.a(this.F.U().h());
                btx_02.a(eze_02.c());
            }
            this.a(btx_02);
        }
        if (btu_12 == btu_1.e && !btu_13.c()) {
            this.c();
        }
    }

    public void a(bty_0 bty_02) {
        if (bty_02 == null) {
            return;
        }
        exk_2 exk_22 = bty_02.a();
        if (bty_02.b() == btz_0.a) {
            if (this.D == btu_1.f) {
                this.a(exk_22);
            }
            if (this.D == btu_1.g) {
                this.b(exk_22);
                this.a(this.E);
            }
            return;
        }
        if (bty_02.b() == btz_0.b) {
            byte by = btu_1.a(this.D);
            eze_0 eze_02 = this.F.C().b(by);
            if (by < 0) {
                throw new IllegalStateException("Shard definition picked for an unknown slot : " + eze_02);
            }
            bib_0 bib_02 = this.J.a(by);
            ezc_0 ezc_02 = eze_02.a() > 0 ? ezc_0.a : ezc_0.b;
            this.a(bib_02, new ezb_0(ezc_02, eze_02, bty_02.c()));
            this.a(this.E);
        }
    }

    public eyo_2 a(bib_0 bib_02, ezb_0 ezb_02) {
        ezc_0 ezc_02;
        int n = bib_02.e();
        if (ezb_02.a() == ezc_0.e) {
            short s2;
            if (n >= bib_02.h().d()) {
                return eyo_2.m;
            }
            int n2 = bib_02.h().c(n);
            if (n2 > (s2 = this.G.a().c())) {
                return eyo_2.q;
            }
        }
        LinkedList linkedList = this.R.computeIfAbsent(bib_02.a(), by -> new LinkedList());
        if (ezb_02.a() == ezc_0.d && n <= 1) {
            ezb_02.a(ezc_0.c);
        }
        if ((ezc_02 = ezb_02.a()) == ezc_0.c && linkedList.size() == 1 && ((ezb_0)linkedList.get(0)).a() == ezc_0.c) {
            return eyo_2.l;
        }
        Optional<ezb_0> optional = btb_1.a(linkedList, ezc_02);
        if (optional.isPresent()) {
            linkedList.removeFirstOccurrence(optional.get());
        } else {
            linkedList.addLast(ezb_02);
        }
        bib_02.a(ezb_02);
        return this.l().a();
    }

    private static Optional<ezb_0> a(List<ezb_0> list, ezc_0 ezc_02) {
        ezc_0 ezc_03 = ezc_0.a(ezc_02);
        if (ezc_03 == null) {
            return Optional.empty();
        }
        if (list.isEmpty()) {
            return Optional.empty();
        }
        ezb_0 ezb_02 = list.get(list.size() - 1);
        return Optional.ofNullable(ezb_02.a() == ezc_03 ? ezb_02 : null);
    }

    private eyn_2 l() {
        eyn_2 eyn_22 = eyl_2.a(this.G, this.m(), this.R);
        if (eyn_22.a() != eyo_2.b) {
            this.a("enchantment.shards.result." + eyn_22.a().name());
        }
        this.L = eyn_22.c();
        fis_1.a().a((ajf_1)this, l, m, o, s, t);
        return eyn_22;
    }

    public Map<Byte, List<ezb_0>> b() {
        return Collections.unmodifiableMap(this.R);
    }

    public void c() {
        this.R.clear();
        this.e();
    }

    public void e() {
        if (this.F == null) {
            return;
        }
        this.J = new bia_0(this.F);
        this.R.forEach((by, linkedList) -> linkedList.forEach(ezb_02 -> this.J.a((byte)by).a((ezb_0)ezb_02)));
        this.l();
        fis_1.a().a((ajf_1)this, j, o, l, m, t, h);
    }

    private int m() {
        if (this.O == null) {
            this.O = new fhx_0(new fhv_0().a(true).a(27083), azu_0.j().k());
        }
        this.K = this.O.b();
        fis_1.a().a((ajf_1)this, n);
        return this.K;
    }

    public void a(boolean bl) {
        this.Q = bl;
        if (!bl) {
            this.b((exk_2)null);
            if (this.D.d()) {
                this.a(btu_1.e);
            }
            if (!this.R.isEmpty()) {
                this.R.forEach((by, linkedList) -> {
                    if (linkedList.stream().noneMatch(B)) {
                        return;
                    }
                    linkedList.clear();
                });
            }
        }
        this.e();
        fis_1.a().a((ajf_1)this, r);
    }

    public void f() {
        this.a((String)null, false);
    }

    public void a(@Nullable String string) {
        this.a(string, true);
    }

    public void c(@Nullable String string) {
        this.a(string, false);
    }

    public void a(@Nullable String string, boolean bl) {
        String string2 = this.M;
        this.M = string;
        this.N = bl ? z : A;
        fis_1.a().a((ajf_1)this, p);
        fis_1.a().a((ajf_1)this, q);
        fso fso2 = this.n();
        if (fso2 == null) {
            throw new IllegalStateException("Unable to find result container for enchantment frame");
        }
        if (string2 != null && this.M == null) {
            fso2.setVisible(false);
        } else if (this.M != null) {
            fso2.setVisible(true);
            this.a(fso2, "6001057.xps", frs_0.h);
            if (!bl && this.F.y()) {
                this.a(this.F.C());
            }
        }
    }

    private void a(eZw eZw2) {
        for (byte by = 0; by < eZw2.b(); by = (byte)(by + 1)) {
            fso fso2;
            if (eZw2.c(by) || (fso2 = this.e("enchantmentShardsSlotsList#" + by)) == null) continue;
            tc_0 tc_02 = eZw2.b(by).c();
            String string = tc_02 == tc_0.e ? "6001045.xps" : "800033.xps";
            this.a(fso2, string, frs_0.e);
        }
    }

    private void a(fso fso2, String string, frs_0 frs_02) {
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile(string);
        fbx_12.setAlignment(frs_02);
        fbx_12.setFollowBorders(false);
        fbx_12.setTurnNumber(1);
        fbx_12.setTimeToLive(10);
        fbx_12.setSpeed(250.0f);
        fqj fqj2 = fso2.getAppearance();
        fqj2.add(fbx_12);
    }

    public void b(boolean bl) {
        fyy_0 fyy_02 = fpm_0.b().h().d("enchantmentDialog");
        fso fso2 = (fso)fyy_02.a(w);
        if (fso2 == null) {
            return;
        }
        if (this.P == bl) {
            return;
        }
        this.P = bl;
        fso2.setUsePositionTween(true);
        fso2.setPosition(fso2.getX(), bl ? 260 : 120, bl ? 500 : 1000, true, true, () -> {
            if (bl) {
                this.a(0);
                return;
            }
            this.a(-120);
        });
        fso2.setUsePositionTween(false);
    }

    public void a(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d("enchantmentDialog");
        if (fyy_02 == null) {
            return;
        }
        fid_1 fid_12 = (fid_1)fyy_02.a("itemSearchContainerSld");
        if (fid_12 == null) {
            return;
        }
        fid_12.setYOffset(n);
    }

    @Nullable
    private fso e(String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d("enchantmentDialog");
        return fyy_02 != null ? (fso)fyy_02.a(string) : null;
    }

    private fso n() {
        if (this.C == null) {
            this.C = this.e(v);
        }
        return this.C;
    }

    public btu_1 g() {
        return this.D;
    }

    public exk_2 h() {
        return this.F;
    }

    public exk_2 i() {
        return this.H;
    }

    public boolean j() {
        return this.P;
    }

    public btx_0 k() {
        return this.I;
    }
}

