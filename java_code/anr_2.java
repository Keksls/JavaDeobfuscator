/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anr
 */
public abstract class anr_2<SoundParam>
extends ans_2<SoundParam> {
    public anr_2(LuaState luaState) {
        super(luaState);
    }

    protected List<anj_1> a(int n, int n2, boolean bl) {
        return this.a(n, n2, bl, anj_1::new);
    }

    protected List<anj_1> a(int n, int n2, boolean bl, BiFunction<Long, Float, anj_1> biFunction) {
        ArrayList<anj_1> arrayList = new ArrayList<anj_1>();
        int n3 = n;
        while (n3 < n2) {
            int n4 = n2 - n3;
            if (n4 < 2) {
                throw new LuaException(String.format("Invalid argument number for method %s. For %s sound declared, missing gain", this.a(), arrayList.size() + 1));
            }
            long l = this.g(n3++);
            float f2 = this.f(n3++);
            if (bl) {
                if (n4 < 4) {
                    throw new LuaException(String.format("Invalid argument number for method %s. For %s sound declared, missing minPitch and maxPitch", this.a(), arrayList.size() + 1));
                }
                float f3 = this.f(n3++);
                float f4 = this.f(n3++);
                arrayList.add(new anj_1(l, f2, f3, f4));
                continue;
            }
            arrayList.add(biFunction.apply(l, Float.valueOf(f2)));
        }
        return arrayList;
    }

    protected anj_1 a(List<anj_1> list) {
        int n = Hw.b(0, list.size());
        return list.get(n);
    }
}

