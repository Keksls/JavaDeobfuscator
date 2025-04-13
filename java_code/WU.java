/*
 * Decompiled with CFR 0.152.
 */
public abstract class WU<TCharacter extends WV>
extends fl_1 {
    protected final TCharacter a;

    protected WU(TCharacter TCharacter) {
        this.a = TCharacter;
    }

    public long b() {
        if (this.a != null) {
            return ((WV)this.a).d();
        }
        return -1L;
    }

    public long c() {
        if (this.a != null) {
            return ((WV)this.a).f();
        }
        return -1L;
    }

    public abstract long a(byte var1);

    public String d() {
        if (this.a != null) {
            return ((WV)this.a).e();
        }
        return "";
    }

    public abstract void b(byte var1);

    @Override
    public fo_1[] b_() {
        return new fo_1[0];
    }

    public abstract void a(byte var1, long var2);

    public TCharacter e() {
        return this.a;
    }
}

