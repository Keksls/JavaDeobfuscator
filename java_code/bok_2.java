/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bok
 */
public class bok_2
extends bof_1
implements Comparable<bok_2> {
    public static final String e = "article";
    public static final String[] f = new String[]{"article"};
    public static final String[] g = new String[bof_1.d.length + f.length];
    @Nullable
    private bss_0<?, ?> h;
    private boolean i = false;
    private final int j;

    protected bok_2(int n) {
        super(boh_1.b);
        this.j = n;
    }

    public bss_0<?, ?> c() {
        if (this.h == null && !this.i) {
            this.i = true;
            brr_1.a(bss_02 -> {
                this.h = bss_02;
                fis_1.a().a((ajf_1)this, e);
            }, "characterSlot");
        }
        return this.h;
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(e)) {
            return this.c();
        }
        return super.b(string);
    }

    public int a(@NotNull bok_2 bok_22) {
        return this.j - bok_22.j;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bok_2)object);
    }

    static {
        System.arraycopy(f, 0, g, 0, f.length);
        System.arraycopy(bof_1.d, 0, g, f.length, bof_1.d.length);
    }
}

