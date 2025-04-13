/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from aFo
 */
class afo_2
implements Iterator<aff_1> {
    private final afl_1 a;
    private final boolean b;
    private final int c;
    private final int d;
    private int e;

    public afo_2(afl_1 afl_12) {
        this.a = afl_12;
        this.b = afl_12.a();
        if (this.b) {
            this.e = afl_12.c().d();
            this.d = afl_12.d().d();
            this.c = afl_12.d().e();
        } else {
            this.e = afl_12.c().e();
            this.d = afl_12.d().e();
            this.c = afl_12.d().d();
        }
    }

    @Override
    public boolean hasNext() {
        return this.e <= this.d;
    }

    public aff_1 a() {
        if (this.e > this.d) {
            throw new NoSuchElementException();
        }
        if (this.b) {
            return new aff_1(this.e++, this.c);
        }
        return new aff_1(this.c, this.e++);
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

