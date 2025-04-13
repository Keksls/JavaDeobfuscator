/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.Multimap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from bdk
 */
public class bdk_2
implements agw_0 {
    protected static final Logger a = Logger.getLogger(bdk_2.class);
    public static final bdk_2 b = new bdk_2();

    private bdk_2() {
    }

    public void a(YK yK) {
        boolean bl = azs_0.a().a("loadAchievements", true);
        if (!bl) {
            yK.b(this);
            return;
        }
        this.a();
        this.b();
        this.c();
        this.d();
        yK.b(this);
    }

    private void a() {
        asw_2.a().a(new aQk(), (T aQk2) -> bhp_1.a.a(aQk2.c(), aQk2.d(), aQk2.e()));
    }

    private void b() {
        asw_2.a().a(new aqh_0(), (T aqh_02) -> bhp_1.a.a(aqh_02.c(), aqh_02.d(), null));
    }

    private void c() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        asw_2.a().a(new aQc(), (T aQc2) -> {
            if (aQc2.y()) {
                Multimap multimap = (Multimap)tIntObjectHashMap.get(aQc2.d());
                if (multimap == null) {
                    multimap = ArrayListMultimap.create();
                    tIntObjectHashMap.put(aQc2.d(), (Object)multimap);
                }
                multimap.put((Object)aQc2.A(), (Object)aQc2.c());
            }
        });
        asw_2.a().a(new aQc(), new bdl_2(this, tIntObjectHashMap));
    }

    private void d() {
        asw_2.a().a(new aQi(), (T aQi2) -> {
            int n = aQi2.c();
            aQj[] aQjArray = aQi2.d();
            aQj[] aQjArray2 = new aQj[aQjArray.length];
            System.arraycopy(aQjArray, 0, aQjArray2, 0, aQjArray.length);
            Arrays.sort(aQjArray2, bdm_1.a);
            int[] nArray = new int[aQjArray2.length];
            int n2 = aQjArray2.length;
            for (int k = 0; k < n2; ++k) {
                nArray[k] = aQjArray2[k].a();
            }
            op_0 op_02 = new op_0(n);
            op_02.a(nArray);
            OQ.a.a(op_02);
        });
    }

    String a(aQc aQc2, TIntObjectHashMap<Multimap<Byte, Integer>> tIntObjectHashMap) {
        String string = aQc2.i();
        boolean bl = aQc2.y();
        if (bl) {
            byte by = aQc2.A();
            int n = aQc2.z();
            Multimap multimap = (Multimap)tIntObjectHashMap.get(aQc2.d());
            if (multimap == null) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(GetLevel() >= ").append(aQc2.q());
            if (n > 0) {
                stringBuilder.append(" && GetItemQuantity(").append(n).append(") > 0");
            }
            for (Byte by2 : multimap.keySet()) {
                if (by2 >= by) continue;
                for (Integer n2 : multimap.get((Object)by2)) {
                    stringBuilder.append(" && IsAchievementComplete(").append(n2).append(')');
                }
            }
            stringBuilder.append(')');
            if (!Cz.f(string)) {
                stringBuilder.append(" && (");
                stringBuilder.append(string);
                stringBuilder.append(')');
            }
            return stringBuilder.toString();
        }
        return string;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.achievements", new Object[0]);
    }
}

