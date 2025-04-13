/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bro
 */
public final class bro_0
implements ajh_1 {
    public static final String a = "nationId";
    public static final String b = "guildId";
    public static final String d = "chiefId";
    public static final String e = "level";
    public static final String f = "levelProgress";
    public static final String g = "chiefView";
    public static final String h = "nation";
    public static final String i = "nationName";
    public static final String j = "guildName";
    public static final String k = "guildBlazon";
    public static final String l = "chiefName";
    public static final String m = "levelDesc";
    public static final String n = "ratioXp";
    public static final String o = "rankDesc";
    public static final String p = "rankNumber";
    public static final String q = "isActivated";
    public static final String[] r = new String[]{"nationId", "guildId", "chiefId", "level", "levelProgress", "rankNumber", "rankDesc", "chiefView", "levelDesc", "ratioXp", "guildBlazon", "guildName", "nationName"};
    private final ebe_0 s;

    public bro_0(ebe_0 ebe_02) {
        this.s = ebe_02;
    }

    @Override
    public String[] d() {
        return r;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.s.b();
        }
        if (b.equals(string)) {
            return this.s.c();
        }
        if (d.equals(string)) {
            return this.s.a();
        }
        if (q.equals(string)) {
            return this.s.k();
        }
        if (e.equals(string)) {
            return this.s.j();
        }
        if (f.equals(string)) {
            ebh_0 ebh_02 = ebj_0.a(this.s.j());
            short s2 = ebh_02.e();
            short s3 = (short)(ebh_02.d() - 1);
            return Float.valueOf((float)(this.s.j() - s3) / (float)(s2 - s3));
        }
        if (h.equals(string)) {
            int n = this.s.b();
            return azs_0.a().a("nationFlagIconsPath", "defaultIconPath", n != 0 ? n : -1);
        }
        if (i.equals(string)) {
            String string2 = bae.h().a(39, (long)this.s.b(), new Object[0]);
            return bae.h().a("company.shortDesc.nationName", string2);
        }
        if (j.equals(string)) {
            long l = this.s.c();
            String string3 = l == 0L ? bae.h().a("company.shortDesc.noGuild", new Object[0]) : this.s.i();
            return bae.h().a("company.shortDesc.guildName", string3);
        }
        if (k.equals(string)) {
            bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.s.a());
            if (bmr_12 == null || !bmr_12.eZ()) {
                return null;
            }
            long l = bmr_12.fa();
            eqd_2 eqd_22 = l != 0L ? new eqd_2(l) : new eqd_2(bmr_12.eV().b());
            if (eqd_22 == null) {
                return null;
            }
            bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
            ays_2 ays_22 = bxp_1.a().a(bxo_12);
            bxo_12.e();
            return ays_22;
        }
        if (l.equals(string)) {
            Object t = euw_2.a.d(this.s.a());
            if (t != null) {
                return bae.h().a("company.shortDesc.chiefName", ((epq_2)t).dp());
            }
            return bae.h().a("company.shortDesc.chiefName", bae.h().a("company.shortDesc.noChief", new Object[0]));
        }
        if (n.equals(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            ebh_0 ebh_03 = ebj_0.a(this.s.j());
            short s4 = ebh_03.e();
            if (ebi_0.a.b().c() != ebh_03.c()) {
                s4 = (short)(s4 + 1);
            }
            short s5 = (short)(ebh_03.d() - 1);
            stringBuilder.append(bae.h().a("xpRatio", bae.h().a((long)(this.s.j() - s5)), bae.h().a((long)(s4 - s5))));
            return stringBuilder.toString();
        }
        if (m.equals(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            short s6 = ebj_0.a(this.s.j()).e();
            if (ebj_0.a(this.s.j()).c() != ebi_0.a.b().c()) {
                s6 = (short)(s6 + 1);
            }
            stringBuilder.append(bae.h().a("company.shortDesc.level", bae.h().a((long)this.s.j()), bae.h().a((long)s6)));
            return stringBuilder.toString();
        }
        if (o.equals(string)) {
            ebh_0 ebh_04 = ebj_0.a(this.s.j());
            if (ebh_04 == null) {
                return bae.h().a("company.shortDesc.noRank", new Object[0]);
            }
            String string4 = bae.h().a(148, (long)ebh_04.a(), new Object[0]);
            return bae.h().a("company.shortDesc.rank", string4);
        }
        if (p.equals(string)) {
            ebh_0 ebh_05 = ebj_0.a(this.s.j());
            if (ebh_05 == null) {
                return 0;
            }
            return ebh_05.c() + 1;
        }
        if (g.equals(string)) {
            return brd_0.k.b(this.s.a());
        }
        return null;
    }
}

