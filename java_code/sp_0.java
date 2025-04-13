/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from Sp
 */
public abstract class sp_0<FX extends Sl>
implements So<FX>,
Sv,
apk_1<Su> {
    private Sq b;
    protected final Su a;
    private Si<FX> c;
    private final List<Su> d = new ArrayList<Su>(1);
    private long e = -1L;

    public sp_0(Su su) {
        this.a = su;
        this.d.add(su);
    }

    @Override
    public Sv f() {
        return this;
    }

    @Override
    public apk_1<Su> c() {
        return this;
    }

    @Override
    public Si<FX> a() {
        return this.c;
    }

    public void a(Si<FX> si) {
        this.c = si;
    }

    public void a(Sq sq) {
        this.b = sq;
    }

    @Override
    public Sq b() {
        return this.b;
    }

    @Override
    public va_0 d() {
        return null;
    }

    @Override
    public ss_0 g() {
        return null;
    }

    @Override
    public Su f_(long l) {
        if (l == this.a.a_()) {
            return this.a;
        }
        return null;
    }

    @Override
    public long a(byte by) {
        return this.e++;
    }

    @Override
    public Iterator<Su> k() {
        return this.d.iterator();
    }

    @Override
    public List<Su> a(aff_1 aff_12) {
        return this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    public List<Su> a(int n, int n2, int n3) {
        ArrayList<Su> arrayList = new ArrayList<Su>();
        Iterator<Su> iterator = this.k();
        while (iterator.hasNext()) {
            Su su = iterator.next();
            if (aob_2.a(su, n, n2) != 0) continue;
            arrayList.add(su);
        }
        return arrayList;
    }

    public byte l() {
        return 0;
    }
}

