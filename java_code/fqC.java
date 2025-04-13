/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class fqC
implements TObjectProcedure<ftI> {
    final /* synthetic */ fqb_0 a;

    fqC(fqb_0 fqb_02) {
        this.a = fqb_02;
    }

    public boolean a(ftI ftI2) {
        fqb_0 fqb_02 = ftI2.getAppearance();
        if (fqb_02.isChecked() && fqb_02 != this.a) {
            fqb_02.p();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ftI)object);
    }
}

