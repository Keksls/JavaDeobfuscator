/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from acR
 */
abstract class acr_0<M extends ade_0>
implements Comparator<M> {
    private static final Logger a = Logger.getLogger(acr_0.class);
    private float b;
    private float c;

    acr_0() {
    }

    public final void a(float f2, float f3) {
        this.b = f2;
        this.c = f3;
    }

    public final int a(M m, M m2) {
        float f2;
        aci_0 aci_02 = this.a(m);
        aci_0 aci_03 = this.a(m2);
        float f3 = acr_0.a(aci_02, this.b, this.c);
        if (f3 == (f2 = acr_0.a(aci_03, this.b, this.c))) {
            return 0;
        }
        return f3 < f2 ? 1 : -1;
    }

    private static float a(aci_0 aci_02, float f2, float f3) {
        if (aci_02 == null) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = (float)aci_02.c() - f2;
        float f5 = (float)aci_02.d() - f3;
        return f4 * f4 + f5 * f5;
    }

    protected abstract aci_0 a(M var1);

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ade_0)object, (ade_0)object2);
    }
}

