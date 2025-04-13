/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectFloatProcedure
 */
import gnu.trove.procedure.TObjectFloatProcedure;
import java.util.HashMap;

/*
 * Renamed from cbD
 */
class cbd_1
implements TObjectFloatProcedure<fjt_0> {
    final /* synthetic */ HashMap a;
    final /* synthetic */ cbc_1 b;

    cbd_1(cbc_1 cbc_12, HashMap hashMap) {
        this.b = cbc_12;
        this.a = hashMap;
    }

    public boolean a(fjt_0 fjt_02, float f2) {
        cbr_1 cbr_12;
        if (fjt_02 == fjt_0.c) {
            fjt_02 = f2 == 1.0f ? fjt_0.e : fjt_0.c;
            cbr_12 = (cbr_1)this.a.get((Object)(f2 == 1.0f ? fjt_0.e : fjt_0.c));
            if (cbr_12 != null) {
                cbr_12.b(0.0f);
            }
        }
        if ((cbr_12 = (cbr_1)this.a.get((Object)fjt_02)) != null) {
            cbr_12.b(f2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, float f2) {
        return this.a((fjt_0)((Object)object), f2);
    }
}

