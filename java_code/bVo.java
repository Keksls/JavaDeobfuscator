/*
 * Decompiled with CFR 0.152.
 */
public class bVo
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "ownerName";
    public static final String e = "localPlayerHasRightToNominate";
    public static final String f = "localPlayerHasRightToRevoke";
    public static final String g = "iconUrl";
    public static final String h = "isSelf";
    private fcu_0 k;
    private String l;
    static final String[] i = new String[]{"name", "ownerName"};
    static final String[] j = new String[]{"localPlayerHasRightToNominate", "localPlayerHasRightToRevoke", "iconUrl", "description"};
    private static final String[] m = new String[j.length + i.length];

    public bVo(fcu_0 fcu_02) {
        this.k = fcu_02;
    }

    public fcu_0 a() {
        return this.k;
    }

    public long b() {
        return this.k.a();
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.c();
        }
        if (string.equals(f)) {
            fcs_0 fcs_02 = bUW.a().x().D();
            fcq_0 fcq_02 = fcs_02.b(azu_0.j().k().a_());
            if (fcq_02 == null) {
                return false;
            }
            return fcv_0.b(fcq_02.b(), this.k);
        }
        if (string.equals(e)) {
            fcs_0 fcs_03 = bUW.a().x().D();
            fcq_0 fcq_03 = fcs_03.b(azu_0.j().k().a_());
            if (fcq_03 == null) {
                return false;
            }
            return fcv_0.a(fcq_03.b(), this.k);
        }
        if (string.equals(g)) {
            return azs_0.a().a("governmentRankIconPath", "defaultIconPath", this.k.g());
        }
        if (string.equals(b)) {
            return bae.h().a(40, (long)((short)this.k.a()), new Object[0]);
        }
        if (string.equals(d)) {
            return this.l;
        }
        if (string.equals(h)) {
            return azu_0.j().k().dp().equals(this.l);
        }
        return null;
    }

    public String c() {
        return bae.h().a(57, (long)((int)this.k.a()), new Object[0]);
    }

    public void a(String string) {
        this.l = string;
        fis_1.a().a((ajf_1)this, d);
    }

    @Override
    public String[] d() {
        return m;
    }

    static {
        System.arraycopy(j, 0, m, 0, j.length);
        System.arraycopy(i, 0, m, j.length, i.length);
    }
}

