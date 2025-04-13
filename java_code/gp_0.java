/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from GP
 */
class gp_0
implements Runnable {
    private final gn_0 a;

    gp_0(gn_0 gn_02) {
        this.a = gn_02;
    }

    @Override
    public void run() {
        try {
            this.a.a();
        }
        catch (IOException iOException) {
            go_0.a.warn((Object)("Unable to read " + this.a.b() + " : " + iOException.getMessage()));
            this.a.c();
        }
    }

    public String toString() {
        return "LoadUrl{m_url=" + this.a + "}";
    }
}

