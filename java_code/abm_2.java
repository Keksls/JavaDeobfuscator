/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from aBM
 */
class abm_2
implements Iterator<Long> {
    private final abl_2 a;
    private int b;
    private final int c;

    protected abm_2(abl_2 abl_22) {
        this.a = abl_22;
        this.b = 0;
        this.c = abl_22.a();
    }

    @Override
    public boolean hasNext() {
        return this.b < this.c;
    }

    public Long a() {
        return this.a.a(this.b++);
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

