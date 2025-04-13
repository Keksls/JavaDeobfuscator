/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ayQ
 */
final class ayq_2
implements TObjectProcedure<ays_2> {
    private static final int a = 1000000;
    private GL2 b;
    private long c;
    private float d;

    ayq_2() {
    }

    float a() {
        return this.d;
    }

    void a(GL2 gL2) {
        this.b = gL2;
        this.c = System.nanoTime();
        this.d = 0.0f;
    }

    public boolean a(ays_2 ays_22) {
        if (ays_22 == null || ays_22.j()) {
            return true;
        }
        if (ays_22.a((GL)this.b)) {
            this.d += ays_22.n();
            ays_22.m = ayt_2.d;
        }
        return System.nanoTime() - this.c <= 1000000L;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ays_2)object);
    }
}

