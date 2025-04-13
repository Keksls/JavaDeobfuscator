/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eRU
 */
public final class eru_1
implements ewb_2 {
    private static final Logger a = Logger.getLogger(eru_1.class);
    private final erw_1 b;
    private final TK<exk_2, vf_2> c;
    private int d;
    private boolean e;
    private long f;

    public eru_1(erw_1 erw_12) {
        this.b = erw_12;
        this.c = new TK<exk_2, vf_2>(ert_1.a, ers_1.o, erw_12.N, true);
        this.c.a(Ui.e);
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
            a.error((Object)"[GUILD_STORAGE] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)ua_02);
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
            a.error((Object)"[GUILD_STORAGE] Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)ua_02);
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
        return true;
    }

    @Override
    public exk_2 a(long l) {
        return this.c.e(l);
    }

    @Override
    public exk_2 c(byte by) {
        return this.c.e(by);
    }

    public int a() {
        return this.c.b();
    }

    public short b() {
        return this.c.k();
    }

    @Override
    public byte b(long l) {
        return (byte)this.c.b(l);
    }

    public Iterator<exk_2> c() {
        return this.c.a(false);
    }

    public Iterator<exk_2> d() {
        return this.c.a(true);
    }

    public void a(Uo uo) {
        this.c.a(uo);
    }

    public void b(Uo uo) {
        this.c.b(uo);
    }

    public boolean f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public ki h() {
        kk kk2 = ki.l();
        kk2.c(this.d);
        kk2.a(this.e);
        Iterator<exk_2> iterator = this.c();
        while (iterator.hasNext()) {
            exk_2 exk_22 = iterator.next();
            kT kT2 = kR.h().a(this.b(exk_22.a())).a(eyl_1.b(exk_22));
            kk2.a(kT2);
        }
        if (this.f >= 0L) {
            kk2.a(this.f);
        } else {
            kk2.u();
        }
        return kk2.m();
    }

    public void a(ki ki2) {
        this.d = ki2.c();
        this.e = ki2.e();
        this.c.j();
        ki2.f().forEach(kR2 -> {
            try {
                this.c.a(eyl_1.a(kR2), (short)kR2.f());
            }
            catch (ua_0 ua_02) {
                a.error((Object)("[GUILD_STORAGE] Error unserializing an item from compartment " + ki2.c()), (Throwable)ua_02);
            }
        });
        this.f = ki2.i() ? ki2.j() : -1L;
    }

    public erw_1 i() {
        return this.b;
    }

    public String toString() {
        return "GuildStorageCompartment{m_inventory=" + this.c + "}";
    }
}

