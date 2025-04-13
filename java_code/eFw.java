/*
 * Decompiled with CFR 0.152.
 */
public class eFw
extends aqr_2 {
    public eFw(aqq_2 ... aqq_2Array) {
        super(aqq_2Array);
    }

    @Override
    public final boolean a(int n) {
        if (n > 0) {
            return n % 2 == 0 && this.c(n / 2);
        }
        return this.c(n);
    }
}

