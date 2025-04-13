/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKp
 */
public class akp_1 {
    private final THashMap<String, Class> a = new THashMap();

    public void a(InputStream inputStream, String string, String string2, THashMap<String, Collection<ako_1>> tHashMap) {
        THashSet<ako_1> tHashSet = this.a(new InputStreamReader(inputStream));
        if (tHashSet == null) {
            return;
        }
        tHashMap.put((Object)akp_1.a(string2, string), tHashSet);
    }

    public final THashSet<ako_1> a(Reader reader) {
        THashSet tHashSet = new THashSet();
        try {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String string = bufferedReader.readLine();
            while (string != null) {
                this.a(string, (Collection<ako_1>)tHashSet);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            akl_1.b.error((Object)"", (Throwable)iOException);
            return null;
        }
        return tHashSet;
    }

    public static String a(String string, String string2) {
        return string.length() == 0 ? string2 : string + "/" + string2;
    }

    private void a(String string, Collection<ako_1> collection) {
        this.a.forEachEntry((TObjectObjectProcedure)new akq_2(this, string, collection));
    }

    public void a(akr_1[] akr_1Array) {
        try {
            for (akr_1 akr_12 : akr_1Array) {
                int n;
                akk_2[] akk_2Array;
                if (!akp_1.a(akr_12)) continue;
                akk_2[] akk_2Array2 = akr_12.a(null);
                if (akk_2Array2 != null) {
                    akk_2Array = akk_2Array2;
                    int n2 = akk_2Array.length;
                    for (n = 0; n < n2; ++n) {
                        akk_2 akk_22 = akk_2Array[n];
                        if (!akp_1.a(akk_22)) continue;
                        this.a.put((Object)(akr_12.a() + "." + akk_22.a()), akk_22.getClass());
                    }
                }
                if ((akk_2Array = akr_12.b(null)) == null) continue;
                akk_2[] akk_2Array3 = akk_2Array;
                n = akk_2Array3.length;
                for (int k = 0; k < n; ++k) {
                    akk_2 akk_23 = akk_2Array3[k];
                    if (!akp_1.a(akk_23)) continue;
                    this.a.put((Object)akk_23.a(), akk_23.getClass());
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static boolean a(akr_1 akr_12) {
        try {
            akr_12.getClass().getDeclaredConstructor(new Class[0]);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }

    private static boolean a(akk_2 akk_22) {
        try {
            akk_22.getClass().getDeclaredConstructor(LuaState.class);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }
}

