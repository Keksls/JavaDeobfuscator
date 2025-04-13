/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTG
 */
public class btg_2
implements ajh_1 {
    public static final String a = "guildName";
    public static final String b = "guildBlazon";
    public static final String d = "guildId";
    public static final String e = "isOpen";
    private static final String g = "isGuildOnly";
    private static final String h = "canOpen";
    private static final String i = "canEnter";
    public static final String[] f = new String[]{"guildName", "guildBlazon", "guildId", "isOpen", "isGuildOnly", "canOpen", "canEnter"};
    private static final int j = 5;
    private final String k;
    private final long l;
    private final long m;
    private final boolean n;
    private final boolean o;

    public btg_2(String string, long l, long l2, boolean bl, boolean bl2) {
        this.k = string;
        this.l = l;
        this.m = l2;
        this.n = bl;
        this.o = bl2;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.k != null && !this.k.isEmpty() ? this.k : bae.h().a("noOwner", new Object[0]);
        }
        if (string.equals(d)) {
            return this.l;
        }
        if (b.equals(string)) {
            if (this.m < 1L) {
                return String.format(azs_0.a().a("guildBlazonBackgroundPartPath", ""), 5);
            }
            return bxp_1.a().a(new bxo_1(new eqd_2(this.m)));
        }
        if (e.equals(string)) {
            return this.n;
        }
        if (g.equals(string)) {
            return this.o;
        }
        if (h.equals(string)) {
            if (this.n) {
                return false;
            }
            return this.b() || btg_2.c();
        }
        if (i.equals(string)) {
            if (!this.n) {
                return false;
            }
            return !this.o || this.b() || btg_2.c();
        }
        return null;
    }

    private boolean b() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        return this.l == bmr_12.fc();
    }

    public long a() {
        return this.l;
    }

    private static boolean c() {
        return emp_0.b(azu_0.j().n().v(), emq_0.bt);
    }
}

