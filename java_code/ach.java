/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

public class ach
implements Comparable {
    public static final Comparator<ach> a = new aci();
    final byte b;
    private final float c;
    private final float d;
    private final float e;

    public ach(byte by, float f2, float f3, float f4) {
        this.b = by;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public int compareTo(@NotNull Object object) {
        ach ach2 = (ach)object;
        return this.b - ach2.b;
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public byte d() {
        return this.b;
    }

    public String toString() {
        return "DayLightDefinition{" + this.b + "%Day Color = {" + this.c + ", " + this.d + ", " + this.e + "}";
    }
}

