/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from aeA
 */
public class aea_0
extends aex {
    private static final Logger c = Logger.getLogger(aea_0.class);
    public static final aea_0 b = new aea_0();
    private final aft_2 d = new aft_2();
    private final aft_2 e = new aft_2();
    private final HashMap<Entity, float[]> f = new HashMap();

    private aea_0() {
    }

    @Override
    public void a() {
        super.a();
        this.f.clear();
    }

    @Override
    public abd_0 b() {
        return new aez();
    }

    @Override
    protected void a(int n, Entity entity) {
        boolean bl;
        int n2 = this.a.size();
        if (n2 - n <= 0) {
            return;
        }
        aug_1 aug_12 = aui_1.a().b();
        boolean bl2 = bl = !aug_12.b(aup_1.e);
        if (!bl) {
            int n3 = entity.m;
            int n4 = entity.o;
            int n5 = entity.l;
            int n6 = entity.n;
            for (int k = n; k < n2; ++k) {
                Entity entity2 = (Entity)this.a.get(k);
                float[] fArray = this.f.get(entity2);
                if (fArray == null) {
                    fArray = new float[4];
                    this.f.put(entity2, fArray);
                    fArray[0] = n5;
                    fArray[1] = n3;
                    fArray[2] = n6;
                    fArray[3] = n4;
                    continue;
                }
                if ((float)n5 < fArray[0]) {
                    fArray[0] = n5;
                }
                if ((float)n3 > fArray[1]) {
                    fArray[1] = n3;
                }
                if ((float)n6 < fArray[2]) {
                    fArray[2] = n6;
                }
                if (!((float)n4 > fArray[3])) continue;
                fArray[3] = n4;
            }
        } else {
            for (int k = n; k < n2; ++k) {
                Entity entity3 = (Entity)this.a.get(k);
                entity3.a(aeb_0.a);
                entity3.b(aey.a);
                if (entity3 instanceof EntityGroup) {
                    ArrayList<Entity> arrayList = entity3.U();
                    for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                        Entity entity4 = arrayList.get(i2);
                        entity4.a(aeb_0.a);
                        entity4.b(aey.a);
                    }
                    continue;
                }
                entity3.a(aeb_0.a);
                entity3.b(aey.a);
            }
        }
    }

    @Override
    public void a(Matrix44 matrix44, ahm_0 ahm_02) {
        if (this.f.isEmpty()) {
            return;
        }
        aug_1 aug_12 = aui_1.a().b();
        int n = ahm_02.i();
        int n2 = ahm_02.j();
        float f2 = ahm_02.f();
        float f3 = f2 / (float)n;
        float f4 = f2 / (float)n2;
        for (Map.Entry<Entity, float[]> entry : this.f.entrySet()) {
            Entity entity = entry.getKey();
            float[] fArray = entry.getValue();
            float f5 = fArray[1] - fArray[0] - 1.0f;
            if (f5 < 48.0f) {
                f5 = 48.0f;
            }
            float f6 = fArray[3] - fArray[2] - 1.0f;
            float f7 = f5 * f3 * Hw.n;
            float f8 = f6 * f4 * Hw.n;
            float f9 = (fArray[0] + fArray[1]) / 2.0f;
            float f10 = (fArray[2] + fArray[3]) / 2.0f;
            this.d.a(f9, f10, 0.0f, 1.0f);
            matrix44.b(this.d, this.e);
            this.e.a *= 2.0f / (float)n;
            this.e.b *= 2.0f / (float)n2;
            ava_1 ava_12 = new ava_1(aup_1.G);
            ava_12.a("gAlphaMaskRadius", f7, f8);
            ava_12.a("gAlphaMaskPos", this.e.a, this.e.b);
            if (entity instanceof EntityGroup) {
                ArrayList<Entity> arrayList = entity.U();
                for (int k = 0; k < arrayList.size(); ++k) {
                    Entity entity2 = arrayList.get(k);
                    entity2.a(aug_12, aup_1.f, ava_12);
                }
                continue;
            }
            entity.a(aug_12, aup_1.e, ava_12);
        }
    }

    @Override
    public void a(acb_0 acb_02) {
    }
}

