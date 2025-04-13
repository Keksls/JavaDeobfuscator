/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cLf
implements csm_1 {
    private static final Logger c = Logger.getLogger(cLf.class);
    protected cks_2 a;
    protected cLm b;
    private final clg_1 d;

    protected cLf(clg_1 clg_12) {
        this.d = clg_12;
    }

    protected cLf() {
        this(new clg_1(false, false));
    }

    @Override
    public final void a(cks_2 cks_22) {
        this.a = cks_22;
        cks_22.a(this.d);
    }

    protected abstract void a(int var1, int var2);

    @Override
    public final boolean b(int n, int n2) {
        this.a.d();
        if (!this.d(n, n2)) {
            return false;
        }
        this.a(n, n2);
        if (this.b != null) {
            ArrayList<fkN> arrayList = this.b.d();
            for (fkN fkN2 : arrayList) {
                if (fkN2.a() != fkO.a) continue;
                this.a.e(fkN2.c());
            }
        }
        return this.b != null && !this.b.c();
    }

    @Override
    public void c(int n, int n2) {
        if (!this.b(n, n2)) {
            this.c();
            return;
        }
        this.b.a(this.a.getWorkingHavenWorld());
        add_2.b().a(new dgb_0(this.b));
        this.b = null;
        this.b();
    }

    protected void b() {
    }

    private boolean d(int n, int n2) {
        afe_1 afe_12 = this.a.getPatchCoordFromMouse(n, n2);
        return this.a.getWorkingHavenWorld().a(afe_12.a(), afe_12.b());
    }

    @Override
    public void c() {
        if (this.b != null) {
            this.b.e(this.a);
            this.a.a(this.d);
            this.b = null;
        }
    }

    @Override
    public abstract fks_0 a();
}

