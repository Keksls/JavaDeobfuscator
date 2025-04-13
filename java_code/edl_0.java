/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eDL
 */
public class edl_0 {
    private static final String b = "</image>";
    private static final String c = " ";
    private static final String d = ", ";
    private static final @Unmodifiable Map<Integer, edk_0> e = ImmutableMap.builder().put((Object)efc_0.v.a(), (Object)edk_0.b).put((Object)efc_0.w.a(), (Object)edk_0.b).put((Object)efc_0.x.a(), (Object)edk_0.b).put((Object)efc_0.y.a(), (Object)edk_0.b).put((Object)efc_0.B.a(), (Object)edk_0.a).put((Object)efc_0.C.a(), (Object)edk_0.a).put((Object)efc_0.D.a(), (Object)edk_0.a).put((Object)efc_0.E.a(), (Object)edk_0.a).build();
    private static final @Unmodifiable Map<Integer, Integer> f = ImmutableMap.builder().put((Object)efc_0.v.a(), (Object)0).put((Object)efc_0.w.a(), (Object)1).put((Object)efc_0.x.a(), (Object)2).put((Object)efc_0.y.a(), (Object)3).put((Object)efc_0.B.a(), (Object)4).put((Object)efc_0.D.a(), (Object)5).put((Object)efc_0.C.a(), (Object)6).put((Object)efc_0.E.a(), (Object)7).build();
    public static final Comparator<edi_0> a = Comparator.comparingInt(edi_02 -> f.get(edi_02.a()));
    private Map<eDJ, List<edi_0>> g = new HashMap<eDJ, List<edi_0>>();

    public boolean a(int n) {
        return e.containsKey(n);
    }

    public void a(efh_0 efh_02, String string, short s2) {
        if (!this.a(efh_02.j())) {
            return;
        }
        int n = efh_02.a(0, s2, eFb.a);
        eDJ eDJ2 = new eDJ(e.get(efh_02.j()), n);
        List<edi_0> list = this.g.get(eDJ2);
        if (list == null) {
            list = new ArrayList<edi_0>();
        }
        edi_0 edi_02 = new edi_0(efh_02.j(), string);
        list.add(edi_02);
        this.g.put(eDJ2, list);
    }

    public Collection<String> a(Oy oy) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Map.Entry<eDJ, List<edi_0>> entry : this.g.entrySet()) {
            List<edi_0> list = entry.getValue();
            if (list.isEmpty()) continue;
            if (list.size() == 1) {
                arrayList.add(list.get(0).b());
                continue;
            }
            list.sort(a);
            eDJ eDJ2 = entry.getKey();
            String string = oy.a(eDJ2.a(), new Object[0]);
            StringBuilder stringBuilder = new StringBuilder(Cr.a(string, eDJ2.c()));
            for (int k = 0; k < list.size(); ++k) {
                String[] stringArray = list.get(k).b().split(b);
                if (stringArray.length < 2) {
                    stringBuilder.append(d).append(list.get(k).b());
                    continue;
                }
                stringBuilder.append(c).append(stringArray[0]).append(b);
            }
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }
}

