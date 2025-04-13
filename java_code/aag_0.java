/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaG
 */
public class aag_0
extends aao_0<Float> {
    aag_0(aaz_0 aaz_02) {
        super(aaz_02);
    }

    public final Float i() {
        float f2 = this.j();
        if ((float)this.f > f2) {
            this.f = (long)((float)this.f - f2);
        }
        return ((aad)this.a[1]).b(this.f);
    }

    @Override
    public final float f() {
        return ((Float)this.e()).floatValue();
    }

    @Override
    public final int g() {
        return ((Float)this.e()).intValue();
    }

    @Override
    public final String h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float j() {
        return this.a[0].a();
    }

    @Override
    public /* synthetic */ Object d() {
        return this.i();
    }
}

