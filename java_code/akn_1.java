/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKn
 */
class akn_1
extends akr_1 {
    private final String a;
    private final Constructor[] d;
    private final Constructor[] e;

    akn_1(String string, Constructor[] constructorArray, Constructor[] constructorArray2) {
        this.a = string;
        this.d = constructorArray;
        this.e = constructorArray2;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return akn_1.a(this.d, luaState);
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return akn_1.a(this.e, luaState);
    }

    private static akk_2[] a(Constructor[] constructorArray, LuaState luaState) {
        if (constructorArray == null || constructorArray.length == 0) {
            return null;
        }
        akk_2[] akk_2Array = new akk_2[constructorArray.length];
        for (int k = 0; k < constructorArray.length; ++k) {
            try {
                akk_2Array[k] = (akk_2)constructorArray[k].newInstance(luaState);
                continue;
            }
            catch (InstantiationException instantiationException) {
                b.error((Object)"", (Throwable)instantiationException);
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                b.error((Object)"", (Throwable)illegalAccessException);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                b.error((Object)"", (Throwable)invocationTargetException);
            }
        }
        return akk_2Array;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

