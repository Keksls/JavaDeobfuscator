/*
 * Decompiled with CFR 0.152.
 */
public class QP {
    private final String a;
    private final int b;

    public QP(String string, int n) {
        this.a = string;
        this.b = n;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public String toString() {
        return "ProxyAddress{m_host='" + this.a + "', m_port=" + this.b + "}";
    }
}

