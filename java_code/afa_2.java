/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aFA
 */
public class afa_2
implements afg_1 {
    private afr_2 a;
    private afr_2 b;
    private long c;
    private long d;
    private final ArrayList<afg_1> e = new ArrayList();

    public afa_2(long l) {
        this.c = l;
        this.d = l;
    }

    public void a(afg_1 afg_12) {
        if (this.a == null) {
            this.a = afg_12.a();
        }
        this.b = afg_12.b();
        afg_12.c(this.d);
        this.d += afg_12.c() - afg_12.d();
        this.e.add(afg_12);
    }

    @Override
    public afr_2 a(long l) {
        if (l >= this.d) {
            return this.b();
        }
        for (afg_1 afg_12 : this.e) {
            if (l < afg_12.d() || l >= afg_12.c()) continue;
            return afg_12.a(l);
        }
        return this.a;
    }

    @Override
    public afr_2 a() {
        return this.a;
    }

    @Override
    public afr_2 b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.d;
    }

    @Override
    public long d() {
        return this.c;
    }

    @Override
    public boolean b_(long l) {
        if (l >= this.d) {
            return false;
        }
        for (afg_1 afg_12 : this.e) {
            if (l < afg_12.d() || l >= afg_12.c()) continue;
            return afg_12.b_(l);
        }
        return false;
    }

    @Override
    public afr_2 a(long l, aej_2 aej_22, apl_1 apl_12) {
        return afd_2.a(this, l, aej_22, apl_12);
    }

    @Override
    public void c(long l) {
        this.c += l;
        this.d += l;
    }
}

