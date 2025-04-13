/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public final class bjS
extends bjg_0 {
    public final int a;
    public final aff_1 b;
    public final boolean d;
    public final RH e;
    public final boolean f;
    public FreeParticleSystem g;
    public biI h;
    bjV i;
    public boolean j = false;

    bjS(efh_0 efh_02, int n, aff_1 aff_12, boolean bl, boolean bl2, RH rH, bjV bjV2) {
        super(efh_02);
        this.a = n;
        this.b = aff_12;
        this.d = bl;
        this.i = bjV2;
        this.e = rH;
        this.f = bl2;
    }

    private bjS(bjS bjS2) {
        super(bjS2.c);
        this.a = bjS2.a;
        this.b = bjS2.b;
        this.d = bjS2.d;
        this.i = null;
        this.e = bjS2.e;
        this.f = bjS2.f;
    }

    @Override
    public void a(biI biI2) {
        this.h = biI2;
        this.i.b(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bjS bjS2 = (bjS)object;
        if (this.d != bjS2.d) {
            return false;
        }
        if (this.f != bjS2.f) {
            return false;
        }
        if (this.a != bjS2.a) {
            return false;
        }
        if (this.b != null ? !this.b.equals(bjS2.b) : bjS2.b != null) {
            return false;
        }
        return this.e == bjS2.e;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.a;
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        n = 31 * n + (this.d ? 1 : 0);
        n = 31 * n + (this.e != null ? this.e.hashCode() : 0);
        n = 31 * n + (this.f ? 1 : 0);
        return n;
    }

    public bjS a() {
        return new bjS(this);
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

