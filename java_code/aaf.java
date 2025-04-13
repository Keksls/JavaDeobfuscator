/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aaf
extends ZT<aap_0> {
    protected static final Logger f = Logger.getLogger(aaf.class);
    protected ZY g;
    private float h = 1.0f;

    public aaf(aap_0 aap_02) {
        super(aap_02);
        ((aap_0)this.d).a(this.a);
    }

    public float d() {
        return this.h;
    }

    public final void a(float f2) {
        this.h *= f2;
    }

    public void b(float f2) {
        this.h = f2;
    }

    public void e() {
        if (!this.f()) {
            return;
        }
        for (int k = 0; k < this.b.length; ++k) {
            this.b[k].a(this.c[k]);
        }
    }

    @Override
    public final void c(int n) {
    }

    public final void a(ZY zY) {
        this.g = zY;
    }

    public boolean f() {
        return this.g == null || this.g.f() == 1.0f;
    }
}

