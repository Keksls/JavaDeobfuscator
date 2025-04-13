/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListResourceInfoCommand;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aZp
implements TObjectProcedure<bNK> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ TShortObjectHashMap c;
    final /* synthetic */ ListResourceInfoCommand d;

    public aZp(ListResourceInfoCommand listResourceInfoCommand, int n, int n2, TShortObjectHashMap tShortObjectHashMap) {
        this.d = listResourceInfoCommand;
        this.a = n;
        this.b = n2;
        this.c = tShortObjectHashMap;
    }

    public boolean a(bNK bNK2) {
        int n = (int)afq_2.c(bNK2.G() - this.a, bNK2.H() - this.b);
        if (n > 200) {
            return true;
        }
        short s2 = bNK2.aR().j();
        ArrayList<bNK> arrayList = (ArrayList<bNK>)this.c.get(s2);
        if (arrayList == null) {
            arrayList = new ArrayList<bNK>();
            this.c.put(s2, arrayList);
        }
        arrayList.add(bNK2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNK)object);
    }
}

