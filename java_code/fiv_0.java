/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from fiV
 */
public class fiv_0
implements ewb_2 {
    private static final Logger a = Logger.getLogger(fiv_0.class);
    private final int b;
    private final TK<exk_2, vf_2> c;

    fiv_0(int n, byte by) {
        this.b = n;
        this.c = new TK<exk_2, vf_2>(fix_0.a, fiw_0.o, by, true);
        this.c.a(Ui.j);
    }

    fiv_0(int n, TK<exk_2, vf_2> tK) {
        this.b = n;
        this.c = tK;
    }

    @Override
    public boolean b(exk_2 exk_22) {
        return this.c.h(exk_22);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        try {
            return this.b(exk_22) && this.c.a(exk_22);
        }
        catch (ua_0 ua_02) {
            a.error((Object)"[STORAGE_BOX] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)ua_02);
            return false;
        }
    }

    @Override
    public boolean a(exk_2 exk_22, byte by) {
        return this.c.b(exk_22, (short)by);
    }

    @Override
    public boolean b(exk_2 exk_22, byte by) {
        try {
            return this.a(exk_22, by) && this.c.a(exk_22, (short)by);
        }
        catch (ua_0 ua_02) {
            a.error((Object)"[STORAGE_BOX] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)ua_02);
            return false;
        }
    }

    @Override
    public boolean c(exk_2 exk_22) {
        return this.c.i(exk_22);
    }

    @Override
    public boolean d(exk_2 exk_22) {
        return this.c(exk_22) && this.c.b(exk_22);
    }

    @Override
    public boolean a(long l, short s2) {
        return this.c.b(l, s2);
    }

    @Override
    public boolean b(long l, short s2) {
        return this.a(l, s2) && this.c.a(l, -s2);
    }

    @Override
    public boolean e() {
        return false;
    }

    public int a() {
        return this.b;
    }

    public List<exk_2> b() {
        return this.c.a(Objects::nonNull);
    }

    @Override
    public exk_2 a(long l) {
        return this.c.e(l);
    }

    @Override
    public exk_2 c(byte by) {
        return this.c.e(by);
    }

    public int c() {
        return this.c.b();
    }

    public short d() {
        return this.c.k();
    }

    @Override
    public byte b(long l) {
        return (byte)this.c.b(l);
    }

    public Iterator<exk_2> f() {
        return this.c.a(false);
    }

    public Iterator<exk_2> g() {
        return this.c.a(true);
    }

    public void a(Uo uo) {
        this.c.a(uo);
    }

    public void b(Uo uo) {
        this.c.b(uo);
    }

    public void a(zj_1 zj_12) {
        zj_12.a = this.b;
        for (exk_2 exk_22 : this.c) {
            zk_1 zk_12 = new zk_1();
            zk_12.a = this.c.b(exk_22.a());
            exk_22.a(zk_12.b);
            zj_12.b.add(zk_12);
        }
    }

    public void b(zj_1 zj_12) {
        this.c.aO_();
        fix_0 fix_02 = (fix_0)this.c.f();
        int n = zj_12.b.size();
        for (int k = 0; k < n; ++k) {
            zk_1 zk_12 = zj_12.b.get(k);
            exk_2 exk_22 = fix_02.a(zk_12.b);
            try {
                this.c.a(exk_22, zk_12.a);
                continue;
            }
            catch (ua_0 ua_02) {
                a.error((Object)"[STORAGE_BOX] Probl\u00e8me de r\u00e9cup\u00e9ration d'un item de compartiment", (Throwable)ua_02);
            }
        }
    }

    public String toString() {
        return "StorageBoxCompartment{m_inventory=" + this.c + "}";
    }
}

