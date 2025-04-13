/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Consumer;

/*
 * Renamed from fhF
 */
public class fhf_0<TStep extends fhh_0> {
    private final int a;
    protected final short b;
    private final short f;
    private final short g;
    private final fhj_0 h;
    protected boolean c;
    private final EnumSet<fhr_0> i = EnumSet.noneOf(fhr_0.class);
    private final acp_2<TStep> j = new acp_2();
    public static final byte d = 16;
    public static final byte e = 0;
    private boolean k;

    public fhf_0(int n, short s2, short s3, short s4, fhj_0 fhj_02, boolean bl) {
        this.a = n;
        this.b = s2;
        this.h = fhj_02;
        this.c = bl;
        this.f = s3;
        this.g = s4;
    }

    public int h() {
        return this.a;
    }

    public void a(fhr_0 fhr_02) {
        this.i.add(fhr_02);
    }

    public void a(Collection<fhr_0> collection) {
        this.i.addAll(collection);
    }

    public void b(fhr_0 fhr_02) {
        this.i.remove(fhr_02);
    }

    public void b(Collection<fhr_0> collection) {
        this.i.removeAll(collection);
    }

    public boolean c(fhr_0 fhr_02) {
        return this.i.contains(fhr_02);
    }

    public Iterator<fhr_0> i() {
        return this.i.iterator();
    }

    public short j() {
        return this.b;
    }

    public boolean k() {
        return this.c;
    }

    public void a(TStep TStep) {
        this.j.a(((fhh_0)TStep).h(), TStep);
    }

    public final TStep a(int n) {
        return (TStep)((fhh_0)this.j.c(n));
    }

    public final int l() {
        return this.j.d();
    }

    public void b(int n) {
        this.j.a(n);
    }

    public final TStep b(byte by) {
        if (this.j.d() == 0) {
            return null;
        }
        return (TStep)((fhh_0)this.j.e(by));
    }

    public final void a(Consumer<TStep> consumer) {
        this.j.forEach(consumer);
    }

    public fhj_0 m() {
        return this.h;
    }

    public short n() {
        return this.f;
    }

    public short o() {
        return this.g;
    }

    public short p() {
        return (short)(this.f - (this.g - this.f) / 2);
    }

    public short q() {
        return (short)(this.g + (this.g - this.f) / 2);
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public boolean r() {
        return this.k;
    }

    public int s() {
        int n = Integer.MAX_VALUE;
        Iterator<TStep> iterator = this.j.iterator();
        while (iterator.hasNext()) {
            n = Math.min(n, ((fhh_0)iterator.next()).f());
        }
        return n;
    }
}

