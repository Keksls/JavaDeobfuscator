/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from byE
 */
public class bye_1
implements ajh_1 {
    public static final String a = "isCreation";
    public static final String b = "isBlazonChange";
    public static final String d = "isNameChange";
    public static final String e = "canChangeBlazon";
    public static final String f = "canChangeName";
    public static final String g = "selectedCategory";
    public static final String h = "emblemIcons";
    public static final String i = "backgroundIcons";
    public static final String j = "emblemCategories";
    public static final String k = "selectedBackground";
    public static final String l = "selectedEmblem";
    public static final String m = "displayEmblem";
    public static final String n = "displayBackground";
    public static final String o = "guildBannerTexture";
    public static final String p = "guildName";
    public static final String q = "title";
    public static final String r = "iconType";
    public static final String s = "previousBlazon";
    public static final String t = "mustRename";
    public static final int u = 0;
    public static final int v = 1;
    public static final String[] w = new String[]{"isCreation", "isBlazonChange", "isNameChange", "canChangeBlazon", "canChangeName", "selectedCategory", "emblemIcons", "backgroundIcons", "emblemCategories", "selectedBackground", "selectedEmblem", "displayEmblem", "displayBackground", "guildBannerTexture", "guildName", "title", "iconType", "previousBlazon", "mustRename"};
    private byi_1 x;
    private final ImmutableList<byh_1> y = bye_1.k();
    private byh_1 z = (byh_1)this.y.get(0);
    private bxo_1 A;
    private bxo_1 B;
    private int C;
    private String D;
    private boolean E;

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.x == byi_1.a;
        }
        if (b.equals(string)) {
            return this.x == byi_1.b;
        }
        if (d.equals(string)) {
            return this.x == byi_1.c;
        }
        if (e.equals(string)) {
            return this.x == byi_1.a || this.x == byi_1.b;
        }
        if (f.equals(string)) {
            return this.x == byi_1.a || this.x == byi_1.c;
        }
        if (g.equals(string)) {
            return this.z;
        }
        if (h.equals(string)) {
            return this.i();
        }
        if (i.equals(string)) {
            return this.j();
        }
        if (j.equals(string)) {
            return this.y;
        }
        if (l.equals(string)) {
            return this.A.b();
        }
        if (k.equals(string)) {
            return this.A.a();
        }
        if (m.equals(string)) {
            return this.C == 0;
        }
        if (n.equals(string)) {
            return this.C != 0;
        }
        if (o.equals(string)) {
            if (this.A == null) {
                return null;
            }
            return bxp_1.a().a(this.A);
        }
        if (p.equals(string)) {
            return this.D;
        }
        if (q.equals(string)) {
            switch (this.x) {
                case a: {
                    return bae.h().a("guild.creation", new Object[0]);
                }
                case b: {
                    return bae.h().a("guild.change.blazon.title", new Object[0]);
                }
                case c: {
                    return bae.h().a("guild.change.name.title", new Object[0]);
                }
            }
        }
        if (r.equals(string)) {
            return this.C;
        }
        if (s.equals(string)) {
            if (this.B == null) {
                return null;
            }
            return bxp_1.a().a(this.B);
        }
        if (t.equals(string)) {
            String string2 = azu_0.j().k().fb();
            this.E = era_1.e.matcher(string2).find();
            return this.E;
        }
        return null;
    }

    @Override
    public String[] d() {
        return w;
    }

    public void a() {
        if (this.B == null) {
            return;
        }
        this.A.a(this.B.a());
        this.A.b(this.B.b());
        this.A.a(this.B.c());
        this.A.b(this.B.d());
        this.z = this.c(this.B.b());
        fis_1.a().a((ajf_1)this, k, l, m, n, o);
    }

    private List<byd_1> i() {
        if (this.z == null) {
            return null;
        }
        ArrayList<byd_1> arrayList = new ArrayList<byd_1>();
        for (Integer n : this.z.b()) {
            arrayList.add(new byd_1(n));
        }
        return arrayList;
    }

    private List<byd_1> j() {
        ArrayList<byd_1> arrayList = new ArrayList<byd_1>();
        for (int k = 0; k < 46; ++k) {
            arrayList.add(new byd_1(k));
        }
        return arrayList;
    }

    private byh_1 c(short s2) {
        for (byh_1 byh_12 : this.y) {
            if (!byh_12.a().b(s2)) continue;
            return byh_12;
        }
        return (byh_1)this.y.get(0);
    }

    private static ImmutableList<byh_1> k() {
        ArrayList<byh_1> arrayList = new ArrayList<byh_1>();
        for (byg_1 byg_12 : byg_1.values()) {
            arrayList.add(new byh_1(byg_12));
        }
        return ImmutableList.copyOf(arrayList);
    }

    public void a(byh_1 byh_12) {
        this.z = byh_12;
        fis_1.a().a((ajf_1)this, h, j);
    }

    public void a(byi_1 byi_12) {
        this.x = byi_12;
    }

    public void a(short s2) {
        this.A.a(s2);
        fis_1.a().a((ajf_1)this, k, o);
    }

    public void b(short s2) {
        this.A.b(s2);
        fis_1.a().a((ajf_1)this, l, o);
    }

    public void a(azj_2 azj_22) {
        this.A.a(azj_22);
        fis_1.a().a((ajf_1)this, o);
    }

    public void b(azj_2 azj_22) {
        this.A.b(azj_22);
        fis_1.a().a((ajf_1)this, o);
    }

    public void a(int n) {
        this.C = n;
        fis_1.a().a((ajf_1)this, m, n);
    }

    public void a(bxo_1 bxo_12) {
        this.A = bxo_12;
        this.z = this.c(bxo_12.b());
        fis_1.a().a((ajf_1)this, o);
    }

    public void a(String string) {
        this.D = string;
    }

    public void b(bxo_1 bxo_12) {
        this.B = bxo_12;
        fis_1.a().a((ajf_1)this, s);
    }

    public void b() {
        this.A = null;
    }

    public String c() {
        return this.D;
    }

    public int e() {
        return this.C;
    }

    public eqd_2 f() {
        return this.A.h();
    }

    public byi_1 g() {
        return this.x;
    }

    public bxo_1 h() {
        return this.A;
    }
}

