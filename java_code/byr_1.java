/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from byR
 */
public class byr_1
implements ajh_1,
byl_1,
Comparable<byr_1> {
    public static final String a = "name";
    public static final String b = "iconUrl";
    private static final String g = "level";
    private static final String h = "isFollowed";
    private static final String i = "isLeader";
    private static final String j = "stateStyle";
    public static final String d = "hpDescription";
    public static final String e = "hpPercentage";
    private static final String k = "positionIconUrl";
    private static final String l = "owner";
    private static final String m = "isHeroLeader";
    private static final String n = "heroPosition";
    private static final String o = "borderColor";
    private final String[] p = new String[]{"name", "iconUrl", "level", "isFollowed", "isLeader", "stateStyle", "hpDescription", "hpPercentage", "positionIconUrl", "owner", "isHeroLeader", "heroPosition", "borderColor"};
    final epl_0 q;
    private final rv_0 r = new bys_1(this);
    private boolean s;
    final /* synthetic */ byp_1 f;

    byr_1(byp_1 byp_12, epl_0 epl_02) {
        this.f = byp_12;
        this.q = epl_02;
    }

    @Override
    public String[] d() {
        return this.p;
    }

    private String o() {
        int n;
        float f2;
        float f3;
        aff_1 aff_12 = this.f.o.q.g();
        aff_1 aff_13 = this.q.g();
        int n2 = aff_13.d() - aff_12.d();
        int n3 = aff_13.e() - aff_12.e();
        if (n2 == 0 && n3 == 0) {
            return null;
        }
        float f4 = ans_0.D().c().c(n2, n3);
        int n4 = Math.round(f4 / (f3 = afq_2.b(f4, f2 = ans_0.D().c().d(n2, n3))) * Hw.n);
        aej_2 aej_22 = aej_2.a(n4, n = Math.round(f2 / f3 * Hw.n));
        if (aej_22 == null) {
            return null;
        }
        switch (aej_22) {
            case a: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 1);
            }
            case b: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 0);
            }
            case c: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 7);
            }
            case d: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 6);
            }
            case e: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 5);
            }
            case f: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 4);
            }
            case g: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 3);
            }
            case h: {
                return azs_0.a().a("compassIconsPath", "defaultIconPath", 2);
            }
        }
        return null;
    }

    public void a() {
        byj_1.a().b(this.f());
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public void a(ays_2 ays_22, String string) {
        if (ays_22 == null) {
            byp_1.a.warn((Object)string);
            return;
        }
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.s();
        }
        if (string.equals(b)) {
            try {
                return this.q.v() ? String.format(azs_0.a().a("companionIconsPath"), this.q.c()) : String.format(azs_0.a().a("breedPortraitIllustrationPath"), this.q.c() + String.valueOf(this.q.z()));
            }
            catch (gm_0 gm_02) {
                byp_1.a.error((Object)"PropertyException during getFieldValue for ICON_URL", (Throwable)gm_02);
                return null;
            }
        }
        if (string.equals(g)) {
            if (this.q.v()) {
                return bae.h().a("partyList.MemberFormatedName", (short)Math.min(this.q(), this.q.k()));
            }
            short s2 = this.q.l();
            short s3 = this.q.k();
            if (!this.q.m() || this.q.l() == 0) {
                return bae.h().a("partyList.MemberFormatedName", s3);
            }
            return bae.h().a("partyList.MemberDownscaledFormatedName", s2, s3);
        }
        if (string.equals(h)) {
            return this.j();
        }
        if (string.equals(k)) {
            return this.o();
        }
        if (string.equals(d)) {
            ani_2 ani_22 = new ani_2();
            ani_22.a((CharSequence)bae.h().a("HPShort", new Object[0])).a((CharSequence)" : ");
            ani_22.d(this.q.p()).a((CharSequence)"/").d(this.t());
            return ani_22.r();
        }
        if (string.equals(e)) {
            return Float.valueOf((float)this.q.p() / (float)this.q.q());
        }
        if (string.equals(j)) {
            return this.u();
        }
        if (string.equals(i)) {
            return this.c();
        }
        if (string.equals(n)) {
            if (byp_1.r == -1L || !this.f.b(this)) {
                return null;
            }
            long l = this.q.f();
            int n = l == byp_1.r ? 1 : (l == byp_1.s ? 2 : 0);
            aZF aZF2 = (aZF)aZH.a().b("switchHero" + n);
            return aZF2.b("key");
        }
        if (string.equals(o)) {
            if (this.s) {
                azf_2 azf_22 = new azf_2(anr_0.v);
                azf_22.b(0.8f);
                return azf_22;
            }
            if (this.q.o() == azu_0.j().n().u() && this.p()) {
                return anr_0.v;
            }
            return azf_2.e;
        }
        if (string.equals(m)) {
            return this.p();
        }
        if (string.equals(l)) {
            if (!this.q.v() && !this.q.w()) {
                return null;
            }
            byr_1 byr_12 = this.r();
            if (byr_12 == null) {
                return this.q.o();
            }
            if (this.q.v()) {
                return bae.h().a("companionOwnedBy", byr_12.s());
            }
            return bae.h().a("heroOwnedBy", byr_12.s());
        }
        return null;
    }

    private boolean p() {
        return !this.q.w() && !this.q.v();
    }

    private int q() {
        long l = this.q.o();
        short s2 = Short.MIN_VALUE;
        TLongObjectIterator tLongObjectIterator = this.f.l.iterator();
        while (tLongObjectIterator.hasNext()) {
            short s3;
            tLongObjectIterator.advance();
            byr_1 byr_12 = (byr_1)tLongObjectIterator.value();
            if (byr_12.q.v() || byr_12.g() != l || (s3 = byr_12.b()) <= s2) continue;
            s2 = s3;
        }
        return s2;
    }

    private byr_1 r() {
        long l = this.q.o();
        byr_1 byr_12 = null;
        TLongObjectIterator tLongObjectIterator = this.f.l.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            byr_12 = (byr_1)tLongObjectIterator.value();
            if (byr_12.q.v() || byr_12.q.w() || byr_12.g() != l) continue;
            break;
        }
        return byr_12;
    }

    private String s() {
        if (this.q == null) {
            return "";
        }
        String string = this.q.a();
        if (string == null) {
            return "";
        }
        return string;
    }

    public short b() {
        return this.q.k();
    }

    private int t() {
        return this.q.q() + this.q.q() * this.q.d() / 100;
    }

    public boolean c() {
        return this.f.n == this;
    }

    private String u() {
        if (this.q.r()) {
            return "partyStateDead";
        }
        if (this.q.s()) {
            return "partyStateInFight";
        }
        return "";
    }

    public void e() {
        fis_1.a().a((ajf_1)this, j);
    }

    public long f() {
        return this.q.f();
    }

    public long g() {
        return this.q.o();
    }

    public long h() {
        return this.q.h();
    }

    public String toString() {
        return this.s();
    }

    public epl_0 i() {
        return this.q;
    }

    public boolean j() {
        return this.q.n();
    }

    public int a(@NotNull byr_1 byr_12) {
        if (this.f.n == null) {
            return -1;
        }
        if (this.f() == this.f.n.f()) {
            return -1;
        }
        if (byr_12.f() == this.f.n.f()) {
            return 1;
        }
        long l = this.q.o();
        long l2 = byr_12.g();
        long l3 = this.f.n.g();
        boolean bl = byr_12.q.v();
        boolean bl2 = this.q.v();
        boolean bl3 = byr_12.q.w();
        boolean bl4 = this.q.w();
        if (l == l2) {
            if (!bl4 && !bl2) {
                return -1;
            }
            if (!bl3 && !bl) {
                return 1;
            }
            if (bl4 && bl) {
                return -1;
            }
            if (bl3 && bl2) {
                return 1;
            }
            return this.q.f() > byr_12.f() ? -1 : 1;
        }
        if (l == l3) {
            return -1;
        }
        if (l2 == l3) {
            return 1;
        }
        return l > l2 ? 1 : -1;
    }

    public int k() {
        if (byp_1.q == this.f()) {
            return 2;
        }
        if (byp_1.r == this.f()) {
            return 1;
        }
        if (byp_1.s == this.f()) {
            return 0;
        }
        return -1;
    }

    public void l() {
        if (this.q == null) {
            return;
        }
        blx_1 blx_12 = bzf_1.a(this.q.f());
        if (blx_12 != null) {
            epa_1 epa_12 = blx_12.a_(eps_0.b);
            epa_12.a(this.r);
            this.r.a(epa_12);
        }
        byj_1.a().a(this.q.f(), this);
        byj_1.a().b(this.q.f());
    }

    public void m() {
        blx_1 blx_12 = bzf_1.a(this.q.f());
        if (blx_12 != null) {
            blx_12.a_(eps_0.b).b(this.r);
        }
        byj_1.a().b(this.q.f(), this);
    }

    public void a(boolean bl) {
        this.s = bl;
        fis_1.a().a((ajf_1)this, o);
    }

    public void n() {
        fis_1.a().a((ajf_1)this, g);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((byr_1)object);
    }
}

