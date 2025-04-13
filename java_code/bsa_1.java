/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bsA
 */
public class bsa_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "guildPerms";
    public static final String d = "anonymousPerms";
    public static final String e = "individualPerms";
    public static final String f = "iconUrl";
    private static final String[] g = new String[]{"name", "guildPerms", "anonymousPerms", "individualPerms", "iconUrl"};
    final int h;
    private int i;
    final ffn j;
    private final ArrayList<bsb_1> k = new ArrayList();

    public bsa_1(int n, ffn ffn2) {
        this.h = n;
        Object r2 = eyo_1.g().d(this.h);
        if (r2 != null) {
            this.i = ((ezr_0)r2).C();
        }
        this.j = ffn2;
        this.c();
    }

    public boolean a(ffp ffp2) {
        ffl ffl2 = this.j.a(ffp2);
        return ffl2 != null && ffl2.a(ffk.a(this.h));
    }

    public int a() {
        return this.h;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(b)) {
            return this.a(ffp.b);
        }
        if (string.equals(d)) {
            return this.a(ffp.a);
        }
        if (string.equals(e)) {
            return this.k;
        }
        if (string.equals(f)) {
            return azs_0.a().a("itemsIconsPath", "defaultIconPath", this.i);
        }
        return null;
    }

    public String b() {
        return bae.h().a(String.format("%s.%s", "roomType", this.h), new Object[0]);
    }

    public void c() {
        this.k.clear();
        abq_2<ffm> abq_22 = this.j.a();
        int n = abq_22.size();
        for (int k = 0; k < n; ++k) {
            this.k.add(new bsb_1(this, (ffm)abq_22.get(k)));
        }
        fis_1.a().a((ajf_1)this, e);
    }

    public void e() {
        for (int k = this.k.size() - 1; k >= 0; --k) {
            this.k.get(k).a();
        }
    }

    public String toString() {
        return "RoomView{m_typeId=" + this.h + ", m_gfxId=" + this.i + ", m_dimensionalBagPermissions=" + this.j + ", m_individualPermissionsView=" + this.k + "}";
    }
}

