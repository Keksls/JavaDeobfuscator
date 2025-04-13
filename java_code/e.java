/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

public enum e implements d<e>
{
    a(1),
    b(2),
    c(3),
    d(4),
    e(5);

    private final int f;
    @SerializedName(value="name")
    private final String g;

    private e(int n2) {
        this.f = n2;
        this.g = this.name();
    }

    public int a() {
        return this.f;
    }

    @Override
    public b a(b b2, e e2) {
        b2.a(e2);
        return b2;
    }

    @Override
    public b b(b b2, e e2) {
        b2.b(e2);
        return b2;
    }

    @Override
    public /* synthetic */ b a(b b2, d d2) {
        return this.b(b2, (e)d2);
    }

    @Override
    public /* synthetic */ b b(b b2, d d2) {
        return this.a(b2, (e)d2);
    }
}

