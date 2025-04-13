/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from VK
 */
public class vk_0
implements Comparable<vk_0> {
    private final int a;
    private final short b;
    private final boolean c;
    private static final vk_0 d = new vk_0(0, -1, false);

    public vk_0(int n, short s2, boolean bl) {
        this.c = bl;
        this.a = n;
        this.b = s2;
    }

    public static vk_0 a() {
        return d;
    }

    public int a(@NotNull vk_0 vk_02) {
        if (this == vk_02) {
            return 0;
        }
        if (vk_02 == null) {
            return -1;
        }
        int n = Integer.signum(this.b - vk_02.b);
        if (n != 0) {
            return n;
        }
        int n2 = Integer.signum(this.a - vk_02.a);
        if (n2 != 0) {
            return n2;
        }
        return (this.c ? 1 : 0) - (vk_02.c ? 1 : 0);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((vk_0)object);
    }
}

