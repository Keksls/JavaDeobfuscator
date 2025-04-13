/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;

/*
 * Renamed from ayW
 */
public final class ayw_2
extends ayv_2 {
    @Override
    public Matrix44 a() {
        return this.a;
    }

    @Override
    public void b() {
        this.a.b();
    }

    @Override
    public float c() {
        return this.a.c()[12];
    }

    @Override
    public float d() {
        return this.a.c()[13];
    }

    @Override
    public float e() {
        return this.a.c()[0];
    }

    @Override
    public float f() {
        return this.a.c()[5];
    }

    @Override
    public void a(float f2, float f3, float f4) {
        float[] fArray = this.a.c();
        fArray[12] = f2;
        fArray[13] = f3;
        fArray[14] = f4;
    }

    @Override
    public void b(float f2, float f3, float f4) {
        float[] fArray = this.a.c();
        fArray[0] = f2;
        fArray[5] = f3;
        fArray[10] = f4;
    }
}

