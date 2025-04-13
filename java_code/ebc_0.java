/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBc
 */
public abstract class ebc_0
extends eAZ<ebb_0, ebd_0> {
    protected final TO<exk_2, vf_2> e;

    protected ebc_0(euw_1 euw_12) {
        super(new ebb_0(euw_12));
        this.e = new TO<exk_2, vf_2>(eBe.a, (tt_0)((Object)this.b), euw_12.a(), true);
        this.e.a(Ui.b);
    }

    @Override
    public void a(exk_2 exk_22) {
        if (this.c != null) {
            ((ebd_0)this.c).a(exk_22);
        }
    }

    public boolean b(exk_2 exk_22) {
        try {
            if (!this.d(exk_22)) {
                return false;
            }
            this.e.a(exk_22);
        }
        catch (ua_0 ua_02) {
            a.error((Object)"Impossible d'ajouter un item \u00e0 l'inventaire alors qu'on \u00e0 pourtant test\u00e9 le canAdd", (Throwable)ua_02);
            return false;
        }
        this.a(exk_22);
        return true;
    }

    public boolean a(exk_2 exk_22, byte by) {
        return false;
    }

    public boolean a(long l, short s2) {
        if (!this.b(l, s2)) {
            return false;
        }
        this.e.a(l, -s2);
        return true;
    }

    public boolean c(exk_2 exk_22) {
        if (!this.e(exk_22)) {
            return false;
        }
        this.e.b(exk_22);
        return true;
    }

    @Nullable
    public exk_2 e(long l) {
        return (exk_2)this.e.e(l);
    }

    @Nullable
    public exk_2 a(byte by) {
        return (exk_2)this.e.e(by);
    }

    public byte f(long l) {
        return (byte)this.e.b(l);
    }

    @Override
    public boolean e() {
        return this.e.l();
    }

    @Override
    public void a() {
        super.a();
        this.e.j();
    }

    public boolean d(exk_2 exk_22) {
        return ((ebb_0)this.b).a((tr_0)this.e, exk_22) >= 0;
    }

    public boolean b(long l, short s2) {
        return ((ebb_0)this.b).a((tr_0<exk_2>)this.e, l, s2) >= 0;
    }

    public boolean e(exk_2 exk_22) {
        return ((ebb_0)this.b).b((tr_0)this.e, exk_22) >= 0;
    }

    public boolean b(exk_2 exk_22, byte by) {
        return ((ebb_0)this.b).a((tr_0)this.e, exk_22, (short)by) >= 0;
    }
}

