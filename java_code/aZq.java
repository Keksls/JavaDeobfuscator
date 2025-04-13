/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListResourceInfoCommand;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aZq
implements TObjectProcedure<ArrayList<bNK>> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ListResourceInfoCommand b;

    public aZq(ListResourceInfoCommand listResourceInfoCommand, ArrayList arrayList) {
        this.b = listResourceInfoCommand;
        this.a = arrayList;
    }

    public boolean a(ArrayList<bNK> arrayList) {
        this.a.addAll(this.b.a(arrayList));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ArrayList)object);
    }
}

