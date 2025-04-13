/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cex
 */
public abstract class cex_0
extends cez_0 {
    private static final Logger c = Logger.getLogger(cex_0.class);
    private String d;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private int i;

    public String A() {
        return this.d;
    }

    public void b(String string) {
        this.d = string;
    }

    public String B() {
        return this.e;
    }

    public void c(String string) {
        this.e = string;
    }

    public String C() {
        return this.f;
    }

    public void d(String string) {
        this.f = string;
    }

    public String D() {
        return this.h;
    }

    public boolean E() {
        return this.g;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public int F() {
        return this.i;
    }

    public void a(int n) {
        this.i = n;
    }

    @Override
    public void p() {
        super.p();
        afg.a().b();
    }

    @Override
    public void q() {
        super.q();
        this.d = null;
        this.e = null;
        this.g = false;
        this.h = null;
    }

    public void G() {
        if (!this.g && this.K() != null && this.K().g().b()) {
            this.u();
        }
    }

    public void H() {
        if (this.K() != null && this.K().g().b()) {
            this.v();
        }
    }

    @Deprecated
    public void I() {
        this.w();
        c.error((Object)"La m\u00e9thode gotoWorldSelection() ne devrait plus \u00eatre utilis\u00e9e.");
    }

    public void J() {
        this.x();
    }

    protected abstract void t();

    protected abstract void u();

    protected abstract void v();

    protected abstract void w();

    protected abstract void x();

    @Override
    protected void b(@NotNull adt_1 adt_12) {
    }
}

