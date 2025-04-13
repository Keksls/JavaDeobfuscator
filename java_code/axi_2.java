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
 * Renamed from axi
 */
class axi_2
implements TObjectProcedure<axc_2> {
    final /* synthetic */ GL2 a;

    axi_2(GL2 gL2) {
        this.a = gL2;
    }

    public boolean a(axc_2 axc_22) {
        axc_22.a(this.a);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((axc_2)object);
    }
}

