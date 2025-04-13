/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from agX
 */
public abstract class agx_0<P extends XW<P>, T extends ahh_0>
extends XV<P>
implements afk_0<T> {
    protected final List<aha_0<T, P>> e = new ArrayList<aha_0<T, P>>();

    protected agx_0() {
    }

    protected abstract T e();

    public final boolean a(aha_0<T, P> aha_02) {
        return this.e.contains(aha_02);
    }

    public final void b(aha_0<T, P> aha_02) {
        this.e.add(aha_02);
    }

    public final void c(aha_0<T, P> aha_02) {
        this.e.remove(aha_02);
    }

    public final void f() {
        this.e.clear();
    }

    public void a(T t, P p2, P p3) {
        for (int k = 0; k < this.e.size(); ++k) {
            this.e.get(k).a(t, p2, p3);
        }
    }
}

