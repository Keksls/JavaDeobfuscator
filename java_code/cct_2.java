/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.TShortHashSet;
import java.util.Arrays;

/*
 * Renamed from ccT
 */
class cct_2
extends ack_2<short[]> {
    private short[] c;

    cct_2(int n) {
        super(n);
    }

    public static void a(cct_2 cct_22, cct_2 cct_23, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        for (int k = 0; k < cct_22.d(); ++k) {
            short[] sArray = (short[])cct_22.c(k);
            if (Arrays.binarySearch(sArray, (short)0) < 0) continue;
            short s2 = cct_22.b(k);
            TShortHashSet tShortHashSet = new TShortHashSet((short[])tShortObjectHashMap.get(s2));
            tShortHashSet.addAll(cct_23.e());
            short[] sArray2 = tShortHashSet.toArray();
            Arrays.sort(sArray2);
            tShortObjectHashMap.put(s2, (Object)sArray2);
        }
    }

    private short[] e() {
        if (this.c == null) {
            int n = this.d();
            TShortArrayList tShortArrayList = new TShortArrayList(n);
            for (int k = 0; k < n; ++k) {
                short s2 = this.b(k);
                if (s2 > 0) continue;
                tShortArrayList.add(s2);
            }
            this.c = tShortArrayList.toArray();
        }
        return this.c;
    }
}

