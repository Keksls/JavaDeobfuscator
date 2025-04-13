/*
 * Decompiled with CFR 0.152.
 */
public abstract class Xa
extends fl_1 {
    protected long a = -1L;

    protected Xa(long l) {
        this.a = l;
    }

    public void b() {
        this.a = -1L;
    }

    public byte[] c() {
        return this.a(this.b_());
    }

    public long d() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public String toString() {
        return "GroupGlobalData{m_id=" + this.a + "}";
    }
}

