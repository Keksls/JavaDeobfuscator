/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fxp
 */
public abstract class fxp_0<T extends Entity> {
    private static final Logger a = Logger.getLogger(fxp_0.class);
    private T b;

    public final T f() {
        return this.b;
    }

    public final void g() {
        this.b = this.e();
        ((Entity)this.b).p = this;
        this.c();
    }

    protected abstract void c();

    protected abstract T e();

    public void d() {
        ((abp_1)this.b).u();
        this.b = null;
    }

    public void a(ays_2 ays_22) {
    }

    public abstract void a(fxe_0 var1);
}

