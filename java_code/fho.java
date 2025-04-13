/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public enum fho implements aqk_2
{
    a(1, 369, (ImmutableList<Integer>)ImmutableList.of((Object)1161), 120),
    b(2, 370, (ImmutableList<Integer>)ImmutableList.of((Object)1203), 120),
    c(3, 369, (ImmutableList<Integer>)ImmutableList.of((Object)1217), 120),
    d(4, 370, (ImmutableList<Integer>)ImmutableList.of((Object)1218), 120),
    e(5, 371, (ImmutableList<Integer>)ImmutableList.of((Object)1219), 120);

    private final int f;
    private final int g;
    private final ImmutableList<Integer> h;
    private final int i;

    private fho(int n2, int n3, ImmutableList<Integer> immutableList, int n4) {
        this.f = n2;
        this.g = n3;
        this.h = immutableList;
        this.i = n4;
    }

    public static fho a(int n) {
        fho[] fhoArray;
        for (fho fho2 : fhoArray = fho.values()) {
            if (fho2.f != n) continue;
            return fho2;
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.i;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return null;
    }
}

