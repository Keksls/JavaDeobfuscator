/*
 * Decompiled with CFR 0.152.
 */
public class Xr
extends adt_1 {
    private final Runnable a;

    public static void a(Runnable runnable) {
        add_2.b().a(new Xr(runnable));
    }

    public Xr(Runnable runnable) {
        this.a = runnable;
        this.a(Xq.a);
    }

    public Runnable b() {
        return this.a;
    }

    @Override
    public int a() {
        return 398;
    }
}

