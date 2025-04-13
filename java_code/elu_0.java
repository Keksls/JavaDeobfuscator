/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from eLU
 */
public class elu_0
implements Iterator<Su> {
    private final Iterator<Su> b;
    private boolean c = false;
    private Su d;
    private boolean e;
    final /* synthetic */ els_0 a;

    public elu_0(els_0 els_02) {
        this.a = els_02;
        this.b = els_02.u();
    }

    private boolean a(Su su) {
        long l = su.a_();
        Object f2 = this.a.w.a(enw_2.a(l), enw_2.a(enw_2.c(), enw_2.e()));
        if (f2 != null) {
            return true;
        }
        if (this.a.A != null && this.a.A.c(l)) {
            return true;
        }
        return this.a.j(l);
    }

    private boolean b() {
        this.c = this.c();
        return this.c;
    }

    private boolean c() {
        if (!this.b.hasNext()) {
            return false;
        }
        Su su = this.b.next();
        if (this.a(su)) {
            this.d = su;
            return true;
        }
        return this.c();
    }

    private Su d() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
        return this.d;
    }

    @Override
    public boolean hasNext() {
        if (this.e) {
            return this.c;
        }
        this.e = true;
        return this.b();
    }

    public Su a() {
        if (!this.e) {
            this.b();
        }
        this.e = false;
        return this.d();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

