/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIB
 */
public class fib_1
extends fiq_2 {
    private static final Logger e = Logger.getLogger(fib_1.class);
    private final fiz_2 f;
    private fvE g;
    private final String h;
    private String i;

    public fib_1(fiz_2 fiz_22, fvE fvE2, String string) {
        this.f = fiz_22;
        this.g = fvE2;
        this.h = string;
    }

    public fib_1(fiz_2 fiz_22, String string, String string2) {
        this.f = fiz_22;
        this.i = string;
        this.h = string2;
    }

    public fiq_2 getConstraint() {
        if (this.g == null) {
            fya_0 fya_02 = fpm_0.b().h();
            if (fya_02 == null) {
                fya_02 = fpm_0.b().h();
            }
            this.g = (fvE)fya_02.b(this.i);
            if (this.g == null) {
                e.warn((Object)("Impossible de trouver le widget " + this.i));
            }
        }
        if (this.f.getConstraint(this.g) == null) {
            return null;
        }
        return this.f.getConstraint(this.g).getConstraint(this.h);
    }

    @Override
    public int getValue() {
        fiq_2 fiq_22 = this.getConstraint();
        return fiq_22 != null ? fiq_22.getValue() : 0;
    }

    @Override
    public void setValue(int n) {
        this.getConstraint().setValue(n);
    }
}

