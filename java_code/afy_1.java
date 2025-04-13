/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aFY
 */
class afy_1
implements ThreadFactory {
    private final String a;
    private final int b;
    private int c;

    afy_1(String string, int n) {
        this.a = string;
        this.b = n;
    }

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, "Net-Proto" + this.a + ":" + this.b + ">" + this.c++);
    }

    public String toString() {
        return "GroupThreadFactory{m_host='" + this.a + "', m_port=" + this.b + ", m_cpt=" + this.c + "}";
    }
}

