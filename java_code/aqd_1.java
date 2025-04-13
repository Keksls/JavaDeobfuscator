/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aqd
 */
public abstract class aqd_1
implements aqs_2 {
    private apy_2 a;
    private short b = 0;

    public abstract void a(int[] var1);

    public <T extends apq_2> Iterable<T> a(int n, int n2, short s2, int n3, int n4, short s3, Iterator<T> iterator) {
        return this.a(n, n2, s2, n3, n4, s3, aej_2.h, iterator);
    }

    public <T extends apq_2> Iterable<T> a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, Iterator<T> iterator) {
        ArrayList<apq_2> arrayList = new ArrayList<apq_2>();
        while (iterator.hasNext()) {
            apq_2 apq_22 = (apq_2)iterator.next();
            if (!this.a(n, n2, s2, n3, n4, s3, aej_22, apq_22.G(), apq_22.H(), apq_22.I())) continue;
            arrayList.add(apq_22);
        }
        return arrayList;
    }

    public short a() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, int n5, int n6, short s4) {
        return this.b().a(n, n2, s2, n3, n4, s3, aej_22, n5, n6, s4);
    }

    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, int n5, int n6, short s4, byte by) {
        return this.b().a(n, n2, s2, n3, n4, s3, aej_22, n5, n6, s4, by);
    }

    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, int n5, int n6, short s4) {
        return this.a(n, n2, s2, n3, n4, s3, aej_2.h, n5, n6, s4);
    }

    protected apy_2 b() {
        if (this.a == null) {
            this.a = new apy_2(this.e(), this.c());
        }
        return this.a;
    }

    public Iterable<int[]> a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22) {
        return this.b().a(n, n2, s2, n3, n4, s3, aej_22);
    }

    public Iterable<int[]> a(int n, int n2, short s2, int n3, int n4, short s3) {
        return this.a(n, n2, s2, n3, n4, s3, aej_2.h);
    }

    protected abstract boolean c();

    public abstract aqe_1 d();

    public abstract List<int[]> e();

    public abstract String f();

    public abstract String g();

    public abstract ArrayList<aqd_1> h();

    public abstract aqs_1 i();
}

