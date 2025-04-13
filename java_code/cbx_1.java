/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

/*
 * Renamed from cbX
 */
class cbx_1
extends cbr_1 {
    private static final int e = 18;
    private static final int f = 18;
    private float g = 0.0f;

    cbx_1() {
    }

    @Override
    void a(ahg_0 ahg_02) {
        super.a(ahg_02);
        this.b = true;
    }

    @Override
    void a() {
        super.a();
        this.b = false;
    }

    @Override
    void a(ahg_0 ahg_02, float f2, float f3) {
        if (!this.b) {
            return;
        }
        float f4 = f3 * f2;
        float f5 = -0.3f * f4;
        float f6 = f5 / 2.0f;
        this.g += 0.17453292f * f4;
        ArrayList arrayList = bNT.f().b();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            this.a(f6, (bNK)arrayList.get(k));
        }
    }

    private void a(float f2, bNK bNK2) {
        Entity entity = bNK2.t();
        if (entity == null) {
            return;
        }
        BatchTransformer batchTransformer = entity.D();
        ayx_2 ayx_22 = (ayx_2)batchTransformer.c(0);
        Matrix44 matrix44 = ayx_22.m();
        if (!fjz_0.b(bNK2.aQ())) {
            if (!matrix44.e()) {
                matrix44.b();
                ayx_22.n();
                batchTransformer.e();
            }
            return;
        }
        float f3 = bNK2.J() * bNK2.K() * 1.0f * ((float)Math.PI / 180);
        float f4 = f2 + f2 * Hw.h(this.g + f3);
        matrix44.a(4, f4);
        ayx_22.n();
        batchTransformer.e();
    }
}

