/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aih
 */
class aih_0
implements TObjectProcedure<HighLightEntity> {
    static final /* synthetic */ boolean a;

    aih_0() {
    }

    public boolean a(HighLightEntity highLightEntity) {
        highLightEntity.u();
        highLightEntity.b = false;
        if (!a && highLightEntity.aw() >= 0) {
            throw new AssertionError();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((HighLightEntity)object);
    }

    static {
        a = !aif_0.class.desiredAssertionStatus();
    }
}

