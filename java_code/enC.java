/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public final class enC
extends enB {
    enE[] d = null;

    public enC(enE[] enEArray) {
        this.d = enEArray;
    }

    public enC() {
    }

    enC(arf_1 arf_12) {
        this.b(arf_12);
    }

    @Nullable
    public aej_2 a(int n, int n2, short s2) {
        if (this.d == null) {
            return null;
        }
        for (int k = 0; k < this.d.length; ++k) {
            enE enE2 = this.d[k];
            if (enE2.a != n || enE2.b != n2 || enE2.c != s2) continue;
            return enE2.d;
        }
        return null;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        this.d = null;
    }

    @Override
    public void b(arf_1 arf_12) {
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            this.d = null;
        } else {
            this.d = new enE[n];
            for (int k = 0; k < n; ++k) {
                this.d[k] = new enE(arf_12);
            }
        }
    }

    @Override
    public void a(gk_0 gk_02) {
        if (this.d == null) {
            gk_02.a((byte)0);
        } else {
            gk_02.a((byte)this.d.length);
            for (int k = 0; k < this.d.length; ++k) {
                this.d[k].a(gk_02);
            }
        }
    }

    @Override
    protected final void c(enB enB2) {
        enC enC2 = (enC)enB2;
        this.b();
        if (enC2.d != null) {
            this.d = (enE[])enC2.d.clone();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof enC)) {
            return false;
        }
        enC enC2 = (enC)object;
        return Arrays.equals(this.d, enC2.d);
    }

    public int hashCode() {
        return this.d != null ? Arrays.hashCode(this.d) : 0;
    }
}

