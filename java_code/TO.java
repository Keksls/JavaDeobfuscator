/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class TO<C extends ts_0, R>
extends TK<C, R> {
    private static final Logger e = Logger.getLogger(TO.class);

    public TO(tv_0<C, R> tv_02, tt_0<C> tt_02, short s2, boolean bl) {
        super(tv_02, tt_02, s2, bl);
    }

    private void f(short s2) {
        int n = 0;
        short s3 = (short)this.a.length;
        for (short s4 = s2; s4 < s3; s4 = (short)(s4 + 1)) {
            if (this.a[s4] == null) {
                n = (short)(n + 1);
                continue;
            }
            if (n <= 0) continue;
            this.a[s4 - n] = this.a[s4];
            this.b.remove(this.a[s4].a());
            this.a[s4] = null;
            this.b.put(this.a[s4 - n].a(), (short)(s4 - n));
        }
    }

    @Override
    public C b(short s2) {
        Object c2 = super.b(s2);
        if (c2 != null) {
            this.f(s2);
        }
        return c2;
    }

    @Override
    public boolean b(C c2) {
        boolean bl = super.b(c2);
        if (bl) {
            this.f((short)0);
        }
        return bl;
    }

    @Override
    public C c(long l) {
        Object c2 = super.c(l);
        if (c2 != null) {
            this.f((short)0);
        }
        return c2;
    }

    @Override
    public int a(int n) {
        int n2 = super.a(n);
        this.f((short)0);
        return n2;
    }

    @Override
    public boolean a(long l, short s2) {
        boolean bl = super.a(l, s2);
        this.f((short)0);
        return bl;
    }

    @Override
    @Deprecated
    public boolean c(C c2, short s2) {
        boolean bl = super.c(c2, s2);
        this.f((short)0);
        return bl;
    }

    @Override
    @Deprecated
    public boolean c(long l, short s2) {
        boolean bl = super.c(l, s2);
        this.f((short)0);
        return bl;
    }

    public boolean d(C c2, short s2) {
        if (c2 == null) {
            e.info((Object)"Impossible d'ajouter un item null");
            return false;
        }
        if (s2 < 0 || s2 >= this.g) {
            e.info((Object)("Impossible d'ajouter un item : position en dehors des limites : " + s2));
            return false;
        }
        if (this.d != null && this.d.a(this, c2, s2) < 0) {
            e.info((Object)"Position refus\u00e9e par le checker");
            return false;
        }
        if (this.l()) {
            throw new uz_0("Cannot add item : maximum size of inventory is reached (" + this.k() + ")");
        }
        if (this.b.containsKey(c2.a())) {
            throw new Uy("Item with uniqueID " + c2.a() + " is already present in the inventory");
        }
        if (this.a[this.a.length - 1] != null) {
            throw new ub_0("if the inventory is not full, then we should not have an object in the last position");
        }
        if (s2 >= this.b.size()) {
            s2 = (short)this.b.size();
        } else {
            for (int k = this.a.length - 1; k > s2; --k) {
                this.a[k] = this.a[k - 1];
                this.a[k - 1] = null;
                if (this.a[k] == null) continue;
                this.b.put(this.a[k].a(), (short)k);
            }
        }
        if (this.a[s2] != null) {
            throw new uc_0("Cannot add item " + c2 + " at position " + s2 + " item " + this.a[s2] + "already present");
        }
        this.a[s2] = c2;
        this.b.put(c2.a(), s2);
        this.a(um_0.a(this.i, c2, s2));
        return true;
    }
}

