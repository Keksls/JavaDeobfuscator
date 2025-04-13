/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLm
 */
public class alm_2 {
    private final akx_2 a;
    private final String b;
    private final akr_2[] c;
    private boolean d;

    public alm_2(akx_2 akx_22, String string, akr_2[] akr_2Array, boolean bl) {
        this.a = akx_22;
        this.b = string;
        this.c = akr_2Array;
        this.d = bl;
    }

    public boolean a() {
        return this.d;
    }

    public int b() {
        return this.a.d();
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public boolean a(alk_2 alk_22) {
        this.a.a(this.b, this.c, alk_22.b());
        return false;
    }
}

