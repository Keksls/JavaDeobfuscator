/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectFloatHashMap
 *  gnu.trove.procedure.TObjectFloatProcedure
 */
import gnu.trove.map.hash.TObjectFloatHashMap;
import gnu.trove.procedure.TObjectFloatProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cbC
 */
public class cbc_1
implements cbv_1 {
    private float a = 0.0f;
    private final TObjectFloatHashMap<fjt_0> b = new TObjectFloatHashMap();
    private boolean c = true;
    private boolean d;
    private float e;
    private float f;
    private float g;

    @Override
    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public void a(float f2) {
        this.e = f2;
    }

    @Override
    public void b(float f2) {
        this.f = f2;
    }

    @Override
    public void c(float f2) {
        this.g = f2;
    }

    @Override
    public void b(boolean bl) {
        this.c = bl;
    }

    @Override
    public void d(float f2) {
        this.a = f2;
    }

    @Override
    public void a(fjt_0 fjt_02, float f2) {
        this.b.put((Object)fjt_02, f2);
    }

    @Override
    public void a(long l, cbe_1 cbe_12, cbe_1 cbe_13, cbr_1 cbr_12, HashMap<fjt_0, cbr_1> hashMap) {
        if (this.c) {
            cbe_12.a(this.a);
            cbe_13.a(1.0f);
            ahg_0 ahg_02 = ajJ.d().e();
            if (cbe_12.a() > 0.0f && !cbr_12.d()) {
                cbr_12.a(ahg_02);
            }
            this.b.forEachEntry((TObjectFloatProcedure)new cbd_1(this, hashMap));
            for (cbr_1 cbr_13 : hashMap.values()) {
                if (!(cbr_13 instanceof cbj_2)) continue;
                cbj_2 cbj_22 = (cbj_2)cbr_13;
                cba_1 cba_12 = cbj_22.b();
                if (this.d) {
                    if (!(cba_12 instanceof cbb_1)) {
                        cbj_22.a(new cbb_1());
                    }
                    cbb_1 cbb_12 = (cbb_1)cbj_22.b();
                    cbb_12.b(this.e);
                    cbb_12.c(this.f);
                    cbb_12.d(this.g);
                    continue;
                }
                if (cba_12 instanceof cbl_1) continue;
                cbj_22.a(new cbl_1());
            }
        } else {
            float f2 = 0.0f;
            cbe_12.a(0.0f);
            cbe_12.a(0.0f);
            ahg_0 ahg_03 = ajJ.d().e();
            if (cbe_12.a() > 0.0f && !cbr_12.d()) {
                cbr_12.a(ahg_03);
            }
            for (Map.Entry<fjt_0, cbr_1> entry : hashMap.entrySet()) {
                cbr_1 cbr_14 = entry.getValue();
                if (cbr_14 == null) continue;
                cbr_14.b(0.0f);
            }
        }
    }
}

