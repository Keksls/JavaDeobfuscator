/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from TR
 */
public abstract class tr_0<C extends ts_0>
implements Iterable<C> {
    private static final Logger a = Logger.getLogger(tr_0.class);
    public static final short f = -1;
    protected short g;
    protected final boolean h;
    protected Ui i;
    private boolean b;
    protected final List<Uo> j = new ArrayList<Uo>(1);

    protected tr_0(boolean bl, short s2) {
        this.h = bl;
        this.g = Hw.b((short)-1, s2);
    }

    public boolean h() {
        return this.h;
    }

    public void a(Uo uo) {
        if (uo == null) {
            return;
        }
        if (!this.j.contains(uo)) {
            this.j.add(uo);
        }
    }

    public void b(Uo uo) {
        if (uo == null) {
            return;
        }
        this.j.remove(uo);
    }

    public void i() {
        this.j.clear();
    }

    protected void a(Uk uk) {
        Uo[] uoArray;
        for (Uo uo : uoArray = this.j.toArray(new Uo[this.j.size()])) {
            try {
                uo.a(uk);
            }
            catch (Exception exception) {
                a.error((Object)("Exception lors de la notification de l'event " + uk + " \u00e0 l'observer " + uo), (Throwable)exception);
            }
        }
    }

    public void j() {
        this.aO_();
        this.i();
    }

    public boolean a(short s2) {
        if (this.g > 0 && s2 < this.b()) {
            a.error((Object)("Can't change the size of the inventory to " + s2 + " : current size is " + this.b()));
            return false;
        }
        this.g = Hw.b((short)-1, s2);
        return true;
    }

    public short k() {
        return this.g;
    }

    public boolean l() {
        return this.g != -1 && this.b() >= this.g;
    }

    public boolean m() {
        return this.b() == 0;
    }

    public boolean n() {
        return this.b;
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    public abstract boolean a(C var1);

    public abstract boolean a(long var1, short var3);

    public abstract short a(long var1);

    public abstract boolean b(C var1);

    public abstract boolean c(C var1);

    @Nullable
    public abstract C c(long var1);

    public abstract int a(int var1);

    public abstract int a(int var1, int var2);

    public abstract boolean e(C var1);

    public abstract boolean d(long var1);

    public abstract boolean b(int var1);

    @Nullable
    public abstract C e(long var1);

    @Nullable
    public abstract C c(int var1);

    public abstract C a(int var1, tw_0<C> var2);

    public abstract ArrayList<C> d(int var1);

    public abstract ArrayList<C> b(int var1, tw_0<C> var2);

    public abstract ArrayList<C> b(tw_0<C> var1);

    public Ui o() {
        return this.i;
    }

    public tr_0<C> a(Ui ui) {
        this.i = ui;
        return this;
    }

    public abstract int b();

    public abstract int c();

    public abstract int aO_();

    @Override
    @NotNull
    public abstract Iterator<C> iterator();

    public abstract tt_0<C> e();

    public abstract void a(tt_0<C> var1);
}

