/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkW
 */
public class bkw_1 {
    private static final Logger e = Logger.getLogger(bkw_1.class);
    public static final short a = 0;
    public static final int b = 100;
    private static final String f = "20";
    private static final String g = "21";
    private static final float h = 0.0f;
    private static final float i = 360.0f;
    private static final float j = 10.0f;
    private static final float k = 60.0f;
    private static final float l = 20.0f;
    private static final float m = 90.0f;
    public static final int c = 1;
    public static final int d = 3;
    private final acy_2<String> n = new acy_2();
    private final Table<Integer, Byte, bku_1> o = HashBasedTable.create();
    private static final bkw_1 p = new bkw_1();

    private bkw_1() {
    }

    public static bkw_1 a() {
        return p;
    }

    public void a(int n, int n2) {
        this.n.a(n, n2 + ".xps");
    }

    @Nullable
    public String a(int n) {
        return this.n.g(n);
    }

    public void a(bku_1 bku_12) {
        this.o.put((Object)bku_12.a(), (Object)bku_12.b(), (Object)bku_12);
    }

    public bkx_1 a(int n, byte by, short s2) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)n, (Object)by);
        if (bku_12 == null) {
            return null;
        }
        short s3 = bku_12.e().containsKey(s2) ? s2 : (short)0;
        return bku_12.e().get(s3).b();
    }

    public int a(int n, byte by) {
        return this.b(n, by, (short)0);
    }

    public int b(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        if (bkx_12 == null || !bkx_12.d()) {
            return -1;
        }
        return bkx_12.a();
    }

    public int b(int n, byte by) {
        return this.c(n, by, (short)0);
    }

    public int c(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        if (bkx_12 == null || !bkx_12.e()) {
            return -1;
        }
        return bkx_12.b();
    }

    public int c(int n, byte by) {
        return this.d(n, by, (short)0);
    }

    public int d(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        if (bkx_12 == null || !bkx_12.f()) {
            return -1;
        }
        return bkx_12.c();
    }

    public int e(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.g() : -1;
    }

    public int f(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.h() : -1;
    }

    public int g(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.i() : -1;
    }

    public int h(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.j() : -1;
    }

    public int i(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.k() : -1;
    }

    public int j(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null ? bkx_12.l() : -1;
    }

    public static int b() {
        return azf_2.b(Hw.a(0.0f, 360.0f), Hw.a(10.0f, 60.0f), Hw.a(20.0f, 90.0f), 1.0f).a();
    }

    public boolean k(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null && bkx_12.e();
    }

    public boolean l(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null && bkx_12.d();
    }

    public boolean d(int n, byte by) {
        return this.m(n, by, (short)0);
    }

    public boolean m(int n, byte by, short s2) {
        bkx_1 bkx_12 = this.a(n, by, s2);
        return bkx_12 != null && bkx_12.f();
    }

    public String a(int n, byte by, short s2, byte by2) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)n, (Object)by);
        if (bku_12 == null) {
            return null;
        }
        int n2 = bku_12.d() - 1;
        int n3 = Hw.a((int)by2, 0, n2);
        bkv_1 bkv_12 = bku_12.e().get(s2);
        return bkw_1.a(f, n, bkv_12.a(), n3 + 1);
    }

    public String n(int n, byte by, short s2) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)n, (Object)by);
        if (bku_12 == null) {
            return null;
        }
        short s3 = (short)(bku_12.c() - 1);
        short s4 = Hw.a(s2, (short)0, s3);
        bkv_1 bkv_12 = bku_12.e().get(s4);
        return bkw_1.a(g, n, bkv_12.a(), s4 + 100);
    }

    public int a(short s2, byte by) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)s2, (Object)by);
        if (bku_12 == null) {
            return 1;
        }
        return bku_12.c();
    }

    public int b(short s2, byte by) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)s2, (Object)by);
        if (bku_12 == null) {
            return 3;
        }
        return bku_12.d();
    }

    public short a(short s2, byte by, short s3) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)s2, (Object)by);
        if (bku_12 == null) {
            return Short.parseShort(String.valueOf(s2) + by);
        }
        bkv_1 bkv_12 = bku_12.e().get(s3);
        if (bkv_12 == null) {
            return Short.parseShort(String.valueOf(s2) + by);
        }
        return Short.parseShort(String.valueOf(s2) + bkv_12.a());
    }

    public byte b(short s2, byte by, short s3) {
        bku_1 bku_12 = (bku_1)this.o.get((Object)s2, (Object)by);
        if (bku_12 == null) {
            return by;
        }
        bkv_1 bkv_12 = bku_12.e().get(s3);
        return bkv_12.a();
    }

    private static String a(String string, int n, byte by, int n2) {
        return String.format("%s%02d%d%04d", string, n, by, n2);
    }

    public String e(int n, byte by) {
        String string = String.format("breed.skinDescription.%d%d", n, by);
        return bae.h().d(string) ? bae.h().a(string, new Object[0]) : bae.h().a("characterCreation.skin", new Object[0]);
    }

    public String f(int n, byte by) {
        String string = String.format("breed.hairDescription.%d%d", n, by);
        return bae.h().d(string) ? bae.h().a(string, new Object[0]) : bae.h().a("characterCreation.hair", new Object[0]);
    }

    public String c() {
        return bae.h().a("characterCreation.pupil", new Object[0]);
    }

    public String d() {
        return bae.h().a("characterCreation.CostumeColor1", new Object[0]);
    }

    public String e() {
        return bae.h().a("characterCreation.CostumeColor2", new Object[0]);
    }

    public String f() {
        return bae.h().a("characterCreation.CostumeColor3", new Object[0]);
    }

    public String g() {
        return bae.h().a("characterCreation.CostumeColor4", new Object[0]);
    }

    public String h() {
        return bae.h().a("characterCreation.CostumeColor5", new Object[0]);
    }

    public String i() {
        return bae.h().a("characterCreation.CostumeColor6", new Object[0]);
    }
}

