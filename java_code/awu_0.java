/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aWu
 */
class awu_0
implements Comparable<awu_0> {
    private final int a;
    private final String b;
    private final String c;

    awu_0(eok_1 eok_12) {
        this.a = eok_12.a();
        this.b = bae.h().a(140, (long)this.a, new Object[0]);
        this.c = bae.h().a(141, (long)this.a, new Object[0]);
    }

    public int a(@NotNull awu_0 awu_02) {
        return this.b.compareTo(awu_02.b);
    }

    public String toString() {
        return this.a + " : " + this.b + " - " + this.c;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((awu_0)object);
    }
}

