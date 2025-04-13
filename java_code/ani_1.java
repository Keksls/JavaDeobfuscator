/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from anI
 */
public class ani_1<SoundParam extends anj_1> {
    public static final int a = -1;
    private final int b;
    private final boolean c;
    private final List<SoundParam> d;

    public ani_1(boolean bl, List<SoundParam> list) {
        this(-1, bl, list);
    }

    public ani_1(int n, List<SoundParam> list) {
        this(n, true, list);
    }

    public ani_1(int n, boolean bl, List<SoundParam> list) {
        this.b = n;
        this.c = bl;
        this.d = list;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public List<SoundParam> c() {
        return this.d;
    }
}

