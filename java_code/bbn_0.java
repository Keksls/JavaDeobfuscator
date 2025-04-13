/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbn
 */
public class bbn_0
extends aku_1 {
    private final Runnable e;

    public bbn_0(Runnable runnable) {
        super(0, 0, 0);
        this.e = runnable;
    }

    @Override
    public void a() {
        this.e.run();
        this.j();
    }

    @Override
    protected void l() {
    }
}

