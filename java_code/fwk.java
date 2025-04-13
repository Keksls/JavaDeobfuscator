/*
 * Decompiled with CFR 0.152.
 */
public abstract class fwk<T, U>
extends fwn<T, U> {
    protected fsq_0 a;

    @Override
    protected void b() {
        if (this.a == null || this.a.getUnfilteredContent() == null) {
            return;
        }
        this.a.setContent(this.a.getUnfilteredContent(), true);
    }

    public void a(fsq_0 fsq_02) {
        this.a = fsq_02;
    }
}

