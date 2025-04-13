/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from aHX
 */
public class ahx_2 {
    private ahx_2() {
    }

    public static long a(TLongArrayList tLongArrayList) {
        int n = Hw.a(tLongArrayList.size());
        return tLongArrayList.removeAt(n);
    }

    public static boolean a(TLongArrayList tLongArrayList, long l) {
        int n = tLongArrayList.size();
        for (int k = 0; k < n; ++k) {
            if (tLongArrayList.getQuick(k) != l) continue;
            tLongArrayList.removeAt(k);
            return true;
        }
        return false;
    }

    public static boolean a(TIntArrayList tIntArrayList, int n) {
        int n2 = tIntArrayList.size();
        for (int k = 0; k < n2; ++k) {
            if (tIntArrayList.getQuick(k) != n) continue;
            tIntArrayList.removeAt(k);
            return true;
        }
        return false;
    }

    public static boolean a(TShortArrayList tShortArrayList, short s2) {
        int n = tShortArrayList.size();
        for (int k = 0; k < n; ++k) {
            if (tShortArrayList.getQuick(k) != s2) continue;
            tShortArrayList.removeAt(k);
            return true;
        }
        return false;
    }

    public static boolean a(TByteArrayList tByteArrayList, byte by) {
        int n = tByteArrayList.size();
        for (int k = 0; k < n; ++k) {
            if (tByteArrayList.getQuick(k) != by) continue;
            tByteArrayList.removeAt(k);
            return true;
        }
        return false;
    }

    public static <T> void a(TIntObjectHashMap<ArrayList<T>> tIntObjectHashMap, int n, T t) {
        ArrayList<T> arrayList = (ArrayList<T>)tIntObjectHashMap.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<T>();
            tIntObjectHashMap.put(n, arrayList);
        }
        arrayList.add(t);
    }
}

