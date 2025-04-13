/*
 * Decompiled with CFR 0.152.
 */
public class amM
implements auxx_2 {
    private final String b;
    private final akx_2 c;
    private final akr_2[] d;
    static final /* synthetic */ boolean a;

    public amM(String string, akx_2 akx_22, akr_2[] akr_2Array) {
        if (!a && akx_22 == null) {
            throw new AssertionError((Object)"FadeInListener avec un script null");
        }
        if (!a && string == null) {
            throw new AssertionError((Object)"FadeInListener avec une fonction nulle");
        }
        this.b = string;
        this.d = akr_2Array;
        this.c = akx_22;
    }

    @Override
    public void c() {
        this.c.a(this.b, this.d, new akq_1[0]);
        auy_2.a().b(this);
    }

    @Override
    public void d() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    static {
        a = !amL.class.desiredAssertionStatus();
    }
}

