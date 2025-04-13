/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBY
 */
public class eby_0<Value> {
    final boolean a;
    @Nullable
    final ebx_0 b;
    @Nullable
    final Value c;

    public eby_0(boolean bl, @Nullable ebx_0 ebx_02, @Nullable Value Value) {
        this.a = bl;
        this.b = ebx_02;
        this.c = Value;
    }

    public boolean a() {
        return this.a;
    }

    @Nullable
    public ebx_0 b() {
        return this.b;
    }

    @Nullable
    public Value c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eby_0)) {
            return false;
        }
        eby_0 eby_02 = (eby_0)object;
        if (!eby_02.a(this)) {
            return false;
        }
        if (this.a() != eby_02.a()) {
            return false;
        }
        ebx_0 ebx_02 = this.b();
        ebx_0 ebx_03 = eby_02.b();
        if (ebx_02 == null ? ebx_03 != null : !((Object)((Object)ebx_02)).equals((Object)ebx_03)) {
            return false;
        }
        Value Value = this.c();
        Value Value2 = eby_02.c();
        return !(Value == null ? Value2 != null : !Value.equals(Value2));
    }

    protected boolean a(Object object) {
        return object instanceof eby_0;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.a() ? 79 : 97);
        ebx_0 ebx_02 = this.b();
        n2 = n2 * 59 + (ebx_02 == null ? 43 : ((Object)((Object)ebx_02)).hashCode());
        Value Value = this.c();
        n2 = n2 * 59 + (Value == null ? 43 : Value.hashCode());
        return n2;
    }

    public String toString() {
        return "CraftStepEnum.StepFallthroughResult(m_hasFallthrough=" + this.a() + ", m_valueFromStep=" + this.b() + ", m_value=" + this.c() + ")";
    }
}

