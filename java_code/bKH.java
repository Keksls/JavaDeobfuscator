/*
 * Decompiled with CFR 0.152.
 */
public abstract class bKH
implements ajh_1 {
    private static final String a = "filterDisplayedText";
    private final Runnable b;

    protected bKH(Runnable runnable) {
        this.b = runnable;
    }

    public abstract bKG aV_();

    public abstract void a(faC var1);

    protected abstract void b(faC var1);

    public abstract boolean a();

    public abstract String b();

    public void f() {
        this.b.run();
    }

    public void c(faC faC2) {
        this.b(faC2);
        this.b.run();
    }

    public int aW_() {
        return 0;
    }

    @Override
    public Object b(String string) {
        if (a.equals(string)) {
            return this.b();
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[]{a};
    }

    public String toString() {
        return this.aV_() + "-filter=" + this.b();
    }
}

