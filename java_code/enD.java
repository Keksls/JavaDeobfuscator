/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class enD
extends enB {
    enF d = null;

    public enD(enF enF2) {
        this.d = enF2;
    }

    enD() {
    }

    enD(arf_1 arf_12) {
        this.b(arf_12);
    }

    public enF c() {
        return this.d;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b() {
        this.d = null;
    }

    @Override
    public final void b(arf_1 arf_12) {
        this.d = enF.a(arf_12);
    }

    @Override
    public void a(gk_0 gk_02) {
        enF.a(this.d, gk_02);
    }

    @Override
    protected final void c(enB enB2) {
        enD enD2 = (enD)enB2;
        this.b();
        if (enD2.d != null) {
            this.d = new enF(enD2.d);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof enD)) {
            return false;
        }
        enD enD2 = (enD)object;
        return Objects.equals(this.d, enD2.d);
    }

    public int hashCode() {
        return this.d != null ? this.d.hashCode() : 0;
    }
}

