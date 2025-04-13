/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.util.Collections;

/*
 * Renamed from bpk
 */
public class bpk_1 {
    public final String a;
    public String[] b;

    public bpk_1(String string, String ... stringArray) {
        this.a = string;
        this.a(stringArray);
    }

    void a(String[] stringArray) {
        THashSet tHashSet = new THashSet();
        if (this.b != null) {
            Collections.addAll(tHashSet, this.b);
        }
        Collections.addAll(tHashSet, stringArray);
        this.b = new String[tHashSet.size()];
        tHashSet.toArray((Object[])this.b);
    }
}

