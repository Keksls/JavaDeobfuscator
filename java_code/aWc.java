/*
 * Decompiled with CFR 0.152.
 */
public class aWc
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    private final byte f;
    private final int g;
    private final int h;
    private final short i;

    public aWc(byte by, int n) {
        this(by, n, 1);
    }

    public aWc(byte by, int n, int n2) {
        this(by, n, n2, 0);
    }

    public aWc(byte by, int n, int n2, short s2) {
        this.f = by;
        this.g = n;
        this.h = n2;
        this.i = s2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        if (this.f == 0) {
            aWc.d();
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a(this.e());
        pt.a(this.g);
        pt.a(this.h);
        pt.b(this.i);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void d() {
        aWc.a("&lt;ID&gt; : create a monster of given ID near the character");
        aWc.a("&lt;ID&gt; &lt;Count&gt; : same with the given count");
        aWc.a("&lt;ID&gt; &lt;Count&gt; &lt;Level&gt; : same with the given level (must be a valid level for this monster)");
        aWc.a("-t id : add given templateId");
        aWc.a("-t id x : same with X templates");
        aWc.a("-ut id : add usergroup with template ID");
        aWc.a("-ut id x : same with X usergroups");
        aWc.a("-ugi id : init usergroup ID in current instance");
        aWc.a("-ugi cn : DEPRECATED init Black Crow on Kelba");
    }

    private short e() {
        switch (this.f) {
            case 1: {
                return 93;
            }
            case 3: {
                return 255;
            }
            case 2: {
                return 365;
            }
            case 4: {
                return 64;
            }
        }
        String string = "Type de groupe " + this.f + " inconnu";
        aVo.a().d(string);
        throw new UnsupportedOperationException(string);
    }

    public int c() {
        return this.g;
    }
}

