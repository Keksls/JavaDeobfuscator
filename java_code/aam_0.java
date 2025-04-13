/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaM
 */
public class aam_0
extends aao_0<Float> {
    aam_0(aaz_0 aaz_02) {
        super(aaz_02);
    }

    public final Float i() {
        if ((float)this.f <= this.a[0].a()) {
            return Float.valueOf(0.0f);
        }
        float f2 = this.j();
        if ((float)this.f <= f2) {
            return Float.valueOf(1.0f);
        }
        this.f = (long)((float)this.f - f2);
        return Float.valueOf(0.0f);
    }

    public final boolean k() {
        return this.f() != 0.0f;
    }

    @Override
    public float f() {
        return ((Float)this.e()).floatValue();
    }

    @Override
    public int g() {
        return ((Float)this.e()).intValue();
    }

    @Override
    public String h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float j() {
        return this.a[1].a() + this.a[0].a();
    }

    @Override
    public /* synthetic */ Object d() {
        return this.i();
    }
}

