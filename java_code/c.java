/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public enum c implements d<c>
{
    a(0, new e[0]),
    b(1, e.values()),
    c(2, new b(b).b(new d[]{e.c, e.e}));

    private final int d;
    @SerializedName(value="name")
    private final String e;
    private final e[] f;

    private c(int n2, e ... eArray) {
        this.d = n2;
        this.e = this.name();
        this.f = eArray;
    }

    private c(int n2, b b2) {
        this.d = n2;
        this.e = this.name();
        Object[] objectArray = b2.a().toArray();
        this.f = (e[])Arrays.copyOf(objectArray, objectArray.length, e[].class);
    }

    public int a() {
        return this.d;
    }

    public e[] b() {
        return this.f;
    }

    @Override
    public b a(b b2, c c2) {
        b2.a(c2.f);
        return b2;
    }

    @Override
    public b b(b b2, c c2) {
        b2.b(c2.f);
        return b2;
    }

    @Override
    public /* synthetic */ b a(b b2, d d2) {
        return this.b(b2, (c)d2);
    }

    @Override
    public /* synthetic */ b b(b b2, d d2) {
        return this.a(b2, (c)d2);
    }
}

