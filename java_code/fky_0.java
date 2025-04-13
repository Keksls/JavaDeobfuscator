/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fkY
 */
public class fky_0 {
    protected static final Logger a = Logger.getLogger(fky_0.class);
    private short b;
    private long c;
    private final oj_0 d;

    public fky_0(oj_0 oj_02) {
        this.d = oj_02;
    }

    public oj_0 a() {
        return this.d;
    }

    public long b() {
        return this.c;
    }

    public short c() {
        return this.b;
    }

    public String d() {
        return String.valueOf(this.a().c(this.c)) + "/" + this.a().b(this.b);
    }

    public float e() {
        return this.a().a(this.b, this.c);
    }

    public flk_0 a(short s2, long l) {
        if (!this.a().a(s2) || !this.a().b(l)) {
            return flk_0.a.get();
        }
        return this.b(s2, l);
    }

    public flk_0 a(short s2, boolean bl) {
        if (!this.a().a(s2)) {
            throw new IllegalArgumentException("Valeur de niveau non valide : " + s2);
        }
        if (this.b == s2) {
            return flk_0.a.get();
        }
        return this.b(s2, bl ? this.a().a((int)s2) : this.c);
    }

    public flk_0 a(long l, boolean bl) {
        if (!this.a().b(l)) {
            throw new IllegalArgumentException("Valeur d'exp\u00e9rience non valide : " + l);
        }
        if (this.c == l) {
            return flk_0.a.get();
        }
        return this.b(bl ? this.a().a(l) : this.b, l);
    }

    public flk_0 a(long l) {
        if (l < 0L) {
            a.error((Object)("Impossible d'ajouter une exp\u00e9rience n\u00e9gative (" + l + "). Il faut plut\u00f4t utiliser Levelable.removeXp"));
            return flk_0.a.get();
        }
        if (l == 0L) {
            return flk_0.a.get();
        }
        long l2 = Math.min(this.c + l, this.a().d());
        if (l2 == this.c) {
            return flk_0.a.get();
        }
        short s2 = this.a().a(l2);
        return this.b(s2, l2);
    }

    private flk_0 b(short s2, long l) {
        short s3 = (short)(s2 - this.b);
        long l2 = l - this.c;
        this.b = s2;
        this.c = l;
        return new flk_0(l2, s3);
    }

    public void f() {
        this.c = 0L;
        this.b = 0;
    }
}

