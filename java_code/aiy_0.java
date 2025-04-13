/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aiY
 */
public class aiy_0 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final aiz_0 e;
    @Nullable
    private final String f;
    private final int g;
    private final int h;
    private static final String i = "x";

    public aiy_0(int n, int n2, int n3, int n4, aiz_0 aiz_02, @Nullable String string, int n5, int n6) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = aiz_02;
        this.f = string;
        this.g = n5;
        this.h = n6;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public aiz_0 e() {
        return this.e;
    }

    @Nullable
    public String f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public String toString() {
        return "{Resolution : " + this.a + i + this.b + i + this.c + " " + Cz.c(this.e.name()) + " " + this.d + "Hz Prefered screen ID: " + this.f + " x: " + this.g + " y: " + this.h + "}";
    }

    public boolean i() {
        return this.e != aiz_0.b && (this.a <= 0 || this.b <= 0);
    }

    public boolean equals(Object object) {
        if (object instanceof aiy_0) {
            aiy_0 aiy_02 = (aiy_0)object;
            return aiy_02.a == this.a && aiy_02.b == this.b && aiy_02.e == this.e && aiy_02.d == this.d && (aiy_02.c == this.c || aiy_02.c == -1 || this.c == -1) && Objects.equals(aiy_02.f, this.f) && aiy_02.g == this.g && aiy_02.h == this.h;
        }
        return super.equals(object);
    }

    public static aiy_0 a(String string) {
        if (string == null) {
            string = "";
        }
        String[] stringArray = string.split(i);
        int n = aiy_0.a(stringArray, 0, 0);
        int n2 = aiy_0.a(stringArray, 1, 0);
        int n3 = aiy_0.a(stringArray, 2, -1);
        int n4 = aiy_0.a(stringArray, 3, 0);
        int n5 = aiy_0.a(stringArray, 4, aiz_0.a.ordinal());
        aiz_0 aiz_02 = aiz_0.a;
        for (aiz_0 aiz_03 : aiz_0.values()) {
            if (aiz_03.ordinal() != n5) continue;
            aiz_02 = aiz_03;
            break;
        }
        int n6 = aiy_0.a(stringArray, 5, 0);
        int n7 = aiy_0.a(stringArray, 6, 0);
        String string2 = stringArray.length == 8 ? stringArray[7] : null;
        return new aiy_0(n, n2, n3, n4, aiz_02, string2, n6, n7);
    }

    private static int a(String[] stringArray, int n, int n2) {
        if (stringArray == null || n >= stringArray.length) {
            return n2;
        }
        try {
            return Integer.parseInt(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public final String j() {
        return String.valueOf(this.a) + i + this.b + i + this.c + i + this.d + i + this.e.ordinal() + i + this.g + i + this.h + (String)(this.f != null ? i + this.f : "");
    }
}

