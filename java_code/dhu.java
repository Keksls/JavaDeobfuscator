/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class dhu
extends dht {
    private final int a;

    public dhu(int n, @Nullable Integer n2, boolean bl) {
        super(n2, bl);
        this.a = n;
    }

    @Override
    public int a() {
        return 17318;
    }

    public int q() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dhu)) {
            return false;
        }
        dhu dhu2 = (dhu)object;
        if (!dhu2.b(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        return this.q() == dhu2.q();
    }

    @Override
    protected boolean b(Object object) {
        return object instanceof dhu;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + this.q();
        return n2;
    }
}

