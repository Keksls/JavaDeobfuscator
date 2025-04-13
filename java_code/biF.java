/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class biF
implements afy_0 {
    protected static final Logger a = Logger.getLogger(biF.class);
    protected static final boolean b = false;
    protected final blx_1 c;
    protected final int d;
    protected final int e;
    protected final int f;

    public biF(blx_1 blx_12, int n, int n2, int n3) {
        this.c = blx_12;
        this.d = n;
        this.e = n2;
        this.f = n3;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        aff_1 aff_12 = this.c.gg();
        int n3 = this.e - aff_12.d();
        int n4 = this.f - aff_12.e();
        if (n3 != 0 || n4 != 0) {
            afe_02.a(afs_2.b(n3, n4));
        }
        if (this.d < 0) {
            afe_02.e("AnimStatique");
        } else {
            fii fii2 = fij.a().a(this.d);
            if (fii2 != null) {
                bNK bNK2 = bNT.f().c(this.e, this.f);
                this.c.a(bNK2);
                bOE.a(afe_02, fii2);
            }
        }
        afe_02.c(this);
    }
}

