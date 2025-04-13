/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aBl
 */
public final class abl_1 {
    private static final int a = 256;
    private static final Logger b = Logger.getLogger(abl_1.class);
    private static final abl_1 c = new abl_1();
    private final TIntIntHashMap d;
    private final TIntObjectHashMap<abj_1> e;
    private final TIntObjectHashMap<abi_1> f = new TIntObjectHashMap();

    private abl_1() {
        this.e = new TIntObjectHashMap();
        this.d = new TIntIntHashMap();
    }

    abj_1 a(int n, Class clazz) {
        abj_1 abj_12 = (abj_1)this.e.get(n);
        if (abj_12 == null) {
            int n2 = this.d.get(n);
            if (n2 == 0) {
                n2 = 256;
            }
            abj_12 = this.a(n, clazz, n2);
        }
        return abj_12;
    }

    private abj_1 a(int n, Class clazz, int n2) {
        abi_1 abi_12 = (abi_1)this.f.get(n);
        if (abi_12 == null) {
            abi_12 = abl_1.a(null, clazz);
            this.f.put(n, (Object)abi_12);
        }
        return new abj_1(n2, clazz, abi_12);
    }

    public final abj_1[] a() {
        Object[] objectArray = new abj_1[this.e.size()];
        return (abj_1[])this.e.values(objectArray);
    }

    private static abi_1 a(String object, String string) {
        if (Cz.f((String)object)) {
            object = string + "$ObjectFactory";
        }
        return (abi_1)Class.forName((String)object).newInstance();
    }

    private static abi_1 a(String string, Class clazz) {
        try {
            return abl_1.a(string, clazz.getName());
        }
        catch (Exception exception) {
            b.error((Object)exception);
            return abj_1.a(clazz);
        }
    }

    public final void a(ath_2 ath_22) {
        aqx_2 aqx_22 = ath_22.a().c("memoryObjectPools");
        if (aqx_22 == null) {
            b.warn((Object)"No pools configuration found");
            return;
        }
        ArrayList<aqx_2> arrayList = aqx_22.d("pool");
        if (arrayList == null) {
            b.warn((Object)"No pools configuration found");
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_23 = arrayList.get(k);
            aqx_2 aqx_24 = aqx_23.f("class");
            aqx_2 aqx_25 = aqx_23.f("size");
            String string = aqx_24.c();
            int n2 = aqx_25.g();
            int n3 = abh_1.d(string);
            this.a(n3, n2);
            aqx_2 aqx_26 = aqx_23.f("factory_class");
            String string2 = aqx_26 != null ? aqx_26.c() : null;
            try {
                this.f.put(n3, (Object)abl_1.a(string2, string));
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("probl\u00e8me avec la factory pour la classe " + string), (Throwable)exception);
            }
        }
    }

    public final ath_2 a(String string) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        try {
            atg_22.a(string);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
        }
        catch (Exception exception) {
            b.error((Object)("Exception during loadConfiguration(" + string + ")"), (Throwable)exception);
        }
        this.a(ath_22);
        return ath_22;
    }

    public final void a(InputStream inputStream) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        try {
            atg_22.a(inputStream);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
        }
        catch (Exception exception) {
            b.error((Object)"Exception during loadConfiguration", (Throwable)exception);
        }
        this.a(ath_22);
    }

    public static abl_1 b() {
        return c;
    }

    final void a(abj_1 abj_12) {
        this.e.put(abj_12.b(), (Object)abj_12);
        aud_1.a().a(abj_12);
    }

    private void a(int n, int n2) {
        this.d.put(n, n2);
    }
}

