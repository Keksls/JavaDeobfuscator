/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from flc
 */
public class flc_0
implements flb_0 {
    private static final Logger a = Logger.getLogger(flc_0.class);
    private long b;
    private short c = 1;
    private final boolean d;

    public flc_0(boolean bl) {
        this.d = bl;
    }

    @Override
    public long ce() {
        return this.b;
    }

    @Override
    public short dr() {
        return this.c;
    }

    public void a() {
        this.b = 0L;
        this.c = 1;
    }

    @Override
    public oj_0 du() {
        return Oz.c;
    }

    @Override
    public float dv() {
        return this.du().a(this.c, this.b);
    }

    public float b() {
        return this.du().a(this.c, this.b);
    }

    private flk_0 a(short s2, long l) {
        long l2 = l - this.ce();
        short s3 = (short)(s2 - this.dr());
        this.c = s2;
        this.b = l;
        return new flk_0(l2, s3);
    }

    private flk_0 a(long l) {
        short s2 = this.du().a(l);
        return this.a(s2, l);
    }

    @Override
    public flk_0 i(long l) {
        if (!this.du().b(l)) {
            a.error((Object)("Valeur d'exp\u00e9rience non valide : " + l));
            return flk_0.a.get();
        }
        if (l > this.c()) {
            a.error((Object)"On essaye d'ajouter plus d'xp que ce que le cap permet", (Throwable)new Exception());
            l = this.c();
        }
        if (this.ce() == l) {
            return flk_0.a.get();
        }
        return this.a(l);
    }

    @Override
    public flk_0 j(long l) {
        long l2 = this.b(l);
        if (l2 <= 0L) {
            return flk_0.a.get();
        }
        return this.i(this.ce() + l2);
    }

    private long b(long l) {
        return Math.max(0L, Math.min(l, this.c() - this.ce()));
    }

    public long c() {
        int n = enp_2.a.b(ens_2.v);
        return this.d && n < this.du().a() ? this.du().a(n) : this.du().d();
    }

    public short d() {
        short s2 = (short)enp_2.a.b(ens_2.v);
        return this.d && s2 < this.du().a() ? s2 : Oz.c.a();
    }

    @Override
    public flk_0 a(short s2) {
        if (!this.du().a(s2)) {
            a.error((Object)("Valeur de niveau non valide : " + s2));
            return flk_0.a.get();
        }
        if (s2 > this.d()) {
            a.error((Object)("Valeur de niveau non valide : sup\u00e9rieure au cap ! : " + s2), (Throwable)new Exception());
            s2 = this.d();
        }
        if (this.dr() == s2) {
            return flk_0.a.get();
        }
        long l = this.du().a((int)s2);
        return this.a(s2, l);
    }
}

