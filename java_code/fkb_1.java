/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKb
 */
public abstract class fkb_1<T extends fyb_0> {
    protected final T a;

    public fkb_1(T t) {
        this.a = t;
        this.d();
    }

    public void a() {
        fyy_0 fyy_02 = ((fyb_0)this.a).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        String string = fyy_02.c();
        String string2 = ((fyb_0)this.a).getId();
        if (string == null) {
            return;
        }
        this.a(string, string2);
    }

    public void b() {
        fyy_0 fyy_02 = ((fyb_0)this.a).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        String string = fyy_02.c();
        String string2 = ((fyb_0)this.a).getId();
        if (string == null) {
            return;
        }
        this.b(string, string2);
    }

    protected abstract void a(String var1, String var2);

    protected abstract void b(String var1, String var2);

    public abstract void c();

    public abstract void d();

    public abstract boolean e();
}

