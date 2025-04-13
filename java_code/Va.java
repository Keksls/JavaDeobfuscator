/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class Va<TQuotaType extends RI>
extends UZ<TQuotaType> {
    private static final Logger e = Logger.getLogger(Va.class);
    private final int f;
    private final int g;

    protected Va(int n, int n2, int n3) {
        this(n, n2, n3, 0);
    }

    protected Va(int n, int n2, int n3, int n4) {
        super(n, n4);
        this.f = n2;
        this.g = n3;
    }

    @Override
    public void a(TQuotaType TQuotaType) {
        super.a(TQuotaType);
        if (this.d > this.g) {
            this.c(TQuotaType);
        }
    }

    @Override
    public void b(TQuotaType TQuotaType) {
        super.b(TQuotaType);
        if (this.d < this.f) {
            this.d(TQuotaType);
        }
    }

    public boolean d() {
        return this.d < this.g;
    }

    public boolean e() {
        return this.d > this.f;
    }

    protected abstract void c(TQuotaType var1);

    protected abstract void d(TQuotaType var1);

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }
}

