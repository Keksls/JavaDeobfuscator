/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.JavaFunction
 *  org.keplerproject.luajava.LuaState
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKr
 */
public abstract class akr_1
implements hr_1 {
    protected static final Logger b = Logger.getLogger(akr_1.class);

    protected akr_1() {
    }

    @Override
    public Collection<hs_1> c() {
        ArrayList<akk_2> arrayList = new ArrayList<akk_2>();
        arrayList.addAll(this.d());
        arrayList.addAll(this.e());
        return arrayList.stream().sorted(Comparator.comparing(hs_1::a)).collect(Collectors.toList());
    }

    private Collection<akk_2> d() {
        Object[] objectArray = this.b(null);
        return objectArray == null ? Lists.newArrayList() : Lists.newArrayList((Object[])objectArray);
    }

    private Collection<akk_2> e() {
        Object[] objectArray = this.a(null);
        return objectArray == null ? Lists.newArrayList() : Lists.newArrayList((Object[])objectArray);
    }

    void c(LuaState luaState) {
        akk_2[] akk_2Array;
        akk_2[] akk_2Array2 = this.a(luaState);
        if (akk_2Array2 != null) {
            luaState.newTable();
            akk_2Array = akk_2Array2;
            int n = akk_2Array.length;
            for (int k = 0; k < n; ++k) {
                akk_2 akk_22 = akk_2Array[k];
                if (akk_22 == null) continue;
                assert (akk_22.a() != null);
                luaState.pushString(akk_22.a());
                luaState.pushJavaFunction((JavaFunction)akk_22);
                luaState.setTable(-3);
            }
            if (this.a() != null) {
                luaState.setGlobal(this.a());
            } else {
                luaState.setGlobal("UnknownLibrary " + this.toString());
            }
        }
        if ((akk_2Array = this.b(luaState)) != null) {
            for (akk_2 akk_23 : akk_2Array) {
                akk_23.i();
            }
        }
    }

    @Nullable
    public abstract akk_2[] a(LuaState var1);

    @Nullable
    public abstract akk_2[] b(LuaState var1);
}

