/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bUj
 */
public class buj_0
implements ajh_1,
Comparable<buj_0> {
    public static final String a = "iconUrl";
    private final int b;

    public buj_0(int n) {
        this.b = n;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return azs_0.a().a("pointsOfInterestIconPath", "defaultIconPath", this.b);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        return null;
    }

    public int a(@NotNull buj_0 buj_02) {
        return buj_02.b - this.b;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((buj_0)object);
    }
}

