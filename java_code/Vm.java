/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class Vm<Rated extends Vk> {
    protected static final Logger a = Logger.getLogger(Vm.class);
    private Rated[] b;
    private final int[] c = new int[2];
    private Vn d;
    private boolean e;
    private boolean f;
    private Rated g;

    public Vm(Rated[] RatedArray) {
        if (RatedArray.length == 2) {
            this.b = RatedArray;
            this.c[0] = RatedArray[0].b();
            this.c[1] = RatedArray[1].b();
        }
        this.e = false;
        this.g = null;
        this.f = false;
        this.d = null;
    }

    public Rated[] a() {
        return this.b;
    }

    public int[] b() {
        return this.c;
    }

    public void a(long l, Rated Rated) {
        if (Rated != this.b[0] && Rated != this.b[1]) {
            a.error((Object)("Impossible de mettre \u00e0 jour le gagnant : rated " + Rated + " n'est pas inclus ni dans " + this.b[0].a() + " ni dans " + this.b[1].a() + "."));
        } else {
            this.g = Rated;
            this.f = false;
            this.b(l);
        }
    }

    public void a(long l) {
        a.warn((Object)("Combat d'id " + l + " mis en mode d'\u00e9galit\u00e9."));
        this.f = true;
        this.b(l);
    }

    private void b(long l) {
        if (!this.e) {
            this.e = true;
            if (this.d == null) {
                a.error((Object)("Combat d'id " + l + " sans handler : Mise \u00e0 jour du ladder impossible."));
            } else {
                this.d.a(l, this);
            }
        }
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public Rated e() {
        return this.g;
    }

    public boolean a(Rated Rated) {
        return this.b[0] == Rated || this.b[1] == Rated;
    }

    public Rated b(Rated Rated) {
        if (this.b[0] == Rated) {
            return this.b[1];
        }
        if (this.b[1] == Rated) {
            return this.b[0];
        }
        return null;
    }

    public void a(Vn vn) {
        this.d = vn;
    }
}

