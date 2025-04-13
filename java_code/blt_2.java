/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blt
 */
public class blt_2 {
    private static final Logger a = Logger.getLogger(blt_2.class);
    private static final ArrayList<abo_2<String, String>> b = new ArrayList();
    private final int c;
    private final ArrayList<bla_2> d = new ArrayList();
    private final HashMap<String, Byte> e = new HashMap();
    private final ArrayList<blg_2> f = new ArrayList();
    private ArrayList<blg_2> g = null;
    private final short h;
    private short i = 0;
    private short j = (short)-1;
    private int k;
    private final wu_0 l;
    private final blr_2 m;
    private final blh_2 n;
    private final boolean o;
    private byte p = 0;
    private final apc_2 q;
    private final apc_2 r;
    private final boolean s;
    private final ArrayList<abo_2<String, String>> t;

    public blt_2(int n, byte by, byte by2, short s2, boolean bl, wu_0 wu_02, short s3, short s4, String string, String string2, boolean bl2, String string3) {
        this.c = n;
        this.m = blr_2.a(by);
        this.n = blh_2.a(by2);
        this.h = s2;
        this.o = bl;
        this.l = wu_02;
        this.i = s3;
        this.j = s3;
        this.s = bl2;
        this.q = this.b(string);
        this.r = this.b(string2);
        this.t = string3 == null ? b : ezq_2.a(string3);
    }

    private apc_2 b(String string) {
        apc_2 apc_22 = null;
        if (string != null && string.length() != 0) {
            try {
                apc_22 = eyS.c(string);
            }
            catch (Exception exception) {
                a.warn((Object)("Impossible de charger le criterion " + string + " pour le challenge " + this.c));
            }
        }
        return apc_22;
    }

    public byte a(String string) {
        Byte by = this.e.get(string);
        if (by != null) {
            return by;
        }
        return 0;
    }

    public boolean a() {
        return this.s;
    }

    public String b() {
        return "";
    }

    public void a(byte by, String string) {
        this.e.put(string, by);
    }

    public void a(bla_2 bla_22) {
        this.d.add(bla_22);
    }

    public String c() {
        return bae.h().a(26, (long)this.c, new Object[0]);
    }

    public String d() {
        return bae.h().a(28, (long)this.c, new Object[0]);
    }

    public String e() {
        return bae.h().a(24, (long)this.c, new Object[0]);
    }

    public String f() {
        return bae.h().a(29, (long)this.c, new Object[0]);
    }

    public int g() {
        return this.c;
    }

    public blr_2 h() {
        return this.m;
    }

    public blh_2 i() {
        return this.n;
    }

    public short j() {
        return this.h;
    }

    public void a(int n, int n2, int n3, short s2, int n4, int n5, String string, byte by) {
        this.f.add(new blg_2(n, n2, n3, s2, n4, n5, string, true, by));
        Collections.sort(this.f);
    }

    public void b(int n, int n2, int n3, short s2, int n4, int n5, String string, byte by) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(new blg_2(n, n2, n3, s2, n4, n5, string, false, by));
    }

    public ArrayList<blg_2> k() {
        return this.f;
    }

    public ArrayList<blg_2> l() {
        return this.g;
    }

    public void a(byte by) {
        this.p = by;
    }

    public byte m() {
        return this.p;
    }

    @Nullable
    public wu_0 n() {
        return this.l;
    }

    public short o() {
        return this.i;
    }

    public short p() {
        return this.j;
    }

    public boolean q() {
        return this.o;
    }

    public ArrayList<bla_2> r() {
        return this.d;
    }

    public bla_2 a(int n) {
        int n2 = this.d.size();
        for (int k = 0; k < n2; ++k) {
            bla_2 bla_22 = this.d.get(k);
            if (bla_22.d() != n) continue;
            return bla_22;
        }
        return null;
    }

    public apc_2 s() {
        return this.q;
    }

    public apc_2 t() {
        return this.r;
    }

    public ArrayList<abo_2<String, String>> u() {
        return this.t;
    }

    public String v() {
        try {
            return String.format(azs_0.a().a("challengeCategoryIconsPath"), this.m.a());
        }
        catch (gm_0 gm_02) {
            a.error((Object)"PropertyException during getIconUrl", (Throwable)gm_02);
            return null;
        }
    }
}

