/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbi
 */
public abstract class fbi_0
implements gr_0 {
    protected static final Logger a = Logger.getLogger(fbi_0.class);
    private final fbk c;
    protected int b;

    protected fbi_0(fbk fbk2) {
        this.c = fbk2;
    }

    public fbk a() {
        return this.c;
    }

    public void a(int n) {
        this.b = n;
    }

    public int d() {
        return this.b;
    }

    protected final faX e() {
        return fbc_0.a.a(this.b);
    }

    public abstract void f();

    public abstract boolean a(faU var1);
}

