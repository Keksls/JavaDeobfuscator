/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCO
 */
public class aco_1
implements Comparable {
    public static final aco_1 a = new aco_1(0, 0);
    public int b;
    public int c;

    public aco_1() {
    }

    public aco_1(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    public float a() {
        int n = this.b + this.c;
        if (n == 0) {
            return 0.0f;
        }
        return (float)this.c / (float)n;
    }

    public int compareTo(@NotNull Object object) {
        if (object == this) {
            return 0;
        }
        if (!(object instanceof aco_1)) {
            return 1;
        }
        aco_1 aco_12 = (aco_1)object;
        float f2 = this.a();
        float f3 = aco_12.a();
        return Float.compare(f2, f3);
    }

    public boolean b() {
        return false;
    }

    public int c() {
        return -1;
    }

    public int d() {
        return -1;
    }
}

