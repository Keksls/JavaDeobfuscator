/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afL
 */
public class afl_0
extends afX {
    String a;
    int b = UL.b.b();

    public void a(String string) {
        this.a = string;
    }

    public void a(int n) {
        this.b = n;
    }

    @Override
    public int a(afj_0 afj_02) {
        return this.b;
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        afj_02.e(this.a);
    }

    @Override
    public afm_0 a() {
        return afm_0.g;
    }
}

