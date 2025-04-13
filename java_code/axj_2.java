/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.jogamp.opengl.GL2;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from axj
 */
class axj_2
implements TObjectProcedure<axk_2> {
    final /* synthetic */ GL2 a;

    axj_2(GL2 gL2) {
        this.a = gL2;
    }

    public boolean a(axk_2 axk_22) {
        axc_2.a(this.a, axk_22, axk_22.h, axk_22.i);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((axk_2)object);
    }
}

