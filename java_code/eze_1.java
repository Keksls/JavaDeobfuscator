/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eze
 */
class eze_1
implements Comparable<eze_1> {
    private final long a;
    private final wu_0 b;
    private final wt_0 c = new wt_0(wt_0.c);

    eze_1(long l, wu_0 wu_02) {
        this.a = l;
        this.b = wu_02;
    }

    public long a() {
        return this.a;
    }

    public void a(eza_1 eza_12) {
        this.c.a(this.b);
        this.c.a(eza_12.a());
    }

    public boolean a(wu_0 wu_02) {
        return this.c.c(wu_02);
    }

    public int a(@NotNull eze_1 eze_12) {
        if (eze_12 == null) {
            return 0;
        }
        if (this.c.b(eze_12.c)) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        return "LevelListElement{m_accountId=" + this.a + "}";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((eze_1)object);
    }
}

