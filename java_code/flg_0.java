/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from flg
 */
class flg_0
implements Iterator<fld_0> {
    private final long[] b;
    private int c;
    final /* synthetic */ flf_0 a;

    flg_0(flf_0 flf_02) {
        this.a = flf_02;
        this.b = this.a.b.keys();
        this.c = 0;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.length;
    }

    public fld_0 a() {
        fld_0 fld_02;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if ((fld_02 = (fld_0)this.a.b.get(this.b[this.c++])) == null) {
            throw new ConcurrentModificationException();
        }
        return fld_02;
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

