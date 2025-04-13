/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJJ
 */
public class fjj_1
implements Iterator<fyb_0> {
    private final fyy_0 a;
    private Iterator<fyb_0> b;
    private fyb_0 c;
    private boolean d;
    private int e;

    public fjj_1(fyy_0 fyy_02) {
        this.a = fyy_02;
        if (this.a == null) {
            throw new IllegalArgumentException("Impossible d'initialiser avec une map nulle");
        }
        this.b = this.a.iterator();
        this.e = -1;
        this.c = this.b();
    }

    @Nullable
    private fyb_0 b() {
        this.d = true;
        if (this.b.hasNext()) {
            return this.b.next();
        }
        this.b = this.c();
        if (this.b == null) {
            return null;
        }
        return this.b.next();
    }

    @Nullable
    private Iterator<fyb_0> c() {
        ++this.e;
        ArrayList<fyy_0> arrayList = this.a.d();
        if (arrayList == null || arrayList.size() >= this.e) {
            return null;
        }
        fyy_0 fyy_02 = arrayList.get(this.e);
        fjj_1 fjj_12 = new fjj_1(fyy_02);
        return fjj_12.hasNext() ? fjj_12 : this.c();
    }

    @Override
    public boolean hasNext() {
        if (!this.d) {
            this.c = this.b();
        }
        return this.c != null;
    }

    public fyb_0 a() {
        if (this.c == null) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return this.c;
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

