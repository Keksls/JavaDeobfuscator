/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fy
 */
public class fy_0 {
    private float[] a;
    private float[] b;
    private float[] c;
    private Fz[] d;

    public float[] a() {
        return this.a;
    }

    public void a(float ... fArray) {
        this.a = (float[])fArray.clone();
    }

    public float[] b() {
        return this.b;
    }

    public void b(float ... fArray) {
        this.b = (float[])fArray.clone();
    }

    public float[] c() {
        return this.c;
    }

    public void c(float ... fArray) {
        this.c = (float[])fArray.clone();
    }

    public Fz[] d() {
        return this.d;
    }

    public void a(Fz ... fzArray) {
        this.d = (Fz[])fzArray.clone();
    }

    public void e() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}

