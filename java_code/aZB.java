/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aZB
implements TObjectProcedure<bNK> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ArrayList e;

    public aZB(int n, int n2, int n3, int n4, ArrayList arrayList) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = arrayList;
    }

    public boolean a(bNK bNK2) {
        if (HideFightOccluders.a(bNK2, this.a, this.b, this.c, this.d)) {
            this.e.add(bNK2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

