/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

interface all {
    default public Logger r_() {
        return Logger.getLogger(this.getClass());
    }

    default public abu a_(int n, int n2) {
        Object t = afz_0.d().b(n, n2);
        if (t == null) {
            t = abe_0.d().b(n, n2);
        }
        if (t == null) {
            t = ahs.d().b(n, n2);
        }
        return t;
    }

    default public abu a(long l) {
        abu abu2 = afz_0.d().b(l);
        if (abu2 == null) {
            abu2 = abe_0.d().b(l);
        }
        if (abu2 == null) {
            abu2 = ahs.d().b(l);
        }
        return abu2;
    }

    default public afv a_(long l) {
        afv afv2 = afz_0.d().b(l);
        return afv2;
    }

    default public abu c(long l) {
        abu abu2 = abe_0.d().b(l);
        if (abu2 == null) {
            abu2 = ahs.d().b(l);
        }
        return abu2;
    }

    default public boolean a(aby_0 aby_02) {
        if (aby_02 instanceof afe_0) {
            return ((afe_0)aby_02).aT() == 8;
        }
        return false;
    }
}

