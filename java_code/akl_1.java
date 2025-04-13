/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKl
 */
public class akl_1 {
    static final Logger b = Logger.getLogger(akl_1.class);
    public static final akl_1 a = new akl_1();
    private akr_1[] c;
    private final THashMap<String, akn_1[]> d = new THashMap();
    private akp_1 e;

    private akl_1() {
    }

    public void a(akr_1[] akr_1Array) {
        this.c = akr_1Array;
    }

    public void b(akr_1 ... akr_1Array) {
        if (this.e != null) {
            this.e.a(akr_1Array);
        }
        akr_1[] akr_1Array2 = this.c;
        this.c = new akr_1[akr_1Array2.length + akr_1Array.length];
        System.arraycopy(akr_1Array2, 0, this.c, 0, akr_1Array2.length);
        System.arraycopy(akr_1Array, 0, this.c, akr_1Array2.length, akr_1Array.length);
    }

    public void a(String string) {
        try {
            int n;
            int n2;
            arf_1 arf_12 = arf_1.a(gg_0.b(string));
            int n3 = arf_12.c();
            akn_1[][] akn_1ArrayArray = new akn_1[n3][];
            for (n2 = 0; n2 < n3; ++n2) {
                n = arf_12.a();
                akn_1ArrayArray[n2] = new akn_1[n];
                for (int k = 0; k < n; ++k) {
                    String string2 = arf_12.e();
                    Constructor[] constructorArray = akl_1.a(arf_12);
                    akn_1ArrayArray[n2][k] = string2.length() == 0 ? new akn_1(string2, null, constructorArray) : new akn_1(string2, constructorArray, null);
                }
            }
            n2 = arf_12.c();
            for (n = 0; n < n2; ++n) {
                String string3 = arf_12.e();
                int n4 = arf_12.c();
                this.d.put((Object)string3, (Object)akn_1ArrayArray[n4]);
            }
        }
        catch (IOException iOException) {
            b.error((Object)"", (Throwable)iOException);
        }
    }

    private static Constructor[] a(arf_1 arf_12) {
        int n = arf_12.a();
        String[] stringArray = new String[n];
        for (int k = 0; k < n; ++k) {
            stringArray[k] = arf_12.e();
        }
        return akl_1.a(stringArray);
    }

    static Constructor[] a(String[] stringArray) {
        Constructor[] constructorArray = new Constructor[stringArray.length];
        for (int k = 0; k < stringArray.length; ++k) {
            try {
                Class<?> clazz = Class.forName(stringArray[k]);
                constructorArray[k] = clazz.getDeclaredConstructor(LuaState.class);
                constructorArray[k].setAccessible(true);
                continue;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                b.error((Object)"", (Throwable)noSuchMethodException);
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                b.error((Object)"", (Throwable)classNotFoundException);
            }
        }
        return constructorArray;
    }

    public akn_1[] b(String string) {
        return (akn_1[])this.d.get((Object)string);
    }

    public boolean a(String string, String string2) {
        if (this.d.containsKey((Object)string)) {
            return this.d.get((Object)string) != null;
        }
        try {
            InputStream inputStream = gg_0.c(string2);
            akn_1[] akn_1Array = this.a(new InputStreamReader(inputStream));
            if (akn_1Array == null) {
                this.d.put((Object)string, null);
                return false;
            }
            this.d.put((Object)string, (Object)akn_1Array);
            return true;
        }
        catch (IOException iOException) {
            b.error((Object)"", (Throwable)iOException);
            return false;
        }
    }

    public akn_1[] c(String string) {
        return this.a(new StringReader(string));
    }

    public akn_1[] a(Reader reader) {
        THashSet<ako_1> tHashSet;
        if (this.e == null) {
            this.e = new akp_1();
            this.e.a(this.c);
        }
        if ((tHashSet = this.e.a(reader)) == null) {
            return null;
        }
        THashMap<String, ArrayList<Class>> tHashMap = akl_1.a(tHashSet);
        akn_1[] akn_1Array = new akn_1[tHashMap.size()];
        tHashMap.forEachEntry((TObjectObjectProcedure)new akm_2(this, akn_1Array));
        return akn_1Array;
    }

    public static THashMap<String, ArrayList<Class>> a(Collection<ako_1> collection) {
        THashMap tHashMap = new THashMap();
        for (ako_1 ako_12 : collection) {
            String string = ako_12.a();
            ArrayList<Class> arrayList = (ArrayList<Class>)tHashMap.get((Object)string);
            if (arrayList == null) {
                arrayList = new ArrayList<Class>();
                tHashMap.put((Object)string, arrayList);
            }
            arrayList.add(ako_12.a);
        }
        return tHashMap;
    }
}

