/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ahm
extends aby_0 {
    private static final Logger Z = Logger.getLogger(ahm.class);
    public static final String Y = "AnimStatique";
    private final aho aa;
    private String ab = "AnimStatique";
    private String ac;

    private ahm(long l, float f2, float f3, float f4, byte by, ahn ahn2) {
        super(l, f2, f3, f4);
        this.a(aej_2.a(by));
        this.aa = ahn2.a();
    }

    public void b() {
        this.aa.a(this);
    }

    public void c() {
        this.aa.b(this);
    }

    public static ahm a(aet_0 aet_02, aeu_0 aeu_02) {
        ahn ahn2 = ahp.a().a(aeu_02.g);
        int n = aet_02.a(aeu_02.a);
        int n2 = aet_02.b(aeu_02.b);
        ahm ahm2 = ahm.a(aeu_02.e, aeu_02.f, n, n2, aeu_02.c, aeu_02.i, aeu_02.j, aeu_02.h, ahn2, aeu_02.k);
        ahm2.m(aeu_02.l);
        return ahm2;
    }

    public static ahm a(long l, int n, float f2, float f3, float f4, boolean bl, byte by, byte by2, ahn ahn2, String string) {
        ahm ahm2 = new ahm(l, f2, f3, f4, by2, ahn2);
        String string2 = String.format(ahp.a().b(), n);
        ahm2.a(string2);
        ahm2.a(string2, true);
        ahm2.g(ahi_0.i.a());
        ahm2.n(string);
        ahm2.h(bl);
        ahm2.a(by);
        return ahm2;
    }

    private void n(String string) {
        this.ab = Cz.f(string) ? Y : string;
    }

    public String d() {
        return this.ab;
    }

    public String e() {
        return this.ac;
    }

    public void m(String string) {
        this.ac = string;
    }

    public aho f() {
        return this.aa;
    }
}

