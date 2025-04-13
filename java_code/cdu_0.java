/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from cDU
 */
public class cdu_0
extends cdx_0 {
    public static final TObjectProcedure<cDY> c = new cDV();
    private cel_0 d;
    private boolean e;
    private cej_0 f;

    @Override
    public void a(cej_0 cej_02) {
        this.f = cej_02;
    }

    public cel_0 j() {
        return this.d;
    }

    @Override
    public void a(cel_0 cel_02) {
        this.d = cel_02;
    }

    @Override
    public void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public void b(long l) {
    }

    @Override
    public void a(long l) {
        this.a(c);
    }

    private boolean a(cer_0 cer_02) {
        if (this.d != cer_02.g()) {
            return false;
        }
        if (this.e != cer_02.i()) {
            return false;
        }
        if (this.f == null) {
            return true;
        }
        return this.f.a(cer_02);
    }

    @Override
    public void a(ArrayList<cDY> arrayList) {
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cer_0 cer_02) {
        if (this.a(cer_02)) {
            super.a(arrayList);
        }
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cdh_0 cdh_02) {
    }
}

