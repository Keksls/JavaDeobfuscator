/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aue
 */
public class aue_1 {
    private ayf_2 a = null;
    private int b;
    private int c;
    private int d;

    public aue_1(String string, int n, int n2) {
        this(ayq_1.a(string, n, n2));
    }

    public aue_1() {
        this("COPRGTL", 4, 11);
    }

    public aue_1(ayn_2 ayn_22) {
        this.a = ayi_2.a(ayn_22);
        this.a.a(0.8f, 0.8f, 0.8f, 1.0f);
    }

    public void a(aui_2 aui_22, int n, int n2) {
        this.a.h();
        this.b = this.a.e();
        this.a.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.c = n - aui_22.h() / 2;
        this.d = (int)(1.5f * (float)aui_22.i()) - n2 - this.b;
    }

    public void a(String string) {
        this.a.a(string.toCharArray(), (float)this.c, (float)this.d);
        this.d -= this.b;
    }

    public void a(String string, int n, int n2) {
        this.a.a(string.toCharArray(), (float)(this.c + n), (float)(this.d - n2));
    }

    public void a() {
        this.a.g();
    }
}

