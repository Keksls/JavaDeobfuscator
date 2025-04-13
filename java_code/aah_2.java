/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from aAh
 */
class aah_2
implements TObjectProcedure<aae_2> {
    final /* synthetic */ DefaultTableModel a;
    final /* synthetic */ float b;
    final /* synthetic */ aag_2 c;

    aah_2(aag_2 aag_22, DefaultTableModel defaultTableModel, float f2) {
        this.c = aag_22;
        this.a = defaultTableModel;
        this.b = f2;
    }

    public boolean a(aae_2 aae_22) {
        this.a.addRow(new Object[]{aae_22.a(), (int)((float)aae_22.b() * this.b), aae_22.c()});
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aae_2)object);
    }
}

