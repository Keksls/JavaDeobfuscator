/*
 * Decompiled with CFR 0.152.
 */
public interface bHp {
    public boolean a();

    public void a(boolean var1);

    default public void s() {
        if (this.a()) {
            return;
        }
        this.a(true);
    }

    default public void t() {
        if (!this.a()) {
            return;
        }
        this.a(false);
    }

    default public void ak_() {
        if (this.a()) {
            this.t();
        } else {
            this.s();
        }
    }
}

