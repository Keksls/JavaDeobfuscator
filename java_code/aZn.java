/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListCharacterInfoCommand;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.ArrayList;

public class aZn
implements TLongObjectProcedure<blx_1> {
    final /* synthetic */ TIntObjectHashMap a;
    final /* synthetic */ ListCharacterInfoCommand b;

    public aZn(ListCharacterInfoCommand listCharacterInfoCommand, TIntObjectHashMap tIntObjectHashMap) {
        this.b = listCharacterInfoCommand;
        this.a = tIntObjectHashMap;
    }

    public boolean a(long l, blx_1 blx_12) {
        int n = blx_12.Z_().t();
        ArrayList<blx_1> arrayList = (ArrayList<blx_1>)this.a.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<blx_1>();
            this.a.put(n, arrayList);
        }
        arrayList.add(blx_12);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (blx_1)object);
    }
}

